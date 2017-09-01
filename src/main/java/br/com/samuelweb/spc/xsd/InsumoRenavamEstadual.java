package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:48
 */
public class InsumoRenavamEstadual extends AbstractInsumoSPCAuto
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Renavam-Estadual
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Chassi
     * This was an Attribute!
     */
    protected java.lang.String localChassi;

    /**
     * field for Placa
     * This was an Attribute!
     */
    protected java.lang.String localPlaca;

    /**
     * field for UfPlaca
     * This was an Attribute!
     */
    protected java.lang.String localUfPlaca;

    /**
     * field for Motor
     * This was an Attribute!
     */
    protected java.lang.String localMotor;

    /**
     * field for CaixaCambio
     * This was an Attribute!
     */
    protected java.lang.String localCaixaCambio;

    /**
     * field for Renavam
     * This was an Attribute!
     */
    protected int localRenavam;

    /**
     * field for Municipio
     * This was an Attribute!
     */
    protected java.lang.String localMunicipio;

    /**
     * field for SituacaoVeiculo
     * This was an Attribute!
     */
    protected java.lang.String localSituacaoVeiculo;

    /**
     * field for RemarcacaoChassi
     * This was an Attribute!
     */
    protected java.lang.String localRemarcacaoChassi;

    /**
     * field for CategoriaVeiculo
     * This was an Attribute!
     */
    protected java.lang.String localCategoriaVeiculo;

    /**
     * field for TipoVeiculo
     * This was an Attribute!
     */
    protected java.lang.String localTipoVeiculo;

    /**
     * field for MarcaModelo
     * This was an Attribute!
     */
    protected java.lang.String localMarcaModelo;

    /**
     * field for EspecieVeiculo
     * This was an Attribute!
     */
    protected java.lang.String localEspecieVeiculo;

    /**
     * field for TipoCarroceria
     * This was an Attribute!
     */
    protected java.lang.String localTipoCarroceria;

    /**
     * field for CorVeiculo
     * This was an Attribute!
     */
    protected java.lang.String localCorVeiculo;

    /**
     * field for AnoModelo
     * This was an Attribute!
     */
    protected int localAnoModelo;

    /**
     * field for AnoFabricacao
     * This was an Attribute!
     */
    protected int localAnoFabricacao;

    /**
     * field for PotenciaVeiculo
     * This was an Attribute!
     */
    protected int localPotenciaVeiculo;

    /**
     * field for Cilindradas
     * This was an Attribute!
     */
    protected int localCilindradas;

    /**
     * field for Combustivel
     * This was an Attribute!
     */
    protected java.lang.String localCombustivel;

    /**
     * field for TracaoVeiculo
     * This was an Attribute!
     */
    protected java.math.BigDecimal localTracaoVeiculo;

    /**
     * field for PesoBrutoVeiculo
     * This was an Attribute!
     */
    protected java.math.BigDecimal localPesoBrutoVeiculo;

    /**
     * field for CapacidadeCarga
     * This was an Attribute!
     */
    protected java.math.BigDecimal localCapacidadeCarga;

    /**
     * field for Procedencia
     * This was an Attribute!
     */
    protected java.lang.String localProcedencia;

    /**
     * field for DocumentoProprietario
     * This was an Attribute!
     */
    protected java.lang.String localDocumentoProprietario;

    /**
     * field for NumeroCarroceria
     * This was an Attribute!
     */
    protected java.lang.String localNumeroCarroceria;

    /**
     * field for QuantidadePassageiros
     * This was an Attribute!
     */
    protected int localQuantidadePassageiros;

    /**
     * field for Restricao1
     * This was an Attribute!
     */
    protected java.lang.String localRestricao1;

    /**
     * field for Restricao2
     * This was an Attribute!
     */
    protected java.lang.String localRestricao2;

    /**
     * field for Restricao3
     * This was an Attribute!
     */
    protected java.lang.String localRestricao3;

    /**
     * field for Restricao4
     * This was an Attribute!
     */
    protected java.lang.String localRestricao4;

    /**
     * field for NumeroEixo
     * This was an Attribute!
     */
    protected int localNumeroEixo;

    /**
     * field for NumeroEixoTraseiro
     * This was an Attribute!
     */
    protected java.lang.String localNumeroEixoTraseiro;

    /**
     * field for NumeroEixoAuxiliar
     * This was an Attribute!
     */
    protected java.lang.String localNumeroEixoAuxiliar;

    /**
     * field for NomeProprietario
     * This was an Attribute!
     */
    protected java.lang.String localNomeProprietario;

    /**
     * field for DebitoIpva
     * This was an Attribute!
     */
    protected java.lang.String localDebitoIpva;

    /**
     * field for DescricaoDebitoIpva
     * This was an Attribute!
     */
    protected java.lang.String localDescricaoDebitoIpva;

    /**
     * field for DebitoMultas
     * This was an Attribute!
     */
    protected java.lang.String localDebitoMultas;

    /**
     * field for DescricaoDebitoMultas
     * This was an Attribute!
     */
    protected java.lang.String localDescricaoDebitoMultas;

    /**
     * field for DataLimiteRestTrib
     * This was an Attribute!
     */
    protected java.lang.String localDataLimiteRestTrib;

    /**
     * field for DataUltimaAtualizacao
     * This was an Attribute!
     */
    protected java.lang.String localDataUltimaAtualizacao;

    /**
     * field for DebitoDpvat
     * This was an Attribute!
     */
    protected java.lang.String localDebitoDpvat;

    /**
     * field for DebitoLicenciamento
     * This was an Attribute!
     */
    protected java.lang.String localDebitoLicenciamento;

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getChassi() {
        return localChassi;
    }

    /**
     * Auto generated setter method
     * @param param Chassi
     */
    public void setChassi(java.lang.String param) {
        this.localChassi = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPlaca() {
        return localPlaca;
    }

    /**
     * Auto generated setter method
     * @param param Placa
     */
    public void setPlaca(java.lang.String param) {
        this.localPlaca = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUfPlaca() {
        return localUfPlaca;
    }

    /**
     * Auto generated setter method
     * @param param UfPlaca
     */
    public void setUfPlaca(java.lang.String param) {
        this.localUfPlaca = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMotor() {
        return localMotor;
    }

    /**
     * Auto generated setter method
     * @param param Motor
     */
    public void setMotor(java.lang.String param) {
        this.localMotor = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCaixaCambio() {
        return localCaixaCambio;
    }

    /**
     * Auto generated setter method
     * @param param CaixaCambio
     */
    public void setCaixaCambio(java.lang.String param) {
        this.localCaixaCambio = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getRenavam() {
        return localRenavam;
    }

    /**
     * Auto generated setter method
     * @param param Renavam
     */
    public void setRenavam(int param) {
        this.localRenavam = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMunicipio() {
        return localMunicipio;
    }

    /**
     * Auto generated setter method
     * @param param Municipio
     */
    public void setMunicipio(java.lang.String param) {
        this.localMunicipio = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSituacaoVeiculo() {
        return localSituacaoVeiculo;
    }

    /**
     * Auto generated setter method
     * @param param SituacaoVeiculo
     */
    public void setSituacaoVeiculo(java.lang.String param) {
        this.localSituacaoVeiculo = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRemarcacaoChassi() {
        return localRemarcacaoChassi;
    }

    /**
     * Auto generated setter method
     * @param param RemarcacaoChassi
     */
    public void setRemarcacaoChassi(java.lang.String param) {
        this.localRemarcacaoChassi = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCategoriaVeiculo() {
        return localCategoriaVeiculo;
    }

    /**
     * Auto generated setter method
     * @param param CategoriaVeiculo
     */
    public void setCategoriaVeiculo(java.lang.String param) {
        this.localCategoriaVeiculo = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTipoVeiculo() {
        return localTipoVeiculo;
    }

    /**
     * Auto generated setter method
     * @param param TipoVeiculo
     */
    public void setTipoVeiculo(java.lang.String param) {
        this.localTipoVeiculo = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMarcaModelo() {
        return localMarcaModelo;
    }

    /**
     * Auto generated setter method
     * @param param MarcaModelo
     */
    public void setMarcaModelo(java.lang.String param) {
        this.localMarcaModelo = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEspecieVeiculo() {
        return localEspecieVeiculo;
    }

    /**
     * Auto generated setter method
     * @param param EspecieVeiculo
     */
    public void setEspecieVeiculo(java.lang.String param) {
        this.localEspecieVeiculo = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTipoCarroceria() {
        return localTipoCarroceria;
    }

    /**
     * Auto generated setter method
     * @param param TipoCarroceria
     */
    public void setTipoCarroceria(java.lang.String param) {
        this.localTipoCarroceria = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCorVeiculo() {
        return localCorVeiculo;
    }

    /**
     * Auto generated setter method
     * @param param CorVeiculo
     */
    public void setCorVeiculo(java.lang.String param) {
        this.localCorVeiculo = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getAnoModelo() {
        return localAnoModelo;
    }

    /**
     * Auto generated setter method
     * @param param AnoModelo
     */
    public void setAnoModelo(int param) {
        this.localAnoModelo = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getAnoFabricacao() {
        return localAnoFabricacao;
    }

    /**
     * Auto generated setter method
     * @param param AnoFabricacao
     */
    public void setAnoFabricacao(int param) {
        this.localAnoFabricacao = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getPotenciaVeiculo() {
        return localPotenciaVeiculo;
    }

    /**
     * Auto generated setter method
     * @param param PotenciaVeiculo
     */
    public void setPotenciaVeiculo(int param) {
        this.localPotenciaVeiculo = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getCilindradas() {
        return localCilindradas;
    }

    /**
     * Auto generated setter method
     * @param param Cilindradas
     */
    public void setCilindradas(int param) {
        this.localCilindradas = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCombustivel() {
        return localCombustivel;
    }

    /**
     * Auto generated setter method
     * @param param Combustivel
     */
    public void setCombustivel(java.lang.String param) {
        this.localCombustivel = param;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getTracaoVeiculo() {
        return localTracaoVeiculo;
    }

    /**
     * Auto generated setter method
     * @param param TracaoVeiculo
     */
    public void setTracaoVeiculo(java.math.BigDecimal param) {
        this.localTracaoVeiculo = param;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getPesoBrutoVeiculo() {
        return localPesoBrutoVeiculo;
    }

    /**
     * Auto generated setter method
     * @param param PesoBrutoVeiculo
     */
    public void setPesoBrutoVeiculo(java.math.BigDecimal param) {
        this.localPesoBrutoVeiculo = param;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getCapacidadeCarga() {
        return localCapacidadeCarga;
    }

    /**
     * Auto generated setter method
     * @param param CapacidadeCarga
     */
    public void setCapacidadeCarga(java.math.BigDecimal param) {
        this.localCapacidadeCarga = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getProcedencia() {
        return localProcedencia;
    }

    /**
     * Auto generated setter method
     * @param param Procedencia
     */
    public void setProcedencia(java.lang.String param) {
        this.localProcedencia = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDocumentoProprietario() {
        return localDocumentoProprietario;
    }

    /**
     * Auto generated setter method
     * @param param DocumentoProprietario
     */
    public void setDocumentoProprietario(java.lang.String param) {
        this.localDocumentoProprietario = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumeroCarroceria() {
        return localNumeroCarroceria;
    }

    /**
     * Auto generated setter method
     * @param param NumeroCarroceria
     */
    public void setNumeroCarroceria(java.lang.String param) {
        this.localNumeroCarroceria = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getQuantidadePassageiros() {
        return localQuantidadePassageiros;
    }

    /**
     * Auto generated setter method
     * @param param QuantidadePassageiros
     */
    public void setQuantidadePassageiros(int param) {
        this.localQuantidadePassageiros = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRestricao1() {
        return localRestricao1;
    }

    /**
     * Auto generated setter method
     * @param param Restricao1
     */
    public void setRestricao1(java.lang.String param) {
        this.localRestricao1 = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRestricao2() {
        return localRestricao2;
    }

    /**
     * Auto generated setter method
     * @param param Restricao2
     */
    public void setRestricao2(java.lang.String param) {
        this.localRestricao2 = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRestricao3() {
        return localRestricao3;
    }

    /**
     * Auto generated setter method
     * @param param Restricao3
     */
    public void setRestricao3(java.lang.String param) {
        this.localRestricao3 = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRestricao4() {
        return localRestricao4;
    }

    /**
     * Auto generated setter method
     * @param param Restricao4
     */
    public void setRestricao4(java.lang.String param) {
        this.localRestricao4 = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getNumeroEixo() {
        return localNumeroEixo;
    }

    /**
     * Auto generated setter method
     * @param param NumeroEixo
     */
    public void setNumeroEixo(int param) {
        this.localNumeroEixo = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumeroEixoTraseiro() {
        return localNumeroEixoTraseiro;
    }

    /**
     * Auto generated setter method
     * @param param NumeroEixoTraseiro
     */
    public void setNumeroEixoTraseiro(java.lang.String param) {
        this.localNumeroEixoTraseiro = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumeroEixoAuxiliar() {
        return localNumeroEixoAuxiliar;
    }

    /**
     * Auto generated setter method
     * @param param NumeroEixoAuxiliar
     */
    public void setNumeroEixoAuxiliar(java.lang.String param) {
        this.localNumeroEixoAuxiliar = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeProprietario() {
        return localNomeProprietario;
    }

    /**
     * Auto generated setter method
     * @param param NomeProprietario
     */
    public void setNomeProprietario(java.lang.String param) {
        this.localNomeProprietario = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDebitoIpva() {
        return localDebitoIpva;
    }

    /**
     * Auto generated setter method
     * @param param DebitoIpva
     */
    public void setDebitoIpva(java.lang.String param) {
        this.localDebitoIpva = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDescricaoDebitoIpva() {
        return localDescricaoDebitoIpva;
    }

    /**
     * Auto generated setter method
     * @param param DescricaoDebitoIpva
     */
    public void setDescricaoDebitoIpva(java.lang.String param) {
        this.localDescricaoDebitoIpva = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDebitoMultas() {
        return localDebitoMultas;
    }

    /**
     * Auto generated setter method
     * @param param DebitoMultas
     */
    public void setDebitoMultas(java.lang.String param) {
        this.localDebitoMultas = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDescricaoDebitoMultas() {
        return localDescricaoDebitoMultas;
    }

    /**
     * Auto generated setter method
     * @param param DescricaoDebitoMultas
     */
    public void setDescricaoDebitoMultas(java.lang.String param) {
        this.localDescricaoDebitoMultas = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDataLimiteRestTrib() {
        return localDataLimiteRestTrib;
    }

    /**
     * Auto generated setter method
     * @param param DataLimiteRestTrib
     */
    public void setDataLimiteRestTrib(java.lang.String param) {
        this.localDataLimiteRestTrib = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDataUltimaAtualizacao() {
        return localDataUltimaAtualizacao;
    }

    /**
     * Auto generated setter method
     * @param param DataUltimaAtualizacao
     */
    public void setDataUltimaAtualizacao(java.lang.String param) {
        this.localDataUltimaAtualizacao = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDebitoDpvat() {
        return localDebitoDpvat;
    }

    /**
     * Auto generated setter method
     * @param param DebitoDpvat
     */
    public void setDebitoDpvat(java.lang.String param) {
        this.localDebitoDpvat = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDebitoLicenciamento() {
        return localDebitoLicenciamento;
    }

    /**
     * Auto generated setter method
     * @param param DebitoLicenciamento
     */
    public void setDebitoLicenciamento(java.lang.String param) {
        this.localDebitoLicenciamento = param;
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

        java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                "http://webservice.consulta.spcjava.spcbrasil.org/");

        if ((namespacePrefix != null) &&
                (namespacePrefix.trim().length() > 0)) {
            writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":Insumo-Renavam-Estadual", xmlWriter);
        } else {
            writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Insumo-Renavam-Estadual", xmlWriter);
        }

        if (localChassi != null) {
            writeAttribute("", "chassi",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localChassi), xmlWriter);
        }

        if (localPlaca != null) {
            writeAttribute("", "placa",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPlaca), xmlWriter);
        }

        if (localUfPlaca != null) {
            writeAttribute("", "uf-placa",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localUfPlaca), xmlWriter);
        }

        if (localMotor != null) {
            writeAttribute("", "motor",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localMotor), xmlWriter);
        }

        if (localCaixaCambio != null) {
            writeAttribute("", "caixa-cambio",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCaixaCambio), xmlWriter);
        }

        if (localRenavam != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "renavam",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRenavam), xmlWriter);
        }

        if (localMunicipio != null) {
            writeAttribute("", "municipio",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localMunicipio), xmlWriter);
        }

        if (localSituacaoVeiculo != null) {
            writeAttribute("", "situacao-veiculo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSituacaoVeiculo), xmlWriter);
        }

        if (localRemarcacaoChassi != null) {
            writeAttribute("", "remarcacao-chassi",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRemarcacaoChassi), xmlWriter);
        }

        if (localCategoriaVeiculo != null) {
            writeAttribute("", "categoria-veiculo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCategoriaVeiculo), xmlWriter);
        }

        if (localTipoVeiculo != null) {
            writeAttribute("", "tipo-veiculo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTipoVeiculo), xmlWriter);
        }

        if (localMarcaModelo != null) {
            writeAttribute("", "marca-modelo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localMarcaModelo), xmlWriter);
        }

        if (localEspecieVeiculo != null) {
            writeAttribute("", "especie-veiculo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localEspecieVeiculo), xmlWriter);
        }

        if (localTipoCarroceria != null) {
            writeAttribute("", "tipo-carroceria",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTipoCarroceria), xmlWriter);
        }

        if (localCorVeiculo != null) {
            writeAttribute("", "cor-veiculo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCorVeiculo), xmlWriter);
        }

        if (localAnoModelo != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "ano-modelo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localAnoModelo), xmlWriter);
        }

        if (localAnoFabricacao != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "ano-fabricacao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localAnoFabricacao), xmlWriter);
        }

        if (localPotenciaVeiculo != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "potencia-veiculo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPotenciaVeiculo), xmlWriter);
        }

        if (localCilindradas != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "cilindradas",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCilindradas), xmlWriter);
        }

        if (localCombustivel != null) {
            writeAttribute("", "combustivel",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCombustivel), xmlWriter);
        }

        if (localTracaoVeiculo != null) {
            writeAttribute("", "tracao-veiculo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTracaoVeiculo), xmlWriter);
        }

        if (localPesoBrutoVeiculo != null) {
            writeAttribute("", "peso-bruto-veiculo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPesoBrutoVeiculo), xmlWriter);
        }

        if (localCapacidadeCarga != null) {
            writeAttribute("", "capacidade-carga",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCapacidadeCarga), xmlWriter);
        }

        if (localProcedencia != null) {
            writeAttribute("", "procedencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localProcedencia), xmlWriter);
        }

        if (localDocumentoProprietario != null) {
            writeAttribute("", "documento-proprietario",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDocumentoProprietario), xmlWriter);
        }

        if (localNumeroCarroceria != null) {
            writeAttribute("", "numero-carroceria",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNumeroCarroceria), xmlWriter);
        }

        if (localQuantidadePassageiros != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "quantidade-passageiros",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localQuantidadePassageiros), xmlWriter);
        }

        if (localRestricao1 != null) {
            writeAttribute("", "restricao1",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRestricao1), xmlWriter);
        }

        if (localRestricao2 != null) {
            writeAttribute("", "restricao2",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRestricao2), xmlWriter);
        }

        if (localRestricao3 != null) {
            writeAttribute("", "restricao3",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRestricao3), xmlWriter);
        }

        if (localRestricao4 != null) {
            writeAttribute("", "restricao4",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRestricao4), xmlWriter);
        }

        if (localNumeroEixo != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "numero-eixo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNumeroEixo), xmlWriter);
        }

        if (localNumeroEixoTraseiro != null) {
            writeAttribute("", "numero-eixo-traseiro",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNumeroEixoTraseiro), xmlWriter);
        }

        if (localNumeroEixoAuxiliar != null) {
            writeAttribute("", "numero-eixo-auxiliar",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNumeroEixoAuxiliar), xmlWriter);
        }

        if (localNomeProprietario != null) {
            writeAttribute("", "nome-proprietario",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNomeProprietario), xmlWriter);
        }

        if (localDebitoIpva != null) {
            writeAttribute("", "debito-ipva",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDebitoIpva), xmlWriter);
        }

        if (localDescricaoDebitoIpva != null) {
            writeAttribute("", "descricao-debito-ipva",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDescricaoDebitoIpva), xmlWriter);
        }

        if (localDebitoMultas != null) {
            writeAttribute("", "debito-multas",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDebitoMultas), xmlWriter);
        }

        if (localDescricaoDebitoMultas != null) {
            writeAttribute("", "descricao-debito-multas",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDescricaoDebitoMultas), xmlWriter);
        }

        if (localDataLimiteRestTrib != null) {
            writeAttribute("", "data-limite-rest-trib",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataLimiteRestTrib), xmlWriter);
        }

        if (localDataUltimaAtualizacao != null) {
            writeAttribute("", "data-ultima-atualizacao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataUltimaAtualizacao), xmlWriter);
        }

        if (localDebitoDpvat != null) {
            writeAttribute("", "debito-dpvat",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDebitoDpvat), xmlWriter);
        }

        if (localDebitoLicenciamento != null) {
            writeAttribute("", "debito-licenciamento",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDebitoLicenciamento), xmlWriter);
        }

        if (localIdAgenteGeradorTracker) {
            namespace = "";
            writeStartElement(null, namespace, "idAgenteGerador", xmlWriter);

            if (localIdAgenteGerador == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                        "idAgenteGerador cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIdAgenteGerador));
            }

            xmlWriter.writeEndElement();
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
        public static InsumoRenavamEstadual parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoRenavamEstadual object = new InsumoRenavamEstadual();

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

                        if (!"Insumo-Renavam-Estadual".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoRenavamEstadual) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "chassi"
                java.lang.String tempAttribChassi = reader.getAttributeValue(null,
                        "chassi");

                if (tempAttribChassi != null) {
                    java.lang.String content = tempAttribChassi;

                    object.setChassi(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribChassi));
                } else {
                }

                handledAttributes.add("chassi");

                // handle attribute "placa"
                java.lang.String tempAttribPlaca = reader.getAttributeValue(null,
                        "placa");

                if (tempAttribPlaca != null) {
                    java.lang.String content = tempAttribPlaca;

                    object.setPlaca(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribPlaca));
                } else {
                }

                handledAttributes.add("placa");

                // handle attribute "uf-placa"
                java.lang.String tempAttribUfPlaca = reader.getAttributeValue(null,
                        "uf-placa");

                if (tempAttribUfPlaca != null) {
                    java.lang.String content = tempAttribUfPlaca;

                    object.setUfPlaca(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribUfPlaca));
                } else {
                }

                handledAttributes.add("uf-placa");

                // handle attribute "motor"
                java.lang.String tempAttribMotor = reader.getAttributeValue(null,
                        "motor");

                if (tempAttribMotor != null) {
                    java.lang.String content = tempAttribMotor;

                    object.setMotor(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMotor));
                } else {
                }

                handledAttributes.add("motor");

                // handle attribute "caixa-cambio"
                java.lang.String tempAttribCaixaCambio = reader.getAttributeValue(null,
                        "caixa-cambio");

                if (tempAttribCaixaCambio != null) {
                    java.lang.String content = tempAttribCaixaCambio;

                    object.setCaixaCambio(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCaixaCambio));
                } else {
                }

                handledAttributes.add("caixa-cambio");

                // handle attribute "renavam"
                java.lang.String tempAttribRenavam = reader.getAttributeValue(null,
                        "renavam");

                if (tempAttribRenavam != null) {
                    java.lang.String content = tempAttribRenavam;

                    object.setRenavam(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribRenavam));
                } else {
                    object.setRenavam(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("renavam");

                // handle attribute "municipio"
                java.lang.String tempAttribMunicipio = reader.getAttributeValue(null,
                        "municipio");

                if (tempAttribMunicipio != null) {
                    java.lang.String content = tempAttribMunicipio;

                    object.setMunicipio(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMunicipio));
                } else {
                }

                handledAttributes.add("municipio");

                // handle attribute "situacao-veiculo"
                java.lang.String tempAttribSituacaoVeiculo = reader.getAttributeValue(null,
                        "situacao-veiculo");

                if (tempAttribSituacaoVeiculo != null) {
                    java.lang.String content = tempAttribSituacaoVeiculo;

                    object.setSituacaoVeiculo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribSituacaoVeiculo));
                } else {
                }

                handledAttributes.add("situacao-veiculo");

                // handle attribute "remarcacao-chassi"
                java.lang.String tempAttribRemarcacaoChassi = reader.getAttributeValue(null,
                        "remarcacao-chassi");

                if (tempAttribRemarcacaoChassi != null) {
                    java.lang.String content = tempAttribRemarcacaoChassi;

                    object.setRemarcacaoChassi(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribRemarcacaoChassi));
                } else {
                }

                handledAttributes.add("remarcacao-chassi");

                // handle attribute "categoria-veiculo"
                java.lang.String tempAttribCategoriaVeiculo = reader.getAttributeValue(null,
                        "categoria-veiculo");

                if (tempAttribCategoriaVeiculo != null) {
                    java.lang.String content = tempAttribCategoriaVeiculo;

                    object.setCategoriaVeiculo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCategoriaVeiculo));
                } else {
                }

                handledAttributes.add("categoria-veiculo");

                // handle attribute "tipo-veiculo"
                java.lang.String tempAttribTipoVeiculo = reader.getAttributeValue(null,
                        "tipo-veiculo");

                if (tempAttribTipoVeiculo != null) {
                    java.lang.String content = tempAttribTipoVeiculo;

                    object.setTipoVeiculo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribTipoVeiculo));
                } else {
                }

                handledAttributes.add("tipo-veiculo");

                // handle attribute "marca-modelo"
                java.lang.String tempAttribMarcaModelo = reader.getAttributeValue(null,
                        "marca-modelo");

                if (tempAttribMarcaModelo != null) {
                    java.lang.String content = tempAttribMarcaModelo;

                    object.setMarcaModelo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMarcaModelo));
                } else {
                }

                handledAttributes.add("marca-modelo");

                // handle attribute "especie-veiculo"
                java.lang.String tempAttribEspecieVeiculo = reader.getAttributeValue(null,
                        "especie-veiculo");

                if (tempAttribEspecieVeiculo != null) {
                    java.lang.String content = tempAttribEspecieVeiculo;

                    object.setEspecieVeiculo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribEspecieVeiculo));
                } else {
                }

                handledAttributes.add("especie-veiculo");

                // handle attribute "tipo-carroceria"
                java.lang.String tempAttribTipoCarroceria = reader.getAttributeValue(null,
                        "tipo-carroceria");

                if (tempAttribTipoCarroceria != null) {
                    java.lang.String content = tempAttribTipoCarroceria;

                    object.setTipoCarroceria(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribTipoCarroceria));
                } else {
                }

                handledAttributes.add("tipo-carroceria");

                // handle attribute "cor-veiculo"
                java.lang.String tempAttribCorVeiculo = reader.getAttributeValue(null,
                        "cor-veiculo");

                if (tempAttribCorVeiculo != null) {
                    java.lang.String content = tempAttribCorVeiculo;

                    object.setCorVeiculo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCorVeiculo));
                } else {
                }

                handledAttributes.add("cor-veiculo");

                // handle attribute "ano-modelo"
                java.lang.String tempAttribAnoModelo = reader.getAttributeValue(null,
                        "ano-modelo");

                if (tempAttribAnoModelo != null) {
                    java.lang.String content = tempAttribAnoModelo;

                    object.setAnoModelo(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribAnoModelo));
                } else {
                    object.setAnoModelo(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("ano-modelo");

                // handle attribute "ano-fabricacao"
                java.lang.String tempAttribAnoFabricacao = reader.getAttributeValue(null,
                        "ano-fabricacao");

                if (tempAttribAnoFabricacao != null) {
                    java.lang.String content = tempAttribAnoFabricacao;

                    object.setAnoFabricacao(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribAnoFabricacao));
                } else {
                    object.setAnoFabricacao(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("ano-fabricacao");

                // handle attribute "potencia-veiculo"
                java.lang.String tempAttribPotenciaVeiculo = reader.getAttributeValue(null,
                        "potencia-veiculo");

                if (tempAttribPotenciaVeiculo != null) {
                    java.lang.String content = tempAttribPotenciaVeiculo;

                    object.setPotenciaVeiculo(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribPotenciaVeiculo));
                } else {
                    object.setPotenciaVeiculo(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("potencia-veiculo");

                // handle attribute "cilindradas"
                java.lang.String tempAttribCilindradas = reader.getAttributeValue(null,
                        "cilindradas");

                if (tempAttribCilindradas != null) {
                    java.lang.String content = tempAttribCilindradas;

                    object.setCilindradas(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribCilindradas));
                } else {
                    object.setCilindradas(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("cilindradas");

                // handle attribute "combustivel"
                java.lang.String tempAttribCombustivel = reader.getAttributeValue(null,
                        "combustivel");

                if (tempAttribCombustivel != null) {
                    java.lang.String content = tempAttribCombustivel;

                    object.setCombustivel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCombustivel));
                } else {
                }

                handledAttributes.add("combustivel");

                // handle attribute "tracao-veiculo"
                java.lang.String tempAttribTracaoVeiculo = reader.getAttributeValue(null,
                        "tracao-veiculo");

                if (tempAttribTracaoVeiculo != null) {
                    java.lang.String content = tempAttribTracaoVeiculo;

                    object.setTracaoVeiculo(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribTracaoVeiculo));
                } else {
                }

                handledAttributes.add("tracao-veiculo");

                // handle attribute "peso-bruto-veiculo"
                java.lang.String tempAttribPesoBrutoVeiculo = reader.getAttributeValue(null,
                        "peso-bruto-veiculo");

                if (tempAttribPesoBrutoVeiculo != null) {
                    java.lang.String content = tempAttribPesoBrutoVeiculo;

                    object.setPesoBrutoVeiculo(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribPesoBrutoVeiculo));
                } else {
                }

                handledAttributes.add("peso-bruto-veiculo");

                // handle attribute "capacidade-carga"
                java.lang.String tempAttribCapacidadeCarga = reader.getAttributeValue(null,
                        "capacidade-carga");

                if (tempAttribCapacidadeCarga != null) {
                    java.lang.String content = tempAttribCapacidadeCarga;

                    object.setCapacidadeCarga(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribCapacidadeCarga));
                } else {
                }

                handledAttributes.add("capacidade-carga");

                // handle attribute "procedencia"
                java.lang.String tempAttribProcedencia = reader.getAttributeValue(null,
                        "procedencia");

                if (tempAttribProcedencia != null) {
                    java.lang.String content = tempAttribProcedencia;

                    object.setProcedencia(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribProcedencia));
                } else {
                }

                handledAttributes.add("procedencia");

                // handle attribute "documento-proprietario"
                java.lang.String tempAttribDocumentoProprietario = reader.getAttributeValue(null,
                        "documento-proprietario");

                if (tempAttribDocumentoProprietario != null) {
                    java.lang.String content = tempAttribDocumentoProprietario;

                    object.setDocumentoProprietario(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDocumentoProprietario));
                } else {
                }

                handledAttributes.add("documento-proprietario");

                // handle attribute "numero-carroceria"
                java.lang.String tempAttribNumeroCarroceria = reader.getAttributeValue(null,
                        "numero-carroceria");

                if (tempAttribNumeroCarroceria != null) {
                    java.lang.String content = tempAttribNumeroCarroceria;

                    object.setNumeroCarroceria(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNumeroCarroceria));
                } else {
                }

                handledAttributes.add("numero-carroceria");

                // handle attribute "quantidade-passageiros"
                java.lang.String tempAttribQuantidadePassageiros = reader.getAttributeValue(null,
                        "quantidade-passageiros");

                if (tempAttribQuantidadePassageiros != null) {
                    java.lang.String content = tempAttribQuantidadePassageiros;

                    object.setQuantidadePassageiros(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribQuantidadePassageiros));
                } else {
                    object.setQuantidadePassageiros(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("quantidade-passageiros");

                // handle attribute "restricao1"
                java.lang.String tempAttribRestricao1 = reader.getAttributeValue(null,
                        "restricao1");

                if (tempAttribRestricao1 != null) {
                    java.lang.String content = tempAttribRestricao1;

                    object.setRestricao1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribRestricao1));
                } else {
                }

                handledAttributes.add("restricao1");

                // handle attribute "restricao2"
                java.lang.String tempAttribRestricao2 = reader.getAttributeValue(null,
                        "restricao2");

                if (tempAttribRestricao2 != null) {
                    java.lang.String content = tempAttribRestricao2;

                    object.setRestricao2(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribRestricao2));
                } else {
                }

                handledAttributes.add("restricao2");

                // handle attribute "restricao3"
                java.lang.String tempAttribRestricao3 = reader.getAttributeValue(null,
                        "restricao3");

                if (tempAttribRestricao3 != null) {
                    java.lang.String content = tempAttribRestricao3;

                    object.setRestricao3(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribRestricao3));
                } else {
                }

                handledAttributes.add("restricao3");

                // handle attribute "restricao4"
                java.lang.String tempAttribRestricao4 = reader.getAttributeValue(null,
                        "restricao4");

                if (tempAttribRestricao4 != null) {
                    java.lang.String content = tempAttribRestricao4;

                    object.setRestricao4(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribRestricao4));
                } else {
                }

                handledAttributes.add("restricao4");

                // handle attribute "numero-eixo"
                java.lang.String tempAttribNumeroEixo = reader.getAttributeValue(null,
                        "numero-eixo");

                if (tempAttribNumeroEixo != null) {
                    java.lang.String content = tempAttribNumeroEixo;

                    object.setNumeroEixo(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribNumeroEixo));
                } else {
                    object.setNumeroEixo(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("numero-eixo");

                // handle attribute "numero-eixo-traseiro"
                java.lang.String tempAttribNumeroEixoTraseiro = reader.getAttributeValue(null,
                        "numero-eixo-traseiro");

                if (tempAttribNumeroEixoTraseiro != null) {
                    java.lang.String content = tempAttribNumeroEixoTraseiro;

                    object.setNumeroEixoTraseiro(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNumeroEixoTraseiro));
                } else {
                }

                handledAttributes.add("numero-eixo-traseiro");

                // handle attribute "numero-eixo-auxiliar"
                java.lang.String tempAttribNumeroEixoAuxiliar = reader.getAttributeValue(null,
                        "numero-eixo-auxiliar");

                if (tempAttribNumeroEixoAuxiliar != null) {
                    java.lang.String content = tempAttribNumeroEixoAuxiliar;

                    object.setNumeroEixoAuxiliar(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNumeroEixoAuxiliar));
                } else {
                }

                handledAttributes.add("numero-eixo-auxiliar");

                // handle attribute "nome-proprietario"
                java.lang.String tempAttribNomeProprietario = reader.getAttributeValue(null,
                        "nome-proprietario");

                if (tempAttribNomeProprietario != null) {
                    java.lang.String content = tempAttribNomeProprietario;

                    object.setNomeProprietario(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNomeProprietario));
                } else {
                }

                handledAttributes.add("nome-proprietario");

                // handle attribute "debito-ipva"
                java.lang.String tempAttribDebitoIpva = reader.getAttributeValue(null,
                        "debito-ipva");

                if (tempAttribDebitoIpva != null) {
                    java.lang.String content = tempAttribDebitoIpva;

                    object.setDebitoIpva(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDebitoIpva));
                } else {
                }

                handledAttributes.add("debito-ipva");

                // handle attribute "descricao-debito-ipva"
                java.lang.String tempAttribDescricaoDebitoIpva = reader.getAttributeValue(null,
                        "descricao-debito-ipva");

                if (tempAttribDescricaoDebitoIpva != null) {
                    java.lang.String content = tempAttribDescricaoDebitoIpva;

                    object.setDescricaoDebitoIpva(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDescricaoDebitoIpva));
                } else {
                }

                handledAttributes.add("descricao-debito-ipva");

                // handle attribute "debito-multas"
                java.lang.String tempAttribDebitoMultas = reader.getAttributeValue(null,
                        "debito-multas");

                if (tempAttribDebitoMultas != null) {
                    java.lang.String content = tempAttribDebitoMultas;

                    object.setDebitoMultas(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDebitoMultas));
                } else {
                }

                handledAttributes.add("debito-multas");

                // handle attribute "descricao-debito-multas"
                java.lang.String tempAttribDescricaoDebitoMultas = reader.getAttributeValue(null,
                        "descricao-debito-multas");

                if (tempAttribDescricaoDebitoMultas != null) {
                    java.lang.String content = tempAttribDescricaoDebitoMultas;

                    object.setDescricaoDebitoMultas(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDescricaoDebitoMultas));
                } else {
                }

                handledAttributes.add("descricao-debito-multas");

                // handle attribute "data-limite-rest-trib"
                java.lang.String tempAttribDataLimiteRestTrib = reader.getAttributeValue(null,
                        "data-limite-rest-trib");

                if (tempAttribDataLimiteRestTrib != null) {
                    java.lang.String content = tempAttribDataLimiteRestTrib;

                    object.setDataLimiteRestTrib(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDataLimiteRestTrib));
                } else {
                }

                handledAttributes.add("data-limite-rest-trib");

                // handle attribute "data-ultima-atualizacao"
                java.lang.String tempAttribDataUltimaAtualizacao = reader.getAttributeValue(null,
                        "data-ultima-atualizacao");

                if (tempAttribDataUltimaAtualizacao != null) {
                    java.lang.String content = tempAttribDataUltimaAtualizacao;

                    object.setDataUltimaAtualizacao(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDataUltimaAtualizacao));
                } else {
                }

                handledAttributes.add("data-ultima-atualizacao");

                // handle attribute "debito-dpvat"
                java.lang.String tempAttribDebitoDpvat = reader.getAttributeValue(null,
                        "debito-dpvat");

                if (tempAttribDebitoDpvat != null) {
                    java.lang.String content = tempAttribDebitoDpvat;

                    object.setDebitoDpvat(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDebitoDpvat));
                } else {
                }

                handledAttributes.add("debito-dpvat");

                // handle attribute "debito-licenciamento"
                java.lang.String tempAttribDebitoLicenciamento = reader.getAttributeValue(null,
                        "debito-licenciamento");

                if (tempAttribDebitoLicenciamento != null) {
                    java.lang.String content = tempAttribDebitoLicenciamento;

                    object.setDebitoLicenciamento(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDebitoLicenciamento));
                } else {
                }

                handledAttributes.add("debito-licenciamento");

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "idAgenteGerador").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "idAgenteGerador").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "idAgenteGerador" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIdAgenteGerador(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setIdAgenteGerador(java.lang.Long.MIN_VALUE);
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

