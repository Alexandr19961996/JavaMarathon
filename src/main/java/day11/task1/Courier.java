package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private final Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        String answer = "нет";
        if (isPayed) answer = "да";
        return "Курьер: количество доставленных заказов: " + warehouse.getCountDeliveredOrders() + "; зарплата: " + salary + "; был выплачен бонус или нет: " + answer;
    }

    public int doWork() {
        int allOrders = warehouse.getCountDeliveredOrders();
        warehouse.setCountDeliveredOrders(allOrders + 1);
        return salary += 100;
    }

    public int bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (!isPayed || warehouse.getCountDeliveredOrders() == 10000) {
            salary += 50000;
            isPayed = true;
        } else {
            System.out.println("Бонус уже был выплачен");
        }
        return salary;
    }
}
