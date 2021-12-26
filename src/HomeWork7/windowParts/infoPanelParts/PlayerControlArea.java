package HomeWork7.windowParts.infoPanelParts;

import javax.swing.*;
import java.awt.*;

public class PlayerControlArea extends JPanel {

    private JButton up;
    private JButton down;
    private JButton left;
    private JButton right;

    public PlayerControlArea() {
        setLayout(new BorderLayout(2,2));
        setBackground(Color.GRAY);
//        Icon icon = new ImageIcon("D:\\JavaTest\\src\\HomeWork7\\windowParts\\infoPanelParts\\Up.png");
//
//        up = new JButton(icon);
        up = new JButton("UP");
        down = new JButton("DOWN");
        left = new JButton("LEFT");
        right = new JButton("RIGHT");

        add(up, BorderLayout.NORTH);
        add(down, BorderLayout.SOUTH);
        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);
    }
}
