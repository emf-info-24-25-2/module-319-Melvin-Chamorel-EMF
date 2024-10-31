package exercices.exerciceBonus.halloween;
import java.util.Scanner;

public class halloween {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        halloween1();
    }

    public static void halloween1() {
        System.out.println("un bonbon ou un sort !!!!");
        System.out.println("1 = bonbon, 2 = sort");
        int chois = scanner.nextInt();
        if (chois == 1) {
            System.out.println("merci !!");
            System.out.println("- 1 bonbon");
        } else if (chois == 2)
        for (int i = 0; i < 12343; i++) {
            i--;
            System.out.println("SORT");
        }
    }
}
