package smartHome;

public class BulbSpy implements Bulb {
    private boolean turnOn_wasCalled = false;

    @Override
    public void turnOn() {
        turnOn_wasCalled = true;
    }

    public boolean turnOn_wasCalled() {
        return turnOn_wasCalled;
    }
}
