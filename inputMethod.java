import java.util.Scanner;
public class inputMethod {
    public static void main(String[] args){
        rahul();
        rahul1();
        rahul2();
        rahul3();
        rahul4();
        rahul5();
        rahul6();

    }
    public static void rahul(){
        // TAKING INPUT FROM USER -----------------------------

        Scanner input=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME : ");
        System.out.println("Your Name is "+input.next());
    }

    public static void rahul1(){
        Scanner i=new Scanner(System.in);
        System.out.println("ENTER YOUR AGE :");
        System.out.println("Your age is "+i.nextInt());
    }

    public static void rahul2(){
        Scanner d=new Scanner(System.in);
        System.out.println("ENTER YOUR RESULT % :");
        System.out.println("Your % id "+d.nextDouble());
    }

    public static void rahul3(){
        Scanner b=new Scanner(System.in);
        System.out.println("ENTER YOUR PASS STATUS :");
        System.out.println("You are Pass : "+b.nextByte());
    }

    public static void rahul4(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER YOUR AGE IN DAY'S :");
        System.out.println("Your age in day's "+s.nextShort());
    }

    public static void rahul5(){
        Scanner l=new Scanner(System.in);
        System.out.println("ENTER A VERY BIG NUMBER :");
        System.out.println("Entered number is "+l.nextLong());
    }

    public static void rahul6(){
        Scanner f=new Scanner(System.in);
        System.out.println("ENTER YOUR FULL NAME :");
        System.out.println("Your Full Name is "+f.nextLine());
    }
}
