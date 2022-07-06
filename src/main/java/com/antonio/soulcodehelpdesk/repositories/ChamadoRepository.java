package com.antonio.soulcodehelpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antonio.soulcodehelpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
