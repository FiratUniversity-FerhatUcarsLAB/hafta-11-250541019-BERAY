public class Multadd {

    /**
     * multadd(a, b, c):
     * a * b + c işlemini yapar.
     */
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    /**
     * expSum(x) aşağıdaki ifadeyi hesaplar:
     *
     *   x * e^(-x) + sqrt(1 - e^(-x))
     *
     * Bu ifade multadd ile yazılabilir:
     *   multadd(x, e^(-x), sqrt(1 - e^(-x)))
     */
    public static double expSum(double x) {
        double eNegX = Math.exp(-x);            // e^(-x)
        double sqrtPart = Math.sqrt(1 - eNegX); // sqrt(1 - e^(-x))
        return multadd(x, eNegX, sqrtPart);
    }

    public static void main(String[] args) {

        // TEST 1: multadd basit test
        System.out.println("multadd(2, 3, 5) = " +
                multadd(2, 3, 5));   // 2*3 + 5 = 11

        // TEST 2:
        // sin(π/4) + cos(π/4)/2
        double sinPart = Math.sin(Math.PI / 4);
        double cosPart = Math.cos(Math.PI / 4);

        double expr1 = multadd(cosPart, 0.5, sinPart);

        System.out.println("sin(π/4) + cos(π/4)/2 = " + expr1);

        // TEST 3:
        // log 10 + log 20
        double expr2 = multadd(Math.log(10), 1, Math.log(20));

        System.out.println("log(10) + log(20) = " + expr2);

        // TEST 4: expSum
        System.out.println("expSum(1) = " + expSum(1));
        System.out.println("expSum(2) = " + expSum(2));
    }
}
