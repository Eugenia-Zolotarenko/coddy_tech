package command.pattern;

// Concrete Command classes that encapsulate device operations

// TODO: Create TVOnCommand class that:
// - Takes a Television in its constructor
// - Implements Command interface
// - Calls powerOn() when executed

class TVOnCommand implements Command {
    // TODO: Implement TVOnCommand
    private Television tv;

    public TVOnCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.powerOn();
    }
}

// TODO: Create TVOffCommand class that:
// - Takes a Television in its constructor
// - Implements Command interface
// - Calls powerOff() when executed

class TVOffCommand implements Command {
    // TODO: Implement TVOffCommand
    private Television tv;

    public TVOffCommand(Television tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.powerOff();
    }
}

// TODO: Create TVChannelCommand class that:
// - Takes a Television and int channel in its constructor
// - Implements Command interface
// - Calls setChannel() with the channel when executed

class TVChannelCommand implements Command {
    // TODO: Implement TVChannelCommand
    private Television tv;
    private int channel;

    public TVChannelCommand(Television tv, int channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        tv.setChannel(channel);
    }
}

// TODO: Create ThermostatSetCommand class that:
// - Takes a Thermostat and int temperature in its constructor
// - Implements Command interface
// - Calls setTemperature() with the temperature when executed

class ThermostatSetCommand implements Command {
    // TODO: Implement ThermostatSetCommand
    private Thermostat thermostat;
    private int temperature;

    public ThermostatSetCommand(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        thermostat.setTemperature(temperature);
    }
}
