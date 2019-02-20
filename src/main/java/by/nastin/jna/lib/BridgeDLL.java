package by.nastin.jna.lib;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.ptr.FloatByReference;

public interface BridgeDLL extends Library {

  BridgeDLL INSTANCE = Native.load("NCTest", BridgeDLL.class);

  void multiply(float a, float b, FloatByReference result);
}
