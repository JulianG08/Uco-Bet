package co.edu.uco.ucobet.generales.domain.city.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcoBetException;

public final class CityIdFormatIsNotValidException extends RuleUcoBetException {
	
	private static final long serialVersionUID = 1L;
	
	private CityIdFormatIsNotValidException(String technicalMessage, String userMessage, Exception rootException) {
		super(technicalMessage, userMessage, rootException);
	}
	
	public static final CityIdFormatIsNotValidException create() {
		var userMessage = "La ciudad tiene un identificador con formato no válido correspondiente al valor por defecto...";
		return new CityIdFormatIsNotValidException(userMessage, userMessage, new Exception());
	}
}