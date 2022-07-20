import java.awt.Point;
import java.util.Scanner;

public class ageNameOverloading {
    public static void main(String[] args) {
        System.out.println("TYPE NAME OR AGE : ");
        System.out.println(userName()+"   "+userAge());

    }

    public static String  userName() {
        return new Scanner(System.in).nextLine();


    }

    public static double userAge() {
        return new Scanner(System.in).nextDouble();


    }
}
