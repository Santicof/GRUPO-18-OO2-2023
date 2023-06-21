package com.unla.grupo18.entities;

import java.time.LocalDateTime;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvento;
	
	@ManyToOne
	@JoinColumn(name = "idDispositivo", nullable=false)
	@JsonBackReference
	private Dispositivo dispositivo;
	
	@Column(name="descripcion")
	private String descripcionEvento;
	
	@Column(name="fechahora")
	private LocalDateTime fechahoraEvento;
	
	@OneToOne
	@JoinColumn(name= "idMetrica")
	private Metrica metrica;
	
	
	
}