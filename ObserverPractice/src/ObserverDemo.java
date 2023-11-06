import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ObserverDemo {
    public static void main(String[] args) {
      Subject sub = new Subject();

      new HexObserver(sub);
      new OctObserver(sub);
      new BinObserver(sub);

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter a number: ");
            sub.setState(scan.nextInt());
        }
    }
}