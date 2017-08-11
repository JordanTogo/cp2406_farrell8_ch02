import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {
        final float DOZENPRICE = 3.25f;
        final float SINGLEPRICE = .45f;
        final int DOZENEGGS = 12;
        int eggs;
        int dozen;
        int remainder;
        float total;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter number of eggs>>> ");
        eggs = inputDevice.nextInt();
        dozen = eggs / DOZENEGGS;
        remainder = eggs % DOZENEGGS;
        total = dozen * DOZENPRICE + remainder * SINGLEPRICE;
        System.out.printf("You ordered %s eggs.\nThat's %s dozen at $%s" +
                " per dozen\n" + "and %s loose eggs at "+
                (int)(SINGLEPRICE * 100) + " cents each\n" +
                "for a total of $%s", eggs, dozen, DOZENPRICE, remainder, total);
    }
}
