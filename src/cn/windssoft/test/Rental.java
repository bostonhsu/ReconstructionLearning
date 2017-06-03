package cn.windssoft.test;

public class Rental {
	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}
	
	/**
	 * @deprecated Use {@link cn.windssoft.test.Movie#getCharge(cn.windssoft.test.Rental)} instead
	 */
	public double getCharge() {
		return _movie.getCharge(_daysRented);
	}

	/**
	 * @deprecated Use {@link cn.windssoft.test.Movie#getFrequentRenterPoints(cn.windssoft.test.Rental)} instead
	 */
	public int getFrequentRenterPoints() {
		return _movie.getFrequentRenterPoints(_daysRented);
	}
}
