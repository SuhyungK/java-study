package 자바의정석;

class Point {
    int x = 10;
    int y = 15;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static long add(long a, long b) {
        return a + b;
    }

    public String getLocation() {
        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point{
    int z = 25;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    @Override
    public String getLocation() {
        return super.getLocation() + ", z : " + z;
    }
}

public class ch7_overriding {
    public static void main(String[] args) {
        Point point = new Point(10, 30);
        Point3D point3d = new Point3D(20, 40, 50);

        System.out.println(point.getLocation());
        System.out.println(point3d.getLocation());
    }
}
