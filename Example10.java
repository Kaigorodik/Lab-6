package lab_6_example_07_10;

public class Example10 {
	
	public static <i> int[] method(int... v) {
        int min = v[0];
        int max = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
            if (v[i] < min) {
                min = v[i];
            }
        }
        return new int[]{max, min};
    }

}
