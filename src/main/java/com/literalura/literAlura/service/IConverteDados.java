package com.literalura.literAlura.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
