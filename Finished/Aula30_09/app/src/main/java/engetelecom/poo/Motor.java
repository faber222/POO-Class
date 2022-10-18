package engetelecom.poo;

public class Motor {
    private final int RPM_MAX;
    private int rpm;
    private int km;

    public Motor(int rPM_MAX) {
        RPM_MAX = rPM_MAX;
        this.km = 0;
        this.rpm = 0;
    }

}
