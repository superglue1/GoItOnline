package Module04;

public class Distance {

    public static double pointDistance (double x1, double x2, double y1, double y2){
        return Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
    }
}
