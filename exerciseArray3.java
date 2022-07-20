import java.util.Scanner;

public class exerciseArray3 {
    public static void main(String[] args) {
        System.out.println("ENTER SIZE OF THE LIST : ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("ENTER ELEMENTS OF THE LIST : ");
        Scanner j=new Scanner(System.in);
        int[] list=new int[n];
        for (int i=0;i< list.length;i++)
            list[i]=j.nextInt();

        for (int i=0;i<n;i++){
            if(list[i]>0){
                int count = 1;
                for (int k = i + 1; k < n; k++) {
                    if (list[i] == list[k]) {
                        count = count + 1;
                        list[k] = 0;
                    }
                }
                System.out.print(list[i] + " occurs " + count + " times");
                System.out.println();
            }
        }
    }
}
