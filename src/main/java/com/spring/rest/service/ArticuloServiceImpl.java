package com.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.dao.IArticuloDao;
import com.spring.rest.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService{

	@Autowired
	IArticuloDao iArticuloDao;
	
	@Override
	public List<Articulo> listarArticulos() {
		
		return iArticuloDao.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		return iArticuloDao.save(articulo);
	}

	@Override
	public Articulo articuloXID(Integer id) {
		return iArticuloDao.findById(id).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		return iArticuloDao.save(articulo);
	}

	@Override
	public void eliminarArticulo(Integer id) {
		
		iArticuloDao.deleteById(id);
		
	}

}
