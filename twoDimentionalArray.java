import java.util.Arrays;

public class twoDimentionalArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,5,7,9},{4,5},{7,8,9,23,4}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);
    }
}
