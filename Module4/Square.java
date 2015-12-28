package Module04;

public class Square {
        //triangle square
    public static double triangleArea(double hight, double side) {
        return hight * side * 0.5;
    }
        //rectangle square
    public static int rectangleArea(int lenght, int width) {
        return lenght*width;
    }
        //circule square
    public static double circule (double radius) {
        return 3.14*Math.pow(radius,2.0);
    }
}