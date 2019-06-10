public class Procesor extends IngrediensOfYourComputer {


    public static double MAX_TEMP = 75;
    private double temperture;
    private int clockSpeed;

    public Procesor(String model, String producer, String seriesNumber, double temperture, int clockSpeed) {
        super(model, producer, seriesNumber);
        this.temperture = temperture;
        this.clockSpeed = clockSpeed;
    }

    public static double getMaxTemp() {
        return MAX_TEMP;
    }

    public double getTemperture() {
        return temperture;
    }

    public void setTemperture(double temperture) {
        this.temperture = temperture;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public void clockSpeedUp(int number) {
        setClockSpeed(getClockSpeed() + number);
        setTemperture(getTemperture() + number / 100 * 10);//te wartosći można włożyć w jakąś stałą itp
        if (getTemperture() + number / 100 * 10 > MAX_TEMP) {
            throw new UnacceptedTemperatureException();
        }

    }

    @Override
    public String toString() {
        return super.toString() +" " + temperture +" " +clockSpeed +" // ";
    }
}
