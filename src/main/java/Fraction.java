public class Fraction {
    private final int num;
    private final int den;

    public Fraction(int num, int den) {
        if (num % den == 0) {
            num = num / den;
            den = 1;
        }

        this.num = num;
        this.den = den;
    }

    public Fraction(int num) {
        this(num, 1);
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
