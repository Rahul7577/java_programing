import java.awt.*;
import java.util.Scanner;

public class exerciseArray4 {
    public static void main(String[] args) {
        System.out.println("ENTER A NUMBER : ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("ENTER ELEMENTS OF THE ARRAY : ");
        Scanner i=new Scanner(System.in);
        int[] number=new int[n];
        for (int j=0;j<n;j++)
            number[j]=i.nextInt();
        Point p=new Point();
        p.x=0;
        p.y=0;
        maxMin(number,p);

        System.out.println("MAX : "+p.x+" MIN : "+p.y);
    }

    private static void maxMin(int[] number,Point p) {
        p.x=p.y=number[0];
        for (int i=0;i< number.length;i++){
            if (p.x<number[i])
                p.x=number[i];
            if (p.y>number[i])
                p.y=number[i];
        }
    }


}
