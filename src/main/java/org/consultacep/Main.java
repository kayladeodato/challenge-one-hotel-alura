package org.consultacep;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novaConsulta = consultaCep.buscarCep("52090250");
        GeradorDeArquivo arquivo = new GeradorDeArquivo();
        arquivo.gerarArquivo(novaConsulta);

        System.out.println("Arquivo gerado.");

    }
}