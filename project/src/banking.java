// textual representation of an object
//
class payment {
	String Method; 
	String Refno;
	int Amount; 
	
	//Methods
	//this is a reference variable which points to current job.
	//this.Method is a property of object
	//Method is a property of method
	void setPaymentDetails(String Method,String Refno,int Amount) {
		this.Method = Method;
		this.Refno = Refno;
		this.Amount = Amount;
		
	}
	
	//Method 2 to read data from  object
	void showPaymentDetails() {
		System.out.println("======Payment======");
		System.out.println("Method:"+Method);
		System.out.println("Refno:"+Refno);
		System.out.println("Amount:\u20b9"+Amount);
		System.out.println("============");
}
}	
class customer{
	String Name; 
	String SessionTime;
	String IpAddress;
	
	void setCustomerDetails(String Name,String SessionTime,String IpAddress) {
		this.Name= Name;
		this.SessionTime= SessionTime;
		this.IpAddress= IpAddress;
}
	void showCutsomerDetails() {
		System.out.println("======Customer======");
		System.out.println("Name:"+Name);
		System.out.println("SessionTime:"+SessionTime);
		System.out.println("IpAddress:"+IpAddress);
		System.out.println("============");
	}
	payment[] Payment;
	private String Method;
	private String Refno;
	private int Amount;
	void setDetailsForCustomer(String Method,String Refno,int Amount, payment[] prr, customer[] crr) {
		this.Method = Method;
		this.Refno = Refno;
		this.Amount = Amount;
	}
}


public class banking{
	public static void main(String[] args) {
		payment[]prr= new payment[3];
		
		for(int i=0;i<prr.length;i++) {
			prr[i] = new payment();
		}
		customer[]crr =new customer[4];
		
		for(int j=0;j<crr.length;j++) {
			crr[j]= new customer();
		}
		
		
		prr[0].setPaymentDetails("RTGS", "RTGS9372PL", 250000);
		prr[1].setPaymentDetails("NEFT", "PUNB198323983712", 60000);
		prr[2].setPaymentDetails("IMPS", "IMPSU923821", 75000);
		
		crr[0].setCustomerDetails("John", "16/1/19-11:59:09:10", "128:182:383:985");
		crr[1].setCustomerDetails("Jennie","18/1/19-01:19:20:59", "821:281:784:783");
		crr[2].setCustomerDetails("Jack",  "10/1/19-11:59:09:10", "390:985:281:398");
		crr[3].setCustomerDetails("Jan",   "01/1/19-12:09:09:10", "872:928:219:823");
		
		customer c1= new customer();
		c1.setDetailsForCustomer("IMPS", "IMPS98903276", 37622, prr, crr);
		c1.showCutsomerDetails();
		 System.out.println("||||||||||||||||");
		
	}
	
}
