package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

//    Map
    public static char [][] map;
    public static int mapWidth;
    public static int mapHeight;
    public static int mapSizeMin = 3;
    public static int mapSizeMax = 4;
    public static char empty = '_';
    public static char passed = '*';

    //    Player
    public static char player = '@';
    public static String playerName = "Boris";
    public static int playerHP = 100;
    public static int playerStr;
    public static int playerX;
    public static int playerY;
    public static int playerExp;
    public static final int playerUp = 8;
    public static final int playerDown = 2;
    public static final int playerRight = 6;
    public static final int playerLeft = 4;

    //    Trap
    public static char trap = 'T';
    public static int trapAttack;

    public static int trapCount;
    public static int trapValueMin = 20;
    public static int trapValueMax = 35;



    public static void main (String[] args){
        createMap();
        spawnPlayer();
        spawnTrap();
        newLevel();


//        createMap();
//        spawnPlayer();
//        spawnTrap();
//
//        while (true){
//            showMap();
//            movePlayer();
//
//            if (!isAlive()){
//                System.out.println("Game over!");
//                break;
//            }
//
//            if (isFullMap()){
//                System.out.println(playerName + " Win this map! \nGame over");
//                break;
//            }
//        }

//

    }

    public static void newLevel() {
//        do {
//            createMap();
//            spawnPlayer();
//            spawnTrap();


            while (true) {

                showMap();
                movePlayer();

                if (!isAlive()) {
                    System.out.println("Game over!");
                    break;
                }
                if (isFullMap()){
                System.out.println(playerName + " Win this map! \nNew Game! \nЗдоровье: " + playerName + " = " + playerHP);
                    createMap();
                    spawnPlayer();
                    spawnTrap();
                    showMap();
                    movePlayer();

                    if (!isAlive()) {
                        System.out.println("Game over!");
                        break;
                    }

            }
            }

        }




    public static void createMap (){
        mapWidth = randomValue(mapSizeMin, mapSizeMax);
        mapHeight = randomValue(mapSizeMin, mapSizeMax);
        map = new char[mapHeight][mapWidth];
        for(int y = 0; y < mapHeight; y++){
            for(int x = 0; x < mapWidth; x++){
                map[y][x] = empty;
            }
        }

        System.out.println("Map has been created. Map size is: [" + mapWidth + "] X [" + mapHeight + "]");


//        System.out.println("mapWidth: " + mapWidth + " mapLength: " + mapLength);

    }

    public static void showMap (){
        System.out.println("************> MAP <**********");
        for(int y = 0; y < mapHeight; y++){
            for(int x = 0; x < mapWidth; x++){
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("*****************************");
    }

    public static void spawnTrap (){
        trapAttack = randomValue(trapValueMin, trapValueMax);

//              Генерирование количества ловушек

        trapCount = (mapHeight + mapWidth) /2;
//              Генерирование координат ловушек
        int trapX;
        int trapY;
        for (int i = 1; i <= trapCount; i++){
//Проверка на пустоту
            do {
                trapX = random.nextInt(mapWidth);
                trapY = random.nextInt(mapHeight);
            } while (!isEmpty(trapY,trapX));

            map[trapY][trapX] = trap;

        }
        System.out.println(trapCount + " traps has been created. Trap's attack = " + trapAttack);

    }



    public static void spawnPlayer (){
        playerX = randomValue(0, mapWidth - 1);
        playerY = randomValue(0, mapHeight - 1);
        map[playerY][playerX] = player;
        System.out.println(playerName + " Let's begin! \nYou has been appeared in [" + (playerY + 1) + " X " + (playerX + 1) + "]");

    }

    public static void movePlayer(){

        int currentPlayerX = playerX;
        int currentPlayerY = playerY;


        int playerDirection;

        do {
            System.out.println("Enter your move: (Up: " + playerUp + " | Down: " + playerDown + " | Right: "
                    + playerRight + " | Left: " + playerLeft + ">>>");
            playerDirection = scanner.nextInt();

            switch (playerDirection){
                case playerUp:
                    playerY -= 1;
                    break;
                case playerDown:
                    playerY += 1;
                    break;
                case playerLeft:
                    playerX -= 1;
                    break;
                case playerRight:
                    playerX += 1;
                    break;
            }
        } while (!checkValidMove(currentPlayerX, currentPlayerY, playerX, playerY));

        playerAction(currentPlayerX, currentPlayerY, playerX, playerY);

    }
    public static boolean isEmpty(int y, int x){
        return map[y][x] == empty;
    }

    public static boolean isFullMap(){
        for (int y = 0; y < mapHeight; y++){
            for (int x = 0; x < mapWidth; x++){
                if (map[y][x] == empty) return false;
            }
        }
        return true;
    }

    public static boolean checkValidMove(int passedX, int passedY, int nextX, int nextY){
        if (nextX >= 0 && nextX < mapWidth && nextY >= 0 && nextY < mapHeight){
            System.out.println(playerName + " move to [" + (nextX + 1) + " X " + (nextY +1) + "] success");
            return true;
        } else {
            System.out.println(playerName + " move invalid! Please, try again.");
            playerX = passedX;
            playerY = passedY;
            return false;
        }
    }

    public static void playerAction(int passedX, int passedY, int nextX, int nextY){
        if (map[nextY][nextX] == trap){
            playerHP -= trapAttack;
            trapCount --;
            System.out.println("Alarm! " + playerName + " has been attacked. HP = " + playerHP);
        }

        map[nextY][nextX] = player;
        map[passedY][passedX] = passed;

    }


    public static int randomValue(int min, int max){
        return min + random.nextInt( max - min);
    }

    public static boolean isAlive(){
        return playerHP > 0;
    }
}
