import java.util.Arrays;
import java.util.Scanner;

public class arrayPrectice {
        public static void main(String[] args) {
        System.out.println("this is second main function !");
        char[] arr={'a' , 'b'};
        int[] i= new int[12];

        float[] f=new float[5];
        f[0]=(float) 2.4;
        f[1]=1;
        f[2]=2;
        f[3]=3;
        f[4]=4;
        System.out.println(Arrays.toString(f));
        char[] c=new char[5];
        c[0]='a';
        c[1]='b';
        c[2]='c';
        c[3]='d';
        c[4]='e';
        System.out.println(Arrays.toString(c));
        double[] d=new double[5];
        d[0]=0.1;
        d[1]=0.2;
        d[2]=0.3;
        d[3]=0.4;
        d[4]=0.5;
        System.out.println(Arrays.toString(d));
        boolean[] b=new boolean[5];
        b[0]=true;
        b[1]=false;
        b[2]=true;
        b[3]=false;
        b[4]=true;
        System.out.println(Arrays.toString(b));
        System.out.println(i[0]+"  "+i);
        System.out.println(f[0]+"  "+f);
        System.out.println(c+" ");
        System.out.println(d[0]+"  "+d);
        System.out.println(b[0]+"  "+b);
        i=main();
        print(i);
        System.out.println();
        Arrays.sort(i,4,9);
        print(i);
        System.out.println();
        main(i);
        print(i);
        System.out.println(search(i));



    }

        public static int[] main(int[] i) {
                Arrays.sort(i);
                return i;

        }

        public static void print(int[] i) {
              /*  System.out.print(i[0]+" ");
                System.out.print(i[1]+" ");
                System.out.print(i[2]+" ");
                System.out.print(i[3]+" ");
                System.out.print(i[4]+" ");
                System.out.print(i[5]+" ");
                System.out.print(i[6]+" ");
                System.out.print(i[7]+" ");
                System.out.print(i[8]+" ");
                System.out.print(i[9]+" ");
                System.out.print(i[10]+" ");
                System.out.print(i[11]+" ");

               */
                System.out.println(Arrays.toString(i));
        }

        public static int[] main() {
                return new int[] {-1,-5,3,1,8,5,0,4,7,9,-8,-2};
        }

        public static int search(int[] i) {
                return Arrays.binarySearch(i,4);
        }
}
