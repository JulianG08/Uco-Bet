package co.edu.uco.ucobet.generales.domain.city.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcoBetException;

public final class CityNameIsNotUniqueForStateException extends RuleUcoBetException {

private static final long serialVersionUID = 1L;
	
	private CityNameIsNotUniqueForStateException(String technicalMessage, String userMessage, Exception rootException) {
		super(technicalMessage, userMessage, rootException);
	}
	
	public static final CityNameIsNotUniqueForStateException create() {
		var userMessage = "El departamento ya tiene una ciudad con el mismo nombre...";
		return new CityNameIsNotUniqueForStateException(userMessage, userMessage, new Exception());
	}
}