import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0 };
        System.out.println(findEvenNumbers(nums1));

        int[] nums2 = new int[] { 45, 16, 1, 77, 12, 34, 99, 14 };
        System.out.println(findTheDifference(nums2));

        Integer[] nums3 = new Integer[6];
        nums3[0] = 45;
        // nums3[1] = 45;
        nums3[2] = 45;
        nums3[3] = 45;
        // nums3[4] = 45;
        // nums3[5] = 45;

        System.out.println(isNull(nums3));
    }

    /*
     * Написать метод, возвращающий количество чётных элементов массива.
     */
    public static int findEvenNumbers(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0)
                count++;
        }

        return count;
    }

    /*
     * Написать функцию, возвращающую разницу между самым большим и самым ма-
     * леньким элементами переданного не пустого массива.
     */
    public static int findTheDifference(int[] arr) {

        Arrays.sort(arr, 0, arr.length);
        int min = arr[0];
        int max = arr[arr.length - 1];
        // int min = arr[0];
        // int max = 0;
        // for (int i : arr) {
        // if (i > max) {
        // max = i;
        // System.out.printf("max: %d \n", max);
        // } else if (i < min) {
        // min = i;
        // System.out.printf("min: %d \n", min);
        // }
        // }

        return max - min;

    }

    /*
     * Написать функцию, возвращающую истину, если в переданном массиве есть два
     * соседних элемента, с нулевым значением.
     */
    public static boolean isNull(Integer[] arr) {
        boolean boo = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == null && arr[i + 1] == null) {
                boo = true;
                break;
            }
        }

        return boo;
    }

}
