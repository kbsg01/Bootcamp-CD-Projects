package Teléfonos;

public class PhoneTest {

	public static void main(String[] args) {
		Galaxy S9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
		IPhone iphone11 = new IPhone("11", 100, "AT&T", "Zing");
		
		S9.displayinfo();
		System.out.println(S9.ring());
		System.out.println(S9.unlock());
		
		iphone11.displayinfo();
		System.out.println(iphone11.ring());
		System.out.println(iphone11.unlock());
	}

}
