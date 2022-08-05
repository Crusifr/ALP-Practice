class CircArea {
    double area(double x) {
        return 3.14 * x;
    }
}
class SqArea {
    int area(int x) {
        return x * x;
    }
}
class RTPolymorphism {
    public static void main(String args[]) {
        CircArea ca = new CircArea();
        SqArea sa = new SqArea();
        System.out.println("Circle area = " + ca.area(1));
        System.out.println("Square area = " + sa.area(1));
    }
}
