package com.samuel.charles.sails_nfe.model.dto;

import lombok.Data;

import java.util.List;

@Data
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
    private List<ProductDTO> items;
}
