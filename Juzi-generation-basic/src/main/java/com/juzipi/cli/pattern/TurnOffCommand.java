package com.juzipi.cli.pattern;

public class TurnOffCommand implements Command{
    private Device device;

    @Override
    public void execute() {
        device.turnOff();
    }

    public TurnOffCommand(Device device) {
        this.device = device;
    }
}
