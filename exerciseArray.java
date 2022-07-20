import java.util.Scanner;

public class exerciseArray {
    public static void main(String[] args){
          System.out.println("ENTER THE COUNT OF NUMBERS : ");
          Scanner i=new Scanner(System.in);
          int n=i.nextInt();
          System.out.print("ENTER NUMBERS : ");
          float[] numbers=new float[n];
          for (int j=0;j<n;j++){
              numbers[j]=i.nextFloat();
          }

          float sum=sum(numbers);
          float prod=product(numbers);
          float avg=sum/n;
          System.out.println("sum = "+sum+" , product = "+prod+" , average = "+avg);


    }

    public static float sum(float... numbers){
        float Sum=0;
        for (int i=0;i< numbers.length;i++)
            Sum+=numbers[i];

        return Sum;
    }
    public static float product(float... numbers){
        float prod=1;
        for (int i=0;i< numbers.length;i++)
            prod*=numbers[i];

        return prod;
    }
}