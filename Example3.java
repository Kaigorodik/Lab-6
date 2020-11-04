package lab_6_example_07_03;

public class Example3 {
	
	static void min(int... v) {

        int min = Integer.MAX_VALUE;

        for(int i : v) {
            if(i < min) min = i;
        }

        System.out.println("min = " + min);
    }

    static void max(int... v) {

        int max = Integer.MIN_VALUE;

        for(int i : v) {
            if(i > max) max = i;
        }

        System.out.println("max = " + max);
    }

    static void middle (int... v) {

    	int max = Integer.MIN_VALUE;
    	int min = Integer.MAX_VALUE;
    	int middle = 0;
    	for(int i : v) {
            if(i > max && i < min) middle=i;
    	}
    	
        System.out.println("mean = " + middle);
    }
}
       

