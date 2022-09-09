public class FindMaxFloat {
    public static void main(String[] args) {
        System.out.println("Welcome to Find Maximum Problem using Generics");
        Float a = 20.1f, b = 1.5f, c = 19.99f;
        testMaximum(a, b, c); //calling method
    }
    /*create testMaximum method and passing parameter */
    private static void testMaximum(Float a,Float b, Float c) {
        Float max = a;
        /*checking the condition and finding maximum no*/
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum Number is: " + max);
    }
}
