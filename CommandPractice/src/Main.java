
public class Main {
    public static void main(String[] args) {
       Fan fan = new Fan("Senko");
       Command turnOnFanCommand = new TurnOnFanCommand(fan);
       Command turnOffFanCommand = new TurnOffFanCommand(fan);

       Switch switchFan = new Switch(turnOnFanCommand, turnOffFanCommand);

       switchFan.switchOn();
       switchFan.switchOff();

        Fan fan2 = new Fan("VN");
        Command turnOnFanCommand2 = new TurnOnFanCommand(fan2);
        Command turnOffFanCommand2 = new TurnOffFanCommand(fan2);

        Switch switchFan2 = new Switch(turnOnFanCommand2, turnOffFanCommand2);
        switchFan2.switchOn();
        switchFan2.switchOff();
    }
}