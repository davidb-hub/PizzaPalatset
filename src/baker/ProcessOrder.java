package baker;

public class ProcessOrder {

    private String receipt;
    private static int id = 0;
    private int orderNr;
    private final int TIME_UNTIL_FINISHED = 10;

    public ProcessOrder() {

    }

    public ProcessOrder(String receipt) {
        this.receipt = receipt;
        id++;
        this.orderNr = id;
    }

    public static int getId() {
        return id;
    }

    public String getReceipt() {
        return receipt;
    }

    public int getOrderNr() {
        return orderNr;
    }

    public int getTIME_UNTIL_FINISHED() {
        return TIME_UNTIL_FINISHED;
    }
}
