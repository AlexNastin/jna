package by.nastin.jna;

import by.nastin.jna.lib.Bridge;
import by.nastin.jna.lib.DefaultBridge;

public class Main {

  public static void main(String[] args) {

    Bridge bridge = new DefaultBridge();

    System.out.println("SimpleDll calling multiply ()...");
    float r = bridge.multiply(3.1f, 3f);
    System.out.println("SimpleDll r: " + r);
  }
}
