package lab_6_example_07_05;

public class Example5 {
	
	static int nonRecursion(int arg) {
        int result = 0;
       for (int i = 1; i<= arg; i++){
           result += Math.pow(i, 2);

       }
       return result;
    }

    static int Recurcion(int arg) {
        if (arg == 1){
            return 1;
        }
        return (int) (Math.pow(arg, 2) + Recurcion(arg-1));
    }
}

