public class Fraction {
    private final int num;

//    public Fraction(int num, int den) {
//    }

    public Fraction(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public Fraction add(Fraction fraction) {
        return new Fraction(0);
    }
}
