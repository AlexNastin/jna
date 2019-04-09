package by.nastin.jna;

import by.nastin.jna.bridge.Bridge;
import by.nastin.jna.bridge.DefaultBridge;
import by.nastin.jna.bridge.State;

public class Main {

    public static void main(String[] args) {

        Bridge bridge = new DefaultBridge();

        System.out.println("Bridge calling multiply ()...");
        float r = bridge.multiply(3.1f, 3f);
        System.out.println("Bridge r: " + r);

        State.ByReference state = new State.ByReference();
        state.setId(1);
        state.setValue(2);
        State.ByReference resultState = bridge.handleState(state);

        System.out.println("Result State: " + resultState);

        bridge.logic();
    }
}