package service.frete;

import service.Shipping;

public class Express implements Shipping {

	@Override
	public double calculateValue(int distance) {
		return distance * 1.45 + 12;
	}
	
}
