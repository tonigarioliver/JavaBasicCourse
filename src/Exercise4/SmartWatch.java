package Exercise4;

public class SmartWatch extends SmartDevice {
    float radius;

    public SmartWatch() {}

    public SmartWatch(float radius) {
        this.radius = radius;
    }

    public SmartWatch(String deviceName, String deviceId, String manufacturer, float radius) {
        super(deviceName, deviceId, manufacturer);
        this.radius = radius;
    }

    public String SmartWatchString() {
        return "SmartWatch{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public String toString() {
        return SmartWatchString()+super.toString();
    }
}
