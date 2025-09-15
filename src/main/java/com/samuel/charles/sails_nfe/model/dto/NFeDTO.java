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

//    modelo a ser seguido
//
//    {
//        "natureza_operacao":"Remessa",
//            "data_emissao":"2017-04-15",
//            "data_entrada_saida":"2017-04-15",
//            "tipo_documento":1,
//            "finalidade_emissao":1,
//            "cnpj_emitente":"SEU_CNPJ",
//            "cpf_emitente": "SEU_CPF",
//            "nome_emitente":"Sua Raz\u00e3o Social Ltda",
//            "nome_fantasia_emitente":"Fantasia do Emitente",
//            "logradouro_emitente":"Rua Quinze de Abril",
//            "numero_emitente":999,
//            "bairro_emitente":"Jd Paulistano",
//            "municipio_emitente":"S\u00e3o Paulo",
//            "uf_emitente":"SP",
//            "cep_emitente":"01454-600",
//            "inscricao_estadual_emitente":"SUA_INSCRICAO_ESTADUAL",
//            "nome_destinatario":"NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL",
//            "cpf_destinatario":"03055054911",
//            "inscricao_estadual_destinatario":null,
//            "telefone_destinatario":1196185555,
//            "logradouro_destinatario":"Rua S\u00e3o Janu\u00e1rio",
//            "numero_destinatario":99,
//            "bairro_destinatario":"Crespo",
//            "municipio_destinatario":"Manaus",
//            "uf_destinatario":"AM",
//            "pais_destinatario":"Brasil",
//            "cep_destinatario":69073178,
//            "valor_frete":0.0,
//            "valor_seguro":0,
//            "valor_total":47.23,
//            "valor_produtos":47.23,
//            "modalidade_frete":0,
//            "items": [
//        {
//            "numero_item":1,
//                "codigo_produto":1232,
//                "descricao":"Cartu00f5es de Visita",
//                "cfop":5923,
//                "unidade_comercial":"un",
//                "quantidade_comercial":100,
//                "valor_unitario_comercial":0.4723,
//                "valor_unitario_tributavel":0.4723,
//                "unidade_tributavel":"un",
//                "codigo_ncm":49111090,
//                "quantidade_tributavel":100,
//                "valor_bruto":47.23,
//                "icms_situacao_tributaria":41,
//                "icms_origem":0,
//                "pis_situacao_tributaria":"07",
//                "cofins_situacao_tributaria":"07"
//        }
//  ]
//    }
}
