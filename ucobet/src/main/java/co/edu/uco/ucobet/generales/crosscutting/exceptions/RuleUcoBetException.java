package co.edu.uco.ucobet.generales.crosscutting.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.enums.Layer;

public class RuleUcoBetException extends UcoBetException {

	private static final long serialVersionUID = 1L;
	
	public RuleUcoBetException(final String technicalMessage, final String userMessage, final Exception rootException) {
		super(technicalMessage, userMessage, Layer.RULE, rootException);
	}
	
	public static RuleUcoBetException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new RuleUcoBetException(technicalMessage, userMessage, rootException);
	}
	
	public static RuleUcoBetException create(final String userMessage, final Exception rootException) {
		return new RuleUcoBetException(userMessage, userMessage, rootException);
	}
	
	public static RuleUcoBetException create(final String technicalMessage, final String userMessage) {
		return new RuleUcoBetException(technicalMessage, userMessage, new Exception());
	}
	
	public static RuleUcoBetException create(final String userMessage) {
		return new RuleUcoBetException(userMessage, userMessage, new Exception());
	}
}