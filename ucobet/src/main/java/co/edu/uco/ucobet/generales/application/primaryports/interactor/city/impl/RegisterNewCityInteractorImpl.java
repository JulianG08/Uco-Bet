package co.edu.uco.ucobet.generales.application.primaryports.interactor.city.impl;

import co.edu.uco.ucobet.generales.application.primaryports.dto.city.RegisterNewCityDto;
import co.edu.uco.ucobet.generales.application.primaryports.interactor.city.RegisterNewCityInteractor;
import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCity;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;

public class RegisterNewCityInteractorImpl implements RegisterNewCityInteractor {

	private RegisterNewCity registerNewCityUseCase;
	
	public RegisterNewCityInteractorImpl(final RegisterNewCity registerNewCityUseCase) {
		this.registerNewCityUseCase = registerNewCityUseCase;
	}
	
	@Override
	public void execute(RegisterNewCityDto data) {
		// Convert dto to domain
		CityDomain domain = CityDomain.create(null, null, null);
		
		//Call use case
		registerNewCityUseCase.execute(domain);
	}
}
