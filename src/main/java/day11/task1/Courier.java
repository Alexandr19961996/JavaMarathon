package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private final Warehouse warehouse;
    private static final int SALARY_AMOUNT = 100;
    private static final int BONUS = 50000;
    private static final int NUMBER_OF_ORDERS_TO_RECEIVE_THE_BONUS = 10000;

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
        warehouse.increaseCountDeliveredOrdersByOne();
        return salary += SALARY_AMOUNT;
    }

    public int bonus() {
        if (warehouse.getCountDeliveredOrders() < NUMBER_OF_ORDERS_TO_RECEIVE_THE_BONUS) {
            System.out.println("Бонус пока не доступен");
        } else if (!isPayed || warehouse.getCountDeliveredOrders() == NUMBER_OF_ORDERS_TO_RECEIVE_THE_BONUS) {
            salary += BONUS;
            isPayed = true;
        } else {
            System.out.println("Бонус уже был выплачен");
        }
        return salary;
    }
}
