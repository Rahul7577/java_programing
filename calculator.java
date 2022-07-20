import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

        while(true) {
            System.out.println("------------WELCOME------------");
            System.out.println("WHICH OPERATION DO YOU WANT TO PERFORMED :");
            System.out.println(1 + ".  ADDITION ");
            System.out.println(2 + ".  SUBTRACTION ");
            System.out.println(3 + ".  MULTIPLICATION ");
            System.out.println(4 + ".  DIVISION ");
            Scanner i = new Scanner(System.in);
            int j = i.nextInt();

            Scanner i1=new Scanner(System.in);
            System.out.print("ENTER YOUR FIRST NUMBER : ");
            float num1=i1.nextFloat();
            Scanner i2=new Scanner(System.in);
            System.out.print("ENTER YOUR SECOND NUMBER :");
            float num2=i2.nextFloat();

            if (j == 1)
                addition(num1 , num2);
            else if (j == 2)
                subtraction(num1 , num2);
            else if (j == 3)
                multiplication(num1 , num2);
            else if (j == 4)
                division(num1 , num2);
            else
                System.out.println("--> PLEASE ENTER A VALID NUMBER !");
        }

    }

    public static void addition(float x , float y) {
        float ans=x+y;
        System.out.println("SUM OF "+x+" AND "+y+" IS : "+ans);

    }

    public static void subtraction(float x , float y) {
        float ans=x-y;
        System.out.println("DIFFERENCE OF "+x+" AND "+y+ " IS : "+ans);

    }

    public static void multiplication(float x , float y) {
        float ans=x*y;

        System.out.println("MULTIPLICATION OF "+x+" AND "+y+" IS : "+ans);

    }

    public static void division(float x , float y) {
        float ans=x/y;

        System.out.println("DIVISION OF "+x+" AND "+y+" IS : "+ans);

    }
}

