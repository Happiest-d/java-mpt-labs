package mypacage;

import mypacage.components.GraphicsPanel;
import mypacage.shapes.Rectangle;
import mypacage.shapes.Shape;
import mypacage.shapes.Triangle;
//import mypacage.shapes.Square;
//import mypacage.shapes.animation.Animator;
//import mypacage.shapes.animation.CircleAnimator;
//import mypacage.shapes.animation.SquareAnimator;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(200, 200, Color.GREEN, 50, 70));
        shapes.add(new Rectangle(300, 300, Color.RED, 100, 150));
        shapes.add(new Triangle(350, 350, Color.BLUE, new int[]{0,50,100}, new int[]{0,50,0}));
        shapes.add(new Triangle(100, 600, Color.MAGENTA, new int[]{0,20,60}, new int[]{0,100,0}));

        GraphicsPanel canvas = new GraphicsPanel(shapes);

        for (Shape s: shapes) {
            Thread t = new Thread(s.getAnimator(canvas));
            t.start();
        }

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(canvas);
        frame.setVisible(true);
    }
}