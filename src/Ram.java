public class Ram extends IngrediensOfYourComputer {

    public static double MAX_TEMP = 80;
    private int memoryAmount;
    private int clockSpeed;
    private double temperture;

    public static double getMaxTemp() {
        return MAX_TEMP;
    }

    public int getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(int memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public double getTemperture() {
        return temperture;
    }

    public void setTemperture(double temperture) {
        this.temperture = temperture;
    }

    public Ram(String model, String producer, String seriesNumber, int memoryAmount, int clockSpeed, double temperture) {
        super(model, producer, seriesNumber);
        this.memoryAmount = memoryAmount;
        this.clockSpeed = clockSpeed;
        this.temperture = temperture;
    }

    @Override
    public String toString() {
        return super.toString() + " " + memoryAmount + " " + clockSpeed + " " + temperture + " // ";
    }

    public void ramClockUp(int change) {
        setClockSpeed(getClockSpeed() + change);
        setTemperture(getTemperture() + change / 100 * 15);
        if (temperture > MAX_TEMP) {
            throw new UnacceptedTemperatureException();
        }
    }

}
