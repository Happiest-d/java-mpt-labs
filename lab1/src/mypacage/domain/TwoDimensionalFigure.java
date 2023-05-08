package mypacage.domain;

public abstract class TwoDimensionalFigure implements IFigure {
    private String color;
    private String transparencyLevel;
    private String borderStyle;

    public TwoDimensionalFigure() {
    }

    public TwoDimensionalFigure(String color, String transparencyLevel, String borderStyle) {
        this.color = color;
        this.transparencyLevel = transparencyLevel;
        this.borderStyle = borderStyle;
    }

    public TwoDimensionalFigure(String[] line) {
        this.color = line[1];
        this.transparencyLevel = line[2];
        this.borderStyle = line[3];
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransparencyLevel() {
        return this.transparencyLevel;
    }

    public void setTransparencyLevel(String transparencyLevel) {
        this.transparencyLevel = transparencyLevel;
    }

    public String getBorderStyle() {
        return this.borderStyle;
    }

    public void setBorderStyle(String borderStyle) {
        this.borderStyle = borderStyle;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Color: ");
        builder.append(this.color);
        builder.append(" | Transparency Level: ");
        builder.append(this.transparencyLevel);
        builder.append(" | Border Style: ");
        builder.append(this.borderStyle);
        return builder.toString();
    }
}