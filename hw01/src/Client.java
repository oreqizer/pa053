import org.omg.CORBA.*;
import tasks.*;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws Exception {
        ORB orb = ORB.init(args, null);

        String obj = args[0];

        InitialTask it = InitialTaskHelper.narrow(orb.string_to_object(obj));
        try {
            AbstractTask init = it.init("433689@mail.muni.cz");
            System.out.println(init.info());

            // 1.
            SimpleTask st = SimpleTaskHelper.narrow(init);
            while (!st.isReady()) {
                TimeUnit.SECONDS.sleep(1);
            }

            // 2.
            AbstractTask task2 = st.next();
            System.out.println(task2.info());

            AdderTask at = AdderTaskHelper.narrow(task2);
            at.result(at.a() + at.b());

            // 3.
            AbstractTask task3 = at.next();
            System.out.println(task3.info());

            MatrixTask mt = MatrixTaskHelper.narrow(task3);
            mt.sendResult(det(mt));

            // 4.
            AbstractTask task4 = mt.next();
            System.out.println(task4.info());

            PolygonTask pt = PolygonTaskHelper.narrow(task4);
            pt.sendResult(distance(pt));

            // 5.
            AbstractTask task5 = pt.next();
            System.out.println(task5.info());
        } catch (TaskException ex) {
            System.out.printf("Error! %s\n", ex.message);
        }
    }

    private static int det(MatrixTask mt) throws TaskException {
        int a = mt.getMatrixItem(0, 0);
        int b = mt.getMatrixItem(1, 0);
        int c = mt.getMatrixItem(2, 0);
        int d = mt.getMatrixItem(0, 1);
        int e = mt.getMatrixItem(1, 1);
        int f = mt.getMatrixItem(2, 1);
        int g = mt.getMatrixItem(0, 2);
        int h = mt.getMatrixItem(1, 2);
        int i = mt.getMatrixItem(2, 2);

        return a*e*i + b*f*g + c*d*h - c*e*g - b*d*i - a*f*h;
    }

    private static float distance(PolygonTask pt) throws TaskException {
        float res = 0;
        Point prev = null;
        for (Point p : pt.getPolyLine()) {
            if (prev != null) {
                res += Math.sqrt(Math.pow(p.x - prev.x, 2) + Math.pow(p.y - prev.y, 2));
            }
            prev = p;
        }
        return res;
    }
}
