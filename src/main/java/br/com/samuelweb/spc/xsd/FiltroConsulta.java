package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:41
 */
public class FiltroConsulta implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Filtro-Consulta
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for CodigoProduto
     */
    protected java.lang.String localCodigoProduto;

    /**
     * field for TipoConsumidor
     */
    protected TipoPessoa localTipoConsumidor;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTipoConsumidorTracker = false;

    /**
     * field for DocumentoConsumidor
     */
    protected java.lang.String localDocumentoConsumidor;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDocumentoConsumidorTracker = false;

    /**
     * field for CepConsumidor
     */
    protected java.lang.String localCepConsumidor;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCepConsumidorTracker = false;

    /**
     * field for TelefoneConsultar
     */
    protected TelefoneFiltro localTelefoneConsultar;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneConsultarTracker = false;

    /**
     * field for UtilizaCMC7
     */
    protected boolean localUtilizaCMC7;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUtilizaCMC7Tracker = false;

    /**
     * field for BancoChequeInicial
     */
    protected int localBancoChequeInicial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBancoChequeInicialTracker = false;

    /**
     * field for AgenciaChequeInicial
     */
    protected int localAgenciaChequeInicial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAgenciaChequeInicialTracker = false;

    /**
     * field for ContaCorrenteChequeInicial
     */
    protected long localContaCorrenteChequeInicial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localContaCorrenteChequeInicialTracker = false;

    /**
     * field for DigitoContaCorrenteChequeInicial
     */
    protected java.lang.String localDigitoContaCorrenteChequeInicial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDigitoContaCorrenteChequeInicialTracker = false;

    /**
     * field for NumeroChequeInicial
     */
    protected int localNumeroChequeInicial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumeroChequeInicialTracker = false;

    /**
     * field for DigitoChequeInicial
     */
    protected int localDigitoChequeInicial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDigitoChequeInicialTracker = false;

    /**
     * field for Cmc71ChequeInicial
     */
    protected java.lang.String localCmc71ChequeInicial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCmc71ChequeInicialTracker = false;

    /**
     * field for Cmc72ChequeInicial
     */
    protected java.lang.String localCmc72ChequeInicial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCmc72ChequeInicialTracker = false;

    /**
     * field for Cmc73ChequeInicial
     */
    protected java.lang.String localCmc73ChequeInicial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCmc73ChequeInicialTracker = false;

    /**
     * field for QuantidadeCheque
     */
    protected int localQuantidadeCheque;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQuantidadeChequeTracker = false;

    /**
     * field for ChequeDetalhado
     * This was an Array!
     */
    protected ChequeFiltro[] localChequeDetalhado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localChequeDetalhadoTracker = false;

    /**
     * field for CodigoInsumoOpcional
     * This was an Array!
     */
    protected long[] localCodigoInsumoOpcional;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCodigoInsumoOpcionalTracker = false;

    /**
     * field for CepOrigem
     */
    protected java.lang.String localCepOrigem;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCepOrigemTracker = false;

    /**
     * field for CodigoEstacaoConsultante
     */
    protected java.lang.String localCodigoEstacaoConsultante;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCodigoEstacaoConsultanteTracker = false;

    /**
     * field for NumeroRg
     */
    protected java.lang.String localNumeroRg;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumeroRgTracker = false;

    /**
     * field for DataNascimentoRg
     */
    protected java.util.Calendar localDataNascimentoRg;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDataNascimentoRgTracker = false;

    /**
     * field for UfEmissaoRg
     */
    protected java.lang.String localUfEmissaoRg;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUfEmissaoRgTracker = false;

    /**
     * field for Chassi
     */
    protected java.lang.String localChassi;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localChassiTracker = false;

    /**
     * field for Renavam
     */
    protected java.lang.String localRenavam;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRenavamTracker = false;

    /**
     * field for Motor
     */
    protected java.lang.String localMotor;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMotorTracker = false;

    /**
     * field for NumeroCaixaCambio
     */
    protected java.lang.String localNumeroCaixaCambio;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumeroCaixaCambioTracker = false;

    /**
     * field for Placa
     */
    protected java.lang.String localPlaca;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPlacaTracker = false;

    /**
     * field for SiglaEstadualAuto
     */
    protected java.lang.String localSiglaEstadualAuto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSiglaEstadualAutoTracker = false;

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCodigoProduto() {
        return localCodigoProduto;
    }

    /**
     * Auto generated setter method
     * @param param CodigoProduto
     */
    public void setCodigoProduto(java.lang.String param) {
        this.localCodigoProduto = param;
    }

    public boolean isTipoConsumidorSpecified() {
        return localTipoConsumidorTracker;
    }

    /**
     * Auto generated getter method
     * @return TipoPessoa
     */
    public TipoPessoa getTipoConsumidor() {
        return localTipoConsumidor;
    }

    /**
     * Auto generated setter method
     * @param param TipoConsumidor
     */
    public void setTipoConsumidor(TipoPessoa param) {
        localTipoConsumidorTracker = param != null;

        this.localTipoConsumidor = param;
    }

    public boolean isDocumentoConsumidorSpecified() {
        return localDocumentoConsumidorTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDocumentoConsumidor() {
        return localDocumentoConsumidor;
    }

    /**
     * Auto generated setter method
     * @param param DocumentoConsumidor
     */
    public void setDocumentoConsumidor(java.lang.String param) {
        localDocumentoConsumidorTracker = param != null;

        this.localDocumentoConsumidor = param;
    }

    public boolean isCepConsumidorSpecified() {
        return localCepConsumidorTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCepConsumidor() {
        return localCepConsumidor;
    }

    /**
     * Auto generated setter method
     * @param param CepConsumidor
     */
    public void setCepConsumidor(java.lang.String param) {
        localCepConsumidorTracker = param != null;

        this.localCepConsumidor = param;
    }

    public boolean isTelefoneConsultarSpecified() {
        return localTelefoneConsultarTracker;
    }

    /**
     * Auto generated getter method
     * @return TelefoneFiltro
     */
    public TelefoneFiltro getTelefoneConsultar() {
        return localTelefoneConsultar;
    }

    /**
     * Auto generated setter method
     * @param param TelefoneConsultar
     */
    public void setTelefoneConsultar(TelefoneFiltro param) {
        localTelefoneConsultarTracker = param != null;

        this.localTelefoneConsultar = param;
    }

    public boolean isUtilizaCMC7Specified() {
        return localUtilizaCMC7Tracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getUtilizaCMC7() {
        return localUtilizaCMC7;
    }

    /**
     * Auto generated setter method
     * @param param UtilizaCMC7
     */
    public void setUtilizaCMC7(boolean param) {
        // setting primitive attribute tracker to true
        localUtilizaCMC7Tracker = true;

        this.localUtilizaCMC7 = param;
    }

    public boolean isBancoChequeInicialSpecified() {
        return localBancoChequeInicialTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getBancoChequeInicial() {
        return localBancoChequeInicial;
    }

    /**
     * Auto generated setter method
     * @param param BancoChequeInicial
     */
    public void setBancoChequeInicial(int param) {
        // setting primitive attribute tracker to true
        localBancoChequeInicialTracker = param != java.lang.Integer.MIN_VALUE;

        this.localBancoChequeInicial = param;
    }

    public boolean isAgenciaChequeInicialSpecified() {
        return localAgenciaChequeInicialTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getAgenciaChequeInicial() {
        return localAgenciaChequeInicial;
    }

    /**
     * Auto generated setter method
     * @param param AgenciaChequeInicial
     */
    public void setAgenciaChequeInicial(int param) {
        // setting primitive attribute tracker to true
        localAgenciaChequeInicialTracker = param != java.lang.Integer.MIN_VALUE;

        this.localAgenciaChequeInicial = param;
    }

    public boolean isContaCorrenteChequeInicialSpecified() {
        return localContaCorrenteChequeInicialTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getContaCorrenteChequeInicial() {
        return localContaCorrenteChequeInicial;
    }

    /**
     * Auto generated setter method
     * @param param ContaCorrenteChequeInicial
     */
    public void setContaCorrenteChequeInicial(long param) {
        // setting primitive attribute tracker to true
        localContaCorrenteChequeInicialTracker = param != java.lang.Long.MIN_VALUE;

        this.localContaCorrenteChequeInicial = param;
    }

    public boolean isDigitoContaCorrenteChequeInicialSpecified() {
        return localDigitoContaCorrenteChequeInicialTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDigitoContaCorrenteChequeInicial() {
        return localDigitoContaCorrenteChequeInicial;
    }

    /**
     * Auto generated setter method
     * @param param DigitoContaCorrenteChequeInicial
     */
    public void setDigitoContaCorrenteChequeInicial(java.lang.String param) {
        localDigitoContaCorrenteChequeInicialTracker = param != null;

        this.localDigitoContaCorrenteChequeInicial = param;
    }

    public boolean isNumeroChequeInicialSpecified() {
        return localNumeroChequeInicialTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getNumeroChequeInicial() {
        return localNumeroChequeInicial;
    }

    /**
     * Auto generated setter method
     * @param param NumeroChequeInicial
     */
    public void setNumeroChequeInicial(int param) {
        // setting primitive attribute tracker to true
        localNumeroChequeInicialTracker = param != java.lang.Integer.MIN_VALUE;

        this.localNumeroChequeInicial = param;
    }

    public boolean isDigitoChequeInicialSpecified() {
        return localDigitoChequeInicialTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getDigitoChequeInicial() {
        return localDigitoChequeInicial;
    }

    /**
     * Auto generated setter method
     * @param param DigitoChequeInicial
     */
    public void setDigitoChequeInicial(int param) {
        // setting primitive attribute tracker to true
        localDigitoChequeInicialTracker = param != java.lang.Integer.MIN_VALUE;

        this.localDigitoChequeInicial = param;
    }

    public boolean isCmc71ChequeInicialSpecified() {
        return localCmc71ChequeInicialTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCmc71ChequeInicial() {
        return localCmc71ChequeInicial;
    }

    /**
     * Auto generated setter method
     * @param param Cmc71ChequeInicial
     */
    public void setCmc71ChequeInicial(java.lang.String param) {
        localCmc71ChequeInicialTracker = param != null;

        this.localCmc71ChequeInicial = param;
    }

    public boolean isCmc72ChequeInicialSpecified() {
        return localCmc72ChequeInicialTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCmc72ChequeInicial() {
        return localCmc72ChequeInicial;
    }

    /**
     * Auto generated setter method
     * @param param Cmc72ChequeInicial
     */
    public void setCmc72ChequeInicial(java.lang.String param) {
        localCmc72ChequeInicialTracker = param != null;

        this.localCmc72ChequeInicial = param;
    }

    public boolean isCmc73ChequeInicialSpecified() {
        return localCmc73ChequeInicialTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCmc73ChequeInicial() {
        return localCmc73ChequeInicial;
    }

    /**
     * Auto generated setter method
     * @param param Cmc73ChequeInicial
     */
    public void setCmc73ChequeInicial(java.lang.String param) {
        localCmc73ChequeInicialTracker = param != null;

        this.localCmc73ChequeInicial = param;
    }

    public boolean isQuantidadeChequeSpecified() {
        return localQuantidadeChequeTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getQuantidadeCheque() {
        return localQuantidadeCheque;
    }

    /**
     * Auto generated setter method
     * @param param QuantidadeCheque
     */
    public void setQuantidadeCheque(int param) {
        // setting primitive attribute tracker to true
        localQuantidadeChequeTracker = param != java.lang.Integer.MIN_VALUE;

        this.localQuantidadeCheque = param;
    }

    public boolean isChequeDetalhadoSpecified() {
        return localChequeDetalhadoTracker;
    }

    /**
     * Auto generated getter method
     * @return ChequeFiltro[]
     */
    public ChequeFiltro[] getChequeDetalhado() {
        return localChequeDetalhado;
    }

    /**
     * validate the array for ChequeDetalhado
     */
    protected void validateChequeDetalhado(ChequeFiltro[] param) {
    }

    /**
     * Auto generated setter method
     * @param param ChequeDetalhado
     */
    public void setChequeDetalhado(ChequeFiltro[] param) {
        validateChequeDetalhado(param);

        localChequeDetalhadoTracker = param != null;

        this.localChequeDetalhado = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param ChequeFiltro
     */
    public void addChequeDetalhado(ChequeFiltro param) {
        if (localChequeDetalhado == null) {
            localChequeDetalhado = new ChequeFiltro[] {  };
        }

        //update the setting tracker
        localChequeDetalhadoTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localChequeDetalhado);
        list.add(param);
        this.localChequeDetalhado = (ChequeFiltro[]) list.toArray(new ChequeFiltro[list.size()]);
    }

    public boolean isCodigoInsumoOpcionalSpecified() {
        return localCodigoInsumoOpcionalTracker;
    }

    /**
     * Auto generated getter method
     * @return long[]
     */
    public long[] getCodigoInsumoOpcional() {
        return localCodigoInsumoOpcional;
    }

    /**
     * validate the array for CodigoInsumoOpcional
     */
    protected void validateCodigoInsumoOpcional(long[] param) {
    }

    /**
     * Auto generated setter method
     * @param param CodigoInsumoOpcional
     */
    public void setCodigoInsumoOpcional(long[] param) {
        validateCodigoInsumoOpcional(param);

        localCodigoInsumoOpcionalTracker = param != null;

        this.localCodigoInsumoOpcional = param;
    }

    public boolean isCepOrigemSpecified() {
        return localCepOrigemTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCepOrigem() {
        return localCepOrigem;
    }

    /**
     * Auto generated setter method
     * @param param CepOrigem
     */
    public void setCepOrigem(java.lang.String param) {
        localCepOrigemTracker = param != null;

        this.localCepOrigem = param;
    }

    public boolean isCodigoEstacaoConsultanteSpecified() {
        return localCodigoEstacaoConsultanteTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCodigoEstacaoConsultante() {
        return localCodigoEstacaoConsultante;
    }

    /**
     * Auto generated setter method
     * @param param CodigoEstacaoConsultante
     */
    public void setCodigoEstacaoConsultante(java.lang.String param) {
        localCodigoEstacaoConsultanteTracker = param != null;

        this.localCodigoEstacaoConsultante = param;
    }

    public boolean isNumeroRgSpecified() {
        return localNumeroRgTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumeroRg() {
        return localNumeroRg;
    }

    /**
     * Auto generated setter method
     * @param param NumeroRg
     */
    public void setNumeroRg(java.lang.String param) {
        localNumeroRgTracker = param != null;

        this.localNumeroRg = param;
    }

    public boolean isDataNascimentoRgSpecified() {
        return localDataNascimentoRgTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataNascimentoRg() {
        return localDataNascimentoRg;
    }

    /**
     * Auto generated setter method
     * @param param DataNascimentoRg
     */
    public void setDataNascimentoRg(java.util.Calendar param) {
        localDataNascimentoRgTracker = param != null;

        this.localDataNascimentoRg = param;
    }

    public boolean isUfEmissaoRgSpecified() {
        return localUfEmissaoRgTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUfEmissaoRg() {
        return localUfEmissaoRg;
    }

    /**
     * Auto generated setter method
     * @param param UfEmissaoRg
     */
    public void setUfEmissaoRg(java.lang.String param) {
        localUfEmissaoRgTracker = param != null;

        this.localUfEmissaoRg = param;
    }

    public boolean isChassiSpecified() {
        return localChassiTracker;
    }

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
        localChassiTracker = param != null;

        this.localChassi = param;
    }

    public boolean isRenavamSpecified() {
        return localRenavamTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRenavam() {
        return localRenavam;
    }

    /**
     * Auto generated setter method
     * @param param Renavam
     */
    public void setRenavam(java.lang.String param) {
        localRenavamTracker = param != null;

        this.localRenavam = param;
    }

    public boolean isMotorSpecified() {
        return localMotorTracker;
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
        localMotorTracker = param != null;

        this.localMotor = param;
    }

    public boolean isNumeroCaixaCambioSpecified() {
        return localNumeroCaixaCambioTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumeroCaixaCambio() {
        return localNumeroCaixaCambio;
    }

    /**
     * Auto generated setter method
     * @param param NumeroCaixaCambio
     */
    public void setNumeroCaixaCambio(java.lang.String param) {
        localNumeroCaixaCambioTracker = param != null;

        this.localNumeroCaixaCambio = param;
    }

    public boolean isPlacaSpecified() {
        return localPlacaTracker;
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
        localPlacaTracker = param != null;

        this.localPlaca = param;
    }

    public boolean isSiglaEstadualAutoSpecified() {
        return localSiglaEstadualAutoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSiglaEstadualAuto() {
        return localSiglaEstadualAuto;
    }

    /**
     * Auto generated setter method
     * @param param SiglaEstadualAuto
     */
    public void setSiglaEstadualAuto(java.lang.String param) {
        localSiglaEstadualAutoTracker = param != null;

        this.localSiglaEstadualAuto = param;
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
                        namespacePrefix + ":Filtro-Consulta", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Filtro-Consulta", xmlWriter);
            }
        }

        namespace = "";
        writeStartElement(null, namespace, "codigo-produto", xmlWriter);

        if (localCodigoProduto == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                    "codigo-produto cannot be null!!");
        } else {
            xmlWriter.writeCharacters(localCodigoProduto);
        }

        xmlWriter.writeEndElement();

        if (localTipoConsumidorTracker) {
            if (localTipoConsumidor == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "tipo-consumidor cannot be null!!");
            }

            localTipoConsumidor.serialize(new javax.xml.namespace.QName(
                    "", "tipo-consumidor"), xmlWriter);
        }

        if (localDocumentoConsumidorTracker) {
            namespace = "";
            writeStartElement(null, namespace, "documento-consumidor",
                    xmlWriter);

            if (localDocumentoConsumidor == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "documento-consumidor cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDocumentoConsumidor);
            }

            xmlWriter.writeEndElement();
        }

        if (localCepConsumidorTracker) {
            namespace = "";
            writeStartElement(null, namespace, "cep-consumidor", xmlWriter);

            if (localCepConsumidor == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "cep-consumidor cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCepConsumidor);
            }

            xmlWriter.writeEndElement();
        }

        if (localTelefoneConsultarTracker) {
            if (localTelefoneConsultar == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "telefone-consultar cannot be null!!");
            }

            localTelefoneConsultar.serialize(new javax.xml.namespace.QName(
                    "", "telefone-consultar"), xmlWriter);
        }

        if (localUtilizaCMC7Tracker) {
            namespace = "";
            writeStartElement(null, namespace, "utiliza-CMC7", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                        "utiliza-CMC7 cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localUtilizaCMC7));
            }

            xmlWriter.writeEndElement();
        }

        if (localBancoChequeInicialTracker) {
            namespace = "";
            writeStartElement(null, namespace, "banco-cheque-inicial",
                    xmlWriter);

            if (localBancoChequeInicial == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                        "banco-cheque-inicial cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localBancoChequeInicial));
            }

            xmlWriter.writeEndElement();
        }

        if (localAgenciaChequeInicialTracker) {
            namespace = "";
            writeStartElement(null, namespace, "agencia-cheque-inicial",
                    xmlWriter);

            if (localAgenciaChequeInicial == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                        "agencia-cheque-inicial cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localAgenciaChequeInicial));
            }

            xmlWriter.writeEndElement();
        }

        if (localContaCorrenteChequeInicialTracker) {
            namespace = "";
            writeStartElement(null, namespace,
                    "conta-corrente-cheque-inicial", xmlWriter);

            if (localContaCorrenteChequeInicial == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                        "conta-corrente-cheque-inicial cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localContaCorrenteChequeInicial));
            }

            xmlWriter.writeEndElement();
        }

        if (localDigitoContaCorrenteChequeInicialTracker) {
            namespace = "";
            writeStartElement(null, namespace,
                    "digito-conta-corrente-cheque-inicial", xmlWriter);

            if (localDigitoContaCorrenteChequeInicial == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "digito-conta-corrente-cheque-inicial cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDigitoContaCorrenteChequeInicial);
            }

            xmlWriter.writeEndElement();
        }

        if (localNumeroChequeInicialTracker) {
            namespace = "";
            writeStartElement(null, namespace, "numero-cheque-inicial",
                    xmlWriter);

            if (localNumeroChequeInicial == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                        "numero-cheque-inicial cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNumeroChequeInicial));
            }

            xmlWriter.writeEndElement();
        }

        if (localDigitoChequeInicialTracker) {
            namespace = "";
            writeStartElement(null, namespace, "digito-cheque-inicial",
                    xmlWriter);

            if (localDigitoChequeInicial == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                        "digito-cheque-inicial cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDigitoChequeInicial));
            }

            xmlWriter.writeEndElement();
        }

        if (localCmc71ChequeInicialTracker) {
            namespace = "";
            writeStartElement(null, namespace, "cmc71-cheque-inicial",
                    xmlWriter);

            if (localCmc71ChequeInicial == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "cmc71-cheque-inicial cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCmc71ChequeInicial);
            }

            xmlWriter.writeEndElement();
        }

        if (localCmc72ChequeInicialTracker) {
            namespace = "";
            writeStartElement(null, namespace, "cmc72-cheque-inicial",
                    xmlWriter);

            if (localCmc72ChequeInicial == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "cmc72-cheque-inicial cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCmc72ChequeInicial);
            }

            xmlWriter.writeEndElement();
        }

        if (localCmc73ChequeInicialTracker) {
            namespace = "";
            writeStartElement(null, namespace, "cmc73-cheque-inicial",
                    xmlWriter);

            if (localCmc73ChequeInicial == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "cmc73-cheque-inicial cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCmc73ChequeInicial);
            }

            xmlWriter.writeEndElement();
        }

        if (localQuantidadeChequeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "quantidade-cheque",
                    xmlWriter);

            if (localQuantidadeCheque == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                        "quantidade-cheque cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localQuantidadeCheque));
            }

            xmlWriter.writeEndElement();
        }

        if (localChequeDetalhadoTracker) {
            if (localChequeDetalhado != null) {
                for (int i = 0; i < localChequeDetalhado.length; i++) {
                    if (localChequeDetalhado[i] != null) {
                        localChequeDetalhado[i].serialize(new javax.xml.namespace.QName(
                                "", "cheque-detalhado"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "cheque-detalhado cannot be null!!");
            }
        }

        if (localCodigoInsumoOpcionalTracker) {
            if (localCodigoInsumoOpcional != null) {
                namespace = "";

                for (int i = 0; i < localCodigoInsumoOpcional.length;
                     i++) {
                    if (localCodigoInsumoOpcional[i] != java.lang.Long.MIN_VALUE) {
                        writeStartElement(null, namespace,
                                "codigo-insumo-opcional", xmlWriter);

                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                localCodigoInsumoOpcional[i]));
                        xmlWriter.writeEndElement();
                    } else {
                        // we have to do nothing since minOccurs is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "codigo-insumo-opcional cannot be null!!");
            }
        }

        if (localCepOrigemTracker) {
            namespace = "";
            writeStartElement(null, namespace, "cep-origem", xmlWriter);

            if (localCepOrigem == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "cep-origem cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCepOrigem);
            }

            xmlWriter.writeEndElement();
        }

        if (localCodigoEstacaoConsultanteTracker) {
            namespace = "";
            writeStartElement(null, namespace,
                    "codigo-estacao-consultante", xmlWriter);

            if (localCodigoEstacaoConsultante == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "codigo-estacao-consultante cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCodigoEstacaoConsultante);
            }

            xmlWriter.writeEndElement();
        }

        if (localNumeroRgTracker) {
            namespace = "";
            writeStartElement(null, namespace, "numero-rg", xmlWriter);

            if (localNumeroRg == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "numero-rg cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNumeroRg);
            }

            xmlWriter.writeEndElement();
        }

        if (localDataNascimentoRgTracker) {
            namespace = "";
            writeStartElement(null, namespace, "data-nascimento-rg",
                    xmlWriter);

            if (localDataNascimentoRg == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "data-nascimento-rg cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDataNascimentoRg));
            }

            xmlWriter.writeEndElement();
        }

        if (localUfEmissaoRgTracker) {
            namespace = "";
            writeStartElement(null, namespace, "uf-emissao-rg", xmlWriter);

            if (localUfEmissaoRg == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "uf-emissao-rg cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localUfEmissaoRg);
            }

            xmlWriter.writeEndElement();
        }

        if (localChassiTracker) {
            namespace = "";
            writeStartElement(null, namespace, "chassi", xmlWriter);

            if (localChassi == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "chassi cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localChassi);
            }

            xmlWriter.writeEndElement();
        }

        if (localRenavamTracker) {
            namespace = "";
            writeStartElement(null, namespace, "renavam", xmlWriter);

            if (localRenavam == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "renavam cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localRenavam);
            }

            xmlWriter.writeEndElement();
        }

        if (localMotorTracker) {
            namespace = "";
            writeStartElement(null, namespace, "motor", xmlWriter);

            if (localMotor == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "motor cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMotor);
            }

            xmlWriter.writeEndElement();
        }

        if (localNumeroCaixaCambioTracker) {
            namespace = "";
            writeStartElement(null, namespace, "numero-caixa-cambio",
                    xmlWriter);

            if (localNumeroCaixaCambio == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "numero-caixa-cambio cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNumeroCaixaCambio);
            }

            xmlWriter.writeEndElement();
        }

        if (localPlacaTracker) {
            namespace = "";
            writeStartElement(null, namespace, "placa", xmlWriter);

            if (localPlaca == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "placa cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPlaca);
            }

            xmlWriter.writeEndElement();
        }

        if (localSiglaEstadualAutoTracker) {
            namespace = "";
            writeStartElement(null, namespace, "sigla-estadual-auto",
                    xmlWriter);

            if (localSiglaEstadualAuto == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "sigla-estadual-auto cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSiglaEstadualAuto);
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
        public static FiltroConsulta parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            FiltroConsulta object = new FiltroConsulta();

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

                        if (!"Filtro-Consulta".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (FiltroConsulta) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list17 = new java.util.ArrayList();

                java.util.ArrayList list18 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "codigo-produto").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "codigo-produto").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "codigo-produto" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCodigoProduto(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "tipo-consumidor").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "tipo-consumidor").equals(
                                reader.getName())) {
                    object.setTipoConsumidor(TipoPessoa.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "documento-consumidor").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "documento-consumidor").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "documento-consumidor" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDocumentoConsumidor(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "cep-consumidor").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "cep-consumidor").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "cep-consumidor" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCepConsumidor(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "telefone-consultar").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "telefone-consultar").equals(reader.getName())) {
                    object.setTelefoneConsultar(TelefoneFiltro.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "utiliza-CMC7").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "utiliza-CMC7").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "utiliza-CMC7" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setUtilizaCMC7(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "banco-cheque-inicial").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "banco-cheque-inicial").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "banco-cheque-inicial" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBancoChequeInicial(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setBancoChequeInicial(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "agencia-cheque-inicial").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "agencia-cheque-inicial").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "agencia-cheque-inicial" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAgenciaChequeInicial(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setAgenciaChequeInicial(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "conta-corrente-cheque-inicial").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "conta-corrente-cheque-inicial").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                        "conta-corrente-cheque-inicial" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setContaCorrenteChequeInicial(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setContaCorrenteChequeInicial(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "digito-conta-corrente-cheque-inicial").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "digito-conta-corrente-cheque-inicial").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                        "digito-conta-corrente-cheque-inicial" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDigitoContaCorrenteChequeInicial(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "numero-cheque-inicial").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "numero-cheque-inicial").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "numero-cheque-inicial" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumeroChequeInicial(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setNumeroChequeInicial(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "digito-cheque-inicial").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "digito-cheque-inicial").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "digito-cheque-inicial" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDigitoChequeInicial(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setDigitoChequeInicial(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "cmc71-cheque-inicial").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "cmc71-cheque-inicial").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "cmc71-cheque-inicial" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCmc71ChequeInicial(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "cmc72-cheque-inicial").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "cmc72-cheque-inicial").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "cmc72-cheque-inicial" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCmc72ChequeInicial(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "cmc73-cheque-inicial").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "cmc73-cheque-inicial").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "cmc73-cheque-inicial" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCmc73ChequeInicial(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "quantidade-cheque").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "quantidade-cheque").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "quantidade-cheque" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setQuantidadeCheque(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setQuantidadeCheque(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "cheque-detalhado").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "cheque-detalhado").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list17.add(ChequeFiltro.Factory.parse(reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone17 = false;

                    while (!loopDone17) {
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
                            loopDone17 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "cheque-detalhado").equals(
                                    reader.getName())) {
                                list17.add(ChequeFiltro.Factory.parse(
                                        reader));
                            } else {
                                loopDone17 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setChequeDetalhado((ChequeFiltro[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            ChequeFiltro.class, list17));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "codigo-insumo-opcional").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "codigo-insumo-opcional").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list18.add(reader.getElementText());

                    //loop until we find a start element that is not part of this array
                    boolean loopDone18 = false;

                    while (!loopDone18) {
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
                            loopDone18 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "codigo-insumo-opcional").equals(
                                    reader.getName())) {
                                list18.add(reader.getElementText());
                            } else {
                                loopDone18 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setCodigoInsumoOpcional((long[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            long.class, list18));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "cep-origem").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "cep-origem").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "cep-origem" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCepOrigem(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "codigo-estacao-consultante").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "codigo-estacao-consultante").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "codigo-estacao-consultante" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCodigoEstacaoConsultante(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "numero-rg").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "numero-rg").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "numero-rg" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumeroRg(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "data-nascimento-rg").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "data-nascimento-rg").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "data-nascimento-rg" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDataNascimentoRg(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "uf-emissao-rg").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "uf-emissao-rg").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "uf-emissao-rg" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setUfEmissaoRg(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "chassi").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "chassi").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "chassi" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setChassi(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "renavam").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "renavam").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "renavam" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRenavam(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "motor").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "motor").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "motor" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMotor(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "numero-caixa-cambio").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "numero-caixa-cambio").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "numero-caixa-cambio" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumeroCaixaCambio(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "placa").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "placa").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "placa" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPlaca(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "sigla-estadual-auto").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "sigla-estadual-auto").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sigla-estadual-auto" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSiglaEstadualAuto(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

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

