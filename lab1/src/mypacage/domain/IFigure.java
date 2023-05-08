package mypacage.domain;

import java.io.Serializable;

public interface IFigure extends Serializable {
    default void print() {
        System.out.println(this.toString());
    }
}
