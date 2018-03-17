/*
  	ISYS 320
  	Name(s):Drew Schulte
  	Date: 3/17/2018
*/

// 1. Your predicted output Message1 and Message2
 

public class Tricky {
    public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main.");
    }
    
    public static void message1() {
        System.out.println("This is message1.");
    }
    
    public static void message2() {
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message 2.");
    }
}

// 3. Were you correct? Explain any differences, since you helped me in class and then reading the book it cleared some things up
 
 

