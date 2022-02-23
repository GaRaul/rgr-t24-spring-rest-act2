package com.spring.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.dto.Fabricante;

public interface IFabricanteDao extends JpaRepository<Fabricante, Integer>{
	
}
