package lab_6_example_07_01;

class Example1 {
	
	private String str1;
    private char ch1;
    
    
    public void setValue(char ch)
    {
        ch1 = ch;
    }
    
    public void setValue(String str)
    {
        str1 = str;
    }

    public void setValue(char [] chArray)
    {

        if (chArray.length == 1)
        {
            ch1 = chArray[0];
        }
        else
            str1 = new String(chArray);

    }
    
    void print() {
        System.out.println("ch = " + ch1 + ", str = " + str1);
}
}


