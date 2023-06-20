package com.unla.grupo18.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dispositivo_alumbrado")
@PrimaryKeyJoinColumn(referencedColumnName="idDispositivo") 
public class DispositivoAlumbrado extends Dispositivo {	

	@Column(name="horadeencendido")
	@CreationTimestamp
	private LocalTime horadeEncendido;
	
	@Column(name="horadeapagado")
	@CreationTimestamp
	private LocalTime horadeApagado;
	
	@Column(name="estado")
	protected boolean estado;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aula_id")
    private Aula aula;

	public DispositivoAlumbrado(String nombreDispositivo, LocalDateTime fechaCreacion, LocalDateTime fechaModificacion,
			LocalDateTime fechaBaja, boolean isBaja, Edificio edificio, LocalTime horadeEncendido, LocalTime horadeApagado,
			boolean estado, Aula aula) {
		super(nombreDispositivo, fechaCreacion, fechaModificacion, fechaBaja, isBaja, edificio);
		this.horadeEncendido = horadeEncendido;
		this.horadeApagado = horadeApagado;
		this.estado = false;
		this.aula = aula;
	}

	
	//@OneToMany(mappedBy = "alumbrado", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<MetricasDispAlumbrado> mediciones = new ArrayList<>();

    

	
	
	
	
}




	
	