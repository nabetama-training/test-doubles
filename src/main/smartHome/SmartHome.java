package smartHome;

public class SmartHome {
    public void run(Bulb bulb, TheSwitch aSwitch) {
        if (aSwitch.isOn()) {
            bulb.turnOn();
        }
        bulb.turnOff();
    }
}
