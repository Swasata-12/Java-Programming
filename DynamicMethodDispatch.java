// When obj.on() will be executed, it will call the on() method of the SmartPhone() class 
// because the reference variable obj is pointing towards the object of class SmartPhone()

class Phone {
    public void showTime() {
        System.out.println("Time is 8 am");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }

    @Override
    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        // SmartPhone obj1 = new Phone(); // Not allowed
        obj.showTime();
        obj.on();
        // obj.music(); // Not allowed
    }
}
