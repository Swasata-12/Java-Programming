public class Variables {
    public static void main(String[] args) {
        boolean isPassed = true;
        int count = 12;
        byte marks = 13; // stores whole number from -128 to 127
        short studentsCount = 1235;
        float pi = 3.14f;
        char myLetter = 'A';
        String name = "Harry";
        String name1 = new String("Swasata");
        long value = 12;
        int value1 = (int) value; // Explicite conversion
        byte b = 127;
        int a = 12;
        b = (byte) a;
        float f = 5.6f;
        int x = (int) f; // in x we get only 5
        System.out.println(name);
        System.out.println(name1);
        System.out.println(count);
        System.out.println(marks);
        System.out.println(isPassed);
        System.out.println(myLetter);
        System.out.println(studentsCount);
        System.out.println(pi);
        System.out.println(value1);
        System.out.println("The value of x after type conversion is: " + x);
    }
}
