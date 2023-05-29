package org.dstu.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Square {
    private int id;
    private String color;
    private String transparencyLevel;
    private String borderStyle;
    private Integer sideSize;
    private Boolean isBig;
    private Integer timesUsed;

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
    @Column(name = "side_size")
    public Integer getSideSize() {
        return sideSize;
    }

    public void setSideSize(Integer sideSize) {
        this.sideSize = sideSize;
    }

    @Basic
    @Column(name = "is_big")
    public Boolean getBig() {
        return isBig;
    }

    public void setBig(Boolean big) {
        isBig = big;
    }

    @Basic
    @Column(name = "times_used")
    public Integer getTimesUsed() {
        return timesUsed;
    }

    public void setTimesUsed(Integer timesUsed) {
        this.timesUsed = timesUsed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return id == square.id && Objects.equals(color, square.color) && Objects.equals(transparencyLevel, square.transparencyLevel) && Objects.equals(borderStyle, square.borderStyle) && Objects.equals(sideSize, square.sideSize) && Objects.equals(isBig, square.isBig) && Objects.equals(timesUsed, square.timesUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, color, transparencyLevel, borderStyle, sideSize, isBig, timesUsed);
    }
}
