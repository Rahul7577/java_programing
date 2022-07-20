import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int num=s.nextInt();
        if (num/10==0){
            System.out.println("DIGIT`S SUM IS : "+num);
        }
        if (num/10!=0 && num/100==0){
            int i,j;
            i=num/10;
            j=num%10;
            System.out.println("DIGIT`S SUM IS : "+(i+j));
        }
        if (num/100!=0 && num/1000==0){
            int i,j,k;
            i=num/100;
            j=(num%100)/10;
            k=num%10;
            System.out.println("DIGIT`S SUM IS : "+(i+j+k));

        }
        if (num/1000!=0 && num/10000==0){
            int i,j,k,l;
            i=num/1000;
            j=(num%1000)/100;
            k=(num%100)/10;
            l=num%10;
            System.out.println("DIGIT`S SUM IS : "+(i+j+k+l));

        }
    }
}
