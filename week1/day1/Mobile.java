package week1.day1;

public class Mobile {
	private void makeCall() {
		String name="ONEPLUS";
		float mobileWeight=450f;
		System.out.println("call connected");
		}
	private void sendMSG() {
		boolean fullCharged=true;
		long mobileCost=25000;
		System.out.println("DOING WELL");
		}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMSG();
		System.out.println("This is my Mobile");
		}

}
