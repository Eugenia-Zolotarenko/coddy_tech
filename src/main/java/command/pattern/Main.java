package command.pattern;

import java.util.Scanner;

// TODO: Create RemoteControl class (the invoker) with:
// - setCommand(Command cmd) method to store a command
// - pressButton() method to execute the stored command

class RemoteControl {
    // TODO: Implement RemoteControl
    private Command command;
    public void setCommand(Command cmd){
        this.command= cmd;
    }
    public void pressButton(){
        command.execute();
    }
}

class Main {
    public static void main(String[] args) {

        // Read inputs
        int channel = 0;
        int temperature = 0;

        // TODO: Create a Television and a Thermostat
        Television tv = new Television();
        Thermostat thermostat = new Thermostat();
        // TODO: Create a RemoteControl
        RemoteControl remoteControl = new RemoteControl();

        // TODO: Demonstrate the Command Pattern:
        // 1. Set a TVOnCommand and press the button
        // 2. Set a TVChannelCommand with the input channel and press the button
        // 3. Set a ThermostatSetCommand with the input temperature and press the button
        // 4. Set a TVOffCommand and press the button
        remoteControl.setCommand(new TVOnCommand(tv));
        remoteControl.pressButton();

        remoteControl.setCommand(new TVChannelCommand(tv, channel));
        remoteControl.pressButton();

        remoteControl.setCommand(new ThermostatSetCommand(thermostat, temperature));
        remoteControl.pressButton();

        remoteControl.setCommand(new TVOffCommand(tv));
        remoteControl.pressButton();
    }
}
