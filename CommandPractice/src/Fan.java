public class Fan {
    private String name;

    public Fan() {
    }

    public Fan(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println("turn on");
    }

    public void turnOff() {
        System.out.println("turn off");
    }

    public String getName() {
        return name;
    }
}
