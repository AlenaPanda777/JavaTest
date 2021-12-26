package HomeWork7.windowParts;

import HomeWork7.windowParts.infoPanelParts.GameControlArea;
import HomeWork7.windowParts.infoPanelParts.GameInfoArea;
import HomeWork7.windowParts.infoPanelParts.PlayerControlArea;
import HomeWork7.windowParts.infoPanelParts.PlayerInfoArea;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {

    private GameControlArea gameControlArea;
    private GameInfoArea gameInfoArea;
    private PlayerInfoArea playerInfoArea;
    private PlayerControlArea playerControlArea;

    private JTextArea log;
    private JScrollPane scroll;


    public InfoPanel(){
        preparePanel();
        createParts();
        prepareLogs();

        add(gameControlArea);
        add(gameInfoArea);
        add(playerInfoArea);
        add(playerControlArea);
        add(scroll);

    }

    private void preparePanel() {
        setBackground(new Color(100,50,15));
        setLayout(new GridLayout(5, 1));
    }

    private void createParts() {
        gameControlArea = new GameControlArea();
        gameInfoArea = new GameInfoArea();
        playerInfoArea = new PlayerInfoArea();
        playerControlArea = new PlayerControlArea();
    }

    private void prepareLogs() {
        log = new JTextArea();
        scroll = new JScrollPane(log);
    }
}
