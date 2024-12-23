package com.aluracursos.desafio.model;
import com.fasterxml.jackson.annotation.*;

import java.util.List;
@JsonIgnoreProperties (ignoreUnknown = true)
public record Datos(
        @JsonAlias("results") List<DatosLibros> resultados

) {
}
