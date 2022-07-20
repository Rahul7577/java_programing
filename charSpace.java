import java.util.Scanner;

public class charSpace {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER TEXT : ");
        String r=s.nextLine();
        for(int i=0;i<r.length();i++)
            System.out.print(r.charAt(i)+" ");

    }
}
