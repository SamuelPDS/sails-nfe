package com.samuel.charles.sails_nfe.model.dto;

import com.samuel.charles.sails_nfe.model.entity.Product;

import java.util.List;

public class NFeDTO {
    private String naturezaOperacao;
    private String dataEmissao;
    private String dataEntradaSaida;
    private Integer tipoDocumento;
    private Integer finalidadeEmissao;
    private String cnpjEmitente;
    private String cpfEmitente;
    private String nomeEmitente;
    private String nomeFantasiaEmitente;
    private String logradouroEmitente;
    private Integer numeroEmitente;
    private String bairroEmitente;
    private String municipioEmitente;
    private String ufEmitente;
    private String cepEmitente;
    private String inscricaoEstadualEmitente;
    private String nomeDestinatario;
    private String cpfDestinatario;
    private String inscricaoEstadualDestinatario;
    private String telefoneDestinatario;
    private String logradouroDestinatario;
    private Integer numeroDestinatario;
    private String bairroDestinatario;
    private String municipioDestinatario;
    private String ufDestinatario;
    private String paisDestinatario;
    private String cepDestinatario;
    private Double valorFrete;
    private Double valorSeguro;
    private Double valorTotal;
    private Double valorProdutos;
    private Integer modalidadeFrete;
    private List<Product> items;

//    modelo exemplo JSON
//{
//    "naturezaOperacao": "Remessa",
//        "dataEmissao": "2024-06-10",
//        "dataEntradaSaida": "2024-06-10",
//        "tipoDocumento": 1,
//        "finalidadeEmissao": 1,
//        "cnpjEmitente": "12345678000199",
//        "cpfEmitente": "12345678901",
//        "nomeEmitente": "Empresa Exemplo Ltda",
//        "nomeFantasiaEmitente": "Fantasia Exemplo",
//        "logradouroEmitente": "Rua Exemplo",
//        "numeroEmitente": 100,
//        "bairroEmitente": "Centro",
//        "municipioEmitente": "São Paulo",
//        "ufEmitente": "SP",
//        "cepEmitente": "01000-000",
//        "inscricaoEstadualEmitente": "123456789",
//        "nomeDestinatario": "Cliente Teste",
//        "cpfDestinatario": "98765432100",
//        "inscricaoEstadualDestinatario": null,
//        "telefoneDestinatario": "11999999999",
//        "logradouroDestinatario": "Av. Teste",
//        "numeroDestinatario": 200,
//        "bairroDestinatario": "Bairro Teste",
//        "municipioDestinatario": "Manaus",
//        "ufDestinatario": "AM",
//        "paisDestinatario": "Brasil",
//        "cepDestinatario": "69000000",
//        "valorFrete": 0,
//        "valorSeguro": 0,
//        "valorTotal": 100.5,
//        "valorProdutos": 100.5,
//        "modalidadeFrete": 0,
//        "items": [
//    {
//        "numeroItem": 1,
//            "codigoProduto": 1234,
//            "descricao": "Produto Exemplo",
//            "cfop": 5102,
//            "unidadeComercial": "un",
//            "quantidadeComercial": 10,
//            "valorUnitarioComercial": 10.05,
//            "valorUnitarioTributavel": 10.05,
//            "unidadeTributavel": "un",
//            "codigoNcm": 12345678,
//            "quantidadeTributavel": 10,
//            "valorBruto": 100.5,
//            "icmsSituacaoTributaria": 41,
//            "icmsOrigem": 0,
//            "pisSituacaoTributaria": "07",
//            "cofinsSituacaoTributaria": "07"
//    }
//    ]
//}
}
