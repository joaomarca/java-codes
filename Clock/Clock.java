public class Clock {
    private clockHand seconds;
    private clockHand minutes;
    private clockHand hours;

    public Clock() {
        this.seconds = new clockHand();
        this.minutes = new clockHand();
        this.hours = new clockHand(24);
    }

    public void advance(int value) {
        this.seconds.advance(value);

        if (this.seconds.getValue() == 0) {
            this.minutes.advance();

            if (this.minutes.getValue() == 0) {
                this.hours.advance();
            }
        }
    }

    public void advance() {
        this.advance(1);
    }

    @Override
    public String toString() {
        return this.hours.getTime() + ":" + this.minutes.getTime() + ":" + this.seconds.getTime();
    }

}
