package implementationOfTheSorting.countingSort;

public class CountingSort {

    public static void main(String[] args) {
        int[] arr = new int[]{8, 5, 1, 7, 6, 2, 9, 6, 4, 5, 1, 3, 9, 8, 8, 0, 0};

        int a[] = sort(arr);

        for (int num : a) {
            System.out.print(num + ", ");
        }
    }

    public static int[] sort(int[] arr) {

        int[] newArr = new int[10];
        int[] sortArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[arr[i]]++;
        }
        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = newArr[i - 1] + newArr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            sortArr[newArr[arr[i]] - 1] = arr[i];
            newArr[arr[i]]--;
        }
        return sortArr;
    }

}
