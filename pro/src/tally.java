public class tally {
	public static void main(String[] args) {
	System.out.println();

	

	int sales = 1;

	int purchase = 2;

	int crdrnotes = 3;

	int receipt = 4;

	int payment = 5;

	

	int userChoice = 6;

	



	

	if(userChoice ==12 ){

		System.out.println("open the sales vochuer");

	}else if(userChoice == sales){

		System.out.println("open the purchase vochuer");

	}else if(userChoice == purchase){

		System.out.println("open the credit debit vochuer");

	}else if(userChoice == crdrnotes){

		System.out.println("open the receipt  vochuer");

	}else if(userChoice == receipt){

		System.out.println("open the payment vochuer");

	}else{

		System.out.println("Please Select a valid optiont");

	}

	

	System.out.println();

	

	// Switch Case

	switch (userChoice) {

		case 1:

			System.out.println("open the sales vochuer");


			break;

			

		case 2:

			System.out.println("open the purchase vochuer");

			break;

			

		case 3:

			System.out.println("open the credit debit vochuer");

			break;

			

		case 4:

			System.out.println("open the receipt  vochuer");
			break;

			

		case 5:

			
			System.out.println("open the payment vochuer");
			break;

			

		default:

			System.out.println("Please Select a Valid option");

			break;

	}

}
}
