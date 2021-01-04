import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int [] array={1,4,-4,2,-1,10,34,-44,99};
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void insertSort(int[] array){
        for (int i = 1; i <array.length ; i++) {
            int current=array[i];
            int k;
            for (k = i-1; k >=0&&array[k]>current; k--) {
                array[k+1]=array[k];
            }
            array[k+1]=current;
        }
    }
}
