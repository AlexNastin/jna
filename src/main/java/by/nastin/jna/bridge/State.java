package by.nastin.jna.bridge;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class State extends Structure {

    public static class ByReference extends State implements Structure.ByReference {
    }

    //todo to private
    public int id;
    public int value;

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("id", "value");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("State{");
        sb.append("id=").append(id);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}