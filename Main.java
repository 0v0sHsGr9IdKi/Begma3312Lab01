/// Лабораторная работа 1.
///
/// @autor Бегма Андрей 3312;
/// @version 1.0
public class Main {
    /**
     *
     * @param args - вводтиая строка (параметр запуска)
     */
    public static void main(String[] args) {
        int[] arr = {3, 56, 7, 500, 88, 49, 366, 100, 6};
        sort(arr);
        System.out.println("The following is a sorted list:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     *
     * @param arr - массив с целочисленными элемантами
     */

    //Сортировка массива методои пузырька
    public static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}