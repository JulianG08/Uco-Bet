package co.edu.uco.ucobet.generales.infraestructure.data.repository;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.Predicate;
import co.edu.uco.ucobet.generales.application.secondaryports.entity.CityEntity;
import co.edu.uco.ucobet.generales.application.secondaryports.repository.CityRepositoryCustoms;
import co.edu.uco.ucobet.generales.crosscutting.exceptions.DataUcoBetException;
import co.edu.uco.ucobet.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.generales.crosscutting.helpers.UUIDHelper;

public class CityRepositoryImpl implements CityRepositoryCustoms {

	private EntityManager entityManager;
	
	public CityRepositoryImpl(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<CityEntity> findByFilter(CityEntity filter) {
		try {
			var criteriaBuilder = entityManager.getCriteriaBuilder();
			var query = criteriaBuilder.createQuery(CityEntity.class);
			var result = query.from(CityEntity.class);
			
			var predicates = new ArrayList<>();
			
			if(!ObjectHelper.isNull(filter)) {
				if(!UUIDHelper.isDefault(filter.getId())) {
					predicates.add(criteriaBuilder.equal(result.get("id"), filter.getId()));
				}
				if(!TextHelper.isEmpty(filter.getName())) {
					predicates.add(criteriaBuilder.equal(result.get("name"), filter.getName()));
				}
				if(!ObjectHelper.isNull(filter.getState()) && !UUIDHelper.isDefault(filter.getState().getId())) {
					predicates.add(criteriaBuilder.equal(result.get("state"), filter.getState()));
				}
			}
			query.select(result).where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
			return entityManager.createQuery(query).getResultList();
		} catch (final Exception exception) {
			throw new DataUcoBetException("Error", "Error", exception);
		}
	}
}