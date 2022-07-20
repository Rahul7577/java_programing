import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        int i=read();
        check(i);


    }

    public static int read() {
        Scanner i=new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER : ");
        return i.nextInt();

    }

    public static void check(int x) {
        if ((x%2)==1)
            System.out.println("ODD NUMBER !");
        if ((x%2)==0)
            System.out.println("EVEN NUMBER !");


    }
}
