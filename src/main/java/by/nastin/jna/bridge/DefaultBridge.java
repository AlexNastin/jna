package by.nastin.jna.bridge;

import com.sun.jna.NativeLibrary;
import com.sun.jna.ptr.FloatByReference;

public class DefaultBridge implements Bridge {

    private BridgeDLL bridgeDLL = BridgeDLL.INSTANCE;

    static {
        NativeLibrary.addSearchPath("NCTest", "/Applications/MyMac/Xcode Lib");
    }

    public float multiply(float a, float b) {
        FloatByReference r = new FloatByReference(0);
        bridgeDLL.multiply(a, b, r);
        return r.getValue();
    }

    @Override
    public State.ByReference handleState(State.ByReference state) {
        return bridgeDLL.handleState(state);
    }

    @Override
    public void logic() {
        bridgeDLL.logic();
    }
}