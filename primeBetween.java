import java.awt.Point;
import java.util.Scanner;

public class primeBetween {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        Point p=new Point();
        System.out.print("ENTER FIRST NUMBER ");
        p.x=i.nextInt();
        System.out.print("ENTER SECOND NUMBER ");
        p.y=i.nextInt();
        primeBt(p);

    }

    public static void primeBt(Point p1) {
        int i=p1.x;
        while (i<p1.y){
            boolean b=true;
            for (int j=2;j<=i/2;j++){
                if (i%j==0) {
                    b = false;
                    break;
                }

            }
            if(b)
                System.out.print(i+"  ");
            i++;
        }
    }
}
