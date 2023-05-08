package mypacage.domain;

public class Square extends TwoDimensionalFigure {
    public Integer sideSize;
    public Boolean isBig = true;
    public Integer timesUsed = 0;

    public Square(String[] line) {
        super(line[1], line[2], line[3]);
        this.sideSize = Integer.parseInt(line[4]);
        this.isBig = Boolean.parseBoolean(line[5]);
        this.timesUsed = Integer.parseInt(line[6]);
    }

    public Integer getSideSize() {
        return this.sideSize;
    }

    public void setSideSize(Integer sideSize) {
        this.sideSize = sideSize;
    }

    public Boolean getBig() {
        return this.isBig;
    }

    public void setBig(Boolean big) {
        this.isBig = big;
    }

    public int getTimesUsed() {
        return this.timesUsed;
    }

    public void setTimesUsed(int timesUsed) {
        this.timesUsed = timesUsed;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("Square: ");
        builder.append(super.toString());
        builder.append(" | Side Size: ");
        builder.append(this.sideSize);
        builder.append(" | Is Big: ");
        builder.append(this.isBig);
        builder.append(" | Times Used: ");
        builder.append(this.timesUsed);
        return builder.toString();
    }
}
