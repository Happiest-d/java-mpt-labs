package org.dstu.dao;

import org.dstu.domain.Rectangle;

public class RectangleDao extends BaseDaoImpl<Rectangle, Integer>{
    public RectangleDao(){
        super(Rectangle.class);
    }
}
