import java.util.*;

public class Main {
    private static void firstTask() {
        System.out.println("Task 1");
        int[] arr = {2, 4, 3, 6, 7, 1};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
    }

    private static void secondTask() {
        System.out.println("Task 2");
        int[] arr = new int[16];
        for (int i = 0; i < 16; i++) {
            arr[i] = i;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void thirdTask() {
        System.out.println("Task 3");
        int[] arr = {-1, 5, 3, 2, -5};
        int[] copiedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copiedArray);
        System.out.println("Max number of array = " + copiedArray[copiedArray.length - 1]);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum all elements in array = " + sum);
        int[] copiedArray_2 = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < copiedArray_2.length; i++) {
            for (int j = -1; j < 4; j++) {
                if (copiedArray_2[i] == j) {
                    copiedArray_2[i] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(copiedArray_2));
    }

    private static void fourthTask() {
        System.out.println("Task 4");
        int[] arr = {7, -2, 4, 6, -3, -1, 2, 0, 1, 3, 5};
        int[] copiedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copiedArray);
        System.out.println("Min number of array = " + copiedArray[0]);
        int[] copiedArray_2 = Arrays.copyOf(arr, arr.length);
        int sum = 0;
        boolean isFirstStepped = false;
        for (int i = 0; i < copiedArray_2.length; i++) {
            if (copiedArray_2[i] < 0 && !isFirstStepped) {
                isFirstStepped = true;
            } else if (copiedArray_2[i] < 0 && isFirstStepped) {
                break;
            } else if (isFirstStepped) {
                sum += copiedArray_2[i];
            }
        }
        System.out.println("Sum is " + sum);
    }

    private static void fifthTask() {
        System.out.println("Task 5");
        int[] arr = {7, -2, 4, 6, -3, -1, 2, 0, 1, 3, 5, 12};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum is " + sum);
        int min = arr[0];
        int sum_2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                break;
            }
            sum_2 += arr[i];
        }
        System.out.println("Sum element before min number of array " + sum_2);
        int[] doubleNumbers = {};
        int[] nonDoubleNumbers = {};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                int[] copiedArray = Arrays.copyOf(nonDoubleNumbers, nonDoubleNumbers.length);
                nonDoubleNumbers = append(copiedArray, arr[i]);
            } else {
                int[] copiedArray = Arrays.copyOf(doubleNumbers, doubleNumbers.length);
                doubleNumbers = append(copiedArray, arr[i]);
            }
        }
        System.out.println("Double numbers of array = " + Arrays.toString(doubleNumbers) + "\n" +
                "Not double numbers of array = " + Arrays.toString(nonDoubleNumbers));
    }

    private static void sixthTask() {
        System.out.println("Task 6");
        int[] arr = {7, -2, 4, 6, -3, -1, 2, 0, 12, 1, 3, 5};
        int sum = 0;
        boolean count = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -2) {
                count = true;
            } else if (arr[i] == -1) {
                count = false;
            } else if (count) {
                sum += 1;
            }
        }
        System.out.println("Count of numbers in array between -2 and -1 = " + sum);
        sum = 0;
        int max = arr[0];
        count = false;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                count = true;
            } else if (count) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of numbers after max number in array = " + sum);
        Arrays.sort(arr);
        reverse_array(arr, arr.length);
    }

    private static void seventhTask() {
        System.out.println("\nTask 2_1");
        int[] arr = new int[100];
        for (int i = 0; i < arr.length;i++) {
            arr[i] = ((int)(Math.random()*100)-51);
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int sum = 0;
        int avg = 0;
        for (int i = 0;i < arr.length;i++) {
            for (int j = 0;j < arr.length;j++) {
                sum = arr[i] + arr[j];
                avg = sum / 2;
                if (max < avg) {
                    max = avg;
                }
            }
        }
        System.out.println(max);
    }

    static int[] append(int[] arr, int element) {
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = {element};
        int[] arrNew = new int[arr1.length + arr2.length];
        int i;
        for (i = 0; i < arr1.length; i++) {
            arrNew[i] = arr1[i];
        }
        for (i = 0; i < arr2.length; i++) {
            arrNew[arr1.length + i] = arr2[i];
        }
        return arrNew;
    }

    static void reverse_array(int[] char_array, int n) {
        int[] dest_array = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            dest_array[j - 1] = char_array[i];
            j = j - 1;
        }

        System.out.println("Reversed array: ");
        for (int k = 0; k < n; k++) {
            System.out.print(dest_array[k] + " ");
        }
    }


    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask();
        sixthTask();
        seventhTask();

    }
}