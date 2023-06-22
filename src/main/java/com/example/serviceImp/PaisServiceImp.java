package com.example.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entidad.Pais;
import com.example.repositorio.PaisRepository;
import com.example.service.PaisService;
@Service
public class PaisServiceImp implements PaisService{
	@Autowired
	private PaisRepository repo;
	@Override
	public List<Pais> listaPaises() {
		return repo.findAll();
	}

}
