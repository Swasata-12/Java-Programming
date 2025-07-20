public class WrapperClass {
    public static void main(String[] args) {
        int a = 1; // it is premitive variable and stores in stack
        Integer b = 1; // it is object and it stores in heap it also consists methods (Autoboxing)
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        String myString = myInt.toString();
        System.out.println(myString.length());
        System.out.println(Integer.max(23, 56));
        System.out.println(Integer.toBinaryString(8));
    }
}
