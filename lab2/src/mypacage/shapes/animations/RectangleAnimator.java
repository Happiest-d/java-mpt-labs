package mypacage.shapes.animations;

import mypacage.shapes.Shape;
import mypacage.shapes.Rectangle;

import javax.swing.*;
import java.awt.*;

public class RectangleAnimator extends Animator {

    public RectangleAnimator(Shape shape, JComponent component) {
        super(shape, component);
    }

    @Override
    public void run() {
        Color[] colors = new Color[]{Color.YELLOW, Color.BLUE, shape.getColor()};

        while (true) {
            int randNumber = (int) (Math.random() * 3);

            shape.moveRel((int) (Math.random() * 20) -10, (int) (Math.random() * 20) -10);
            shape.setColor(colors[randNumber]);
            if (component != null) {
                component.repaint();
            }
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
