public class Fraction {
    private final int num;
    private final int den;

    private static Fraction reduceToLowerTerms(int num, int den) {
        int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int p: primeNumbers) {
            while (hasFactor(num, p) && hasFactor(den, p)) {
                num = num / p;
                den = den / p;
            }
        }

        return new Fraction(num, den);
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
        return reduceToLowerTerms(num, den);
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
}
