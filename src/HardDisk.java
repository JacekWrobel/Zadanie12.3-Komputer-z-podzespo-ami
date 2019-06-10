public class HardDisk extends IngrediensOfYourComputer {

    private int memoryAmount;

    public HardDisk(String model, String producer, String seriesNumber, int memoryAmount) {
        super(model, producer, seriesNumber);
        this.memoryAmount = memoryAmount;
    }

    public int getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(int memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

    @Override
    public String toString() {
        return super.toString() + " " + memoryAmount + " // ";
    }

}
