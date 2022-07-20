import java.util.Scanner;

public class sumExceed {
    public static void main(String[] args) {
        int result;
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER NUMBER : ");
        result=s.nextInt();
        while (result<=100){
            result+=s.nextInt();

        }
        System.out.println("DONE !---> "+result);
    }
}
