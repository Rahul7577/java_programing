import java.util.Scanner;

public class one_tenWhile {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER A NUMBER BETWEEN 1 AND 10 : ");
        double i=s.nextDouble();
        while(i<1 || i>10){
            System.out.println(i+" IS NOT BETWEEN 1 AND 10.");
            System.out.print("TRY AGAIN : ");
            i=s.nextDouble();

        }
        System.out.println(i+" IS BETWEEN 1 AND 10. THANKS!");
    }
}
