package u_code_i_code;

class zomato{
	String resturantname;
	int phonenumber;
	int stars;
	
	customer cRef;
	
	void setDataForzomato(String rn, int phn, int s){
		resturantname=rn;
		phonenumber=phn;
		stars=s;
	}
	
	void showDataForzomato() {
		System.out.println("========================");
		System.out.println("*****Resturant Data*****");
		System.out.println("resturantname\t"+resturantname);
		System.out.println("phonenumber\t"+phonenumber);
		System.out.println("stars      \t"+stars);
		System.out.println("========================");
		System.out.println("**Customer Details**");
		cRef.showDataForcustomer();
	}
}

//textual representation of customer
class customer{
	String Name;
	int PhoneNumber;
	String email;
	
	void setDataForcustomer(String N, int ph, String em){
		Name=N;
		PhoneNumber=ph;
		email=em;
	}

	void showDataForcustomer() {
		System.out.println("*****Customer Data****");
		System.out.println("Name      \t"+Name);
		System.out.println("PhoneNumber\t"+PhoneNumber);
		System.out.println("email      \t"+email);
		System.out.println("=========================");
		
	}
}
	
public class food {

	public static void main(String[] args) {
		customer c1= new customer();
		zomato z1=new zomato();
	
		System.out.println("c1:"+c1);
		System.out.println("z1:"+z1);
		System.out.println("");
		c1.setDataForcustomer("Harry", 98768909, "harrymar@gmail.com");
		z1.setDataForzomato("burgerking",897837909 , 5);
		z1.cRef=c1;
		z1.showDataForzomato();
		
		//arr is a new reference variable
		//it will to int arr in heap element
		int [] arr= new int[5];
		arr[0] = 111;
		//cArr is a new reference variable
		//it will point
		customer[]cArr=new customer[5];
		cArr[0]=new customer();
		cArr[2]= new customer();
		cArr[0].setDataForcustomer("henry", 7856483, "henry@gmail.com");
		cArr[2].setDataForcustomer("mike", 7468239, "mike234@gmil.com");
		cArr[0].showDataForcustomer();
		cArr[2].showDataForcustomer();
	
	}
}



