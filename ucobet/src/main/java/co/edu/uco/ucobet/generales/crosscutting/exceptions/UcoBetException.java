package co.edu.uco.ucobet.generales.crosscutting.exceptions;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.enums.Layer;
import co.edu.uco.ucobet.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.generales.crosscutting.helpers.TextHelper;

public class UcoBetException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String userMessage;
	private Layer layer;
	
	public UcoBetException(final String technicalMessage, final String userMessage, final Layer layer, final Exception rootException) {
		super(ObjectHelper.getDefault(technicalMessage, TextHelper.applyTrim(userMessage)), ObjectHelper.getDefault(rootException, new Exception()));
		setUserMessage(userMessage);
		setLayer(layer);
	}
	
	public String getUserMessage() {
		return userMessage;
	}
	
	private final void setUserMessage(final String userMessage) {
		this.userMessage = TextHelper.applyTrim(userMessage);
	}
	
	public Layer getLayer() {
		return layer;
	}
	
	private final void setLayer(final Layer layer) {
		this.layer = ObjectHelper.getDefault(layer, Layer.GENERAL);
	}
	
	public static UcoBetException create(final String technicalMessage, final String userMessage, final Exception rootException) {
		return new UcoBetException(technicalMessage, userMessage, Layer.GENERAL, rootException);
	}
	
	public static UcoBetException create(final String userMessage, final Exception rootException) {
		return new UcoBetException(userMessage, userMessage, Layer.GENERAL, rootException);
	}
	
	public static UcoBetException create(final String technicalMessage, final String userMessage) {
		return new UcoBetException(technicalMessage, userMessage, Layer.GENERAL, new Exception());
	}
	
	public static UcoBetException create(final String userMessage) {
		return new UcoBetException(userMessage, userMessage, Layer.GENERAL, new Exception());
	}
}