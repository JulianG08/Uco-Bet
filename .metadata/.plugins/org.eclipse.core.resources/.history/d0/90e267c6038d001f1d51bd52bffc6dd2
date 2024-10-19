package co.edu.uco.ucobet.generales.application.primaryports.dto.country;

import co.edu.uco.ucobet.generales.crosscutting.helpers.TextHelper;

public final class RegisterNewCountryDto {
	
	private String name;
	
	public RegisterNewCountryDto(final String name) {
		setName(name);
	}
	
	public static final RegisterNewCountryDto create(final String name) {
		return new RegisterNewCountryDto(name);
	}
	
	public final String getName() {
		return name;
	}
	
	public final void setName(final String name) {
		this.name = TextHelper.getDefault(name, TextHelper.EMPTY);
	}
}