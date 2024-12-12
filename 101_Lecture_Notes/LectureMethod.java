/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("John");
        greeting("Jayden");
        greeting("Jimothy II");
        
        double num = raise(6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        System.out.println(num);
	}
	
	public static double raise(double salary, int persent){
	  double amount = salary + (salary * (persent/100.00));
	  return amount;
	}
	
	
	public static void greeting(String name){
	    System.out.println("Hello " + name);   
	}
	
	
	public static void printAnimal(){
	    System.out.println("            __");
	    System.out.println("(\\,--------'()'--o");
	    System.out.println(" (_    ___    /~\"");
	    System.out.println("(_)_)  (_)_)");
	}
}