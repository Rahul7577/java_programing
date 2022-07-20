import java.util.Scanner;

public class luckyNumber {
    public static void main(String[] args) {
        System.out.print("ENTER A FOUR DIGIT NUMBER : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int a,b,c,d;
        a=num/1000;
        b=(num%1000)/100;
        c=(num%100)/10;
        d=num%10;
        if (a+b==c+d)
            System.out.println("THE NUMBER "+num+" IS A LUCKY NUMBER SINCE "+a+" + "+b+" = "+c+" + "+d);
        else
            System.out.println("THE NUMBER "+num+" IS NOT A LUCKY NUMBER SINCE "+a+" + "+b+" != "+c+" + "+d);
    }
}
