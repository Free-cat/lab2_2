import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Main {

    public static void main(String[] args) {

        Line line1 = new Line(0,1,1,1);
        Line line2 = new Line(0,0,1,0);
        int A1 = line1.getA();
        int A2 = line2.getA();
        int B1 = line1.getB();
        int B2 = line2.getB();
        int temps;

        System.out.println("Уравнение прямой 1:" + line1.getUrav());
        System.out.println("Уравнение прямой 2:" + line2.getUrav());

        temps = (A1*B2)-(A2*B1);
        if (temps == 0){
            System.out.println("Прямые параллельны");
        }
        else{
            double ugol;
            ugol = Math.acos((((B1*B2)+(A1*A2))/((Math.sqrt(Math.pow(B1,2)+Math.pow(A1,2)))*(Math.sqrt((Math.pow(B2,2)+(Math.pow(A2,2))))))));
            ugol = (ugol * 180) / Math.PI;
            System.out.println("Угол между прямыми: " + ugol);
        }
}
}
