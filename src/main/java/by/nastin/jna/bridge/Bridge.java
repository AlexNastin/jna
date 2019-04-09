package by.nastin.jna.bridge;

public interface Bridge {

    float multiply(float a, float b);

    State.ByReference handleState(State.ByReference state);

    void logic();
}