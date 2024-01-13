
# Consumindo dados da API ViaCEP

O projeto se refere a uma aplicação que consulta um endereço a partir de um CEP informado e o resultado com sucesso dessa pesquisa é salvo em um arquivo json.

## Informações 📝
- O projeto consistem em uma classe que contém as informações de endereço (cep, logradouro, complemento, bairro, localidade e uf);
- Possui também uma classe que consulta a API ViaCEP na qual busca o endereço informado. (https://viacep.com.br/ws/04101300/json
- Foi criada uma classe que cria um arquivo json contendo as informações de um objeto `Endereco`.
- A classe main é onde é inserido o CEP para consulta. E a partir do resultado com sucesso, os dados são salvos em um arquivo json
- Foi utilizado a biblioteca `Gson` para realizar a conversão do JSON devolvido pela API ViaCEP em um arquivo json e salvar um objeto `Endereco` em um arquivo .jon.

## Tecnologias e Ferramentas ⚙️


**Linguagem:** Java (versão: 17)

## Resultado ✔️

- Para cada consulta com sucesso é salvo um arquivo com os dados recebidos pela API. O arquivo está renomeado com o número do cep e posteriormente .jon. (Ex: `52090-250.json`)

```
{
  "cep": "52090-250",
  "logradouro": "Rua Macaúbal",
  "complemento": "",
  "bairro": "Nova Descoberta",
  "localidade": "Recife",
  "uf": "PE"
}
```
<br>
✨ Feito com carinho por <a href="http://https://www.linkedin.com/in/kayla-deodato/"> Kayla</a> 💜
