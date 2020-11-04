package lab_6_example_07_06;

public class lab_6_example_07_06 {

	public static void main(String[] args) {
		
		Example6 ex6=new Example6();
		int[] array = ex6.method(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 15);

        for (int i : array) {
            System.out.print(i + " ");
        }

	}

}
