enum Status {
    Running, Success, Failed, Pending;
}

enum Laptop1 {
    Mackbook(2000), Asus(4500), Apple(8523), Lenovo(1000);

    private int price;

    private Laptop1(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        Status s = Status.Running;
        Status s1[] = Status.values();
        System.out.println(s);
        System.out.println(s.ordinal());
        for (Status status : s1) {
            System.out.println(status + " " + status.ordinal());
        }
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i] + " " + s1[i].ordinal());
        }

        // We can also use it in case of switch
        for (Status status : s1) {
            if (status == Status.Running) {
                System.out.println("All Good");
            } else if (status == Status.Failed) {
                System.out.println("Try Again");
            } else if (status == Status.Pending) {
                System.out.println("Please Wait");
            } else {
                System.out.println("Done");
            }
        }

        for (Laptop1 lap : Laptop1.values()) {
            System.out.println(lap + " : " + lap.getPrice() + " : " + lap.ordinal());
        }
    }
}
