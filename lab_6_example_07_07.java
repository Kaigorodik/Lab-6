package lab_6_example_07_07;

public class lab_6_example_07_07 {

	public static void main(String[] args) {
		Example7 ex7=new Example7();
		int[] array = ex7.method(new char[]{'A', 'B', 'C', 'D', 'E', 'F','K','L'});

        for (int i : array) {
            System.out.print(i + " ");
        }

	}

}
