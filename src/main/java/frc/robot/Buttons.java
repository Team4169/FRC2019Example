package frc.robot;

public enum Buttons {
    A(0), B(1), X(2), Y(3), LB(4), RB(5), LT(6), RT(7), BACK(8), START(9), LeftJoystickButton(10),
    RightJoystickButton(11), UP(12), DOWN(13), LEFT(14), RIGHT(15)

    public final int port;
    Buttons(int port) {
        this.port = port;
    }
}