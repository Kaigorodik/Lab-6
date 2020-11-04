package lab_6_example_07_01;

public class lab_6_example_07_01 {

	public static void main(String[] args) {
		
    Example1 ex1=new Example1();
    ex1.print();
    
    ex1.setValue('K');
    ex1.setValue("I am learning Java");
    ex1.print();
    
    char [] chArray= {'F'};
    ex1.setValue(chArray);
    ex1.print();

	}

}
