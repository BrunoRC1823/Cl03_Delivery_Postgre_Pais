package com.example.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entidad.Pais;
import com.example.service.PaisService;

@RestController
@RequestMapping("/rest/pais")
public class PaisController {
	@Autowired
	private PaisService paisService;

	@GetMapping
	public ResponseEntity<?> listaPais() {
		List<Pais> lstPaises = paisService.listaPaises();
		return ResponseEntity.ok(lstPaises);
	}
}
