import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER TEXT : ");
        String r=s.nextLine();
        for (int i=r.length()-1;i>=0;i--)
            System.out.print(r.charAt(i));
    }
}
