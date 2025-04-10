public class clockHand {
    private int value;
    private int limit;

    public clockHand(int limit) {
        this.value = 0;
        this.limit = limit;
    }

    public clockHand() {
        this(60);
    }

    public void advance(int value) {
        this.value += value;
        if (this.value == this.limit) {
            this.value = 0;
        } else if (this.value > 60) {
            this.value = value - 1;
        }
    }

    public void advance() {
        this.advance(1);
    }

    public int getValue() {
        return this.value;
    }

    public String getTime() {
        if (this.getValue() < 10) {
            return "0" + this.getValue();
        } else {
            return String.valueOf(this.getValue());
        }
    }

}
