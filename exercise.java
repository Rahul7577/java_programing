import java.util.Scanner;
public class exercise {
    public static void main(String[] args){
        first();
        second();

    }
    public static void first(){
        Scanner i=new Scanner(System.in);
        System.out.println("ENTER YOUR FAVORITE NUMBER :");
        System.out.println(i.nextInt()+" is my favorite integer too !");
    }

    public static void second(){
        Scanner n=new Scanner(System.in);
        Scanner a=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME AND AGE :");
        System.out.println(n.nextLine()+"!"+" You are "+a.nextFloat()+" year's old !");
    }
}
