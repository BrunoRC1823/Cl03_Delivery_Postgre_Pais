package com.example.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pais")
public class Pais {
	@Id
	@Column(name = "idPais")
	private int idPais;
	@Column(name = "iso")
	private String iso;
	@Column(name = "nombre")
	private String nombre;
}
