import java.util.Scanner;

public class palindromeCheck {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER TEXT : ");
        String r=s.nextLine();
        int i=0,j=r.length()-1;
        boolean b=true;
        while (i<=j && j>=i){
            if (r.charAt(i)!=r.charAt(j)) {
                b=false;
                System.out.println(r + " NOT A PALINDROME !");
                break;
            }
            else{
                i++;
                j--;
            }
        }
        if (b)
            System.out.println(r+" IS A PALINDROME !");
    }
}
