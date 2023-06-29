package fourthassignment;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> intersection = new ArrayList<>();
        int n1 = arr1.length, n2 = arr2.length, n3 = arr3.length;
        int i1 = 0, i2 = 0, i3 = 0;
        while (i1 < n1 && i2 < n2 && i3 < n3) {
            int curr1 = arr1[i1], curr2 = arr2[i2], curr3 = arr3[i3];
            if (curr1 == curr2 && curr1 == curr3) {
                intersection.add(curr1);
                i1++;
                i2++;
                i3++;
            } else {
                int increment1 = 0, increment2 = 0, increment3 = 0;
                if (curr1 < curr2 || curr1 < curr3)
                    increment1 = 1;
                if (curr2 < curr1 || curr2 < curr3)
                    increment2 = 1;
                if (curr3 < curr1 || curr3 < curr2)
                    increment3 = 1;
                i1 += increment1;
                i2 += increment2;
                i3 += increment3;
            }
        }
        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};
        System.out.println(arraysIntersection(arr1, arr2, arr3));
    }
}
