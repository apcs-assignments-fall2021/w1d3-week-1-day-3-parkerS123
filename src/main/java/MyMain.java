public class MyMain {
    // Adds 5 to the given integer
    // This method has been written for you
    public static int add5(int x) {
        return (x + 5);
    }

    // Given three ints x, y, and z, this method
    // returns the largest of the three numbers
    public static int findBiggestNumber(int x, int y, int z) {
        if(x>y && x>z) {
            System.out.println(x + " is the biggest");
        }
        else if(y>x && y>z) {
            System.out.println(y + " is the biggest");
        }
        else {
            System.out.println(z + " is the biggest");
        }

        return 0;
    }

    // This method simulates the flip of a coin, where
    // true represents "heads" and false represents "tails"
    // This method should return true half the time, and false the other half
    public static boolean flipCoin() {
        double rand = Math.random();
        if (rand >= 0.5) {
            return false;
        }
        else {
            return true;
            {
        }
    }

    // This method simulates the flip of a weighted coin,
    // that is a coin that is biased towards heads
    public static boolean flipWeightedCoin() {
        // REPLACE THIS WITH YOUR CODE
        return false;
    }

    // This method rounds a double to the nearest whole number
    public static int round(double d) {
        // REPLACE THIS WITH YOUR CODE
        return 0;
    }

    // This method returns a random number between 1 and 6, inclusive
    public static int rollDie() {
        // REPLACE THIS WITH YOUR CODE
        return 0;
    }

    // This method carries out the quadratic formula and *prints* out the answers
    public static void quadForm(int a, int b, int c) {
        return;
    }

    public static void main(String[] args) {
        // Test the add5 method
        int x = 2;
        int y = add5(x);
        System.out.println(y);

        System.out.println(findBiggestNumber(15,8,1));
        flipCoin();

    }
}