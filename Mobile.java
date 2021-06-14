package week1.day1;

public class Mobile {
	
	
	public void makeCall() {
	System.out.println("Calling...");
	}
	public void sendMsg() {
	System.out.println("Sending Message...");	
	}
	public static void main(String[] args) {
		Mobile device = new Mobile();
		device.makeCall();
		device.sendMsg();
	}
}
