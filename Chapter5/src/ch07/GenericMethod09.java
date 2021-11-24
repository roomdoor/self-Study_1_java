package ch07;


public class GenericMethod09 {

    public static <T, V> double makeRectangle(Point09<T, V> p1, Point09<T, V> p2) {
//        double left = ((Number) p1.getX()).doubleValue();
//        double right = ((Number) p2.getX()).doubleValue();
//        double top = ((Number) p1.getY()).doubleValue();
//        double bottom = ((Number) p2.getY()).doubleValue();
        double left = (Integer) p1.getX();
        double right = (Integer) p2.getX();
        double top = (double) p1.getY();
        double bottom = (double) p2.getY();
//        double ???? =(double) p1.getx();

        double width = right - left;
        double height = bottom - top;

        return width * height;
    }

    public static void main(String[] args) {
        Point09<Integer, Double> p1 = new Point09<Integer, Double>(0, 0.0);
        Point09<Integer, Double> p2 = new Point09<Integer, Double>(10, 10.0);

        double size = GenericMethod09.<Integer, Double>makeRectangle(p1, p2);
        System.out.println(size);
    }
}
