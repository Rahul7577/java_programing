import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int num=s.nextInt();
        int num1=0,num2=1,result=num1+num2;
        if (num==0 || num==1)
            System.out.println("FIBONACCI OF 0 IS : "+num);
        else {
            int i=2;
            while (i <= num) {
                result = num1 + num2;
                num1 = num2;
                num2 = result;
                i++;
            }
            System.out.println("FIBONACCI OF " + num + " IS : " + result);
        }

    }
}
