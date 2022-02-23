package com.spring.rest.service;

import java.util.List;

import com.spring.rest.dto.Articulo;

public interface IArticuloService {

	public List<Articulo> listarArticulos();
	
	public Articulo guardarArticulo(Articulo articulo);
	
	public Articulo articuloXID(Integer id);
	
	public Articulo actualizarArticulo(Articulo articulo);
	
	public void eliminarArticulo(Integer id);
	
}
