package by.nastin.javamemory;

import com.sun.jna.Native;

import java.lang.reflect.Field;

public class Main {

  static {
    try {
//      setLibraryPath("/Library/Java/Extensions");
      setLibraryPath("/Users/aliaksei-nastsin/IdeaProjects/javamemory/scripts");
    } catch (Exception e) {
      e.printStackTrace();
    }
    Native.load("TestCMain", TestCMain.class);
//    System.loadLibrary("main");
  }



  public static void main(String[] args) {



  }

  public static void setLibraryPath(String path) throws Exception {
    System.setProperty("java.library.path", path);

    //set sys_paths to null
    final Field sysPathsField = ClassLoader.class.getDeclaredField("sys_paths");
    sysPathsField.setAccessible(true);
    sysPathsField.set(null, null);
  }
}
