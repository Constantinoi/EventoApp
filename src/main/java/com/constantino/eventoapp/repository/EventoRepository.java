package com.constantino.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.constantino.eventoapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo(long codigo);
}
