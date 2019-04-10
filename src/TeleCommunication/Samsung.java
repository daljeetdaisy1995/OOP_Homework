package TeleCommunication;

public class Samsung extends AbstractTelephone implements InterfaceTelephone {

	@Override
	public void answercall() {
		
	}

	@Override
	public void declinecall() {
		
		
	}
	
	@Override
	public void holdcall() {
		System.out.println("holding call which is generated in samsung and is coming from interface telephone");
	}

	
	public void message(){
	 System.out.println("message from samsung");
		
	}
			
	
	
	}


