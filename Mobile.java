package week1.day1;

public class Mobile {

		String mobileBrand ="Samsung";
		int MobileModel = 8;
		boolean isused1 = true;
		boolean isused2 = false;
		
		public void makeCall ()
		{	Long MobileNumber = 998877787L;
			System.out.println("Making call");
		    System.out.println(MobileNumber);}

		public void sendSMS()
		{System.out.println("Sending SMS");}
		
		public void takeSnap()
		{System.out.println("Taking Snap");}
		 
		public static void main(String[] args) {
			Mobile test = new Mobile();
			test.makeCall();
			test.sendSMS();
			test.takeSnap();
			System.out.println("Brand:" + test.mobileBrand);
			System.out.println("Model:"+ test.MobileModel);
			System.out.println("IsUsed:" + test.isused2);
		}

	}

	
	

