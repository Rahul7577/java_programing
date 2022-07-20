import java.util.Scanner;

public class triSpheir {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int num=s.nextInt();
        int i=1,l=num;
        while(i<=num){
            int j=i;
            while (j<num){
                System.out.print("   ");
                j++;
            }
            if (i<num)
                System.out.print(" * ");
            int k=2;
            while (k<=i && i<num){
                System.out.print("   ");
                k++;
            }
            k=2;
            while (k<i && i<num){
                System.out.print("   ");
                k++;
            }

            if (l<num &&l>1)
                System.out.print(" * ");
            l--;
            if (i<num)
                System.out.println();

            i++;
        }
        i=1;
        while (i<=2*num-1){
            System.out.print(" * ");
            i++;
        }

        System.out.println();
        System.out.println();
        System.out.println();
        i=1;
        while (i<=num){
            int j=1;
            while (j<=num){
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}

