// It is the example of Polymorphism in java. 

interface MyCamera {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4K....");
    }
}

interface MyWifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting....");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Taking snap");
    }
    // public void record4KVideo(){
    // System.out.println("Taking snap and recoding in 4k");
    // }

    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = { "Harry", "Prashanth", "Anjali5G" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class Interface2 {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        MyCamera cam = new MySmartPhone(); // This is a smartphone but, use it as a camera
        ms.record4KVideo();
        // ms.greet(); --> Throws an error!
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
        ms.connectToNetwork("Swasata1999");
        // cam.getNetworks(); --> Not allowed
        cam.takeSnap();
        cam.recordVideo();
        cam.record4KVideo();

    }
}
