public class Clock() {
    private clockHand seconds;
    private clockHand minutes;
    private clockHand hours;

    public Clock() {
        this.seconds = new clockHand();
        this.minutes = new clockHand();
        this.hours = new clockHand(24);
    }

    public void advance() {
        this.seconds.advance();

        if (this.seconds.getValue() == 0) {
            this.minutes.advance();

            if (this.minutes.getValue() == 0) {
                this.hours.advance();
            }
        }
    }

    @Override
    public String toString() {
        return this.hours.getValue() + ":" + this.minutes.getValue() + ":" + this.hours.getValue();
    }
    
}
