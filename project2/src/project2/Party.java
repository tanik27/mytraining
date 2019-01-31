package project2;

class Address{
	String adrsLine;
	String city;
	int zipCode;
	String GSTIN;
	
	void setAddressDetails(String i, String adrsLine, String city, int zipCode, String GSTIN){

		
		this.adrsLine = adrsLine;
		this.city = city;
		this.zipCode = zipCode;
		this.GSTIN = GSTIN;
	}
		void showAddressDetails(){

			System.out.println("===Address===");
			System.out.println("Address Line: "+adrsLine);
			System.out.println("City: "+city+" | "+zipCode);
			System.out.println("GSTIN: "+GSTIN);
			System.out.println("=============");

		
	}
}
class Order{
	int orderId;
	String date;
	String Supplier_Name;
	int price;
	
	void setOrderDetails(int orderId, String date, String Supplier_Name, int price){

		this.orderId = orderId;
		this.price = price;
		this.date = date;
		this.Supplier_Name = Supplier_Name;
		this.price = price;

	}
	void showOrderDetails(){

		System.out.println("===Order: "+orderId+"===");

		System.out.println("Date "+date );	
		System.out.println("Supplier_Name:"+Supplier_Name);
		System.out.println("Price: \u20b9"+price);
		System.out.println("===============");

	}
}

class Customer{
	String name;
	String phone;
	
	Order[] order;
	Address[] addresses;

	void setDetailsForCustomer(String name, String phone, Address[] addresses, Order[] orders){

		this.name = name;

		this.phone = phone;

		this.addresses = addresses;

		this.order = orders;
}
		void showDetailsForCustomer(){
			System.out.println("***Customer "+name+"*****");

			System.out.println("Phone "+phone);
	
			System.out.println("^^^^^^^^^^Addresses^^^^^^^^^^");
	
			for(Address aRef : addresses){

				aRef.showAddressDetails();

			}
			for(Order oRef : order){

				oRef.showOrderDetails();

			}
	
}
public static  class Party {
			public static void main(String[] args) {
				Address[] arr = new Address[3];

				

				for(int i=0;i<arr.length;i++){

					arr[i] = new Address();

				}

				

				Order[] orr = new Order[5];

				

				for(int i=0;i<orr.length;i++){

					orr[i] = new Order();

				}



				arr[0].setAddressDetails("f-282,Mandia Road", "M.M.MILLS", "PALI-MARWAR", 395302, "09DIE0094AN490");

				arr[1].setAddressDetails("3874,Raipura Market", "M.T.COMPANY", "RAJSTHAN", 395401, "08SJSAH83N99A");

				arr[2].setAddressDetails("Building No.98,Opp.SBI", "S.G.FABRICS", "MUMBAI", 392289, "07HSH039848SJ");

				

				

				orr[0].setOrderDetails(503, "29/1/2019", "MFT", 33000);

				orr[1].setOrderDetails(201, "19/1/2019", "MFT", 55090);

				orr[2].setOrderDetails(301, "21/1/2019", "MFT", 67000);

				orr[3].setOrderDetails(410, "28/1/2019", "MFT", 49080);

				orr[4].setOrderDetails(520, "30/1/2019", "MFT", 41100);

				

				Customer c1 = new Customer();

				

				
				// 1 to many Fulfillment !!

				c1.setDetailsForCustomer("John", "+91 99999 88888", arr, orr);



				c1.showDetailsForCustomer();

				int total=0;
				for(int j=0;j<orr.length;j++) {
					total=total+orr[j].price;
				}
				System.out.println("total amount:"+total);
		}
}
}

