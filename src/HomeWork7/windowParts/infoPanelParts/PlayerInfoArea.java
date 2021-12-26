package HomeWork7.windowParts.infoPanelParts;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {
    public PlayerInfoArea() {
        setBackground(Color.YELLOW);
        setLayout(new GridLayout(5,1));
        add(new JLabel("==Player==", SwingConstants.CENTER));
        add(new JLabel("Health points = ", SwingConstants.LEFT));
        add(new JLabel("Manna points = ", SwingConstants.LEFT));
        add(new JLabel("Strength points = ", SwingConstants.LEFT));
        add(new JLabel("Experience points = ", SwingConstants.LEFT));
    }
}
