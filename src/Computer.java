public class Computer {
    private Procesor procesor;
    private HardDisk hardDisk;
    private Ram ram;

    public Computer(Procesor procesor, HardDisk hardDisk, Ram ram) {
        this.procesor = procesor;
        this.hardDisk = hardDisk;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return procesor +" "  +  hardDisk +" "  + ram;
    }
}
