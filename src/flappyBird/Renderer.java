package flappyBird;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kacper on 10.01.2018.
 */
public class Renderer extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        FlappyBird.flappyBird.repaint(g);
    }
}
