import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {
        final float DOZENPRICE = 3.25f;
        final float SINGLEPRICE = .45f;
        final int DOZENEGG = 12;
        int eggs;
        int dozen;
        int remainder;
        float total;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter number of eggs>>> ");
        eggs = inputDevice.nextInt();
        dozen = eggs / DOZENEGG;
        remainder = eggs % DOZENEGG;
        total = dozen * DOZENPRICE + remainder * SINGLEPRICE;
        System.out.println("You ordered " + eggs + " eggs. That's " + dozen +
                " dozen at $ " + DOZENPRICE + " per dozen and " + remainder +
                " loose eggs at " + (int)(SINGLEPRICE * 100) +
                " cents each for a total of $" + total);
    }
}
