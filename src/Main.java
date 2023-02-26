import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность размер массива");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите эл массива");
        for (int i = 0; i < size; i++){
            array[i] = input.nextInt();
        }
        System.out.println("введённый массив: ");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }
        bubleSort(array);
        System.out.println("отсортированный массив: " + Arrays.toString(array));
    }


    private static void bubleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }}}}
