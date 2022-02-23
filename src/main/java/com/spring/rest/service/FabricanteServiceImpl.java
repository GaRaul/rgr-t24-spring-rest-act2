package com.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.dao.IFabricanteDao;
import com.spring.rest.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService{

	@Autowired
	IFabricanteDao iFabricanteDao;
	
	@Override
	public List<Fabricante> listarFabricantes() {
		
		return iFabricanteDao.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		return iFabricanteDao.save(fabricante);
	}

	@Override
	public Fabricante fabricanteXID(Integer id) {
		return iFabricanteDao.findById(id).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		return iFabricanteDao.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Integer id) {
		
		iFabricanteDao.deleteById(id);
	}

}
