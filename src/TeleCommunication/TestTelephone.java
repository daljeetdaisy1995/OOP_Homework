package TeleCommunication;

public class TestTelephone {

	public static void main(String[] args) {
		Samsung samsung = new Samsung();
		samsung.holdcall();
		
        samsung.message();
        
      Iphone iphone = new Iphone();
      iphone.videocall();
      
        
	}

}
