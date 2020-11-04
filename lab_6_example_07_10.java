package lab_6_example_07_10;

public class lab_6_example_07_10 {

	public static void main(String[] args) {
		Example10 ex10=new Example10();
		int[] arr = ex10.method(new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19});

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

	}


