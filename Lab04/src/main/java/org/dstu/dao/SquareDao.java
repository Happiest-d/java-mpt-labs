package org.dstu.dao;

import org.dstu.domain.Square;
import org.hibernate.query.Query;

import java.util.List;

public class SquareDao extends BaseDaoImpl<Square, Integer>{
    public SquareDao() {
        super(Square.class);
    }

    public List<Square> getAllByIsBig(boolean borderStyle) {
        Query q = getSession().createQuery("FROM Square WHERE Square.borderStyle = \"" + borderStyle + "\"");
        return q.list();
    }
}
