package co.edu.uco.ucobet.generales.application.primaryports.dto.city;

import java.util.UUID;

import co.edu.uco.ucobet.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.generales.crosscutting.helpers.UUIDHelper;

public final class RegisterNewCityDto {
	
	private String name;
	private UUID state;
	
	public RegisterNewCityDto(final String name, final UUID state) {
		setName(name);
		setState(state);
	}
	
	public static final RegisterNewCityDto create(final String name, final UUID state) {
		return new RegisterNewCityDto(name, state);
	}
	
	public final UUID getState() {
		return state;
	}
	
	public final void setState(final UUID state) {
		this.state = UUIDHelper.getDefault(state, UUIDHelper.getDefault());
	}
	
	public final String getName() {
		return name;
	}
	
	public final void setName(final String name) {
		this.name = TextHelper.getDefault(name, TextHelper.EMPTY);
	}
}