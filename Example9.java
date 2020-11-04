package lab_6_example_07_09;

public class Example9 {
	
	 public static int[] method(int[] array) {
	        for (int i = 0; i<array.length/2; i++){
	            int buffer = array[i];
	            array[i] = array[array.length-i-1];
	            array[array.length-i-1] = buffer;
	        }
	        return array;
	    }

}
