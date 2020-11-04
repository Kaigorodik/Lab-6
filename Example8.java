package lab_6_example_07_08;

public class Example8 {
	
	 public static double method(int[] array) {
	        int result = 0;
	        for (int i = 0; i < array.length; i++) {
	            result += array[i];
	        }
	        return (double)result/array.length;
	    }

}
