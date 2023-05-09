package mypacage.shapes;

import mypacage.shapes.animations.Animator;
import mypacage.shapes.animations.RectangleAnimator;
import mypacage.shapes.animations.TriangleAnimator;

import javax.swing.*;
import java.awt.*;
public class Triangle extends Shape {
    protected int[] xValues;
    protected int[] yValues;

    public Triangle() {}

    public Triangle(int x, int y, Color color, int[] xValues, int[] yValues) {
        super(x, y, color);
        this.xValues = xValues;
        this.yValues = yValues;
    }

    public int[] getxValues() {
        return xValues;
    }

    public void setxValues(int[] xValues) {
        this.xValues = xValues;
    }

    public int[] getyValues() {
        return yValues;
    }

    public void setyValues(int[] yValues) {
        this.yValues = yValues;
    }

    public int[] updateValues(int[] values, int step) {
        int[] result = new int[3];
        for (int i=0; i<3; i++) {
            result[i] = values[i] + step;
        }
        return result;
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(color);
        g.drawPolygon(updateValues(xValues, getX()), updateValues(yValues, getY()), 3);
        g.fillPolygon(updateValues(xValues, getX()), updateValues(yValues, getY()), 3);
    }

    @Override
    public Animator getAnimator(JComponent component) {
        return new TriangleAnimator(this, component);
    }
}
