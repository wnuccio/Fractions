public class Fraction {
    private final int num;

//    public Fraction(int num, int den) {
//    }

    public Fraction(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Fraction)) return false;
        Fraction oth = (Fraction) obj;
        return this.num == oth.num;
    }

    public Fraction plus(Fraction fraction) {
        return new Fraction(this.num + fraction.num);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "num=" + num +
                '}';
    }
}
