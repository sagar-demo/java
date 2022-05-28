import java.util.Arrays;
public class arrayy {
    public static void main(String[] args){
        //Single dimensional array in java
        int[] arrayy={1,24,56,7,54,87,54,57,51};
        Arrays.sort(arrayy);
        //Multidimensional arrays in java
        int [][]twoD_Array=new int[2][3];
        twoD_Array[0][2]=8;
        System.out.println(Arrays.deepToString(twoD_Array));
        System.out.println(Arrays.toString(arrayy));
    }
}
