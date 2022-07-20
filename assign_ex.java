public class assign_ex {
    public static void main(String[] args) {
        rahul();
    }

    public static void rahul() {
        int i=2+3-4;
        System.out.println(i);
        int i1=i+9;
        System.out.println(i1);
        rahul2(i,i1);
        int i3=rahul3(5,2);
        System.out.println(i3);

    }

    public static void rahul2(int i,int i1){
        int j,k;
        j=k=i+i1;
        System.out.println(j);
        System.out.println(k);
        //++j;
        System.out.println(++j);
        //j++;
        System.out.println(j++);
        //--k;
        System.out.println(--k);
        //k--;
        System.out.println(k--);

        System.out.println(j);
        System.out.println(k);
    }

    public static int rahul3(int x,int y) {
        int z=x*(2*(1+5))+(12/(4+2))/y;
        return z;

    }
}
