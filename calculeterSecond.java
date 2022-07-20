import java.util.Scanner;
public class calculeterSecond {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER : NUMBER OPERATER(+,-,*,/) NUMBER");
        double d1=s.nextDouble();
        char op=s.next().charAt(0);
        double d2=s.nextDouble();
        if(op=='+')
            sum(d1,d2);
        else if (op=='-')
            sub(d1,d2);
        else if (op=='*')
            mul(d1,d2);
        else if (op=='/')
            div(d1,d2);
        else
            System.out.println("ENTER A VALID DATA !");
    }


    public static void sum(double x , double y){
        System.out.println("SUM OF "+x+" AND "+y+" IS = "+(x+y));
    }

    public static void sub(double x , double y){
        System.out.println("DIFFERENCE OF "+x+" AND "+y+" IS = "+(x-y));
    }
    public static void mul(double x , double y){
        System.out.println("MULTIPLICATION OF "+x+" AND "+y+" IS = "+(x*y));
    }
    public static void div(double x , double y){
        System.out.println("DIVISION OF "+x+" AND "+y+" IS = "+(x/y));
    }
}
