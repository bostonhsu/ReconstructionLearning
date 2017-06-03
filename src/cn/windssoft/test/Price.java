package cn.windssoft.test;

abstract class Price {
	abstract int getPriceCode();
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
}