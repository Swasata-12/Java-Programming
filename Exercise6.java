// Create an array of 5 floats and calculate their sum.

public class Exercise6 {
    public static void main(String[] args) {
        float arr[] = { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f };
        float sum = 0;
        for (float element : arr) {
            sum += element;
        }
        System.out.println("The sum of the array elements is " + sum);
    }
}
