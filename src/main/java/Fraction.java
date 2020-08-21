public class Fraction {
    private final int num;
    private final int den;

    private static Fraction reduceToLowerTerms(int num, int den) {
        int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i: primeNumbers) {
            if (num >= i && num % i == 0 && den >= i && den % i == 0) {
                num = num / i;
                den = den / i;
            };
        }
        Fraction result = new Fraction(num, den);
        return result;
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

    public Fraction plus(Fraction fraction) {
        return Fraction.of(this.num + fraction.num);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "num=" + num +
                ", den=" + den +
                '}';
    }
}
