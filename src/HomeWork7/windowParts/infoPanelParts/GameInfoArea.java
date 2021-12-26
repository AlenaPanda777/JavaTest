package HomeWork7.windowParts.infoPanelParts;

import javax.swing.*;
import java.awt.*;

public class GameInfoArea extends JPanel {
    public GameInfoArea() {
        setBackground(Color.CYAN);
        setLayout(new GridLayout(4,1));
        add(new JLabel("==GameInfo==", SwingConstants.CENTER));
        add(new JLabel("Map", SwingConstants.LEFT));
        add(new JLabel("Level = ", SwingConstants.LEFT));
        add(new JLabel("Count traps = ", SwingConstants.LEFT));
    }
}
