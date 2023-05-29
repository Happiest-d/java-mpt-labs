package org.dstu.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Rectangle {
    private int id;
    private String color;
    private String transparencyLevel;
    private String borderStyle;
    private Integer shortSide;
    private Integer longSide;
    private String bottomSide;
    private Paint paint;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "transparency_level")
    public String getTransparencyLevel() {
        return transparencyLevel;
    }


    public void setTransparencyLevel(String transparencyLevel) {
        this.transparencyLevel = transparencyLevel;
    }

    @Basic
    @Column(name = "border_style")
    public String getBorderStyle() {
        return borderStyle;
    }

    public void setBorderStyle(String borderStyle) {
        this.borderStyle = borderStyle;
    }

    @Basic
    @Column(name = "shortside")
    public Integer getShortSide() {
        return shortSide;
    }

    public void setShortSide(Integer shortSide) {
        this.shortSide = shortSide;
    }

    @Basic
    @Column(name = "longside")
    public Integer getLongSide() {
        return longSide;
    }

    public void setLongSide(Integer longSide) {
        this.longSide = longSide;
    }

    @Basic
    @Column(name = "bottomside")
    public String getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(String bottomSide) {
        this.bottomSide = bottomSide;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paint_id")
    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return id == rectangle.id && Objects.equals(color, rectangle.color) && Objects.equals(transparencyLevel, rectangle.transparencyLevel) && Objects.equals(borderStyle, rectangle.borderStyle) && Objects.equals(shortSide, rectangle.shortSide) && Objects.equals(longSide, rectangle.longSide) && Objects.equals(bottomSide, rectangle.bottomSide) && Objects.equals(paint, rectangle.paint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, color, transparencyLevel, borderStyle, shortSide, longSide, bottomSide, paint);
    }
}
