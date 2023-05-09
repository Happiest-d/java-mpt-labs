package mypacage.shapes;

import mypacage.shapes.animations.Animator;
import mypacage.shapes.animations.RectangleAnimator;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends Shape{
    protected int shortSide;
    protected int longSide;

    public Rectangle () {}

    public Rectangle(int x, int y, Color color, int shortSide, int longSide) {
        super(x, y, color);
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    public int getShortSide() {
        return shortSide;
    }

    public void setShortSide(int shortSide) {
        this.shortSide = shortSide;
    }

    public int getLongSide() {
        return longSide;
    }

    public void setLongSide(int longSide) {
        this.longSide = longSide;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawRect(x, y, shortSide, longSide);
        g.fillRect(x, y, shortSide, longSide);
    }

    @Override
    public Animator getAnimator(JComponent component) {
        return new RectangleAnimator(this, component);
    }
}
