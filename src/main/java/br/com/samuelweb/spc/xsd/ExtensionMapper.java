package br.com.samuelweb.spc.xsd;

import br.com.samuelweb.spc.wsdl.ConsultaWebServiceStub;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:08
 */
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
            java.lang.String namespaceURI, java.lang.String typeName,
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Sexo".equals(typeName)) {
            return Sexo.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Estado".equals(typeName)) {
            return Estado.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Telefone".equals(typeName)) {
            return Telefone.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Faturamento-Presumido".equals(typeName)) {
            return InsumoFaturamentoPresumido.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Ramo-Atividade".equals(typeName)) {
            return RamoAtividade.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Credito-Concedido".equals(typeName)) {
            return InsumoCreditoConcedido.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Endereco-Ocorrencia-Consumidor".equals(typeName)) {
            return EnderecoOcorrenciaConsumidor.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Cartorio".equals(typeName)) {
            return Cartorio.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Resultado-Consulta-Score".equals(typeName)) {
            return ResultadoConsultaScore.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Incorporacao-Fusao-Cisao".equals(typeName)) {
            return InsumoIncorporacaoFusaoCisao.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Contra-Ordem-Agencia-Conta-Diferente".equals(
                        typeName)) {
            return InsumoContraOrdemAgenciaContaDiferente.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Pais".equals(typeName)) {
            return Pais.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Dados-Telefone-Consultado".equals(typeName)) {
            return InsumoDadosTelefoneConsultado.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Insumo-Antecessora".equals(typeName)) {
            return InsumoAntecessora.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Insumo-Dpvat".equals(typeName)) {
            return InsumoDpvat.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Telefone-Vinculado-Assinante-Consultado".equals(
                        typeName)) {
            return InsumoTelefoneVinculadoAssinanteConsultado.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Divida-Vencida".equals(typeName)) {
            return InsumoDividaVencida.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Cheque-Consulta-Online-SRS".equals(typeName)) {
            return InsumoChequeConsultaOnlineSRS.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Renavam-Estadual".equals(typeName)) {
            return InsumoRenavamEstadual.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Resultado-Consulta".equals(typeName)) {
            return ResultadoConsulta.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Resultado-Insumo-Consulta-Realizada".equals(typeName)) {
            return ResultadoInsumoConsultaRealizada.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Moeda".equals(typeName)) {
            return Moeda.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-SPC-Score-12-Meses".equals(typeName)) {
            return InsumoSPCScore12Meses.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Alerta-Obito".equals(typeName)) {
            return InsumoAlertaObito.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Insumo-Rg".equals(typeName)) {
            return InsumoRg.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Contra-Ordem-Documento-Diferente-SRS".equals(
                        typeName)) {
            return InsumoContraOrdemDocumentoDiferenteSRS.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Endereco".equals(typeName)) {
            return Endereco.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Insumo-SPC".equals(typeName)) {
            return InsumoSPC.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Participacao-Falencia".equals(typeName)) {
            return InsumoParticipacaoFalencia.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Cnpj".equals(typeName)) {
            return Cnpj.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Capital-Social".equals(typeName)) {
            return InsumoCapitalSocial.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Atividade-Empresa".equals(typeName)) {
            return InsumoAtividadeEmpresa.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Cheque-Final".equals(typeName)) {
            return ChequeFinal.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Insumo-Gravame".equals(typeName)) {
            return InsumoGravame.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Riskscoring-6-Meses".equals(typeName)) {
            return InsumoRiskscoring6Meses.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Pessoa-Fisica".equals(typeName)) {
            return PessoaFisica.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Cheque-Lojista".equals(typeName)) {
            return InsumoChequeLojista.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Insumo-Contumacia".equals(typeName)) {
            return InsumoContumacia.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Observacao-Alerta-Obito".equals(typeName)) {
            return ObservacaoAlertaObito.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Telefone-Consultado".equals(typeName)) {
            return InsumoTelefoneConsultado.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Signo".equals(typeName)) {
            return Signo.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "simNao".equals(typeName)) {
            return SimNao.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Insumo-Roubo-Furto".equals(typeName)) {
            return InsumoRouboFurto.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "perfilFinanceiroContasAtivo".equals(typeName)) {
            return PerfilFinanceiroContasAtivo.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Relacionamento-Mais-Antigo-Com-Fornecedores".equals(
                        typeName)) {
            return InsumoRelacionamentoMaisAntigoComFornecedores.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Gasto-Estimado-PJ".equals(typeName)) {
            return InsumoGastoEstimadoPJ.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Insumo-CCF".equals(typeName)) {
            return InsumoCCF.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Estado-Civil".equals(typeName)) {
            return EstadoCivil.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "abstractInsumoSPCAuto".equals(typeName)) {
            return AbstractInsumoSPCAuto.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Insumo-Acao".equals(typeName)) {
            return InsumoAcao.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Cheque-Sem-Fundo-Achei-CCF".equals(typeName)) {
            return InsumoChequeSemFundoAcheiCCF.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Gasto-Estimado-PF".equals(typeName)) {
            return InsumoGastoEstimadoPF.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Tipo-Assinante-Telefone".equals(typeName)) {
            return TipoAssinanteTelefone.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Assinante-Telefone".equals(typeName)) {
            return AssinanteTelefone.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Quadro-Administrativo".equals(typeName)) {
            return InsumoQuadroAdministrativo.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Contra-Ordem".equals(typeName)) {
            return InsumoContraOrdem.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "mensagemBaseExterna".equals(typeName)) {
            return MensagemBaseExterna.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Endereco-CEP-Consultado".equals(typeName)) {
            return InsumoEnderecoCEPConsultado.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Historico-Pagamento".equals(typeName)) {
            return InsumoHistoricoPagamento.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Telefone-Alternativo".equals(typeName)) {
            return InsumoTelefoneAlternativo.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Natureza-Anotacao".equals(typeName)) {
            return NaturezaAnotacao.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Perfil-Financeiro-PJ".equals(typeName)) {
            return InsumoPerfilFinanceiroPJ.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Ocorrencia-Recheque-Online".equals(typeName)) {
            return OcorrenciaRechequeOnline.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Mensagem-Riskscoring".equals(typeName)) {
            return MensagemRiskscoring.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Natureza-Juridica".equals(typeName)) {
            return NaturezaJuridica.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "faixa-renda-presumida".equals(typeName)) {
            return FaixaRendaPresumida.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Insumo-Protesto".equals(typeName)) {
            return InsumoProtesto.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Detalhe1QuadroSocialMaisCompletoPJ".equals(typeName)) {
            return Detalhe1QuadroSocialMaisCompletoPJ.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "InformacoesAdicionais1Socios".equals(typeName)) {
            return InformacoesAdicionais1Socios.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-SPCAutoLocaliza".equals(typeName)) {
            return InsumoSPCAutoLocaliza.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Mensagem-Gasto-Estimado-PF".equals(typeName)) {
            return MensagemGastoEstimadoPF.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Mensagem-Gasto-Estimado-PJ".equals(typeName)) {
            return MensagemGastoEstimadoPJ.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Operador".equals(typeName)) {
            return Operador.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Limite-Credito-Sugerido".equals(typeName)) {
            return InsumoLimiteCreditoSugerido.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Cartorio-Obito".equals(typeName)) {
            return CartorioObito.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Agencia-Conta-Documento-Diferente".equals(typeName)) {
            return AgenciaContaDocumentoDiferente.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Informacoes-Adicionais".equals(typeName)) {
            return InsumoInformacoesAdicionais.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Telefone-Filtro".equals(typeName)) {
            return TelefoneFiltro.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Contra-Ordem-Agencia-Diferente".equals(typeName)) {
            return InsumoContraOrdemAgenciaDiferente.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Insumo-Ocupacao".equals(typeName)) {
            return InsumoOcupacao.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Cheque-Contra-Ordem".equals(typeName)) {
            return ChequeContraOrdem.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Contra-Ordem-Documento-Diferente".equals(typeName)) {
            return InsumoContraOrdemDocumentoDiferente.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Consulta-Realizada-Cheque".equals(typeName)) {
            return InsumoConsultaRealizadaCheque.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Tipo-Cliente-Score".equals(typeName)) {
            return TipoClienteScore.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Protocolo-Consulta".equals(typeName)) {
            return ProtocoloConsulta.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "perfilFinanceiroIdentificacaoEmpresa".equals(typeName)) {
            return PerfilFinanceiroIdentificacaoEmpresa.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Historico-Cheque-Documento-Diferente".equals(
                        typeName)) {
            return InsumoHistoricoChequeDocumentoDiferente.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Pessoa-Juridica".equals(typeName)) {
            return PessoaJuridica.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Tipo-Acao".equals(typeName)) {
            return TipoAcao.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Informacoes-Complementares".equals(typeName)) {
            return InsumoInformacoesComplementares.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Restricao-Financeira".equals(typeName)) {
            return InsumoRestricaoFinanceira.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Alinea".equals(typeName)) {
            return Alinea.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Ocorrencia-Consumidor".equals(typeName)) {
            return InsumoOcorrenciaConsumidor.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Restricao".equals(typeName)) {
            return Restricao.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Cheque-Sem-Fundo-Achei".equals(typeName)) {
            return InsumoChequeSemFundoAchei.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-SPC-Score-3-Meses".equals(typeName)) {
            return InsumoSPCScore3Meses.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "QuadroAdministrativoQuadroSocialMaisCompletoPJ".equals(
                        typeName)) {
            return QuadroAdministrativoQuadroSocialMaisCompletoPJ.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Cheque-Outras-Ocorrencias-SRS".equals(typeName)) {
            return InsumoChequeOutrasOcorrenciasSRS.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "SemRestricao".equals(typeName)) {
            return SemRestricao.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Banco".equals(typeName)) {
            return Banco.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Registro-Quadro-Social-Mais-Completo-PJ".equals(typeName)) {
            return RegistroQuadroSocialMaisCompletoPJ.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Risco-Credito-PJ".equals(typeName)) {
            return InsumoRiscoCreditoPJ.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Alerta-Documento".equals(typeName)) {
            return InsumoAlertaDocumento.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Contumacia-SRS".equals(typeName)) {
            return InsumoContumaciaSRS.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "perfilFinanceiroFraseConclusao".equals(typeName)) {
            return PerfilFinanceiroFraseConclusao.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Filtro-Consulta".equals(typeName)) {
            return FiltroConsulta.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Renda-Presumida-Spc".equals(typeName)) {
            return InsumoRendaPresumidaSpc.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Mensagem-Indice-Relacionamento-Mercado-PJ".equals(typeName)) {
            return MensagemIndiceRelacionamentoMercadoPJ.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Mensagem-Indice-Relacionamento-Mercado-PF".equals(typeName)) {
            return MensagemIndiceRelacionamentoMercadoPF.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Referencia-Comercial".equals(typeName)) {
            return ReferenciaComercial.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "InformacoesAdicionais2Socios".equals(typeName)) {
            return InformacoesAdicionais2Socios.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Insumo-Filial".equals(typeName)) {
            return InsumoFilial.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Resultado-Insumo".equals(typeName)) {
            return ResultadoInsumo.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Lista-Produto".equals(typeName)) {
            return ListaProduto.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Cheque".equals(typeName)) {
            return Cheque.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Resultado-Insumo-Contra-Ordem".equals(typeName)) {
            return ResultadoInsumoContraOrdem.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Insumo-Produto".equals(typeName)) {
            return InsumoProduto.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Cpf".equals(typeName)) {
            return Cpf.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Quadro-Societario".equals(typeName)) {
            return InsumoQuadroSocietario.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Renavam-Federal".equals(typeName)) {
            return InsumoRenavamFederal.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Insumo-Obito".equals(typeName)) {
            return InsumoObito.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "perfilFinanceiroIdentificacaoBalanco".equals(typeName)) {
            return PerfilFinanceiroIdentificacaoBalanco.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Parametro-Produto".equals(typeName)) {
            return ParametroProduto.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Cheque-Lojista".equals(typeName)) {
            return ChequeLojista.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Detalhe2QuadroSocialMaisCompletoPJ".equals(typeName)) {
            return Detalhe2QuadroSocialMaisCompletoPJ.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Cidade".equals(typeName)) {
            return Cidade.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Tipo-Documento-Alerta".equals(typeName)) {
            return TipoDocumentoAlerta.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "perfilFinanceiroResultado".equals(typeName)) {
            return PerfilFinanceiroResultado.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "InformacoesAdicionais3Socios".equals(typeName)) {
            return InformacoesAdicionais3Socios.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Filtro-Consulta-Complementar".equals(typeName)) {
            return FiltroConsultaComplementar.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Registro-Consultas".equals(typeName)) {
            return InsumoRegistroConsultas.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Situacao-Documento-WS".equals(typeName)) {
            return SituacaoDocumentoWS.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Referenciais-Negocios".equals(typeName)) {
            return InsumoReferenciaisNegocios.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "perfilFinanceiroIndicesFinanceiroIntegrado".equals(
                        typeName)) {
            return PerfilFinanceiroIndicesFinanceiroIntegrado.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "perfilFinanceiroContasPassivo".equals(typeName)) {
            return PerfilFinanceiroContasPassivo.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Limite-Credito-PJ".equals(typeName)) {
            return InsumoLimiteCreditoPJ.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Participacao-Empresas".equals(typeName)) {
            return InsumoParticipacaoEmpresas.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Mensagem-Complementar".equals(typeName)) {
            return MensagemComplementar.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Alerta-Identidade".equals(typeName)) {
            return InsumoAlertaIdentidade.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Tipo-Pessoa".equals(typeName)) {
            return TipoPessoa.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Produto".equals(typeName)) {
            return Produto.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Resultado-Insumo-Contumacia".equals(typeName)) {
            return ResultadoInsumoContumacia.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Carta-Anuencia".equals(typeName)) {
            return CartaAnuencia.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "baseExternaAgente".equals(typeName)) {
            return BaseExternaAgente.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Endereco-Assinante-Telefone".equals(typeName)) {
            return EnderecoAssinanteTelefone.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Indice-Relacionamento-Mercado-PF".equals(typeName)) {
            return InsumoIndiceRelacionamentoMercadoPF.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Resumo-Insumo".equals(typeName)) {
            return ResumoInsumo.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Vara".equals(typeName)) {
            return Vara.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Indice-Relacionamento-Mercado-PJ".equals(typeName)) {
            return InsumoIndiceRelacionamentoMercadoPJ.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Filtro-Consulta-Score".equals(typeName)) {
            return FiltroConsultaScore.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Cep".equals(typeName)) {
            return Cep.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Subjudice".equals(typeName)) {
            return Subjudice.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Resultado-Consumidor".equals(typeName)) {
            return ResultadoConsumidor.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Dados-Bancarios".equals(typeName)) {
            return DadosBancarios.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Cheque-Filtro".equals(typeName)) {
            return ChequeFiltro.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Riskscoring-12-Meses".equals(typeName)) {
            return InsumoRiskscoring12Meses.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) && "Grafia-PJ".equals(typeName)) {
            return ConsultaWebServiceStub.GrafiaPJ.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Cheque-Sem-Fundo-Varejo".equals(typeName)) {
            return InsumoChequeSemFundoVarejo.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Historico-Cheque".equals(typeName)) {
            return InsumoHistoricoCheque.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Pendencia-Financeira".equals(typeName)) {
            return InsumoPendenciaFinanceira.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Ultimas-Consultas".equals(typeName)) {
            return InsumoUltimasConsultas.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Quadro-Social-Mais-Completo-PJ".equals(typeName)) {
            return InsumoQuadroSocialMaisCompletoPJ.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Informacao-Poder-Judiciario".equals(typeName)) {
            return InsumoInformacaoPoderJudiciario.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Dados-Agencia-Bancaria".equals(typeName)) {
            return DadosAgenciaBancaria.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Principais-Produtos".equals(typeName)) {
            return InsumoPrincipaisProdutos.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Consulta-Realizada".equals(typeName)) {
            return InsumoConsultaRealizada.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Telefone-Vinculado-Consumidor".equals(typeName)) {
            return InsumoTelefoneVinculadoConsumidor.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Contra-Ordem-SRS".equals(typeName)) {
            return InsumoContraOrdemSRS.Factory.parse(reader);
        }

        if ("http://webservice.consulta.spcjava.spcbrasil.org/".equals(
                namespaceURI) &&
                "Insumo-Historico-Conta-Corrente".equals(typeName)) {
            return InsumoHistoricoContaCorrente.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException(
                "Unsupported type " + namespaceURI + " " + typeName);
    }
}

