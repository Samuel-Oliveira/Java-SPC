package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:02
 */
public class ResultadoConsulta implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Resultado-Consulta
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Protocolo
     */
    protected ProtocoloConsulta localProtocolo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localProtocoloTracker = false;

    /**
     * field for Operador
     */
    protected Operador localOperador;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localOperadorTracker = false;

    /**
     * field for MensagemBaseExterna
     * This was an Array!
     */
    protected MensagemBaseExterna[] localMensagemBaseExterna;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localMensagemBaseExternaTracker = false;

    /**
     * field for BaseInoperante
     * This was an Array!
     */
    protected java.lang.String[] localBaseInoperante;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localBaseInoperanteTracker = false;

    /**
     * field for Consumidor
     */
    protected ResultadoConsumidor localConsumidor;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localConsumidorTracker = false;

    /**
     * field for GrafiaPj
     */
    protected ResultadoInsumo localGrafiaPj;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localGrafiaPjTracker = false;

    /**
     * field for EnderecoCepConsultado
     */
    protected ResultadoInsumo localEnderecoCepConsultado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localEnderecoCepConsultadoTracker = false;

    /**
     * field for TelefoneConsultado
     */
    protected ResultadoInsumo localTelefoneConsultado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localTelefoneConsultadoTracker = false;

    /**
     * field for TelefoneVinculadoConsumidor
     */
    protected ResultadoInsumo localTelefoneVinculadoConsumidor;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localTelefoneVinculadoConsumidorTracker = false;

    /**
     * field for TelefoneVinculadoAssinanteConsultado
     */
    protected ResultadoInsumo localTelefoneVinculadoAssinanteConsultado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localTelefoneVinculadoAssinanteConsultadoTracker = false;

    /**
     * field for UltimoTelefoneInformado
     */
    protected ResultadoInsumo localUltimoTelefoneInformado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localUltimoTelefoneInformadoTracker = false;

    /**
     * field for UltimoEnderecoInformado
     */
    protected ResultadoInsumo localUltimoEnderecoInformado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localUltimoEnderecoInformadoTracker = false;

    /**
     * field for ParticipacaoEmpresa
     */
    protected ResultadoInsumo localParticipacaoEmpresa;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localParticipacaoEmpresaTracker = false;

    /**
     * field for Socio
     */
    protected ResultadoInsumo localSocio;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localSocioTracker = false;

    /**
     * field for Administrador
     */
    protected ResultadoInsumo localAdministrador;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localAdministradorTracker = false;

    /**
     * field for AlertaDocumento
     */
    protected ResultadoInsumo localAlertaDocumento;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localAlertaDocumentoTracker = false;

    /**
     * field for Spc
     */
    protected ResultadoInsumo localSpc;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localSpcTracker = false;

    /**
     * field for ChequeLojista
     */
    protected ResultadoInsumo localChequeLojista;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localChequeLojistaTracker = false;

    /**
     * field for Ccf
     */
    protected ResultadoInsumo localCcf;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localCcfTracker = false;

    /**
     * field for ContraOrdemDocumentoDiferente
     */
    protected ResultadoInsumoContraOrdem localContraOrdemDocumentoDiferente;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localContraOrdemDocumentoDiferenteTracker = false;

    /**
     * field for ContraOrdemAgenciaDiferente
     */
    protected ResultadoInsumoContraOrdem localContraOrdemAgenciaDiferente;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localContraOrdemAgenciaDiferenteTracker = false;

    /**
     * field for ContraOrdemAgenciaContaDiferente
     */
    protected ResultadoInsumoContraOrdem localContraOrdemAgenciaContaDiferente;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localContraOrdemAgenciaContaDiferenteTracker = false;

    /**
     * field for Acao
     */
    protected ResultadoInsumo localAcao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localAcaoTracker = false;

    /**
     * field for Protesto
     */
    protected ResultadoInsumo localProtesto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localProtestoTracker = false;

    /**
     * field for ContraOrdem
     */
    protected ResultadoInsumoContraOrdem localContraOrdem;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localContraOrdemTracker = false;

    /**
     * field for Contumacia
     */
    protected ResultadoInsumoContumacia localContumacia;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localContumaciaTracker = false;

    /**
     * field for CreditoConcedido
     */
    protected ResultadoInsumo localCreditoConcedido;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localCreditoConcedidoTracker = false;

    /**
     * field for BancoAgenciaContaDocumentoDiferente
     */
    protected ResultadoInsumo localBancoAgenciaContaDocumentoDiferente;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localBancoAgenciaContaDocumentoDiferenteTracker = false;

    /**
     * field for DadosAgenciaBancaria
     */
    protected ResultadoInsumo localDadosAgenciaBancaria;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localDadosAgenciaBancariaTracker = false;

    /**
     * field for ConsultaRealizada
     */
    protected ResultadoInsumoConsultaRealizada localConsultaRealizada;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localConsultaRealizadaTracker = false;

    /**
     * field for InformacaoPoderJudiciario
     */
    protected ResultadoInsumo localInformacaoPoderJudiciario;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localInformacaoPoderJudiciarioTracker = false;

    /**
     * field for Riskscoring6Meses
     */
    protected ResultadoInsumo localRiskscoring6Meses;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localRiskscoring6MesesTracker = false;

    /**
     * field for Riskscoring12Meses
     */
    protected ResultadoInsumo localRiskscoring12Meses;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localRiskscoring12MesesTracker = false;

    /**
     * field for ChequeSemFundoAchei
     */
    protected ResultadoInsumo localChequeSemFundoAchei;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localChequeSemFundoAcheiTracker = false;

    /**
     * field for ChequeSemFundoAcheiCcf
     */
    protected ResultadoInsumo localChequeSemFundoAcheiCcf;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localChequeSemFundoAcheiCcfTracker = false;

    /**
     * field for ContumaciaSrs
     */
    protected ResultadoInsumo localContumaciaSrs;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localContumaciaSrsTracker = false;

    /**
     * field for ParticipacaoFalencia
     */
    protected ResultadoInsumo localParticipacaoFalencia;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localParticipacaoFalenciaTracker = false;

    /**
     * field for RestricaoFinanceira
     */
    protected ResultadoInsumo localRestricaoFinanceira;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localRestricaoFinanceiraTracker = false;

    /**
     * field for PendenciaFinanceira
     */
    protected ResultadoInsumo localPendenciaFinanceira;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localPendenciaFinanceiraTracker = false;

    /**
     * field for ChequeSemFundoVarejo
     */
    protected ResultadoInsumo localChequeSemFundoVarejo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localChequeSemFundoVarejoTracker = false;

    /**
     * field for ContraOrdemSrs
     */
    protected ResultadoInsumo localContraOrdemSrs;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localContraOrdemSrsTracker = false;

    /**
     * field for ContraOrdemDocumentoDiferenteSrs
     */
    protected ResultadoInsumo localContraOrdemDocumentoDiferenteSrs;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localContraOrdemDocumentoDiferenteSrsTracker = false;

    /**
     * field for ChequeOutrasOcorrenciasSrs
     */
    protected ResultadoInsumo localChequeOutrasOcorrenciasSrs;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localChequeOutrasOcorrenciasSrsTracker = false;

    /**
     * field for ChequeConsultaOnlineSrs
     */
    protected ResultadoInsumo localChequeConsultaOnlineSrs;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localChequeConsultaOnlineSrsTracker = false;

    /**
     * field for ConsultaRealizadaCheque
     */
    protected ResultadoInsumo localConsultaRealizadaCheque;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localConsultaRealizadaChequeTracker = false;

    /**
     * field for ReferenciaisNegocios
     */
    protected ResultadoInsumo localReferenciaisNegocios;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localReferenciaisNegociosTracker = false;

    /**
     * field for HistoricoPagamento
     */
    protected ResultadoInsumo localHistoricoPagamento;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localHistoricoPagamentoTracker = false;

    /**
     * field for RelacionamentoMaisAntigoComFornecedores
     */
    protected ResultadoInsumo localRelacionamentoMaisAntigoComFornecedores;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localRelacionamentoMaisAntigoComFornecedoresTracker = false;

    /**
     * field for RegistroConsulta
     */
    protected ResultadoInsumo localRegistroConsulta;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localRegistroConsultaTracker = false;

    /**
     * field for UltimasConsultas
     */
    protected ResultadoInsumo localUltimasConsultas;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localUltimasConsultasTracker = false;

    /**
     * field for CapitalSocial
     */
    protected ResultadoInsumo localCapitalSocial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localCapitalSocialTracker = false;

    /**
     * field for Antecessora
     */
    protected ResultadoInsumo localAntecessora;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localAntecessoraTracker = false;

    /**
     * field for AtividadeEmpresa
     */
    protected ResultadoInsumo localAtividadeEmpresa;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localAtividadeEmpresaTracker = false;

    /**
     * field for Filial
     */
    protected ResultadoInsumo localFilial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localFilialTracker = false;

    /**
     * field for InformacoesAdicionais
     */
    protected ResultadoInsumo localInformacoesAdicionais;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localInformacoesAdicionaisTracker = false;

    /**
     * field for IncorporacaoFusaoCisao
     */
    protected ResultadoInsumo localIncorporacaoFusaoCisao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localIncorporacaoFusaoCisaoTracker = false;

    /**
     * field for PrincipaisProdutos
     */
    protected ResultadoInsumo localPrincipaisProdutos;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localPrincipaisProdutosTracker = false;

    /**
     * field for MensagemComplementar
     * This was an Array!
     */
    protected MensagemComplementar[] localMensagemComplementar;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localMensagemComplementarTracker = false;

    /**
     * field for SpcScore3Meses
     */
    protected ResultadoInsumo localSpcScore3Meses;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localSpcScore3MesesTracker = false;

    /**
     * field for SpcScore12Meses
     */
    protected ResultadoInsumo localSpcScore12Meses;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localSpcScore12MesesTracker = false;

    /**
     * field for SpcObito
     */
    protected ResultadoInsumo localSpcObito;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localSpcObitoTracker = false;

    /**
     * field for ConfirmacaoRg
     */
    protected ResultadoInsumo localConfirmacaoRg;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localConfirmacaoRgTracker = false;

    /**
     * field for RenavamFederal
     */
    protected ResultadoInsumo localRenavamFederal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localRenavamFederalTracker = false;

    /**
     * field for RouboFurto
     */
    protected ResultadoInsumo localRouboFurto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localRouboFurtoTracker = false;

    /**
     * field for Dpvat
     */
    protected ResultadoInsumo localDpvat;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localDpvatTracker = false;

    /**
     * field for Gravame
     */
    protected ResultadoInsumo localGravame;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localGravameTracker = false;

    /**
     * field for RenavamEstadual
     */
    protected ResultadoInsumo localRenavamEstadual;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localRenavamEstadualTracker = false;

    /**
     * field for LocalizaVeiculo
     */
    protected ResultadoInsumo localLocalizaVeiculo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localLocalizaVeiculoTracker = false;

    /**
     * field for RendaPresumidaSpc
     */
    protected ResultadoInsumo localRendaPresumidaSpc;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localRendaPresumidaSpcTracker = false;

    /**
     * field for LimiteCreditoSugerido
     */
    protected ResultadoInsumo localLimiteCreditoSugerido;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localLimiteCreditoSugeridoTracker = false;

    /**
     * field for Ocupacao
     */
    protected ResultadoInsumo localOcupacao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localOcupacaoTracker = false;

    /**
     * field for InformacoesComplementares
     */
    protected ResultadoInsumo localInformacoesComplementares;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localInformacoesComplementaresTracker = false;

    /**
     * field for TelefoneAlternativo
     */
    protected ResultadoInsumo localTelefoneAlternativo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localTelefoneAlternativoTracker = false;

    /**
     * field for AlertaObito
     */
    protected ResultadoInsumo localAlertaObito;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localAlertaObitoTracker = false;

    /**
     * field for AlertaIdentidade
     */
    protected ResultadoInsumo localAlertaIdentidade;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localAlertaIdentidadeTracker = false;

    /**
     * field for FaturamentoPresumido
     */
    protected ResultadoInsumo localFaturamentoPresumido;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localFaturamentoPresumidoTracker = false;

    /**
     * field for LimiteCreditoPj
     */
    protected ResultadoInsumo localLimiteCreditoPj;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localLimiteCreditoPjTracker = false;

    /**
     * field for GastoEstimadoPj
     */
    protected ResultadoInsumo localGastoEstimadoPj;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localGastoEstimadoPjTracker = false;

    /**
     * field for QuadroSocialMaisCompletoPj
     */
    protected ResultadoInsumo localQuadroSocialMaisCompletoPj;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localQuadroSocialMaisCompletoPjTracker = false;

    /**
     * field for RiscoCreditoPj
     */
    protected ResultadoInsumo localRiscoCreditoPj;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localRiscoCreditoPjTracker = false;

    /**
     * field for PerfilFinanceiroPj
     */
    protected ResultadoInsumo localPerfilFinanceiroPj;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localPerfilFinanceiroPjTracker = false;

    /**
     * field for GastoEstimadoPf
     */
    protected ResultadoInsumo localGastoEstimadoPf;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localGastoEstimadoPfTracker = false;

    /**
     * field for IndiceRelacionamentoMercadoPf
     */
    protected ResultadoInsumo localIndiceRelacionamentoMercadoPf;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localIndiceRelacionamentoMercadoPfTracker = false;

    /**
     * field for IndiceRelacionamentoMercadoPj
     */
    protected ResultadoInsumo localIndiceRelacionamentoMercadoPj;

    /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
    protected boolean localIndiceRelacionamentoMercadoPjTracker = false;

    /**
     * field for Restricao
     * This was an Attribute!
     */
    protected boolean localRestricao;

    /**
     * field for Data
     * This was an Attribute!
     */
    protected java.util.Calendar localData;

    public boolean isProtocoloSpecified() {
        return localProtocoloTracker;
    }

    /**
     * Auto generated getter method
     * @return ProtocoloConsulta
     */
    public ProtocoloConsulta getProtocolo() {
        return localProtocolo;
    }

    /**
     * Auto generated setter method
     * @param param Protocolo
     */
    public void setProtocolo(ProtocoloConsulta param) {
        localProtocoloTracker = param != null;

        this.localProtocolo = param;
    }

    public boolean isOperadorSpecified() {
        return localOperadorTracker;
    }

    /**
     * Auto generated getter method
     * @return Operador
     */
    public Operador getOperador() {
        return localOperador;
    }

    /**
     * Auto generated setter method
     * @param param Operador
     */
    public void setOperador(Operador param) {
        localOperadorTracker = param != null;

        this.localOperador = param;
    }

    public boolean isMensagemBaseExternaSpecified() {
        return localMensagemBaseExternaTracker;
    }

    /**
     * Auto generated getter method
     * @return MensagemBaseExterna[]
     */
    public MensagemBaseExterna[] getMensagemBaseExterna() {
        return localMensagemBaseExterna;
    }

    /**
     * validate the array for MensagemBaseExterna
     */
    protected void validateMensagemBaseExterna(MensagemBaseExterna[] param) {
    }

    /**
     * Auto generated setter method
     * @param param MensagemBaseExterna
     */
    public void setMensagemBaseExterna(MensagemBaseExterna[] param) {
        validateMensagemBaseExterna(param);

        localMensagemBaseExternaTracker = param != null;

        this.localMensagemBaseExterna = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param MensagemBaseExterna
     */
    public void addMensagemBaseExterna(MensagemBaseExterna param) {
        if (localMensagemBaseExterna == null) {
            localMensagemBaseExterna = new MensagemBaseExterna[] {  };
        }

        //update the setting tracker
        localMensagemBaseExternaTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localMensagemBaseExterna);
        list.add(param);
        this.localMensagemBaseExterna = (MensagemBaseExterna[]) list.toArray(new MensagemBaseExterna[list.size()]);
    }

    public boolean isBaseInoperanteSpecified() {
        return localBaseInoperanteTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String[]
     */
    public java.lang.String[] getBaseInoperante() {
        return localBaseInoperante;
    }

    /**
     * validate the array for BaseInoperante
     */
    protected void validateBaseInoperante(java.lang.String[] param) {
    }

    /**
     * Auto generated setter method
     * @param param BaseInoperante
     */
    public void setBaseInoperante(java.lang.String[] param) {
        validateBaseInoperante(param);

        localBaseInoperanteTracker = param != null;

        this.localBaseInoperante = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param java.lang.String
     */
    public void addBaseInoperante(java.lang.String param) {
        if (localBaseInoperante == null) {
            localBaseInoperante = new java.lang.String[] {  };
        }

        //update the setting tracker
        localBaseInoperanteTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localBaseInoperante);
        list.add(param);
        this.localBaseInoperante = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
    }

    public boolean isConsumidorSpecified() {
        return localConsumidorTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoConsumidor
     */
    public ResultadoConsumidor getConsumidor() {
        return localConsumidor;
    }

    /**
     * Auto generated setter method
     * @param param Consumidor
     */
    public void setConsumidor(ResultadoConsumidor param) {
        localConsumidorTracker = param != null;

        this.localConsumidor = param;
    }

    public boolean isGrafiaPjSpecified() {
        return localGrafiaPjTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getGrafiaPj() {
        return localGrafiaPj;
    }

    /**
     * Auto generated setter method
     * @param param GrafiaPj
     */
    public void setGrafiaPj(ResultadoInsumo param) {
        localGrafiaPjTracker = param != null;

        this.localGrafiaPj = param;
    }

    public boolean isEnderecoCepConsultadoSpecified() {
        return localEnderecoCepConsultadoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getEnderecoCepConsultado() {
        return localEnderecoCepConsultado;
    }

    /**
     * Auto generated setter method
     * @param param EnderecoCepConsultado
     */
    public void setEnderecoCepConsultado(ResultadoInsumo param) {
        localEnderecoCepConsultadoTracker = param != null;

        this.localEnderecoCepConsultado = param;
    }

    public boolean isTelefoneConsultadoSpecified() {
        return localTelefoneConsultadoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getTelefoneConsultado() {
        return localTelefoneConsultado;
    }

    /**
     * Auto generated setter method
     * @param param TelefoneConsultado
     */
    public void setTelefoneConsultado(ResultadoInsumo param) {
        localTelefoneConsultadoTracker = param != null;

        this.localTelefoneConsultado = param;
    }

    public boolean isTelefoneVinculadoConsumidorSpecified() {
        return localTelefoneVinculadoConsumidorTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getTelefoneVinculadoConsumidor() {
        return localTelefoneVinculadoConsumidor;
    }

    /**
     * Auto generated setter method
     * @param param TelefoneVinculadoConsumidor
     */
    public void setTelefoneVinculadoConsumidor(ResultadoInsumo param) {
        localTelefoneVinculadoConsumidorTracker = param != null;

        this.localTelefoneVinculadoConsumidor = param;
    }

    public boolean isTelefoneVinculadoAssinanteConsultadoSpecified() {
        return localTelefoneVinculadoAssinanteConsultadoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getTelefoneVinculadoAssinanteConsultado() {
        return localTelefoneVinculadoAssinanteConsultado;
    }

    /**
     * Auto generated setter method
     * @param param TelefoneVinculadoAssinanteConsultado
     */
    public void setTelefoneVinculadoAssinanteConsultado(
            ResultadoInsumo param) {
        localTelefoneVinculadoAssinanteConsultadoTracker = param != null;

        this.localTelefoneVinculadoAssinanteConsultado = param;
    }

    public boolean isUltimoTelefoneInformadoSpecified() {
        return localUltimoTelefoneInformadoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getUltimoTelefoneInformado() {
        return localUltimoTelefoneInformado;
    }

    /**
     * Auto generated setter method
     * @param param UltimoTelefoneInformado
     */
    public void setUltimoTelefoneInformado(ResultadoInsumo param) {
        localUltimoTelefoneInformadoTracker = param != null;

        this.localUltimoTelefoneInformado = param;
    }

    public boolean isUltimoEnderecoInformadoSpecified() {
        return localUltimoEnderecoInformadoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getUltimoEnderecoInformado() {
        return localUltimoEnderecoInformado;
    }

    /**
     * Auto generated setter method
     * @param param UltimoEnderecoInformado
     */
    public void setUltimoEnderecoInformado(ResultadoInsumo param) {
        localUltimoEnderecoInformadoTracker = param != null;

        this.localUltimoEnderecoInformado = param;
    }

    public boolean isParticipacaoEmpresaSpecified() {
        return localParticipacaoEmpresaTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getParticipacaoEmpresa() {
        return localParticipacaoEmpresa;
    }

    /**
     * Auto generated setter method
     * @param param ParticipacaoEmpresa
     */
    public void setParticipacaoEmpresa(ResultadoInsumo param) {
        localParticipacaoEmpresaTracker = param != null;

        this.localParticipacaoEmpresa = param;
    }

    public boolean isSocioSpecified() {
        return localSocioTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getSocio() {
        return localSocio;
    }

    /**
     * Auto generated setter method
     * @param param Socio
     */
    public void setSocio(ResultadoInsumo param) {
        localSocioTracker = param != null;

        this.localSocio = param;
    }

    public boolean isAdministradorSpecified() {
        return localAdministradorTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getAdministrador() {
        return localAdministrador;
    }

    /**
     * Auto generated setter method
     * @param param Administrador
     */
    public void setAdministrador(ResultadoInsumo param) {
        localAdministradorTracker = param != null;

        this.localAdministrador = param;
    }

    public boolean isAlertaDocumentoSpecified() {
        return localAlertaDocumentoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getAlertaDocumento() {
        return localAlertaDocumento;
    }

    /**
     * Auto generated setter method
     * @param param AlertaDocumento
     */
    public void setAlertaDocumento(ResultadoInsumo param) {
        localAlertaDocumentoTracker = param != null;

        this.localAlertaDocumento = param;
    }

    public boolean isSpcSpecified() {
        return localSpcTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getSpc() {
        return localSpc;
    }

    /**
     * Auto generated setter method
     * @param param Spc
     */
    public void setSpc(ResultadoInsumo param) {
        localSpcTracker = param != null;

        this.localSpc = param;
    }

    public boolean isChequeLojistaSpecified() {
        return localChequeLojistaTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getChequeLojista() {
        return localChequeLojista;
    }

    /**
     * Auto generated setter method
     * @param param ChequeLojista
     */
    public void setChequeLojista(ResultadoInsumo param) {
        localChequeLojistaTracker = param != null;

        this.localChequeLojista = param;
    }

    public boolean isCcfSpecified() {
        return localCcfTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getCcf() {
        return localCcf;
    }

    /**
     * Auto generated setter method
     * @param param Ccf
     */
    public void setCcf(ResultadoInsumo param) {
        localCcfTracker = param != null;

        this.localCcf = param;
    }

    public boolean isContraOrdemDocumentoDiferenteSpecified() {
        return localContraOrdemDocumentoDiferenteTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumoContraOrdem
     */
    public ResultadoInsumoContraOrdem getContraOrdemDocumentoDiferente() {
        return localContraOrdemDocumentoDiferente;
    }

    /**
     * Auto generated setter method
     * @param param ContraOrdemDocumentoDiferente
     */
    public void setContraOrdemDocumentoDiferente(
            ResultadoInsumoContraOrdem param) {
        localContraOrdemDocumentoDiferenteTracker = param != null;

        this.localContraOrdemDocumentoDiferente = param;
    }

    public boolean isContraOrdemAgenciaDiferenteSpecified() {
        return localContraOrdemAgenciaDiferenteTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumoContraOrdem
     */
    public ResultadoInsumoContraOrdem getContraOrdemAgenciaDiferente() {
        return localContraOrdemAgenciaDiferente;
    }

    /**
     * Auto generated setter method
     * @param param ContraOrdemAgenciaDiferente
     */
    public void setContraOrdemAgenciaDiferente(
            ResultadoInsumoContraOrdem param) {
        localContraOrdemAgenciaDiferenteTracker = param != null;

        this.localContraOrdemAgenciaDiferente = param;
    }

    public boolean isContraOrdemAgenciaContaDiferenteSpecified() {
        return localContraOrdemAgenciaContaDiferenteTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumoContraOrdem
     */
    public ResultadoInsumoContraOrdem getContraOrdemAgenciaContaDiferente() {
        return localContraOrdemAgenciaContaDiferente;
    }

    /**
     * Auto generated setter method
     * @param param ContraOrdemAgenciaContaDiferente
     */
    public void setContraOrdemAgenciaContaDiferente(
            ResultadoInsumoContraOrdem param) {
        localContraOrdemAgenciaContaDiferenteTracker = param != null;

        this.localContraOrdemAgenciaContaDiferente = param;
    }

    public boolean isAcaoSpecified() {
        return localAcaoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getAcao() {
        return localAcao;
    }

    /**
     * Auto generated setter method
     * @param param Acao
     */
    public void setAcao(ResultadoInsumo param) {
        localAcaoTracker = param != null;

        this.localAcao = param;
    }

    public boolean isProtestoSpecified() {
        return localProtestoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getProtesto() {
        return localProtesto;
    }

    /**
     * Auto generated setter method
     * @param param Protesto
     */
    public void setProtesto(ResultadoInsumo param) {
        localProtestoTracker = param != null;

        this.localProtesto = param;
    }

    public boolean isContraOrdemSpecified() {
        return localContraOrdemTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumoContraOrdem
     */
    public ResultadoInsumoContraOrdem getContraOrdem() {
        return localContraOrdem;
    }

    /**
     * Auto generated setter method
     * @param param ContraOrdem
     */
    public void setContraOrdem(ResultadoInsumoContraOrdem param) {
        localContraOrdemTracker = param != null;

        this.localContraOrdem = param;
    }

    public boolean isContumaciaSpecified() {
        return localContumaciaTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumoContumacia
     */
    public ResultadoInsumoContumacia getContumacia() {
        return localContumacia;
    }

    /**
     * Auto generated setter method
     * @param param Contumacia
     */
    public void setContumacia(ResultadoInsumoContumacia param) {
        localContumaciaTracker = param != null;

        this.localContumacia = param;
    }

    public boolean isCreditoConcedidoSpecified() {
        return localCreditoConcedidoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getCreditoConcedido() {
        return localCreditoConcedido;
    }

    /**
     * Auto generated setter method
     * @param param CreditoConcedido
     */
    public void setCreditoConcedido(ResultadoInsumo param) {
        localCreditoConcedidoTracker = param != null;

        this.localCreditoConcedido = param;
    }

    public boolean isBancoAgenciaContaDocumentoDiferenteSpecified() {
        return localBancoAgenciaContaDocumentoDiferenteTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getBancoAgenciaContaDocumentoDiferente() {
        return localBancoAgenciaContaDocumentoDiferente;
    }

    /**
     * Auto generated setter method
     * @param param BancoAgenciaContaDocumentoDiferente
     */
    public void setBancoAgenciaContaDocumentoDiferente(
            ResultadoInsumo param) {
        localBancoAgenciaContaDocumentoDiferenteTracker = param != null;

        this.localBancoAgenciaContaDocumentoDiferente = param;
    }

    public boolean isDadosAgenciaBancariaSpecified() {
        return localDadosAgenciaBancariaTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getDadosAgenciaBancaria() {
        return localDadosAgenciaBancaria;
    }

    /**
     * Auto generated setter method
     * @param param DadosAgenciaBancaria
     */
    public void setDadosAgenciaBancaria(ResultadoInsumo param) {
        localDadosAgenciaBancariaTracker = param != null;

        this.localDadosAgenciaBancaria = param;
    }

    public boolean isConsultaRealizadaSpecified() {
        return localConsultaRealizadaTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumoConsultaRealizada
     */
    public ResultadoInsumoConsultaRealizada getConsultaRealizada() {
        return localConsultaRealizada;
    }

    /**
     * Auto generated setter method
     * @param param ConsultaRealizada
     */
    public void setConsultaRealizada(ResultadoInsumoConsultaRealizada param) {
        localConsultaRealizadaTracker = param != null;

        this.localConsultaRealizada = param;
    }

    public boolean isInformacaoPoderJudiciarioSpecified() {
        return localInformacaoPoderJudiciarioTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getInformacaoPoderJudiciario() {
        return localInformacaoPoderJudiciario;
    }

    /**
     * Auto generated setter method
     * @param param InformacaoPoderJudiciario
     */
    public void setInformacaoPoderJudiciario(ResultadoInsumo param) {
        localInformacaoPoderJudiciarioTracker = param != null;

        this.localInformacaoPoderJudiciario = param;
    }

    public boolean isRiskscoring6MesesSpecified() {
        return localRiskscoring6MesesTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getRiskscoring6Meses() {
        return localRiskscoring6Meses;
    }

    /**
     * Auto generated setter method
     * @param param Riskscoring6Meses
     */
    public void setRiskscoring6Meses(ResultadoInsumo param) {
        localRiskscoring6MesesTracker = param != null;

        this.localRiskscoring6Meses = param;
    }

    public boolean isRiskscoring12MesesSpecified() {
        return localRiskscoring12MesesTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getRiskscoring12Meses() {
        return localRiskscoring12Meses;
    }

    /**
     * Auto generated setter method
     * @param param Riskscoring12Meses
     */
    public void setRiskscoring12Meses(ResultadoInsumo param) {
        localRiskscoring12MesesTracker = param != null;

        this.localRiskscoring12Meses = param;
    }

    public boolean isChequeSemFundoAcheiSpecified() {
        return localChequeSemFundoAcheiTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getChequeSemFundoAchei() {
        return localChequeSemFundoAchei;
    }

    /**
     * Auto generated setter method
     * @param param ChequeSemFundoAchei
     */
    public void setChequeSemFundoAchei(ResultadoInsumo param) {
        localChequeSemFundoAcheiTracker = param != null;

        this.localChequeSemFundoAchei = param;
    }

    public boolean isChequeSemFundoAcheiCcfSpecified() {
        return localChequeSemFundoAcheiCcfTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getChequeSemFundoAcheiCcf() {
        return localChequeSemFundoAcheiCcf;
    }

    /**
     * Auto generated setter method
     * @param param ChequeSemFundoAcheiCcf
     */
    public void setChequeSemFundoAcheiCcf(ResultadoInsumo param) {
        localChequeSemFundoAcheiCcfTracker = param != null;

        this.localChequeSemFundoAcheiCcf = param;
    }

    public boolean isContumaciaSrsSpecified() {
        return localContumaciaSrsTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getContumaciaSrs() {
        return localContumaciaSrs;
    }

    /**
     * Auto generated setter method
     * @param param ContumaciaSrs
     */
    public void setContumaciaSrs(ResultadoInsumo param) {
        localContumaciaSrsTracker = param != null;

        this.localContumaciaSrs = param;
    }

    public boolean isParticipacaoFalenciaSpecified() {
        return localParticipacaoFalenciaTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getParticipacaoFalencia() {
        return localParticipacaoFalencia;
    }

    /**
     * Auto generated setter method
     * @param param ParticipacaoFalencia
     */
    public void setParticipacaoFalencia(ResultadoInsumo param) {
        localParticipacaoFalenciaTracker = param != null;

        this.localParticipacaoFalencia = param;
    }

    public boolean isRestricaoFinanceiraSpecified() {
        return localRestricaoFinanceiraTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getRestricaoFinanceira() {
        return localRestricaoFinanceira;
    }

    /**
     * Auto generated setter method
     * @param param RestricaoFinanceira
     */
    public void setRestricaoFinanceira(ResultadoInsumo param) {
        localRestricaoFinanceiraTracker = param != null;

        this.localRestricaoFinanceira = param;
    }

    public boolean isPendenciaFinanceiraSpecified() {
        return localPendenciaFinanceiraTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getPendenciaFinanceira() {
        return localPendenciaFinanceira;
    }

    /**
     * Auto generated setter method
     * @param param PendenciaFinanceira
     */
    public void setPendenciaFinanceira(ResultadoInsumo param) {
        localPendenciaFinanceiraTracker = param != null;

        this.localPendenciaFinanceira = param;
    }

    public boolean isChequeSemFundoVarejoSpecified() {
        return localChequeSemFundoVarejoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getChequeSemFundoVarejo() {
        return localChequeSemFundoVarejo;
    }

    /**
     * Auto generated setter method
     * @param param ChequeSemFundoVarejo
     */
    public void setChequeSemFundoVarejo(ResultadoInsumo param) {
        localChequeSemFundoVarejoTracker = param != null;

        this.localChequeSemFundoVarejo = param;
    }

    public boolean isContraOrdemSrsSpecified() {
        return localContraOrdemSrsTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getContraOrdemSrs() {
        return localContraOrdemSrs;
    }

    /**
     * Auto generated setter method
     * @param param ContraOrdemSrs
     */
    public void setContraOrdemSrs(ResultadoInsumo param) {
        localContraOrdemSrsTracker = param != null;

        this.localContraOrdemSrs = param;
    }

    public boolean isContraOrdemDocumentoDiferenteSrsSpecified() {
        return localContraOrdemDocumentoDiferenteSrsTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getContraOrdemDocumentoDiferenteSrs() {
        return localContraOrdemDocumentoDiferenteSrs;
    }

    /**
     * Auto generated setter method
     * @param param ContraOrdemDocumentoDiferenteSrs
     */
    public void setContraOrdemDocumentoDiferenteSrs(ResultadoInsumo param) {
        localContraOrdemDocumentoDiferenteSrsTracker = param != null;

        this.localContraOrdemDocumentoDiferenteSrs = param;
    }

    public boolean isChequeOutrasOcorrenciasSrsSpecified() {
        return localChequeOutrasOcorrenciasSrsTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getChequeOutrasOcorrenciasSrs() {
        return localChequeOutrasOcorrenciasSrs;
    }

    /**
     * Auto generated setter method
     * @param param ChequeOutrasOcorrenciasSrs
     */
    public void setChequeOutrasOcorrenciasSrs(ResultadoInsumo param) {
        localChequeOutrasOcorrenciasSrsTracker = param != null;

        this.localChequeOutrasOcorrenciasSrs = param;
    }

    public boolean isChequeConsultaOnlineSrsSpecified() {
        return localChequeConsultaOnlineSrsTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getChequeConsultaOnlineSrs() {
        return localChequeConsultaOnlineSrs;
    }

    /**
     * Auto generated setter method
     * @param param ChequeConsultaOnlineSrs
     */
    public void setChequeConsultaOnlineSrs(ResultadoInsumo param) {
        localChequeConsultaOnlineSrsTracker = param != null;

        this.localChequeConsultaOnlineSrs = param;
    }

    public boolean isConsultaRealizadaChequeSpecified() {
        return localConsultaRealizadaChequeTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getConsultaRealizadaCheque() {
        return localConsultaRealizadaCheque;
    }

    /**
     * Auto generated setter method
     * @param param ConsultaRealizadaCheque
     */
    public void setConsultaRealizadaCheque(ResultadoInsumo param) {
        localConsultaRealizadaChequeTracker = param != null;

        this.localConsultaRealizadaCheque = param;
    }

    public boolean isReferenciaisNegociosSpecified() {
        return localReferenciaisNegociosTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getReferenciaisNegocios() {
        return localReferenciaisNegocios;
    }

    /**
     * Auto generated setter method
     * @param param ReferenciaisNegocios
     */
    public void setReferenciaisNegocios(ResultadoInsumo param) {
        localReferenciaisNegociosTracker = param != null;

        this.localReferenciaisNegocios = param;
    }

    public boolean isHistoricoPagamentoSpecified() {
        return localHistoricoPagamentoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getHistoricoPagamento() {
        return localHistoricoPagamento;
    }

    /**
     * Auto generated setter method
     * @param param HistoricoPagamento
     */
    public void setHistoricoPagamento(ResultadoInsumo param) {
        localHistoricoPagamentoTracker = param != null;

        this.localHistoricoPagamento = param;
    }

    public boolean isRelacionamentoMaisAntigoComFornecedoresSpecified() {
        return localRelacionamentoMaisAntigoComFornecedoresTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getRelacionamentoMaisAntigoComFornecedores() {
        return localRelacionamentoMaisAntigoComFornecedores;
    }

    /**
     * Auto generated setter method
     * @param param RelacionamentoMaisAntigoComFornecedores
     */
    public void setRelacionamentoMaisAntigoComFornecedores(
            ResultadoInsumo param) {
        localRelacionamentoMaisAntigoComFornecedoresTracker = param != null;

        this.localRelacionamentoMaisAntigoComFornecedores = param;
    }

    public boolean isRegistroConsultaSpecified() {
        return localRegistroConsultaTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getRegistroConsulta() {
        return localRegistroConsulta;
    }

    /**
     * Auto generated setter method
     * @param param RegistroConsulta
     */
    public void setRegistroConsulta(ResultadoInsumo param) {
        localRegistroConsultaTracker = param != null;

        this.localRegistroConsulta = param;
    }

    public boolean isUltimasConsultasSpecified() {
        return localUltimasConsultasTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getUltimasConsultas() {
        return localUltimasConsultas;
    }

    /**
     * Auto generated setter method
     * @param param UltimasConsultas
     */
    public void setUltimasConsultas(ResultadoInsumo param) {
        localUltimasConsultasTracker = param != null;

        this.localUltimasConsultas = param;
    }

    public boolean isCapitalSocialSpecified() {
        return localCapitalSocialTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getCapitalSocial() {
        return localCapitalSocial;
    }

    /**
     * Auto generated setter method
     * @param param CapitalSocial
     */
    public void setCapitalSocial(ResultadoInsumo param) {
        localCapitalSocialTracker = param != null;

        this.localCapitalSocial = param;
    }

    public boolean isAntecessoraSpecified() {
        return localAntecessoraTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getAntecessora() {
        return localAntecessora;
    }

    /**
     * Auto generated setter method
     * @param param Antecessora
     */
    public void setAntecessora(ResultadoInsumo param) {
        localAntecessoraTracker = param != null;

        this.localAntecessora = param;
    }

    public boolean isAtividadeEmpresaSpecified() {
        return localAtividadeEmpresaTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getAtividadeEmpresa() {
        return localAtividadeEmpresa;
    }

    /**
     * Auto generated setter method
     * @param param AtividadeEmpresa
     */
    public void setAtividadeEmpresa(ResultadoInsumo param) {
        localAtividadeEmpresaTracker = param != null;

        this.localAtividadeEmpresa = param;
    }

    public boolean isFilialSpecified() {
        return localFilialTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getFilial() {
        return localFilial;
    }

    /**
     * Auto generated setter method
     * @param param Filial
     */
    public void setFilial(ResultadoInsumo param) {
        localFilialTracker = param != null;

        this.localFilial = param;
    }

    public boolean isInformacoesAdicionaisSpecified() {
        return localInformacoesAdicionaisTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getInformacoesAdicionais() {
        return localInformacoesAdicionais;
    }

    /**
     * Auto generated setter method
     * @param param InformacoesAdicionais
     */
    public void setInformacoesAdicionais(ResultadoInsumo param) {
        localInformacoesAdicionaisTracker = param != null;

        this.localInformacoesAdicionais = param;
    }

    public boolean isIncorporacaoFusaoCisaoSpecified() {
        return localIncorporacaoFusaoCisaoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getIncorporacaoFusaoCisao() {
        return localIncorporacaoFusaoCisao;
    }

    /**
     * Auto generated setter method
     * @param param IncorporacaoFusaoCisao
     */
    public void setIncorporacaoFusaoCisao(ResultadoInsumo param) {
        localIncorporacaoFusaoCisaoTracker = param != null;

        this.localIncorporacaoFusaoCisao = param;
    }

    public boolean isPrincipaisProdutosSpecified() {
        return localPrincipaisProdutosTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getPrincipaisProdutos() {
        return localPrincipaisProdutos;
    }

    /**
     * Auto generated setter method
     * @param param PrincipaisProdutos
     */
    public void setPrincipaisProdutos(ResultadoInsumo param) {
        localPrincipaisProdutosTracker = param != null;

        this.localPrincipaisProdutos = param;
    }

    public boolean isMensagemComplementarSpecified() {
        return localMensagemComplementarTracker;
    }

    /**
     * Auto generated getter method
     * @return MensagemComplementar[]
     */
    public MensagemComplementar[] getMensagemComplementar() {
        return localMensagemComplementar;
    }

    /**
     * validate the array for MensagemComplementar
     */
    protected void validateMensagemComplementar(
            MensagemComplementar[] param) {
    }

    /**
     * Auto generated setter method
     * @param param MensagemComplementar
     */
    public void setMensagemComplementar(MensagemComplementar[] param) {
        validateMensagemComplementar(param);

        localMensagemComplementarTracker = param != null;

        this.localMensagemComplementar = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param MensagemComplementar
     */
    public void addMensagemComplementar(MensagemComplementar param) {
        if (localMensagemComplementar == null) {
            localMensagemComplementar = new MensagemComplementar[] {  };
        }

        //update the setting tracker
        localMensagemComplementarTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localMensagemComplementar);
        list.add(param);
        this.localMensagemComplementar = (MensagemComplementar[]) list.toArray(new MensagemComplementar[list.size()]);
    }

    public boolean isSpcScore3MesesSpecified() {
        return localSpcScore3MesesTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getSpcScore3Meses() {
        return localSpcScore3Meses;
    }

    /**
     * Auto generated setter method
     * @param param SpcScore3Meses
     */
    public void setSpcScore3Meses(ResultadoInsumo param) {
        localSpcScore3MesesTracker = param != null;

        this.localSpcScore3Meses = param;
    }

    public boolean isSpcScore12MesesSpecified() {
        return localSpcScore12MesesTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getSpcScore12Meses() {
        return localSpcScore12Meses;
    }

    /**
     * Auto generated setter method
     * @param param SpcScore12Meses
     */
    public void setSpcScore12Meses(ResultadoInsumo param) {
        localSpcScore12MesesTracker = param != null;

        this.localSpcScore12Meses = param;
    }

    public boolean isSpcObitoSpecified() {
        return localSpcObitoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getSpcObito() {
        return localSpcObito;
    }

    /**
     * Auto generated setter method
     * @param param SpcObito
     */
    public void setSpcObito(ResultadoInsumo param) {
        localSpcObitoTracker = param != null;

        this.localSpcObito = param;
    }

    public boolean isConfirmacaoRgSpecified() {
        return localConfirmacaoRgTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getConfirmacaoRg() {
        return localConfirmacaoRg;
    }

    /**
     * Auto generated setter method
     * @param param ConfirmacaoRg
     */
    public void setConfirmacaoRg(ResultadoInsumo param) {
        localConfirmacaoRgTracker = param != null;

        this.localConfirmacaoRg = param;
    }

    public boolean isRenavamFederalSpecified() {
        return localRenavamFederalTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getRenavamFederal() {
        return localRenavamFederal;
    }

    /**
     * Auto generated setter method
     * @param param RenavamFederal
     */
    public void setRenavamFederal(ResultadoInsumo param) {
        localRenavamFederalTracker = param != null;

        this.localRenavamFederal = param;
    }

    public boolean isRouboFurtoSpecified() {
        return localRouboFurtoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getRouboFurto() {
        return localRouboFurto;
    }

    /**
     * Auto generated setter method
     * @param param RouboFurto
     */
    public void setRouboFurto(ResultadoInsumo param) {
        localRouboFurtoTracker = param != null;

        this.localRouboFurto = param;
    }

    public boolean isDpvatSpecified() {
        return localDpvatTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getDpvat() {
        return localDpvat;
    }

    /**
     * Auto generated setter method
     * @param param Dpvat
     */
    public void setDpvat(ResultadoInsumo param) {
        localDpvatTracker = param != null;

        this.localDpvat = param;
    }

    public boolean isGravameSpecified() {
        return localGravameTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getGravame() {
        return localGravame;
    }

    /**
     * Auto generated setter method
     * @param param Gravame
     */
    public void setGravame(ResultadoInsumo param) {
        localGravameTracker = param != null;

        this.localGravame = param;
    }

    public boolean isRenavamEstadualSpecified() {
        return localRenavamEstadualTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getRenavamEstadual() {
        return localRenavamEstadual;
    }

    /**
     * Auto generated setter method
     * @param param RenavamEstadual
     */
    public void setRenavamEstadual(ResultadoInsumo param) {
        localRenavamEstadualTracker = param != null;

        this.localRenavamEstadual = param;
    }

    public boolean isLocalizaVeiculoSpecified() {
        return localLocalizaVeiculoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getLocalizaVeiculo() {
        return localLocalizaVeiculo;
    }

    /**
     * Auto generated setter method
     * @param param LocalizaVeiculo
     */
    public void setLocalizaVeiculo(ResultadoInsumo param) {
        localLocalizaVeiculoTracker = param != null;

        this.localLocalizaVeiculo = param;
    }

    public boolean isRendaPresumidaSpcSpecified() {
        return localRendaPresumidaSpcTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getRendaPresumidaSpc() {
        return localRendaPresumidaSpc;
    }

    /**
     * Auto generated setter method
     * @param param RendaPresumidaSpc
     */
    public void setRendaPresumidaSpc(ResultadoInsumo param) {
        localRendaPresumidaSpcTracker = param != null;

        this.localRendaPresumidaSpc = param;
    }

    public boolean isLimiteCreditoSugeridoSpecified() {
        return localLimiteCreditoSugeridoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getLimiteCreditoSugerido() {
        return localLimiteCreditoSugerido;
    }

    /**
     * Auto generated setter method
     * @param param LimiteCreditoSugerido
     */
    public void setLimiteCreditoSugerido(ResultadoInsumo param) {
        localLimiteCreditoSugeridoTracker = param != null;

        this.localLimiteCreditoSugerido = param;
    }

    public boolean isOcupacaoSpecified() {
        return localOcupacaoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getOcupacao() {
        return localOcupacao;
    }

    /**
     * Auto generated setter method
     * @param param Ocupacao
     */
    public void setOcupacao(ResultadoInsumo param) {
        localOcupacaoTracker = param != null;

        this.localOcupacao = param;
    }

    public boolean isInformacoesComplementaresSpecified() {
        return localInformacoesComplementaresTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getInformacoesComplementares() {
        return localInformacoesComplementares;
    }

    /**
     * Auto generated setter method
     * @param param InformacoesComplementares
     */
    public void setInformacoesComplementares(ResultadoInsumo param) {
        localInformacoesComplementaresTracker = param != null;

        this.localInformacoesComplementares = param;
    }

    public boolean isTelefoneAlternativoSpecified() {
        return localTelefoneAlternativoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getTelefoneAlternativo() {
        return localTelefoneAlternativo;
    }

    /**
     * Auto generated setter method
     * @param param TelefoneAlternativo
     */
    public void setTelefoneAlternativo(ResultadoInsumo param) {
        localTelefoneAlternativoTracker = param != null;

        this.localTelefoneAlternativo = param;
    }

    public boolean isAlertaObitoSpecified() {
        return localAlertaObitoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getAlertaObito() {
        return localAlertaObito;
    }

    /**
     * Auto generated setter method
     * @param param AlertaObito
     */
    public void setAlertaObito(ResultadoInsumo param) {
        localAlertaObitoTracker = param != null;

        this.localAlertaObito = param;
    }

    public boolean isAlertaIdentidadeSpecified() {
        return localAlertaIdentidadeTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getAlertaIdentidade() {
        return localAlertaIdentidade;
    }

    /**
     * Auto generated setter method
     * @param param AlertaIdentidade
     */
    public void setAlertaIdentidade(ResultadoInsumo param) {
        localAlertaIdentidadeTracker = param != null;

        this.localAlertaIdentidade = param;
    }

    public boolean isFaturamentoPresumidoSpecified() {
        return localFaturamentoPresumidoTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getFaturamentoPresumido() {
        return localFaturamentoPresumido;
    }

    /**
     * Auto generated setter method
     * @param param FaturamentoPresumido
     */
    public void setFaturamentoPresumido(ResultadoInsumo param) {
        localFaturamentoPresumidoTracker = param != null;

        this.localFaturamentoPresumido = param;
    }

    public boolean isLimiteCreditoPjSpecified() {
        return localLimiteCreditoPjTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getLimiteCreditoPj() {
        return localLimiteCreditoPj;
    }

    /**
     * Auto generated setter method
     * @param param LimiteCreditoPj
     */
    public void setLimiteCreditoPj(ResultadoInsumo param) {
        localLimiteCreditoPjTracker = param != null;

        this.localLimiteCreditoPj = param;
    }

    public boolean isGastoEstimadoPjSpecified() {
        return localGastoEstimadoPjTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getGastoEstimadoPj() {
        return localGastoEstimadoPj;
    }

    /**
     * Auto generated setter method
     * @param param GastoEstimadoPj
     */
    public void setGastoEstimadoPj(ResultadoInsumo param) {
        localGastoEstimadoPjTracker = param != null;

        this.localGastoEstimadoPj = param;
    }

    public boolean isQuadroSocialMaisCompletoPjSpecified() {
        return localQuadroSocialMaisCompletoPjTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getQuadroSocialMaisCompletoPj() {
        return localQuadroSocialMaisCompletoPj;
    }

    /**
     * Auto generated setter method
     * @param param QuadroSocialMaisCompletoPj
     */
    public void setQuadroSocialMaisCompletoPj(ResultadoInsumo param) {
        localQuadroSocialMaisCompletoPjTracker = param != null;

        this.localQuadroSocialMaisCompletoPj = param;
    }

    public boolean isRiscoCreditoPjSpecified() {
        return localRiscoCreditoPjTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getRiscoCreditoPj() {
        return localRiscoCreditoPj;
    }

    /**
     * Auto generated setter method
     * @param param RiscoCreditoPj
     */
    public void setRiscoCreditoPj(ResultadoInsumo param) {
        localRiscoCreditoPjTracker = param != null;

        this.localRiscoCreditoPj = param;
    }

    public boolean isPerfilFinanceiroPjSpecified() {
        return localPerfilFinanceiroPjTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getPerfilFinanceiroPj() {
        return localPerfilFinanceiroPj;
    }

    /**
     * Auto generated setter method
     * @param param PerfilFinanceiroPj
     */
    public void setPerfilFinanceiroPj(ResultadoInsumo param) {
        localPerfilFinanceiroPjTracker = param != null;

        this.localPerfilFinanceiroPj = param;
    }

    public boolean isGastoEstimadoPfSpecified() {
        return localGastoEstimadoPfTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getGastoEstimadoPf() {
        return localGastoEstimadoPf;
    }

    /**
     * Auto generated setter method
     * @param param GastoEstimadoPf
     */
    public void setGastoEstimadoPf(ResultadoInsumo param) {
        localGastoEstimadoPfTracker = param != null;

        this.localGastoEstimadoPf = param;
    }

    public boolean isIndiceRelacionamentoMercadoPfSpecified() {
        return localIndiceRelacionamentoMercadoPfTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getIndiceRelacionamentoMercadoPf() {
        return localIndiceRelacionamentoMercadoPf;
    }

    /**
     * Auto generated setter method
     * @param param IndiceRelacionamentoMercadoPf
     */
    public void setIndiceRelacionamentoMercadoPf(ResultadoInsumo param) {
        localIndiceRelacionamentoMercadoPfTracker = param != null;

        this.localIndiceRelacionamentoMercadoPf = param;
    }

    public boolean isIndiceRelacionamentoMercadoPjSpecified() {
        return localIndiceRelacionamentoMercadoPjTracker;
    }

    /**
     * Auto generated getter method
     * @return ResultadoInsumo
     */
    public ResultadoInsumo getIndiceRelacionamentoMercadoPj() {
        return localIndiceRelacionamentoMercadoPj;
    }

    /**
     * Auto generated setter method
     * @param param IndiceRelacionamentoMercadoPj
     */
    public void setIndiceRelacionamentoMercadoPj(ResultadoInsumo param) {
        localIndiceRelacionamentoMercadoPjTracker = param != null;

        this.localIndiceRelacionamentoMercadoPj = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getRestricao() {
        return localRestricao;
    }

    /**
     * Auto generated setter method
     * @param param Restricao
     */
    public void setRestricao(boolean param) {
        this.localRestricao = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getData() {
        return localData;
    }

    /**
     * Auto generated setter method
     * @param param Data
     */
    public void setData(java.util.Calendar param) {
        this.localData = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, parentQName));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://webservice.consulta.spcjava.spcbrasil.org/");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":Resultado-Consulta", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Resultado-Consulta", xmlWriter);
            }
        }

        if (true) {
            writeAttribute("", "restricao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRestricao), xmlWriter);
        }

        if (localData != null) {
            writeAttribute("", "data",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localData), xmlWriter);
        }

        if (localProtocoloTracker) {
            if (localProtocolo == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "protocolo cannot be null!!");
            }

            localProtocolo.serialize(new javax.xml.namespace.QName("",
                    "protocolo"), xmlWriter);
        }

        if (localOperadorTracker) {
            if (localOperador == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "operador cannot be null!!");
            }

            localOperador.serialize(new javax.xml.namespace.QName("",
                    "operador"), xmlWriter);
        }

        if (localMensagemBaseExternaTracker) {
            if (localMensagemBaseExterna != null) {
                for (int i = 0; i < localMensagemBaseExterna.length; i++) {
                    if (localMensagemBaseExterna[i] != null) {
                        localMensagemBaseExterna[i].serialize(new javax.xml.namespace.QName(
                                "", "mensagem-base-externa"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "mensagem-base-externa cannot be null!!");
            }
        }

        if (localBaseInoperanteTracker) {
            if (localBaseInoperante != null) {
                namespace = "";

                for (int i = 0; i < localBaseInoperante.length; i++) {
                    if (localBaseInoperante[i] != null) {
                        writeStartElement(null, namespace,
                                "base-inoperante", xmlWriter);

                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                localBaseInoperante[i]));

                        xmlWriter.writeEndElement();
                    } else {
                        // we have to do nothing since minOccurs is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "base-inoperante cannot be null!!");
            }
        }

        if (localConsumidorTracker) {
            if (localConsumidor == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "consumidor cannot be null!!");
            }

            localConsumidor.serialize(new javax.xml.namespace.QName("",
                    "consumidor"), xmlWriter);
        }

        if (localGrafiaPjTracker) {
            if (localGrafiaPj == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "grafia-pj cannot be null!!");
            }

            localGrafiaPj.serialize(new javax.xml.namespace.QName("",
                    "grafia-pj"), xmlWriter);
        }

        if (localEnderecoCepConsultadoTracker) {
            if (localEnderecoCepConsultado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "endereco-cep-consultado cannot be null!!");
            }

            localEnderecoCepConsultado.serialize(new javax.xml.namespace.QName(
                    "", "endereco-cep-consultado"), xmlWriter);
        }

        if (localTelefoneConsultadoTracker) {
            if (localTelefoneConsultado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "telefone-consultado cannot be null!!");
            }

            localTelefoneConsultado.serialize(new javax.xml.namespace.QName(
                    "", "telefone-consultado"), xmlWriter);
        }

        if (localTelefoneVinculadoConsumidorTracker) {
            if (localTelefoneVinculadoConsumidor == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "telefone-vinculado-consumidor cannot be null!!");
            }

            localTelefoneVinculadoConsumidor.serialize(new javax.xml.namespace.QName(
                    "", "telefone-vinculado-consumidor"), xmlWriter);
        }

        if (localTelefoneVinculadoAssinanteConsultadoTracker) {
            if (localTelefoneVinculadoAssinanteConsultado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "telefone-vinculado-assinante-consultado cannot be null!!");
            }

            localTelefoneVinculadoAssinanteConsultado.serialize(new javax.xml.namespace.QName(
                            "", "telefone-vinculado-assinante-consultado"),
                    xmlWriter);
        }

        if (localUltimoTelefoneInformadoTracker) {
            if (localUltimoTelefoneInformado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "ultimo-telefone-informado cannot be null!!");
            }

            localUltimoTelefoneInformado.serialize(new javax.xml.namespace.QName(
                    "", "ultimo-telefone-informado"), xmlWriter);
        }

        if (localUltimoEnderecoInformadoTracker) {
            if (localUltimoEnderecoInformado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "ultimo-endereco-informado cannot be null!!");
            }

            localUltimoEnderecoInformado.serialize(new javax.xml.namespace.QName(
                    "", "ultimo-endereco-informado"), xmlWriter);
        }

        if (localParticipacaoEmpresaTracker) {
            if (localParticipacaoEmpresa == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "participacao-empresa cannot be null!!");
            }

            localParticipacaoEmpresa.serialize(new javax.xml.namespace.QName(
                    "", "participacao-empresa"), xmlWriter);
        }

        if (localSocioTracker) {
            if (localSocio == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "socio cannot be null!!");
            }

            localSocio.serialize(new javax.xml.namespace.QName("", "socio"),
                    xmlWriter);
        }

        if (localAdministradorTracker) {
            if (localAdministrador == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "administrador cannot be null!!");
            }

            localAdministrador.serialize(new javax.xml.namespace.QName("",
                    "administrador"), xmlWriter);
        }

        if (localAlertaDocumentoTracker) {
            if (localAlertaDocumento == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "alerta-documento cannot be null!!");
            }

            localAlertaDocumento.serialize(new javax.xml.namespace.QName(
                    "", "alerta-documento"), xmlWriter);
        }

        if (localSpcTracker) {
            if (localSpc == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "spc cannot be null!!");
            }

            localSpc.serialize(new javax.xml.namespace.QName("", "spc"),
                    xmlWriter);
        }

        if (localChequeLojistaTracker) {
            if (localChequeLojista == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cheque-lojista cannot be null!!");
            }

            localChequeLojista.serialize(new javax.xml.namespace.QName("",
                    "cheque-lojista"), xmlWriter);
        }

        if (localCcfTracker) {
            if (localCcf == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "ccf cannot be null!!");
            }

            localCcf.serialize(new javax.xml.namespace.QName("", "ccf"),
                    xmlWriter);
        }

        if (localContraOrdemDocumentoDiferenteTracker) {
            if (localContraOrdemDocumentoDiferente == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "contra-ordem-documento-diferente cannot be null!!");
            }

            localContraOrdemDocumentoDiferente.serialize(new javax.xml.namespace.QName(
                    "", "contra-ordem-documento-diferente"), xmlWriter);
        }

        if (localContraOrdemAgenciaDiferenteTracker) {
            if (localContraOrdemAgenciaDiferente == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "contra-ordem-agencia-diferente cannot be null!!");
            }

            localContraOrdemAgenciaDiferente.serialize(new javax.xml.namespace.QName(
                    "", "contra-ordem-agencia-diferente"), xmlWriter);
        }

        if (localContraOrdemAgenciaContaDiferenteTracker) {
            if (localContraOrdemAgenciaContaDiferente == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "contra-ordem-agencia-conta-diferente cannot be null!!");
            }

            localContraOrdemAgenciaContaDiferente.serialize(new javax.xml.namespace.QName(
                    "", "contra-ordem-agencia-conta-diferente"), xmlWriter);
        }

        if (localAcaoTracker) {
            if (localAcao == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "acao cannot be null!!");
            }

            localAcao.serialize(new javax.xml.namespace.QName("", "acao"),
                    xmlWriter);
        }

        if (localProtestoTracker) {
            if (localProtesto == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "protesto cannot be null!!");
            }

            localProtesto.serialize(new javax.xml.namespace.QName("",
                    "protesto"), xmlWriter);
        }

        if (localContraOrdemTracker) {
            if (localContraOrdem == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "contra-ordem cannot be null!!");
            }

            localContraOrdem.serialize(new javax.xml.namespace.QName("",
                    "contra-ordem"), xmlWriter);
        }

        if (localContumaciaTracker) {
            if (localContumacia == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "contumacia cannot be null!!");
            }

            localContumacia.serialize(new javax.xml.namespace.QName("",
                    "contumacia"), xmlWriter);
        }

        if (localCreditoConcedidoTracker) {
            if (localCreditoConcedido == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "credito-concedido cannot be null!!");
            }

            localCreditoConcedido.serialize(new javax.xml.namespace.QName(
                    "", "credito-concedido"), xmlWriter);
        }

        if (localBancoAgenciaContaDocumentoDiferenteTracker) {
            if (localBancoAgenciaContaDocumentoDiferente == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "banco-agencia-conta-documento-diferente cannot be null!!");
            }

            localBancoAgenciaContaDocumentoDiferente.serialize(new javax.xml.namespace.QName(
                            "", "banco-agencia-conta-documento-diferente"),
                    xmlWriter);
        }

        if (localDadosAgenciaBancariaTracker) {
            if (localDadosAgenciaBancaria == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "dados-agencia-bancaria cannot be null!!");
            }

            localDadosAgenciaBancaria.serialize(new javax.xml.namespace.QName(
                    "", "dados-agencia-bancaria"), xmlWriter);
        }

        if (localConsultaRealizadaTracker) {
            if (localConsultaRealizada == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "consulta-realizada cannot be null!!");
            }

            localConsultaRealizada.serialize(new javax.xml.namespace.QName(
                    "", "consulta-realizada"), xmlWriter);
        }

        if (localInformacaoPoderJudiciarioTracker) {
            if (localInformacaoPoderJudiciario == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "informacao-poder-judiciario cannot be null!!");
            }

            localInformacaoPoderJudiciario.serialize(new javax.xml.namespace.QName(
                    "", "informacao-poder-judiciario"), xmlWriter);
        }

        if (localRiskscoring6MesesTracker) {
            if (localRiskscoring6Meses == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "riskscoring-6-meses cannot be null!!");
            }

            localRiskscoring6Meses.serialize(new javax.xml.namespace.QName(
                    "", "riskscoring-6-meses"), xmlWriter);
        }

        if (localRiskscoring12MesesTracker) {
            if (localRiskscoring12Meses == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "riskscoring-12-meses cannot be null!!");
            }

            localRiskscoring12Meses.serialize(new javax.xml.namespace.QName(
                    "", "riskscoring-12-meses"), xmlWriter);
        }

        if (localChequeSemFundoAcheiTracker) {
            if (localChequeSemFundoAchei == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cheque-sem-fundo-achei cannot be null!!");
            }

            localChequeSemFundoAchei.serialize(new javax.xml.namespace.QName(
                    "", "cheque-sem-fundo-achei"), xmlWriter);
        }

        if (localChequeSemFundoAcheiCcfTracker) {
            if (localChequeSemFundoAcheiCcf == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cheque-sem-fundo-achei-ccf cannot be null!!");
            }

            localChequeSemFundoAcheiCcf.serialize(new javax.xml.namespace.QName(
                    "", "cheque-sem-fundo-achei-ccf"), xmlWriter);
        }

        if (localContumaciaSrsTracker) {
            if (localContumaciaSrs == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "contumacia-srs cannot be null!!");
            }

            localContumaciaSrs.serialize(new javax.xml.namespace.QName("",
                    "contumacia-srs"), xmlWriter);
        }

        if (localParticipacaoFalenciaTracker) {
            if (localParticipacaoFalencia == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "participacao-falencia cannot be null!!");
            }

            localParticipacaoFalencia.serialize(new javax.xml.namespace.QName(
                    "", "participacao-falencia"), xmlWriter);
        }

        if (localRestricaoFinanceiraTracker) {
            if (localRestricaoFinanceira == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "restricao-financeira cannot be null!!");
            }

            localRestricaoFinanceira.serialize(new javax.xml.namespace.QName(
                    "", "restricao-financeira"), xmlWriter);
        }

        if (localPendenciaFinanceiraTracker) {
            if (localPendenciaFinanceira == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "pendencia-financeira cannot be null!!");
            }

            localPendenciaFinanceira.serialize(new javax.xml.namespace.QName(
                    "", "pendencia-financeira"), xmlWriter);
        }

        if (localChequeSemFundoVarejoTracker) {
            if (localChequeSemFundoVarejo == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cheque-sem-fundo-varejo cannot be null!!");
            }

            localChequeSemFundoVarejo.serialize(new javax.xml.namespace.QName(
                    "", "cheque-sem-fundo-varejo"), xmlWriter);
        }

        if (localContraOrdemSrsTracker) {
            if (localContraOrdemSrs == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "contra-ordem-srs cannot be null!!");
            }

            localContraOrdemSrs.serialize(new javax.xml.namespace.QName(
                    "", "contra-ordem-srs"), xmlWriter);
        }

        if (localContraOrdemDocumentoDiferenteSrsTracker) {
            if (localContraOrdemDocumentoDiferenteSrs == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "contra-ordem-documento-diferente-srs cannot be null!!");
            }

            localContraOrdemDocumentoDiferenteSrs.serialize(new javax.xml.namespace.QName(
                    "", "contra-ordem-documento-diferente-srs"), xmlWriter);
        }

        if (localChequeOutrasOcorrenciasSrsTracker) {
            if (localChequeOutrasOcorrenciasSrs == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cheque-outras-ocorrencias-srs cannot be null!!");
            }

            localChequeOutrasOcorrenciasSrs.serialize(new javax.xml.namespace.QName(
                    "", "cheque-outras-ocorrencias-srs"), xmlWriter);
        }

        if (localChequeConsultaOnlineSrsTracker) {
            if (localChequeConsultaOnlineSrs == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cheque-consulta-online-srs cannot be null!!");
            }

            localChequeConsultaOnlineSrs.serialize(new javax.xml.namespace.QName(
                    "", "cheque-consulta-online-srs"), xmlWriter);
        }

        if (localConsultaRealizadaChequeTracker) {
            if (localConsultaRealizadaCheque == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "consulta-realizada-cheque cannot be null!!");
            }

            localConsultaRealizadaCheque.serialize(new javax.xml.namespace.QName(
                    "", "consulta-realizada-cheque"), xmlWriter);
        }

        if (localReferenciaisNegociosTracker) {
            if (localReferenciaisNegocios == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "referenciais-negocios cannot be null!!");
            }

            localReferenciaisNegocios.serialize(new javax.xml.namespace.QName(
                    "", "referenciais-negocios"), xmlWriter);
        }

        if (localHistoricoPagamentoTracker) {
            if (localHistoricoPagamento == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "historico-pagamento cannot be null!!");
            }

            localHistoricoPagamento.serialize(new javax.xml.namespace.QName(
                    "", "historico-pagamento"), xmlWriter);
        }

        if (localRelacionamentoMaisAntigoComFornecedoresTracker) {
            if (localRelacionamentoMaisAntigoComFornecedores == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "relacionamento-mais-antigo-com-fornecedores cannot be null!!");
            }

            localRelacionamentoMaisAntigoComFornecedores.serialize(new javax.xml.namespace.QName(
                            "", "relacionamento-mais-antigo-com-fornecedores"),
                    xmlWriter);
        }

        if (localRegistroConsultaTracker) {
            if (localRegistroConsulta == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "registro-consulta cannot be null!!");
            }

            localRegistroConsulta.serialize(new javax.xml.namespace.QName(
                    "", "registro-consulta"), xmlWriter);
        }

        if (localUltimasConsultasTracker) {
            if (localUltimasConsultas == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "ultimas-consultas cannot be null!!");
            }

            localUltimasConsultas.serialize(new javax.xml.namespace.QName(
                    "", "ultimas-consultas"), xmlWriter);
        }

        if (localCapitalSocialTracker) {
            if (localCapitalSocial == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "capital-social cannot be null!!");
            }

            localCapitalSocial.serialize(new javax.xml.namespace.QName("",
                    "capital-social"), xmlWriter);
        }

        if (localAntecessoraTracker) {
            if (localAntecessora == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "antecessora cannot be null!!");
            }

            localAntecessora.serialize(new javax.xml.namespace.QName("",
                    "antecessora"), xmlWriter);
        }

        if (localAtividadeEmpresaTracker) {
            if (localAtividadeEmpresa == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "atividade-empresa cannot be null!!");
            }

            localAtividadeEmpresa.serialize(new javax.xml.namespace.QName(
                    "", "atividade-empresa"), xmlWriter);
        }

        if (localFilialTracker) {
            if (localFilial == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "filial cannot be null!!");
            }

            localFilial.serialize(new javax.xml.namespace.QName("", "filial"),
                    xmlWriter);
        }

        if (localInformacoesAdicionaisTracker) {
            if (localInformacoesAdicionais == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "informacoes-adicionais cannot be null!!");
            }

            localInformacoesAdicionais.serialize(new javax.xml.namespace.QName(
                    "", "informacoes-adicionais"), xmlWriter);
        }

        if (localIncorporacaoFusaoCisaoTracker) {
            if (localIncorporacaoFusaoCisao == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "incorporacao-fusao-cisao cannot be null!!");
            }

            localIncorporacaoFusaoCisao.serialize(new javax.xml.namespace.QName(
                    "", "incorporacao-fusao-cisao"), xmlWriter);
        }

        if (localPrincipaisProdutosTracker) {
            if (localPrincipaisProdutos == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "principais-produtos cannot be null!!");
            }

            localPrincipaisProdutos.serialize(new javax.xml.namespace.QName(
                    "", "principais-produtos"), xmlWriter);
        }

        if (localMensagemComplementarTracker) {
            if (localMensagemComplementar != null) {
                for (int i = 0; i < localMensagemComplementar.length;
                     i++) {
                    if (localMensagemComplementar[i] != null) {
                        localMensagemComplementar[i].serialize(new javax.xml.namespace.QName(
                                "", "mensagem-complementar"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "mensagem-complementar cannot be null!!");
            }
        }

        if (localSpcScore3MesesTracker) {
            if (localSpcScore3Meses == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "spc-score-3-meses cannot be null!!");
            }

            localSpcScore3Meses.serialize(new javax.xml.namespace.QName(
                    "", "spc-score-3-meses"), xmlWriter);
        }

        if (localSpcScore12MesesTracker) {
            if (localSpcScore12Meses == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "spc-score-12-meses cannot be null!!");
            }

            localSpcScore12Meses.serialize(new javax.xml.namespace.QName(
                    "", "spc-score-12-meses"), xmlWriter);
        }

        if (localSpcObitoTracker) {
            if (localSpcObito == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "spc-obito cannot be null!!");
            }

            localSpcObito.serialize(new javax.xml.namespace.QName("",
                    "spc-obito"), xmlWriter);
        }

        if (localConfirmacaoRgTracker) {
            if (localConfirmacaoRg == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "confirmacao-rg cannot be null!!");
            }

            localConfirmacaoRg.serialize(new javax.xml.namespace.QName("",
                    "confirmacao-rg"), xmlWriter);
        }

        if (localRenavamFederalTracker) {
            if (localRenavamFederal == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "renavam-federal cannot be null!!");
            }

            localRenavamFederal.serialize(new javax.xml.namespace.QName(
                    "", "renavam-federal"), xmlWriter);
        }

        if (localRouboFurtoTracker) {
            if (localRouboFurto == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "roubo-furto cannot be null!!");
            }

            localRouboFurto.serialize(new javax.xml.namespace.QName("",
                    "roubo-furto"), xmlWriter);
        }

        if (localDpvatTracker) {
            if (localDpvat == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "dpvat cannot be null!!");
            }

            localDpvat.serialize(new javax.xml.namespace.QName("", "dpvat"),
                    xmlWriter);
        }

        if (localGravameTracker) {
            if (localGravame == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "gravame cannot be null!!");
            }

            localGravame.serialize(new javax.xml.namespace.QName("",
                    "gravame"), xmlWriter);
        }

        if (localRenavamEstadualTracker) {
            if (localRenavamEstadual == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "renavam-estadual cannot be null!!");
            }

            localRenavamEstadual.serialize(new javax.xml.namespace.QName(
                    "", "renavam-estadual"), xmlWriter);
        }

        if (localLocalizaVeiculoTracker) {
            if (localLocalizaVeiculo == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "localizaVeiculo cannot be null!!");
            }

            localLocalizaVeiculo.serialize(new javax.xml.namespace.QName(
                    "", "localizaVeiculo"), xmlWriter);
        }

        if (localRendaPresumidaSpcTracker) {
            if (localRendaPresumidaSpc == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "renda-presumida-spc cannot be null!!");
            }

            localRendaPresumidaSpc.serialize(new javax.xml.namespace.QName(
                    "", "renda-presumida-spc"), xmlWriter);
        }

        if (localLimiteCreditoSugeridoTracker) {
            if (localLimiteCreditoSugerido == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "limite-credito-sugerido cannot be null!!");
            }

            localLimiteCreditoSugerido.serialize(new javax.xml.namespace.QName(
                    "", "limite-credito-sugerido"), xmlWriter);
        }

        if (localOcupacaoTracker) {
            if (localOcupacao == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "ocupacao cannot be null!!");
            }

            localOcupacao.serialize(new javax.xml.namespace.QName("",
                    "ocupacao"), xmlWriter);
        }

        if (localInformacoesComplementaresTracker) {
            if (localInformacoesComplementares == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "informacoes-complementares cannot be null!!");
            }

            localInformacoesComplementares.serialize(new javax.xml.namespace.QName(
                    "", "informacoes-complementares"), xmlWriter);
        }

        if (localTelefoneAlternativoTracker) {
            if (localTelefoneAlternativo == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "telefone-alternativo cannot be null!!");
            }

            localTelefoneAlternativo.serialize(new javax.xml.namespace.QName(
                    "", "telefone-alternativo"), xmlWriter);
        }

        if (localAlertaObitoTracker) {
            if (localAlertaObito == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "alerta-obito cannot be null!!");
            }

            localAlertaObito.serialize(new javax.xml.namespace.QName("",
                    "alerta-obito"), xmlWriter);
        }

        if (localAlertaIdentidadeTracker) {
            if (localAlertaIdentidade == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "alerta-identidade cannot be null!!");
            }

            localAlertaIdentidade.serialize(new javax.xml.namespace.QName(
                    "", "alerta-identidade"), xmlWriter);
        }

        if (localFaturamentoPresumidoTracker) {
            if (localFaturamentoPresumido == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "faturamento-presumido cannot be null!!");
            }

            localFaturamentoPresumido.serialize(new javax.xml.namespace.QName(
                    "", "faturamento-presumido"), xmlWriter);
        }

        if (localLimiteCreditoPjTracker) {
            if (localLimiteCreditoPj == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "limite-credito-pj cannot be null!!");
            }

            localLimiteCreditoPj.serialize(new javax.xml.namespace.QName(
                    "", "limite-credito-pj"), xmlWriter);
        }

        if (localGastoEstimadoPjTracker) {
            if (localGastoEstimadoPj == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "gasto-estimado-pj cannot be null!!");
            }

            localGastoEstimadoPj.serialize(new javax.xml.namespace.QName(
                    "", "gasto-estimado-pj"), xmlWriter);
        }

        if (localQuadroSocialMaisCompletoPjTracker) {
            if (localQuadroSocialMaisCompletoPj == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "quadro-social-mais-completo-pj cannot be null!!");
            }

            localQuadroSocialMaisCompletoPj.serialize(new javax.xml.namespace.QName(
                    "", "quadro-social-mais-completo-pj"), xmlWriter);
        }

        if (localRiscoCreditoPjTracker) {
            if (localRiscoCreditoPj == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "risco-credito-pj cannot be null!!");
            }

            localRiscoCreditoPj.serialize(new javax.xml.namespace.QName(
                    "", "risco-credito-pj"), xmlWriter);
        }

        if (localPerfilFinanceiroPjTracker) {
            if (localPerfilFinanceiroPj == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "perfil-financeiro-pj cannot be null!!");
            }

            localPerfilFinanceiroPj.serialize(new javax.xml.namespace.QName(
                    "", "perfil-financeiro-pj"), xmlWriter);
        }

        if (localGastoEstimadoPfTracker) {
            if (localGastoEstimadoPf == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "gasto-estimado-pf cannot be null!!");
            }

            localGastoEstimadoPf.serialize(new javax.xml.namespace.QName(
                    "", "gasto-estimado-pf"), xmlWriter);
        }

        if (localIndiceRelacionamentoMercadoPfTracker) {
            if (localIndiceRelacionamentoMercadoPf == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "indice-relacionamento-mercado-pf cannot be null!!");
            }

            localIndiceRelacionamentoMercadoPf.serialize(new javax.xml.namespace.QName(
                    "", "indice-relacionamento-mercado-pf"), xmlWriter);
        }

        if (localIndiceRelacionamentoMercadoPjTracker) {
            if (localIndiceRelacionamentoMercadoPj == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "indice-relacionamento-mercado-pj cannot be null!!");
            }

            localIndiceRelacionamentoMercadoPj.serialize(new javax.xml.namespace.QName(
                    "", "indice-relacionamento-mercado-pj"), xmlWriter);
        }

        xmlWriter.writeEndElement();
    }

    private java.lang.String generatePrefix(
            java.lang.String namespace) {
        if (namespace.equals(
                "http://webservice.consulta.spcjava.spcbrasil.org/")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
                                   java.lang.String namespace, java.lang.String localPart,
                                   javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
                                java.lang.String namespace, java.lang.String attName,
                                java.lang.String attValue,
                                javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
                                java.lang.String attName, java.lang.String attValue,
                                javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
                                     java.lang.String attName, javax.xml.namespace.QName qname,
                                     javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
                            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
                             javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                        qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static ResultadoConsulta parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            ResultadoConsulta object = new ResultadoConsulta();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                        "http://www.w3.org/2001/XMLSchema-instance",
                        "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                ":") + 1);

                        if (!"Resultado-Consulta".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (ResultadoConsulta) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "restricao"
                java.lang.String tempAttribRestricao = reader.getAttributeValue(null,
                        "restricao");

                if (tempAttribRestricao != null) {
                    java.lang.String content = tempAttribRestricao;

                    object.setRestricao(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            tempAttribRestricao));
                } else {
                }

                handledAttributes.add("restricao");

                // handle attribute "data"
                java.lang.String tempAttribData = reader.getAttributeValue(null,
                        "data");

                if (tempAttribData != null) {
                    java.lang.String content = tempAttribData;

                    object.setData(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribData));
                } else {
                }

                handledAttributes.add("data");

                reader.next();

                java.util.ArrayList list3 = new java.util.ArrayList();

                java.util.ArrayList list4 = new java.util.ArrayList();

                java.util.ArrayList list58 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "protocolo").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "protocolo").equals(
                                reader.getName())) {
                    object.setProtocolo(ProtocoloConsulta.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "operador").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "operador").equals(
                                reader.getName())) {
                    object.setOperador(Operador.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "mensagem-base-externa").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "mensagem-base-externa").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list3.add(MensagemBaseExterna.Factory.parse(reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone3 = false;

                    while (!loopDone3) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement())
                            reader.next();

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone3 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "mensagem-base-externa").equals(
                                    reader.getName())) {
                                list3.add(MensagemBaseExterna.Factory.parse(
                                        reader));
                            } else {
                                loopDone3 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setMensagemBaseExterna((MensagemBaseExterna[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            MensagemBaseExterna.class, list3));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "base-inoperante").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "base-inoperante").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list4.add(reader.getElementText());

                    //loop until we find a start element that is not part of this array
                    boolean loopDone4 = false;

                    while (!loopDone4) {
                        // Ensure we are at the EndElement
                        while (!reader.isEndElement()) {
                            reader.next();
                        }

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone4 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "base-inoperante").equals(
                                    reader.getName())) {
                                list4.add(reader.getElementText());
                            } else {
                                loopDone4 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setBaseInoperante((java.lang.String[]) list4.toArray(
                            new java.lang.String[list4.size()]));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "consumidor").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "consumidor").equals(
                                reader.getName())) {
                    object.setConsumidor(ResultadoConsumidor.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "grafia-pj").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "grafia-pj").equals(
                                reader.getName())) {
                    object.setGrafiaPj(ResultadoInsumo.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "endereco-cep-consultado").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "endereco-cep-consultado").equals(
                                reader.getName())) {
                    object.setEnderecoCepConsultado(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "telefone-consultado").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "telefone-consultado").equals(reader.getName())) {
                    object.setTelefoneConsultado(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "telefone-vinculado-consumidor").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "telefone-vinculado-consumidor").equals(
                                reader.getName())) {
                    object.setTelefoneVinculadoConsumidor(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "telefone-vinculado-assinante-consultado").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "telefone-vinculado-assinante-consultado").equals(
                                reader.getName())) {
                    object.setTelefoneVinculadoAssinanteConsultado(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "ultimo-telefone-informado").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "ultimo-telefone-informado").equals(
                                reader.getName())) {
                    object.setUltimoTelefoneInformado(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "ultimo-endereco-informado").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "ultimo-endereco-informado").equals(
                                reader.getName())) {
                    object.setUltimoEnderecoInformado(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "participacao-empresa").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "participacao-empresa").equals(reader.getName())) {
                    object.setParticipacaoEmpresa(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "socio").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "socio").equals(
                                reader.getName())) {
                    object.setSocio(ResultadoInsumo.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "administrador").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "administrador").equals(
                                reader.getName())) {
                    object.setAdministrador(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "alerta-documento").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "alerta-documento").equals(
                                reader.getName())) {
                    object.setAlertaDocumento(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "spc").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "spc").equals(
                                reader.getName())) {
                    object.setSpc(ResultadoInsumo.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "cheque-lojista").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "cheque-lojista").equals(
                                reader.getName())) {
                    object.setChequeLojista(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ccf").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "ccf").equals(
                                reader.getName())) {
                    object.setCcf(ResultadoInsumo.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "contra-ordem-documento-diferente").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "contra-ordem-documento-diferente").equals(
                                reader.getName())) {
                    object.setContraOrdemDocumentoDiferente(ResultadoInsumoContraOrdem.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "contra-ordem-agencia-diferente").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "contra-ordem-agencia-diferente").equals(
                                reader.getName())) {
                    object.setContraOrdemAgenciaDiferente(ResultadoInsumoContraOrdem.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "contra-ordem-agencia-conta-diferente").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "contra-ordem-agencia-conta-diferente").equals(
                                reader.getName())) {
                    object.setContraOrdemAgenciaContaDiferente(ResultadoInsumoContraOrdem.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "acao").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "acao").equals(
                                reader.getName())) {
                    object.setAcao(ResultadoInsumo.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "protesto").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "protesto").equals(
                                reader.getName())) {
                    object.setProtesto(ResultadoInsumo.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "contra-ordem").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "contra-ordem").equals(
                                reader.getName())) {
                    object.setContraOrdem(ResultadoInsumoContraOrdem.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "contumacia").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "contumacia").equals(
                                reader.getName())) {
                    object.setContumacia(ResultadoInsumoContumacia.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "credito-concedido").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "credito-concedido").equals(reader.getName())) {
                    object.setCreditoConcedido(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "banco-agencia-conta-documento-diferente").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "banco-agencia-conta-documento-diferente").equals(
                                reader.getName())) {
                    object.setBancoAgenciaContaDocumentoDiferente(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "dados-agencia-bancaria").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "dados-agencia-bancaria").equals(
                                reader.getName())) {
                    object.setDadosAgenciaBancaria(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "consulta-realizada").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "consulta-realizada").equals(reader.getName())) {
                    object.setConsultaRealizada(ResultadoInsumoConsultaRealizada.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "informacao-poder-judiciario").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "informacao-poder-judiciario").equals(
                                reader.getName())) {
                    object.setInformacaoPoderJudiciario(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "riskscoring-6-meses").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "riskscoring-6-meses").equals(reader.getName())) {
                    object.setRiskscoring6Meses(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "riskscoring-12-meses").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "riskscoring-12-meses").equals(reader.getName())) {
                    object.setRiskscoring12Meses(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "cheque-sem-fundo-achei").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "cheque-sem-fundo-achei").equals(
                                reader.getName())) {
                    object.setChequeSemFundoAchei(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "cheque-sem-fundo-achei-ccf").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "cheque-sem-fundo-achei-ccf").equals(
                                reader.getName())) {
                    object.setChequeSemFundoAcheiCcf(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "contumacia-srs").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "contumacia-srs").equals(
                                reader.getName())) {
                    object.setContumaciaSrs(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "participacao-falencia").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "participacao-falencia").equals(
                                reader.getName())) {
                    object.setParticipacaoFalencia(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "restricao-financeira").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "restricao-financeira").equals(reader.getName())) {
                    object.setRestricaoFinanceira(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "pendencia-financeira").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "pendencia-financeira").equals(reader.getName())) {
                    object.setPendenciaFinanceira(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "cheque-sem-fundo-varejo").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "cheque-sem-fundo-varejo").equals(
                                reader.getName())) {
                    object.setChequeSemFundoVarejo(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "contra-ordem-srs").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "contra-ordem-srs").equals(
                                reader.getName())) {
                    object.setContraOrdemSrs(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "contra-ordem-documento-diferente-srs").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "contra-ordem-documento-diferente-srs").equals(
                                reader.getName())) {
                    object.setContraOrdemDocumentoDiferenteSrs(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "cheque-outras-ocorrencias-srs").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "cheque-outras-ocorrencias-srs").equals(
                                reader.getName())) {
                    object.setChequeOutrasOcorrenciasSrs(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "cheque-consulta-online-srs").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "cheque-consulta-online-srs").equals(
                                reader.getName())) {
                    object.setChequeConsultaOnlineSrs(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "consulta-realizada-cheque").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "consulta-realizada-cheque").equals(
                                reader.getName())) {
                    object.setConsultaRealizadaCheque(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "referenciais-negocios").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "referenciais-negocios").equals(
                                reader.getName())) {
                    object.setReferenciaisNegocios(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "historico-pagamento").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "historico-pagamento").equals(reader.getName())) {
                    object.setHistoricoPagamento(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "relacionamento-mais-antigo-com-fornecedores").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "relacionamento-mais-antigo-com-fornecedores").equals(
                                reader.getName())) {
                    object.setRelacionamentoMaisAntigoComFornecedores(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "registro-consulta").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "registro-consulta").equals(reader.getName())) {
                    object.setRegistroConsulta(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "ultimas-consultas").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "ultimas-consultas").equals(reader.getName())) {
                    object.setUltimasConsultas(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "capital-social").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "capital-social").equals(
                                reader.getName())) {
                    object.setCapitalSocial(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "antecessora").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "antecessora").equals(
                                reader.getName())) {
                    object.setAntecessora(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "atividade-empresa").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "atividade-empresa").equals(reader.getName())) {
                    object.setAtividadeEmpresa(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "filial").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "filial").equals(
                                reader.getName())) {
                    object.setFilial(ResultadoInsumo.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "informacoes-adicionais").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "informacoes-adicionais").equals(
                                reader.getName())) {
                    object.setInformacoesAdicionais(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "incorporacao-fusao-cisao").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "incorporacao-fusao-cisao").equals(
                                reader.getName())) {
                    object.setIncorporacaoFusaoCisao(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "principais-produtos").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "principais-produtos").equals(reader.getName())) {
                    object.setPrincipaisProdutos(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "mensagem-complementar").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "mensagem-complementar").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list58.add(MensagemComplementar.Factory.parse(reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone58 = false;

                    while (!loopDone58) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement())
                            reader.next();

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone58 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "mensagem-complementar").equals(
                                    reader.getName())) {
                                list58.add(MensagemComplementar.Factory.parse(
                                        reader));
                            } else {
                                loopDone58 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setMensagemComplementar((MensagemComplementar[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            MensagemComplementar.class, list58));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "spc-score-3-meses").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "spc-score-3-meses").equals(reader.getName())) {
                    object.setSpcScore3Meses(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "spc-score-12-meses").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "spc-score-12-meses").equals(reader.getName())) {
                    object.setSpcScore12Meses(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "spc-obito").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "spc-obito").equals(
                                reader.getName())) {
                    object.setSpcObito(ResultadoInsumo.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "confirmacao-rg").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "confirmacao-rg").equals(
                                reader.getName())) {
                    object.setConfirmacaoRg(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "renavam-federal").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "renavam-federal").equals(
                                reader.getName())) {
                    object.setRenavamFederal(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "roubo-furto").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "roubo-furto").equals(
                                reader.getName())) {
                    object.setRouboFurto(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "dpvat").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "dpvat").equals(
                                reader.getName())) {
                    object.setDpvat(ResultadoInsumo.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "gravame").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "gravame").equals(
                                reader.getName())) {
                    object.setGravame(ResultadoInsumo.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "renavam-estadual").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "renavam-estadual").equals(
                                reader.getName())) {
                    object.setRenavamEstadual(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "localizaVeiculo").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "localizaVeiculo").equals(
                                reader.getName())) {
                    object.setLocalizaVeiculo(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "renda-presumida-spc").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "renda-presumida-spc").equals(reader.getName())) {
                    object.setRendaPresumidaSpc(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "limite-credito-sugerido").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "limite-credito-sugerido").equals(
                                reader.getName())) {
                    object.setLimiteCreditoSugerido(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ocupacao").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "ocupacao").equals(
                                reader.getName())) {
                    object.setOcupacao(ResultadoInsumo.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "informacoes-complementares").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "informacoes-complementares").equals(
                                reader.getName())) {
                    object.setInformacoesComplementares(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "telefone-alternativo").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "telefone-alternativo").equals(reader.getName())) {
                    object.setTelefoneAlternativo(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "alerta-obito").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "alerta-obito").equals(
                                reader.getName())) {
                    object.setAlertaObito(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "alerta-identidade").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "alerta-identidade").equals(reader.getName())) {
                    object.setAlertaIdentidade(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "faturamento-presumido").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "faturamento-presumido").equals(
                                reader.getName())) {
                    object.setFaturamentoPresumido(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "limite-credito-pj").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "limite-credito-pj").equals(reader.getName())) {
                    object.setLimiteCreditoPj(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "gasto-estimado-pj").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "gasto-estimado-pj").equals(reader.getName())) {
                    object.setGastoEstimadoPj(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "quadro-social-mais-completo-pj").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "quadro-social-mais-completo-pj").equals(
                                reader.getName())) {
                    object.setQuadroSocialMaisCompletoPj(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "risco-credito-pj").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "risco-credito-pj").equals(
                                reader.getName())) {
                    object.setRiscoCreditoPj(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-pj").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-pj").equals(reader.getName())) {
                    object.setPerfilFinanceiroPj(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "gasto-estimado-pf").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "gasto-estimado-pf").equals(reader.getName())) {
                    object.setGastoEstimadoPf(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "indice-relacionamento-mercado-pf").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "indice-relacionamento-mercado-pf").equals(
                                reader.getName())) {
                    object.setIndiceRelacionamentoMercadoPf(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "indice-relacionamento-mercado-pj").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "indice-relacionamento-mercado-pj").equals(
                                reader.getName())) {
                    object.setIndiceRelacionamentoMercadoPj(ResultadoInsumo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}

