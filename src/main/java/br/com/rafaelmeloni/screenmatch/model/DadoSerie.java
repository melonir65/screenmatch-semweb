package br.com.rafaelmeloni.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) //ignora as propiedades que vc não quer do Json
public record DadoSerie(@JsonAlias("Title") String titulo, // converte o nome do campo no Json para o nome desejado
                        @JsonAlias("totalSeasons") Integer totalTemporadas,
                        @JsonAlias("imdbRating") String avaliacao) {
}
