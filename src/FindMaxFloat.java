public class FindMaxFloat {
    public static void main(String[] args) {
        //1st print welcome msg.
        System.out.println("Welcome to Find Maximum Problem using Generics");
        //take variables strings
        String e = "Ahmedabad", f = "Pune", g = "Mumbai";
        e = "Apple";

        /*calling directly without creating object coz testMaximum method also static.*/
        testMaximum(e, f, g);//calling method
    }

    /*creating testMaximum method and passing parameter in string type*/
    private static void testMaximum(String e, String f, String g) {
        String max = e;
        /*
        check condition comparing and finding max string
         */
        if (f.compareTo(e) > 0) {
            max = f;
        }
        if (g.compareTo(max) > 0) {
            max = g;
        }
    }
}
