public class loops{

    public static void main(String[] args) {

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("for loop: " + i);
        }

        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println("while loop: " + i);
            i++;
        }

        // do-while loop (simulated using a while loop with a condition)
        i = 0;
        while (true) {
            System.out.println("do-while loop: " + i);
            i++;
            if (i == 5) {
                break;
            }
        }

        // for-each loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("for-each loop: " + number);
        }
    }
}
