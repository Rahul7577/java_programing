import java.util.Scanner;

public class exerciseArray2 {
    public static void main(String[] args) {
        System.out.print("ENTER A NUMBER : ");
        Scanner i =new Scanner(System.in);
        int n=i.nextInt();
        while (n>20 || n<=0) {
            System.out.println("ENTER A VALID NUMBER ! ");
            n=i.nextInt();
        }
        int[] numbers=new int[n];
        fillArrayOfIntegers(numbers);
        printArrayOfIntegers(numbers);

    }

    private static void printArrayOfIntegers(int[] numbers) {
        System.out.print("ELEMENTS ARE : [");
        for (int i=0;i< numbers.length;i++)
            System.out.print(" "+numbers[i]);
        System.out.print(" ]");
    }

    private static void fillArrayOfIntegers(int[] numbers) {
        Scanner j=new Scanner(System.in);
        System.out.println("ENTER ELEMENTS : ");
        for(int i=0;i< numbers.length;i++)
            numbers[i]=j.nextInt();
    }

}
