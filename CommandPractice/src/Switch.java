public class Switch {
    private Command turnOn;
    private Command turnOff;
    public Switch(Command turnOn, Command turnOff) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
    }

    public void switchOn() {
        turnOn.execute();
    }

    public void switchOff() {
        turnOff.execute();
    }

}
