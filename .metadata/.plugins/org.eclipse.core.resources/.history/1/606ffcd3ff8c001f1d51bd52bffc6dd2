package co.edu.uco.ucobet.generales.application.usecase.city.impl;

import java.util.UUID;

import co.edu.uco.ucobet.generales.application.usecase.city.RegisterNewCityRuleValidator;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.generales.domain.city.rules.CityIdDoesNotExistsRule;
import co.edu.uco.ucobet.generales.domain.city.rules.CityIdFormatIsValidRule;
import co.edu.uco.ucobet.generales.domain.city.rules.CityIdIsNotEmptyRule;
import co.edu.uco.ucobet.generales.domain.city.rules.CityNameIsUniqueForStateRule;
import co.edu.uco.ucobet.generales.domain.city.rules.CityStateIsValidRule;
import co.edu.uco.ucobet.generales.domain.state.StateDomain;

public class RegisterNewCityRuleValidatorImpl implements RegisterNewCityRuleValidator {
	
	CityIdDoesNotExistsRule cityIdDoesNotExistsRule;
	CityIdFormatIsValidRule cityIdFormatIsValidRule;
	CityIdIsNotEmptyRule cityIdIsNotEmptyRule;
	CityNameIsUniqueForStateRule cityNameIsUniqueForStateRule;
	CityStateIsValidRule cityStateIsValidRule;
	
	public RegisterNewCityRuleValidatorImpl(final CityIdDoesNotExistsRule cityIdDoesNotExistsRule, final CityIdFormatIsValidRule cityIdFormatIsValidRule, final CityIdIsNotEmptyRule cityIdIsNotEmptyRule, final CityNameIsUniqueForStateRule cityNameIsUniqueForStateRule, final CityStateIsValidRule cityStateIsValidRule) {
		this.cityIdDoesNotExistsRule = cityIdDoesNotExistsRule;
		this.cityIdFormatIsValidRule = cityIdFormatIsValidRule;
		this.cityIdIsNotEmptyRule = cityIdIsNotEmptyRule;
		this.cityNameIsUniqueForStateRule = cityNameIsUniqueForStateRule;
		this.cityStateIsValidRule = cityStateIsValidRule;
	}
	
	@Override
	public void validate(CityDomain data) {
		validateRulesRelatedWithId(data.getId());
		validateRulesRelatedWithName(data);
		validateRulesRelatedWithState(data.getState());
	}

	public void validateRulesRelatedWithId(final UUID id) {
		cityIdIsNotEmptyRule.execute(id);
		cityIdFormatIsValidRule.execute(id);
		cityIdDoesNotExistsRule.execute(id);
		
	}
	
	public void validateRulesRelatedWithName(final CityDomain data) {
		cityNameIsUniqueForStateRule.execute(data);
	}
	
	public void validateRulesRelatedWithState(final StateDomain state) {
		cityStateIsValidRule.execute(state);
	}
}
