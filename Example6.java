package lab_6_example_07_06;

public class Example6 {
	
	 static int[] method(int[] array, int num) {
        if (array.length > num) {
            int[] newArr = new int[num];
            for (int i = 0; i < num; i++) {
                newArr[i] = array[i];
            }
            return newArr;
        } else {
            return array;
        }
    }

}
