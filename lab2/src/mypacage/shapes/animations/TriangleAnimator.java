package mypacage.shapes.animations;

import mypacage.shapes.Shape;
import mypacage.shapes.Triangle;

import javax.swing.*;
import java.awt.*;

public class TriangleAnimator extends Animator {

    public TriangleAnimator(Shape shape, JComponent component) {
        super(shape, component);
    }

    @Override
    public void run() {
        Color[] colors = new Color[]{Color.PINK, Color.ORANGE, shape.getColor()};

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
