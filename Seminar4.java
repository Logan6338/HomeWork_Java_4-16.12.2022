import java.util.Scanner;

public class Seminar4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите начальное значение a = ");
        int start = in.nextInt();
        System.out.print("Введите конечное значение b = ");
        int end = in.nextInt();
        System.out.print("Введите шаг суммы k1 = ");
        int sum = in.nextInt();
        System.out.print("Введите шаг произведения k2 = ");
        int multi = in.nextInt();
        way(start, end, sum, multi);
        System.out.println("Количество вариантов равно " + count);
        in.close();
    }

    static int count = 0;

    public static void way(int a, int b, int k1, int k2) {
        if (a == b) {
            count++;
        } else if (a < b) {
            way((a + k1), b, k1, k2);
            way(a * k2, b, k1, k2);
        }
    }
}