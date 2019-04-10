package TeleCommunication;

public class Polymorphism extends Iphone {
	
	//Method overloading
	
	public void callforward(String name1, String name2) {
		String name = name1+" "+ name2;
		System.out.println(name);
	}

	public void callforward(String name1, String name2, String name3) {
		String name4 = name1 + name2+ name3;
		
		System.out.println(name4);
	}
	
	//method overriding
	
	@Override 
	public void videocall() {
		System.out.println("video call in the Polymorphism class");
	}

      public static void main(String []args) {
    	  Polymorphism polymorphism = new Polymorphism();
    	  polymorphism.callforward("Raman", "Aman");
    	  
    	  polymorphism.videocall();
    	  
	
}
      }