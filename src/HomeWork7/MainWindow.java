package HomeWork7;

import HomeWork7.windowParts.GamePanel;
import HomeWork7.windowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{

    private int widthW = 1366;
    private int heightW = 768;
    private int posXW = 300;
    private int posYW = 200;
    private String titleW = "Game Survive";
    private InfoPanel infoPanel;
    private GamePanel map;

    MainWindow(){
        setupWindow();
        map = new GamePanel();
        infoPanel = new InfoPanel();

        add(map);
        add(infoPanel, BorderLayout.EAST);




        setVisible(true);

//        JButton jButton1 = new JButton("Button1");
//        JButton jButton2 = new JButton("Button1");
//        add(jButton1);
//        add(jButton2);
//
//        JPanel panel = new JPanel();
//
//        panel.setLayout(new GridLayout(1,2));
//        panel.add(jButton1);
//        panel.add(jButton2);
//
//        add(panel, BorderLayout.NORTH);

    }

    private void setupWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(widthW, heightW);
        setLocation(posXW,posYW);
        setTitle(titleW);
        setResizable(false);
    }
}
