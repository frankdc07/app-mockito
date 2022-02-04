package org.frank.appmockito.ejemplos.services;

import org.frank.appmockito.ejemplos.Datos;
import org.frank.appmockito.ejemplos.models.Examen;
import org.frank.appmockito.ejemplos.repositories.ExamenRepository;
import org.frank.appmockito.ejemplos.repositories.ExamenRepositoryImpl;
import org.frank.appmockito.ejemplos.repositories.PreguntaRepository;
import org.frank.appmockito.ejemplos.repositories.PreguntaRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ExamenServiceImplSpyTest {
    @Spy
    private ExamenRepositoryImpl examenRepository;
    @Spy
    private PreguntaRepositoryImpl preguntaRepository;

    @InjectMocks
    private ExamenServiceImpl examenService;
//    Si no se usan anotaciones
//    private ExamenService examenService;


    @Test
    void testSpy() {

        List<String> preguntas = Arrays.asList("pregunta 3");
//        when(preguntaRepository.findPreguntasPorExamenId(anyLong())).thenReturn(preguntas);
        doReturn(preguntas).when(preguntaRepository).findPreguntasPorExamenId(anyLong());

        Examen examen = examenService.findExamenPorNombreConPreguntas("Matematicas");
        assertEquals(5L, examen.getId());
        assertEquals("Matematicas", examen.getNombre());
        assertEquals(1, examen.getPreguntas().size());
        assertTrue(examen.getPreguntas().contains("pregunta 3"));
    }
}