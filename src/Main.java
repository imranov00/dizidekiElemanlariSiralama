import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int size = input.nextInt();

        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Elemanı giriniz: ");
            list[i] = input.nextInt();
        }

        Arrays.sort(list);

        System.out.println("Sıralanmış Dizi: " + Arrays.toString(list));
    }
}
