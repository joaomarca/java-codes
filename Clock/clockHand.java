public class clockHand() {
    private int value;
    private int limit;

    public clockHand(int limit) {
        this.value = 0;
        this.limit = limit;
    }

    public clockHand() {
        this(0, 60);
    }

    public void advance(int value) {
        this.value += value;
        if (this.value == limit) {
            this.value = 0;
        } else if (this.value > 60) {
            this.value = value - 1;
        }
    }

    public int getValue() {
        return this.value;
    }

}
