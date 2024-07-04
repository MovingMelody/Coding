import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        varAgrsFunction(1, 2, 3, 4);

        // Vararg parameter must be the last in the list
        multiple(2, 3.5, "Sun", "Moon", "Mars");
    }

    // here nums is called "Variable Length of Arguments" (length varies)
    static void varAgrsFunction(int... nums) {
        System.out.println("nums is of type " + ((Object) nums).getClass().getSimpleName() + " : " + Arrays.toString(nums));
    }

    // Vararg parameter must be the last in the list
    static void multiple(int a, double d, String... names) {
        System.out.println(a);
        System.out.println(d);
        System.out.println(Arrays.toString(names));
    }

    static void sameName(int x){
        System.out.println(x);
    }

    /// Function Overloading - happens at compile time
    static String sameName(String x){
        return "8" + x;
    }
}
