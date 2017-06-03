package cn.windssoft.test;

public class Test {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Boston");
		Customer customer2 = new Customer("Jack");
		
		Movie movie1 = new Movie("Movie1", Movie.CHILDENS);
		Movie movie2 = new Movie("Movie2", Movie.NEW_RELEASE);
		Movie movie3 = new Movie("Movie3", Movie.REGULAR);
		Movie movie4 = new Movie("Movie4", Movie.NEW_RELEASE);
		Movie movie5 = new Movie("Movie5", Movie.REGULAR);
		
		customer1.addRental(new Rental(movie1, 10));
		customer1.addRental(new Rental(movie2, 8));
		customer1.addRental(new Rental(movie3, 5));
		customer2.addRental(new Rental(movie4, 4));
		customer2.addRental(new Rental(movie5, 7));
		
		System.out.println(customer1.statement());
		System.out.println(customer2.statement());
	}
}
