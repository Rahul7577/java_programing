public class condition {
    public static void main(String[] args){
        check();
        rr.rahul();
    }
    public static void check(){
        int i,j;
        i=12;
        j=6;
        boolean b;
        if(i >= j)
            b=false;
        else
            b=true;
        send(b);

    }
    public static void send(boolean B){
        if(B)
            System.out.println(B);
        else
            System.out.println(B);
    }
}
