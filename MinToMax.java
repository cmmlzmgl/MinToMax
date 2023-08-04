import java.util.Arrays;
import java.util.Scanner;

public class MinToMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Dizinin Boyutunu Giriniz: ");
        int sizeOfList = input.nextInt();

        int[] list = new int[sizeOfList];

        for (int i = 0; i<list.length; i++)
        {
            System.out.print("Lütfen Dizinin "+ (i+1) +". elemanını giriniz: ");
            int element = input.nextInt();
            list[i] = element;
        }

        Arrays.sort(list);
        System.out.print("Sıralama: "+Arrays.toString(list));
    }
}
