package co.edu.uco.ucobet.generales.domain.city.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcoBetException;

public final class CityIdDoesExistsException extends RuleUcoBetException {

	private static final long serialVersionUID = 1L;

	private CityIdDoesExistsException(String technicalMessage, String userMessage, Exception rootException) {
		super(technicalMessage, userMessage, rootException);
	}
	
	public static final CityIdDoesExistsException create() {
		var userMessage = "Si existe la ciudad con el identificador indicado...";
		return new CityIdDoesExistsException(userMessage, userMessage, new Exception());
	}
}