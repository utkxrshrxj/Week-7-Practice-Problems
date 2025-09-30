class SmartDevice {
    protected String name;
    public SmartDevice(String name) {
        this.name = name;
    }
    public void turnOn() {
        System.out.println(name + " is now ON");
    }
    public void turnOff() {
        System.out.println(name + " is now OFF");
    }
}

class SmartLight extends SmartDevice {
    public SmartLight(String name) {
        super(name);
    }
    public void changeColor(String color) {
        System.out.println(name + " changed color to " + color);
    }
}

class SmartThermostat extends SmartDevice {
    public SmartThermostat(String name) {
        super(name);
    }
    public void setTemperature(int temp) {
        System.out.println(name + " set temperature to " + temp + "°C");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        SmartDevice d1 = new SmartLight("Living Room Light");
        SmartDevice d2 = new SmartThermostat("Bedroom Thermostat");

        d1.turnOn();
        if (d1 instanceof SmartLight) {
            SmartLight light = (SmartLight) d1;
            light.changeColor("Blue");
        }

        d2.turnOn();
        if (d2 instanceof SmartThermostat) {
            SmartThermostat t = (SmartThermostat) d2;
            t.setTemperature(22);
        }
    }
}
