import java.util.Scanner;

public class piramidNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int n=s.nextInt();
        int i=1,j;
        while (i<=n){
            j=1;
            while (j<=i) {
                System.out.print(i+" ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
