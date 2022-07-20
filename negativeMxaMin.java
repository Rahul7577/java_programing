import java.util.Scanner;

public class negativeMxaMin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int min,max;
        int num=s.nextInt();
        max=min=num;
        while(true){
            if (num>0) {
                if (max < num)
                    max = num;
                if (min > num)
                    min = num;
                num = s.nextInt();
            }

            else
                break;
        }
        System.out.println("MAX = "+max);
        System.out.println("MIN = "+min);


    }
}
