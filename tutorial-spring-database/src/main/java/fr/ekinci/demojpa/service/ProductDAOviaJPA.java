package fr.ekinci.demojpa.service;

import fr.ekinci.demojpa.configuration.DatabaseConfiguration;
import fr.ekinci.demojpa.model.FilmEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

@Repository
@Profile("jpa")
public class ProductDAOviaJPA implements IProductDAO {

	@PersistenceContext(unitName = DatabaseConfiguration.JPA_PERSISTANCE_UNIT_NAME)
	private EntityManager em;

	@Transactional
	@Override
	public FilmEntity insert(FilmEntity product) {
		em.persist(Film);
		return Film;
	}

	@Override
	public FilmEntity select(FilmEntity product) {
		return em.find(FilmEntity.class, Film.getId());
	}

}
