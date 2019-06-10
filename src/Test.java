public class Test {
    public static void main(String[] args) {

        Procesor procesorA = new Procesor("Intel", "Intel", "Intel", 40, 2000);
        HardDisk hardDiskA = new HardDisk("Hartdisk", "Hartdisk", "Hartdisk", 128);
        Ram ramA = new Ram("Ram", "Ram", "Ram", 4000, 2000, 40);
        Computer computer1 = new Computer(procesorA, hardDiskA, ramA);
        System.out.println(procesorA);
        System.out.println(hardDiskA);
        System.out.println(ramA);
        System.out.println(computer1);

        try {
            procesorA.clockSpeedUp(300);
        } catch (UnacceptedTemperatureException e) {
            System.out.println("Zbyt wygórowane parametry >>> SPŁONIESZ :)");
        }
        System.out.println(computer1);

        try {
            ramA.ramClockUp(100);
        } catch (UnacceptedTemperatureException e) {
            System.out.println("Zbyt wygórowane parametry >>> SPŁONIESZ :)");
        }
        System.out.println(computer1);

    }
}