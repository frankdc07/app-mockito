package org.frank.appmockito.ejemplos.repositories;

import org.frank.appmockito.ejemplos.Datos;

import java.util.List;

public class PreguntaRepositoryImpl implements PreguntaRepository {
    @Override
    public List<String> findPreguntasPorExamenId(Long id) {
        return Datos.PREGUNTAS;
    }

    @Override
    public void guardarVarias(List<String> preguntas) {

    }
}
