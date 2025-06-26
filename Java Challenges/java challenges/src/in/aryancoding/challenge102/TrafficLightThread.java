package in.aryancoding.challenge102;

public class TrafficLightThread extends Thread{

    private final TrafficColor color;

    public TrafficLightThread(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("\n%s is active", color);
        try {
            Thread.sleep(color.getOnTimeInMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("\n%s is Inactive now", color);
    }
}
