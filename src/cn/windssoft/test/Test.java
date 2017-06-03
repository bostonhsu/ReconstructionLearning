package cn.windssoft.test;

public class Test {

	public static void main(String[] args) {
		Customer customers[] = new Customer[5];
		for (int i = 0; i < customers.length; i++) {
			customers[i] = new Customer("Customer" + String.valueOf(i));
		}
		
		Movie movie1 = new Movie("Test1", Movie.CHILDENS);
		Movie movie2 = new Movie("Test2", Movie.NEW_RELEASE);
		Movie movie3 = new Movie("Test3", Movie.REGULAR);
		Movie movie4 = new Movie("Test4", Movie.NEW_RELEASE);
		Movie movie5 = new Movie("Test5", Movie.REGULAR);
		
		customers[0].addRental(new Rental(movie1, 5));
		customers[1].addRental(new Rental(movie2, 3));
		customers[2].addRental(new Rental(movie3, 2));
		customers[3].addRental(new Rental(movie4, 2));
		customers[4].addRental(new Rental(movie5, 1));
		
		for (Customer customer : customers) {
			System.out.println(customer.statement());
		}
	}

}
