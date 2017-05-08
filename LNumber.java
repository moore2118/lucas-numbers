package LucasNumbers;

class LNumber {

    private int value;
    private boolean divisible = false;
// constructor for LNumber class
    LNumber(int number){
        value = number;
    }

    @Override // overrodes toString method
    public String toString() {
        return Integer.toString(value) + " : " + isDivisible();
    }

    public int getValue() {
        return value;
    }

    public boolean isDivisible() {
        return divisible;
    }

    public void setDivisible(boolean divisible) {
        this.divisible = divisible;
    }
}
