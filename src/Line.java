public class Line {
    public int X1;
    public int X2;
    public int Y1;
    public int Y2;
    public int k;
    public int b;
    public String urav;

    Line(int x1, int x2, int y1, int y2){
        X1 = x1;
        X2 = x2;
        Y1 = y1;
        Y2 = y2;
        k = (Y1 - Y2)/(X1-X2);
        b = Y2 - (k*X2);
    }

    public int getX1() {
        return X1;
    }

    public int getX2() {
        return X2;
    }

    public int getY1() {
        return Y1;
    }

    public int getY2() {
        return Y2;
    }

    public String getUrav() {
        if (b>0) urav = "y="+k+"x"+"+"+b;
        if (b<0) urav = "y="+k+"x"+b;
        if (b==0) urav = "y="+k+"x";
        return urav;
    }

    public int getK() {
        return k;
    }

    public int getB() {
        return b;
    }
}
