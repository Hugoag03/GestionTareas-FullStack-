package com.fullstack.gestiontareas.repositories;

import com.fullstack.gestiontareas.entitites.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
