package com.sri.bootexe.springbootexe.repos;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.sri.bootexe.springbootexe.Entity.SpringbootEntity;

@Repository
public class SpringbootIMPL implements SpringbootRepos{
		
	@Override
	public <S extends SpringbootEntity> S save(S entity) {
		// TODO Auto-generated method stub
		return entity;
	}

	@Override
	public <S extends SpringbootEntity> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<SpringbootEntity> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<SpringbootEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<SpringbootEntity> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(SpringbootEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends SpringbootEntity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
