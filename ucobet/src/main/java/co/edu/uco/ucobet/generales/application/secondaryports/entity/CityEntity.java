package co.edu.uco.ucobet.generales.application.secondaryports.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import co.edu.uco.ucobet.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.generales.crosscutting.helpers.UUIDHelper;

@Entity
@Table(name = "City")
public final class CityEntity {
	
	@Id
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "state")
	private StateEntity state;
	
	public CityEntity() {
		setId(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
		setState(StateEntity.create());
	}
	
	public CityEntity(final UUID id, final String name, final StateEntity state) {
		setId(id);
		setName(name);
		setState(state);
	}
	
	public static final CityEntity create() {
		return new CityEntity();
	}
	
	public static final CityEntity create(final UUID id) {
		return new CityEntity(id, TextHelper.EMPTY, StateEntity.create());
	}
	
	public static final CityEntity create(final UUID id, final String name, final StateEntity state) {
		return new CityEntity(id, name, state);
	}
	
	public final UUID getId() {
		return id;
	}
	
	public final void setId(final UUID id) {
		this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
	}
	
	public final String getName() {
		return name;
	}
	
	public final void setName(final String name) {
		this.name = TextHelper.getDefault(name, TextHelper.EMPTY);
	}
	
	public final StateEntity getState() {
		return state;
	}
	
	public final void setState(final StateEntity state) {
		this.state = ObjectHelper.getDefault(state, StateEntity.create());
	}
}