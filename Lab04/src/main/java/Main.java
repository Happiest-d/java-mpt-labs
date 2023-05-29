import org.dstu.dao.PaintDao;
import org.dstu.dao.RectangleDao;
import org.dstu.dao.SquareDao;
import org.dstu.domain.Paint;
import org.dstu.domain.Rectangle;
import org.dstu.domain.Square;
import org.dstu.util.HibernateUtil;
import org.hibernate.Metamodel;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.metamodel.EntityType;
import java.awt.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Session session = HibernateUtil.getSession();

        SquareDao squareDao = new SquareDao();
        Square square = new Square();

        square.setBig(true);
        square.setColor("blue");
        square.setBorderStyle("none");
        square.setSideSize(14);
        square.setTimesUsed(22);
        square.setTransparencyLevel("44 %");
        squareDao.save(square);



        PaintDao paintDao = new PaintDao();
        Paint paint = new Paint();

        paint.setName("Красивое");
        int savedId = paintDao.save(paint);
        System.out.println(savedId);



        RectangleDao rectangleDao = new RectangleDao();
        Rectangle rectangle = new Rectangle();

        rectangle.setBorderStyle("dotted");
        rectangle.setColor("red");
        rectangle.setBottomSide("есть");
        rectangle.setLongSide(55);
        rectangle.setShortSide(11);
        rectangle.setTransparencyLevel("1 %");
        rectangle.setPaint(paint);
        rectangleDao.save(rectangle);


        try {
            System.out.println("querying all the managed entities...");
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities()) {
                final String entityName = entityType.getName();
                final Query query = session.createQuery("from " + entityName);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {
                    System.out.println("  " + o);
                }
            }
        } finally {
            session.close();
        }
    }
}