package org.frank.appmockito.ejemplos.repositories;

import org.frank.appmockito.ejemplos.Datos;
import org.frank.appmockito.ejemplos.models.Examen;

import java.util.List;

public class ExamenRepositoryImpl implements ExamenRepository {
    @Override
    public List<Examen> findAll() {
        return Datos.EXAMENES;
    }

    @Override
    public Examen guardar(Examen examen) {
        examen.setId(8L);
        return examen;
    }
}
