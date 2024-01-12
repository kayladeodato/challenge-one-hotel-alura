package org.example;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    // Método que usa a API Via CEP para a consulta dos endereços
    public Endereco buscarCep(String cep) {
        URI endereco = URI.create("https://viacep.com.br/ws/" +  cep + "/json/");

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            Endereco enderecoConsulta = new Gson().fromJson(json, Endereco.class);
            return enderecoConsulta;

        } catch (Exception e) {
            throw new RuntimeException("Endereço não encontrado. Revise o CEP informado.");
        }
    }
}
