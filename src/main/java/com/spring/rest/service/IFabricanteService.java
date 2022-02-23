package com.spring.rest.service;

import java.util.List;

import com.spring.rest.dto.Fabricante;

public interface IFabricanteService {

	public List<Fabricante> listarFabricantes();
	
	public Fabricante guardarFabricante(Fabricante fabricante);
	
	public Fabricante fabricanteXID(Integer id);
	
	public Fabricante actualizarFabricante(Fabricante fabricante);
	
	public void eliminarFabricante(Integer id);
	
}
