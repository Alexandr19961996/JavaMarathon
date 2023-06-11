package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void increaseCountPickedOrdersByOne() {
        setCountPickedOrders(getCountPickedOrders() + 1);
    }

    public void increaseCountDeliveredOrdersByOne() {
        setCountDeliveredOrders(getCountDeliveredOrders() + 1);
    }

    @Override
    public String toString() {
        return "Количество собранных заказов: " + countPickedOrders + "; количество доставленных заказов: " + countDeliveredOrders;
    }
}
