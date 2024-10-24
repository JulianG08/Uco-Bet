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
		// TODO: Send notification to administrator when city is created! Email information is saved in Key Vault...You must retrieve email from your key vault configuration
		// TODO: I should be able to change the subject and the body of the email dinamically! (Parameters building block)
	}
}
