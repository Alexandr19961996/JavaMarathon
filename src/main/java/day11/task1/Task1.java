package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        // test 1
        Warehouse warehouseOne = new Warehouse();
        Picker pickerOne = new Picker(warehouseOne);
        Courier courierOne = new Courier(warehouseOne);
        businessProcess(pickerOne);
        businessProcess(courierOne);

        System.out.println(pickerOne);
        System.out.println(courierOne);
        System.out.println();

        // test 2
        Warehouse warehouseTwo = new Warehouse();
        Picker pickerTwo = new Picker(warehouseTwo);
        Courier courierTwo = new Courier(warehouseTwo);

        pickerTwo.doWork();
        courierTwo.doWork();

        System.out.println(pickerTwo);
        System.out.println(courierTwo);

        System.out.println();

        System.out.println(pickerOne);
        System.out.println(courierOne);
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
