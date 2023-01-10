package AbstracDemo0.demo.ArraysDemo;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {24,62,84,13};
        System.out.println("Before sorting" + Arrays.toString(arr));

        //from small to large
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
