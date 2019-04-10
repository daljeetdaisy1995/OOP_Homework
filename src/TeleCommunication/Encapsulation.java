package TeleCommunication;

public class Encapsulation {
	private String name;
	private String videocallperson;
	
	
	
	public String getName() {
		return name;
	}

    public void setName(String name) {
		this.name = name;
	}


    public String getVideocallperson() {
		return videocallperson;
	}

    public void setVideocallperson(String videocallperson) {
		this.videocallperson = videocallperson;
	}

    public static void main(String[] args) {
		Encapsulation var = new Encapsulation();
		var.setName("Java");
		System.out.println(var.getName());
		
		var.setVideocallperson("Among two people");
		System.out.println(var.getVideocallperson());
				

	}

}
