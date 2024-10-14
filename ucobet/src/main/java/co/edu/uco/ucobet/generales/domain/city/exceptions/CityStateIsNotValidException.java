package co.edu.uco.ucobet.generales.domain.city.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcoBetException;

public final class CityStateIsNotValidException extends RuleUcoBetException {

private static final long serialVersionUID = 1L;
	
	private CityStateIsNotValidException(String technicalMessage, String userMessage, Exception rootException) {
		super(technicalMessage, userMessage, rootException);
	}
	
	public static final CityStateIsNotValidException create() {
		var userMessage = "El departamento no es valido...";
		return new CityStateIsNotValidException(userMessage, userMessage, new Exception());
	}
}