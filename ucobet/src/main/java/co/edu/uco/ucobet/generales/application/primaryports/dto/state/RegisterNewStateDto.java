package co.edu.uco.ucobet.generales.application.primaryports.dto.state;

import java.util.UUID;

import co.edu.uco.ucobet.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.generales.crosscutting.helpers.UUIDHelper;

public final class RegisterNewStateDto {
	
	private String name;
	private UUID country;
	
	public RegisterNewStateDto(final String name, final UUID country) {
		setName(name);
		setCountry(country);
	}
	
	public static final RegisterNewStateDto create(final String name, final UUID country) {
		return new RegisterNewStateDto(name, country);
	}
	
	public final UUID getCountry() {
		return country;
	}
	
	private final void setCountry(final UUID country) {
		this.country = UUIDHelper.getDefault(country, UUIDHelper.getDefault());
	}
	
	public final String getName() {
		return name;
	}
	
	private final void setName(final String name) {
		this.name = TextHelper.getDefault(name, TextHelper.EMPTY);
	}
}