import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            number.add(random.nextInt(1, 100));
        }
        ArrayList<Integer> takSan = new ArrayList<>();
        ArrayList<Integer> JupSan = new ArrayList<>();

        for (Integer san : number) {
            if (san % 2 == 0) {
                JupSan.add(san);
            } else {
                takSan.add(san);
            }
            System.out.println("tak sandar");
            takSan.forEach(System.out::println);
            System.out.println("\n jup sandar");

            JupSan.forEach(System.out::println);


            {

            }


        }
    }
}