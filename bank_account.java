import java.util.Scanner;

public class bank_account {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("---------------- WELCOME TO SBI BANK ----------------------");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        user();


    }
    public static void user(){
        float bal=0;
        Scanner i=new Scanner(System.in);
        System.out.print(" ENTER YOUR ACCOUNT NO : ");
        long ac_no=i.nextLong();

        Scanner j=new Scanner(System.in);
        System.out.print(" ENTER YOUR NAME : ");
        String name=j.nextLine();

        System.out.println(" WELCOME "+name+" !");
        System.out.println(" ACCOUNT NO : "+ac_no);
        System.out.println(" ACCOUNT HOLDER NAME : "+name);
        System.out.println(" D.O.B. : 07/12/2001 ");
        System.out.println(" MOBILE NO. : 7619796725");
        System.out.println(" ACCOUNT TYPE : SAVING ACCOUNT ");
        System.out.println(" ACCOUNT BALANCE :"+bal);
        System.out.println(" IFSC CODE : SBIN00321453");
    }
}
