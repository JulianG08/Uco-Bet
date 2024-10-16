package co.edu.uco.ucobet.generales.application.usecase.city.impl;

import co.edu.uco.ucobet.generales.application.secondaryports.entity.CityEntity;
import co.edu.uco.ucobet.generales.application.secondaryports.repository.CityRepository;
import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCity;
import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCityRuleValidator;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;

public final class RegisterNewCityImpl implements RegisterNewCity {

	private CityRepository cityRepository;
	private RegisterNewCityRuleValidator registerNewCityRuleValidator;
	
	public RegisterNewCityImpl(final CityRepository cityRepository, final RegisterNewCityRuleValidator registarNewCityRuleValidator) {
		this.cityRepository = cityRepository;
		this.registerNewCityRuleValidator = registarNewCityRuleValidator;
	}
	
	@Override
	public void execute(final CityDomain data) {
		registerNewCityRuleValidator.validate(data);
		CityEntity cityEntity = CityEntity.create();
		cityRepository.save(cityEntity);
	}
}
