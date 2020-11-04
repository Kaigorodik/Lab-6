package lab_6_example_07_07;

public class Example7 {
	
	public static int[] method(char[] array) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }

}
