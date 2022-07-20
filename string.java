public class string {
    public static void main(String[] args){
        // STRING ---------------------------
        String s="Rahul";
        String s2=s;
        System.out.println(s);
        System.out.println(s2);

        //STRING ---------------------------
        String s3="Rahul bohra is a softwere engineer ";
        System.out.println(s3);

        //STRING METHODS -----------------------------------
        //toUpperCase() ----
        String s4=s3.toUpperCase();
        System.out.println(s4);

        //toLowerCase -----
        String s5=s4.toLowerCase();
        System.out.println(s5);

        //LENGTH -----------
        int i=s5.length();
        System.out.println(i);

        //CHECKING EMPTY OR NOT -------
        boolean b=s5.isEmpty();
        boolean b2=s.isBlank();
        System.out.println(b);
        System.out.println(b2);

        // CHARACTER AT GIVEN INDEX -------

        char c=s.charAt(3);
        char c2=s5.charAt(23);
        System.out.println(c);
        System.out.println(c2);

        //INDEX OF GIVEN CHARACTER -----------

        int i2=s4.indexOf('e');
        int i4=s4.indexOf('E');

        int i3=s3.lastIndexOf('e');
        System.out.println(i2);
        System.out.println(i4);
        System.out.println(i3);

    //CONCATENATION OF STRINGS --------------
        String str="RAHUL BOHRA";
        String str2="IS A SOFTWERE ENGINEER !";
        System.out.println(str+str2);
        System.out.println(str+" "+str2);

        System.out.println(1+" "+str);
        System.out.println(2+str2+str+2+3);

        System.out.println(str.concat("IS A SOFTWERE ENGINEER !!!!!!!!!").concat("HAVE A NICE DAY !!"));


    }
}
