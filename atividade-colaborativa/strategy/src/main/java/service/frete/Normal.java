package service.frete;

import service.Shipping;

public class Normal implements Shipping {

	@Override
	public double calculateValue(int distance) {
		return distance * 1.25 + 10;
	}
}
