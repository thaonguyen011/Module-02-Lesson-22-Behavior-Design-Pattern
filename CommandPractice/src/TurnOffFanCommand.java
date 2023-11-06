public class TurnOffFanCommand implements Command{
    private final Fan fan;

    public TurnOffFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        System.out.print("Fan " + fan.getName() + ": ");
        fan.turnOff();

    }
}
