package com.fullstack.gestiontareas.services;

import com.fullstack.gestiontareas.entitites.Tarea;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface TareaService {

    List<Tarea> getAllTareas();

    Optional<Tarea> getTareaById(Long id);

    Tarea createTarea(Tarea tarea);

    Tarea updateTarea(Long id, Tarea tarea);

    void deleteTarea(Long id);
}
