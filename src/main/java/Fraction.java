public class Fraction {
    private final int num;
    private final int den;

    private static Fraction reduceToLowerTerms(Fraction f) {
        int _num = Math.abs(f.num);
        int _den = Math.abs(f.den);

        int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int p: primeNumbers) {
            while (hasFactor(_num, p) && hasFactor(_den, p)) {
                _num = _num / p;
                _den = _den / p;
            }
        }
        return new Fraction(_num, _den);
    }

    private static Fraction defineSign(Fraction f) {
        int _num = f.num * (int)(Math.signum(f.num) * Math.signum(f.den));
        int _den = Math.abs(f.den);
        return new Fraction(_num, _den);
    }

    private static Fraction normalize(Fraction original) {
        Fraction reduced = reduceToLowerTerms(original);
        Fraction signDefined = defineSign(reduced);
        return signDefined;
    }

    private static boolean hasFactor(int number, int primeNumber) {
        return number >= primeNumber && number % primeNumber == 0;
    }

    private Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public static Fraction of(int num, int den) {
        if (den == 0) throw new IllegalArgumentException("Den cannot be zero");
        return normalize(new Fraction(num, den));
    }

    public static Fraction of(int num) {
        return of(num, 1);
    }

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Fraction)) return false;
        Fraction oth = (Fraction) obj;
        return this.num == oth.num && this.den == oth.den;
    }

    public Fraction plus(Fraction other) {
        int newDen = this.den * other.den;
        int newNum1 = (newDen / this.den) * this.num;
        int newNum2 = (newDen / other.den) * other.num;
        int newNum = newNum1 + newNum2;
        return Fraction.of(newNum, newDen);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "num=" + num +
                ", den=" + den +
                '}';
    }

    public Fraction inverse() {
        return Fraction.of(this.den, this.num);
    }
}
