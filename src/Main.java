import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Main {

    public static void main(String[] args) {

        Line line1 = new Line(1,2,3,4);
        Line line2 = new Line(45,3,2,1);

        System.out.println("Уравнение прямой 1:" + line1.getUrav());
        System.out.println("Уравнение прямой 2:" + line2.getUrav());

        if (line1.getK() == line2.getK()){
            System.out.println("Прямые параллельны");
        }
        else{
            int A1 = line1.getK();
            int A2 = line2.getK();
            int TG = (A2-A1)/(1+(A1*A2));
            if (TG == 0){
                System.out.println("Угол равен 90 градусов");
            }
            else{
                double rad = Math.atan(TG);
                System.out.println("Угол:"+ (rad*180/Math.PI));
            }
        }
}
}
