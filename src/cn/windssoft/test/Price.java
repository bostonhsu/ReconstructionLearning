package cn.windssoft.test;

abstract class Price {
	abstract int getPriceCode();

	public double getCharge(int daysRented) {
		double result = 0;
		switch (getPriceCode()) {
		
		case Movie.NEW_RELEASE:
			result += daysRented * 3;
			break;
		case Movie.CHILDENS:
			result += 1.5;
			if (daysRented > 3) {
				result += (daysRented - 3) * 1.5;
			}
			break;
		}
		return result;
	}
}

class ChildensPrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.CHILDENS;
	}
}

class NewReleasePrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
}

class RegularPrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.REGULAR;
	}
	
	public double getCharge(int daysRented) {
		double result = 2;
		if (daysRented > 2) {
			result += (daysRented - 2) * 1.5;
		}
		return result;
	}
}