package mypacage.domain;

public class Rectangle extends TwoDimensionalFigure {
    private Integer shortSide = 1;
    private Integer longSide = 2;
    private String bottomSide;

    public Rectangle(String[] line) {
        super(line[1], line[2], line[3]);
        this.shortSide = Integer.parseInt(line[4]);
        this.longSide = Integer.parseInt(line[5]);
        this.bottomSide = line[6];
    }

    public Integer getShortSide() {
        return this.shortSide;
    }

    public void setShortSide(Integer shortSide) {
        this.shortSide = shortSide;
    }

    public Integer getLongSide() {
        return this.longSide;
    }

    public void setLongSide(Integer longSide) {
        this.longSide = longSide;
    }

    public String getBottomSide() {
        return this.bottomSide;
    }

    public void setBottomSide(String bottomSide) {
        this.bottomSide = bottomSide;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("Reactangle: ");
        builder.append(super.toString());
        builder.append(" | Short Side: ");
        builder.append(this.shortSide);
        builder.append(" | Long Side: ");
        builder.append(this.longSide);
        builder.append(" | Bottom Side: ");
        builder.append(this.bottomSide);
        return builder.toString();
    }
}
