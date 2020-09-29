package com.sri.bootexe.springbootexe.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sri.bootexe.springbootexe.Entity.SpringbootEntity;

@Repository
public interface SpringbootRepos extends CrudRepository<SpringbootEntity, Long>{

}
