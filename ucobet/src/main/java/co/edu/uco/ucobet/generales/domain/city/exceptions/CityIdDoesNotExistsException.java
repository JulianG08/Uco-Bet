package co.edu.uco.ucobet.generales.domain.city.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcoBetException;

public final class CityIdDoesNotExistsException extends RuleUcoBetException {
	
	private static final long serialVersionUID = 1L;

	private CityIdDoesNotExistsException(String technicalMessage, String userMessage, Exception rootException) {
		super(technicalMessage, userMessage, rootException);
	}
	
	public static final CityIdDoesNotExistsException create() {
		var userMessage = "No existe la ciudad con el identificador indicado...";
		return new CityIdDoesNotExistsException(userMessage, userMessage, new Exception());
	}
}