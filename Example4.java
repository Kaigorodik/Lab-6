package lab_6_example_07_04;

public class Example4 {
	
	static int nonRecursion(int arg) {
        int r = 1;
        while (arg >= 1) {
            r *= arg;
            arg -= 2;
        }
        return r;
    }

    static int Recursion(int arg) {
        int r = arg % 2 == 0 ? 2 : 1;
        if (arg <= r) {
            return r;
        }
        return arg * Recursion(arg-=2);
    }
}


