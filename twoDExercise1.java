import java.util.Scanner;

public class twoDExercise1 {
    public static void main(String[] args) {
        System.out.print("ENTER METRIX SIZE : ");
        Scanner input=new Scanner(System.in);
        int row=input.nextInt();
        int col=input.nextInt();
        int[][] metrix=new int[row][col];
        System.out.println("ENTER ELEMENTS OF THE METRIX : ");
        Scanner p1=new Scanner(System.in);
        for (int i=0;i<metrix.length;i++){
            for (int j=0;j< metrix[i].length;j++)
                metrix[i][j]=p1.nextInt();
        }
        for (int i=0;i<metrix.length;i++){
            int sum=0;
            for (int j=0;j< metrix[i].length;j++)
                 sum=sum+metrix[i][j];
            System.out.println("SUM OF ROW "+(i+1)+" : "+sum);

        }

        System.out.println(" "+row+" , "+col);
    }
}
