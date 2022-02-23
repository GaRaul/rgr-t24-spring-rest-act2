package com.spring.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.dto.Articulo;

public interface IArticuloDao extends JpaRepository<Articulo, Integer>{

}
