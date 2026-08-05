package command.pattern;

// Receiver classes - the actual devices that perform actions

// TODO: Create the Television class with:
// - powerOn() method that prints "TV is now ON"
// - powerOff() method that prints "TV is now OFF"
// - setChannel(int channel) method that prints "TV channel set to [channel]"

class Television {
    // TODO: Implement the Television methods
    public void powerOn(){
        System.out.println("TV is now ON");
    }
    public void powerOff(){
        System.out.println("TV is now OFF");
    }

    public void setChannel(int channel){
        System.out.println("TV channel set to " + channel);
    }
}

// TODO: Create the Thermostat class with:
// - setTemperature(int temp) method that prints "Thermostat set to [temp] degrees"
// - turnOff() method that prints "Thermostat turned OFF"

class Thermostat {
    // TODO: Implement the Thermostat methods
    public void setTemperature(int temp){
        System.out.println("Thermostat set to " + temp + " degrees");
    }
    public void turnOff(){
        System.out.println("Thermostat turned OFF");
    }
}
