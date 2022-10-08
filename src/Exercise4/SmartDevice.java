package Exercise4;

public class SmartDevice {
    String deviceName;
    String deviceId;
    String manufacturer;

    public SmartDevice() {}

    public SmartDevice(String deviceName, String deviceId, String manufacturer) {
        this.deviceName = deviceName;
        this.deviceId = deviceId;
        this.manufacturer = manufacturer;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "deviceName='" + deviceName + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
