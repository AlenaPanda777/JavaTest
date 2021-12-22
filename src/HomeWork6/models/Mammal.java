package HomeWork6.models;

public class Mammal {
    protected String name;
    protected String color;
    protected int age;
    protected int runLength;
    protected int swimLength;

    public Mammal(String name, String color, int age, int runLength, int swimLength){
        this.name = name;
        this.color = color;
        this.age = age;
        this.runLength = runLength;
        this.swimLength = swimLength;
    }

    public void infoAnimal(){
        System.out.println( "nickName: " + name + ", Color: " + color + ", age: " + age +
                ", Max length of run: " + runLength + " metres, Max length of swim: " + swimLength + " metres");
    }


    public void run(){
        System.out.println(name + " Max length of run: " + runLength);
    }

    public void swim(){
        if(swimLength > 0){
        System.out.println(name + " Max length of swim: " + swimLength);
    }else {
            System.out.println(name +" I have paws! Take me on your hands");
        }
    }





}
