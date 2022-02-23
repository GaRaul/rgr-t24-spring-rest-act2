package com.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.dto.Fabricante;
import com.spring.rest.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricanteController {

	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		
		return fabricanteServiceImpl.listarFabricantes();
		
	}
	
	@PostMapping("/fabricantes")
	public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
	
		return fabricanteServiceImpl.guardarFabricante(fabricante);
		
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante fabricanteXID(@PathVariable(name="id") Integer id) {
		Fabricante fabricanteXID = new Fabricante();
		
		fabricanteXID = fabricanteServiceImpl.fabricanteXID(id);
		
		System.out.println("Fabricante XID: " + fabricanteXID);
		
		return fabricanteXID;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name="id") Integer id, @RequestBody Fabricante fabricante) {
		
		Fabricante fabricante_seleccionado = new Fabricante();
		Fabricante fabricante_actualizado = new Fabricante();
		
		fabricante_seleccionado = fabricanteServiceImpl.fabricanteXID(id);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		fabricante_actualizado = fabricanteServiceImpl.actualizarFabricante(fabricante_seleccionado);
		
		System.out.println("Fabricante actualizado: " + fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eliminarFabricante(@PathVariable(name="id") Integer id) {
		
		fabricanteServiceImpl.eliminarFabricante(id);
		
	}
	
}
