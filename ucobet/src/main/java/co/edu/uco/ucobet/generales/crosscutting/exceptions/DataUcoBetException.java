package co.edu.uco.ucobet.generales.crosscutting.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.enums.Layer;

public final class DataUcoBetException extends UcoBetException {

	private static final long serialVersionUID = 1L;
	
	public DataUcoBetException(final String technicalMessage, final String userMessage, final Exception rootException) {
		super(technicalMessage, userMessage, Layer.DATA, rootException);
	}
	
	public static final DataUcoBetException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new DataUcoBetException(technicalMessage, userMessage, rootException);
	}
	
	public static final DataUcoBetException create(final String userMessage, final Exception rootException) {
		return new DataUcoBetException(userMessage, userMessage, rootException);
	}
	
	public static final DataUcoBetException create(final String technicalMessage, final String userMessage) {
		return new DataUcoBetException(technicalMessage, userMessage, new Exception());
	}
	
	public static final DataUcoBetException create(final String userMessage) {
		return new DataUcoBetException(userMessage, userMessage, new Exception());
	}
}