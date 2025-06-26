package in.aryancoding.challenge102;

public enum TrafficColor {

    RED(9000),
    GREEN(1000),
    YELLOW(3000);

    private final int onTimeInMills;

    public int getOnTimeInMills() {
        return onTimeInMills;
    }

    TrafficColor(int onTimeInMills) {
        this.onTimeInMills = onTimeInMills;
    }
}
