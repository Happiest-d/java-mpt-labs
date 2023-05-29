package org.dstu.domain;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Paint {
    private int id;
    private String name;
    private Set<Rectangle> figures = new LinkedHashSet<>();

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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "paint")
    public Set<Rectangle> getFigures() {
        return figures;
    }

    public void setFigures(Set<Rectangle> figures) {
        this.figures = figures;
    }
}
