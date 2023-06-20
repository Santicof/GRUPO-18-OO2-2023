package com.unla.grupo18.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import jakarta.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "dispositivo")
public abstract class Dispositivo {

	// ================== ATRIBUTOS ================== 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int idDispositivo;
	
	@Column(name="nombreDispositivo")
	protected String nombreDispositivo;
	
	@Column(name="fechaCreacion")
	@CreationTimestamp
	protected LocalDateTime fechaCreacion;
	
	@Column(name="fechaModificacion")
	@CreationTimestamp
	protected LocalDateTime fechaModificacion;
	
	@Column(name="fechaBaja")
	@CreationTimestamp
	protected LocalDateTime fechaBaja;
	
	@Column(name="isBaja")
	protected boolean isBaja;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idEdificio", nullable = false)
	protected Edificio edificio;

	// ================== CONSTRUCTOR SIN ID ==================

	public Dispositivo(String nombreDispositivo, LocalDateTime fechaCreacion, LocalDateTime fechaModificacion,
			LocalDateTime fechaBaja, boolean isBaja, Edificio edificio) {
		super();
		this.nombreDispositivo = nombreDispositivo;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.fechaBaja = fechaBaja;
		this.isBaja = isBaja;
		this.edificio = edificio;
	}

	// ================== CONSTRUCTOR CON TODOS LOS PARAMETROS ==================
	
	public Dispositivo(int idDispositivo, String nombreDispositivo, LocalDateTime fechaCreacion,
			LocalDateTime fechaModificacion, LocalDateTime fechaBaja, boolean isBaja, Edificio edificio) {
		super();
		this.idDispositivo = idDispositivo;
		this.nombreDispositivo = nombreDispositivo;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.fechaBaja = fechaBaja;
		this.isBaja = isBaja;
		this.edificio = edificio;
	}

	// CONSTRUCTOR SIN EDIFICIO
	public Dispositivo(int idDispositivo, String nombreDispositivo, LocalDateTime fechaCreacion,
			LocalDateTime fechaModificacion, LocalDateTime fechaBaja, boolean isBaja) {
		super();
		this.idDispositivo = idDispositivo;
		this.nombreDispositivo = nombreDispositivo;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.fechaBaja = fechaBaja;
		this.isBaja = isBaja;
	}
	


	@Override
	public String toString() {
		return "idDispositivo: " + idDispositivo 
				+ "\nnombreDispositivo: " + nombreDispositivo
				+ "\nfechaCreacion: " + fechaCreacion 
				+ "\nfechaModificacion: " + fechaModificacion 
				+ "\nfechaBaja: " + fechaBaja 
				+ "\nisBaja: " + isBaja;
	}

	
	
	
    
	    
	
	
}
