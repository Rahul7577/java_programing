import java.util.Arrays;
import java.util.Scanner;

public class exerciseArray5 {
    public static void main(String[] args) {
        System.out.println("ENTER A NUMBER : ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("ENTER ELEMENTS OF THE ARRAY : ");
        Scanner i=new Scanner(System.in);
        int[] number=new int[n];
        for (int j=0;j<n;j++)
            number[j]=i.nextInt();
        System.out.println(Arrays.toString(number));
        placeOddEven(number);


    }

    private static void placeOddEven(int[] number) {
        int[] arr=new int[number.length];
        int x=0;
        for (int i=0;i< number.length ;i++) {
            if (number[i]%2==0)
                continue;
            else {
                arr[x] = number[i];
                x = x + 1;
            }

        }
        for (int i=0;i< number.length;i++) {
            if (number[i]%2!=0)
                continue;
            else {
                arr[x] = number[i];
                x = x + 1;
            }
        }


        System.out.println(Arrays.toString(arr));
    }
}
