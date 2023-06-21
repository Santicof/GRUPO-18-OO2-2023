package com.unla.grupo18.repositories;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.grupo18.entities.Evento;

@Repository("eventoRepositorio")
public interface IEventoRepository extends JpaRepository <Evento, Serializable> {

	// Trae x descripcion
	public abstract Evento findByDescripcionEvento(String descripcionEvento);
	// Trae x ID
	public abstract Evento findByidEvento(int idEvento);
	// Trae por fecha hora evento
	public abstract Evento findByFechahoraEvento(LocalDateTime fechahoraEvento);
	
}
