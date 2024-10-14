package co.edu.uco.ucobet.generales.crosscutting.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.enums.Layer;

public final class CrosscuttingUcoBetException extends UcoBetException {

	private static final long serialVersionUID = 1L;
	
	public CrosscuttingUcoBetException(final String technicalMessage, final String userMessage, final Exception rootException) {
		super(technicalMessage, userMessage, Layer.CROSSCUTTING, rootException);
	}
	
	public static final CrosscuttingUcoBetException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new CrosscuttingUcoBetException(technicalMessage, userMessage, rootException);
	}
	
	public static final CrosscuttingUcoBetException create(final String userMessage, final Exception rootException) {
		return new CrosscuttingUcoBetException(userMessage, userMessage, rootException);
	}
	
	public static final CrosscuttingUcoBetException create(final String technicalMessage, final String userMessage) {
		return new CrosscuttingUcoBetException(technicalMessage, userMessage, new Exception());
	}
	
	public static final CrosscuttingUcoBetException create(final String userMessage) {
		return new CrosscuttingUcoBetException(userMessage, userMessage, new Exception());
	}
}