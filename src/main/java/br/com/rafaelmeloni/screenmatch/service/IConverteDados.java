package br.com.rafaelmeloni.screenmatch.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe );

}
