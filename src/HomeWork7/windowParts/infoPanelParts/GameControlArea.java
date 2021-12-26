package HomeWork7.windowParts.infoPanelParts;

import javax.swing.*;
import java.awt.*;

public class GameControlArea extends JPanel {
    private JButton startGame;
    private JButton exitGame;



    public GameControlArea() {
        setLayout(new GridLayout(3,1));
        startGame = new JButton("START GAME");
        exitGame = new JButton("EXIT GAME");


        add(new JLabel("==GameControls==", SwingConstants.CENTER));
        add(startGame);
        add(exitGame);
    }
}
