package com.wuyj.modle.command.simple;

/**
 * @author wuyj
 * @date 2022/1/22 10:41 下午
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
