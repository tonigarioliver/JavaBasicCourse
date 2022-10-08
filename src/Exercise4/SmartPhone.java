package Exercise4;

public class SmartPhone extends SmartDevice {
    float size;

    public SmartPhone() {}

    public SmartPhone(float size) {
        this.size = size;
    }

    public SmartPhone(String deviceName, String deviceId, String manufacturer, float size) {
        super(deviceName, deviceId, manufacturer);
        this.size = size;
    }

    public String SmartPhoneString() {
        return "SmartPhone{" +
                "size=" + size +
                '}';
    }

    @Override
    public String toString() {
        return SmartPhoneString()+super.toString();
    }
}
