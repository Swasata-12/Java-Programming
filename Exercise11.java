// Write a function to find the average of a set of numbers passed as arguments.

public class Exercise11 {
    static float sumAvg(float x, int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        float avg = sum / x;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("The Average is: " + sumAvg(5, 1, 5, 4, 78, 45));
    }
}
