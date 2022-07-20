import java.util.Scanner;

public class strictDivisors {
    public static void main(String[] args) {
        System.out.print("ENTER A NUMBER : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int sum=0;
        int i=1;
        while (i<=num/2){
            if (num%i==0) {
                System.out.print(i + " + ");
                sum = sum + i;
            }

            i++;
        }

        System.out.print("= "+sum);
    }
}
