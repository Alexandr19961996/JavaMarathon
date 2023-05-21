package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private final Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        String answer = "нет";
        if (isPayed) answer = "да";
        return "Сборщик: количество cобранных заказов: " + warehouse.getCountPickedOrders() + "; зарплата: " + salary + "; был выплачен бонус или нет: " + answer;
    }

    public int doWork() {
        int allOrders = warehouse.getCountPickedOrders();
        warehouse.setCountPickedOrders(allOrders + 1);
        return salary += 80;
    }

    public int bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (!isPayed || warehouse.getCountPickedOrders() == 10000) {
            salary += 70000;
            isPayed = true;
        } else {
            System.out.println("Бонус уже был выплачен");
        }
        return salary;
    }
}
