package co.edu.uco.ucobet.generales.domain.city.rules.impl;

import co.edu.uco.ucobet.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.generales.domain.city.CityDomain;
import co.edu.uco.ucobet.generales.domain.city.exceptions.CityNameIsNotUniqueForStateException;
import co.edu.uco.ucobet.generales.domain.city.rules.CityNameIsUniqueForStateRule;

public class CityNameIsUniqueForStateRuleImpl implements CityNameIsUniqueForStateRule {

	@Override
	public void execute(CityDomain data) {
		if (ObjectHelper.isNull(data)) {
			throw CityNameIsNotUniqueForStateException.create();
		}
	}

}