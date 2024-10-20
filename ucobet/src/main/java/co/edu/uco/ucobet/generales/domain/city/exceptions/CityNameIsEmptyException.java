package co.edu.uco.ucobet.generales.domain.city.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcoBetException;

public final class CityNameIsEmptyException extends RuleUcoBetException {

private static final long serialVersionUID = 1L;
	
	private CityNameIsEmptyException(String technicalMessage, String userMessage, Exception rootException) {
		super(technicalMessage, userMessage, rootException);
	}
	
	public static final CityNameIsEmptyException create() {
		var userMessage = "La ciudad tiene un nombre vacío...";
		return new CityNameIsEmptyException(userMessage, userMessage, new Exception());
	}
}