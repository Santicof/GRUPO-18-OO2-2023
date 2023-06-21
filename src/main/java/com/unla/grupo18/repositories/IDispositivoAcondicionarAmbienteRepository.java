package com.unla.grupo18.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.unla.grupo18.entities.DispositivoAcondicionarAmbiente;

@Repository("DispositivoAcondicionarAmbienteRepository")
public interface IDispositivoAcondicionarAmbienteRepository extends JpaRepository<DispositivoAcondicionarAmbiente, Serializable>{

	// Traer todos los dispositivos
	public abstract List<DispositivoAcondicionarAmbiente> findAll();

	// Traer un unico Dispositivo Acondicionar Ambiente por ID
	public abstract DispositivoAcondicionarAmbiente findByidDispositivo(int idDispositivo);
	
}
