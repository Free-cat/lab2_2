public class Line {
    public int X1;
    public int X2;
    public int Y1;
    public int Y2;
    public int A, B, C;

    Line(int x1, int y1, int x2, int y2){
        X1 = x1;
        X2 = x2;
        Y1 = y1;
        Y2 = y2;
        A = (Y1 - Y2);
        B = (X2 - X1);
        C = (X1*Y2 - X2*Y1);
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
        return A+"x"+B+"y"+C+"=0";
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public int getC() {
        return C;
    }
}
