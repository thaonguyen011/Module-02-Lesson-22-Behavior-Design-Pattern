public class TurnOnFanCommand implements Command{
    private final Fan fan;

    public TurnOnFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        System.out.print("Fan " + fan.getName() +": ");
        fan.turnOn();

    }
}
