package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:39
 */
public class PessoaJuridica implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Pessoa-Juridica
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Cnpj
     */
    protected Cnpj localCnpj;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCnpjTracker = false;

    /**
     * field for SituacaoCnpj
     */
    protected SituacaoDocumentoWS localSituacaoCnpj;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSituacaoCnpjTracker = false;

    /**
     * field for SituacaoInscricaoEstadual
     */
    protected SituacaoDocumentoWS localSituacaoInscricaoEstadual;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSituacaoInscricaoEstadualTracker = false;

    /**
     * field for Endereco
     */
    protected Endereco localEndereco;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnderecoTracker = false;

    /**
     * field for Telefone
     */
    protected Telefone localTelefone;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneTracker = false;

    /**
     * field for Fax
     */
    protected Telefone localFax;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFaxTracker = false;

    /**
     * field for NaturezaJuridica
     */
    protected NaturezaJuridica localNaturezaJuridica;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNaturezaJuridicaTracker = false;

    /**
     * field for AtividadeEconomicaPrincipal
     */
    protected RamoAtividade localAtividadeEconomicaPrincipal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAtividadeEconomicaPrincipalTracker = false;

    /**
     * field for AtividadeEconomicaSecundaria
     * This was an Array!
     */
    protected RamoAtividade[] localAtividadeEconomicaSecundaria;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAtividadeEconomicaSecundariaTracker = false;

    /**
     * field for DataFundacao
     * This was an Attribute!
     */
    protected java.util.Calendar localDataFundacao;

    /**
     * field for Email
     * This was an Attribute!
     */
    protected java.lang.String localEmail;

    /**
     * field for HomePage
     * This was an Attribute!
     */
    protected java.lang.String localHomePage;

    /**
     * field for InscricaoEstadual
     * This was an Attribute!
     */
    protected long localInscricaoEstadual;

    /**
     * field for NomeComercial
     * This was an Attribute!
     */
    protected java.lang.String localNomeComercial;

    /**
     * field for NumeroNIRENIRC
     * This was an Attribute!
     */
    protected long localNumeroNIRENIRC;

    /**
     * field for RazaoSocial
     * This was an Attribute!
     */
    protected java.lang.String localRazaoSocial;

    /**
     * field for RazaoSocialAnterior
     * This was an Attribute!
     */
    protected java.lang.String localRazaoSocialAnterior;

    /**
     * field for ValorCapitalSocial
     * This was an Attribute!
     */
    protected java.math.BigDecimal localValorCapitalSocial;

    public boolean isCnpjSpecified() {
        return localCnpjTracker;
    }

    /**
     * Auto generated getter method
     * @return Cnpj
     */
    public Cnpj getCnpj() {
        return localCnpj;
    }

    /**
     * Auto generated setter method
     * @param param Cnpj
     */
    public void setCnpj(Cnpj param) {
        localCnpjTracker = param != null;

        this.localCnpj = param;
    }

    public boolean isSituacaoCnpjSpecified() {
        return localSituacaoCnpjTracker;
    }

    /**
     * Auto generated getter method
     * @return SituacaoDocumentoWS
     */
    public SituacaoDocumentoWS getSituacaoCnpj() {
        return localSituacaoCnpj;
    }

    /**
     * Auto generated setter method
     * @param param SituacaoCnpj
     */
    public void setSituacaoCnpj(SituacaoDocumentoWS param) {
        localSituacaoCnpjTracker = param != null;

        this.localSituacaoCnpj = param;
    }

    public boolean isSituacaoInscricaoEstadualSpecified() {
        return localSituacaoInscricaoEstadualTracker;
    }

    /**
     * Auto generated getter method
     * @return SituacaoDocumentoWS
     */
    public SituacaoDocumentoWS getSituacaoInscricaoEstadual() {
        return localSituacaoInscricaoEstadual;
    }

    /**
     * Auto generated setter method
     * @param param SituacaoInscricaoEstadual
     */
    public void setSituacaoInscricaoEstadual(SituacaoDocumentoWS param) {
        localSituacaoInscricaoEstadualTracker = param != null;

        this.localSituacaoInscricaoEstadual = param;
    }

    public boolean isEnderecoSpecified() {
        return localEnderecoTracker;
    }

    /**
     * Auto generated getter method
     * @return Endereco
     */
    public Endereco getEndereco() {
        return localEndereco;
    }

    /**
     * Auto generated setter method
     * @param param Endereco
     */
    public void setEndereco(Endereco param) {
        localEnderecoTracker = param != null;

        this.localEndereco = param;
    }

    public boolean isTelefoneSpecified() {
        return localTelefoneTracker;
    }

    /**
     * Auto generated getter method
     * @return Telefone
     */
    public Telefone getTelefone() {
        return localTelefone;
    }

    /**
     * Auto generated setter method
     * @param param Telefone
     */
    public void setTelefone(Telefone param) {
        localTelefoneTracker = param != null;

        this.localTelefone = param;
    }

    public boolean isFaxSpecified() {
        return localFaxTracker;
    }

    /**
     * Auto generated getter method
     * @return Telefone
     */
    public Telefone getFax() {
        return localFax;
    }

    /**
     * Auto generated setter method
     * @param param Fax
     */
    public void setFax(Telefone param) {
        localFaxTracker = param != null;

        this.localFax = param;
    }

    public boolean isNaturezaJuridicaSpecified() {
        return localNaturezaJuridicaTracker;
    }

    /**
     * Auto generated getter method
     * @return NaturezaJuridica
     */
    public NaturezaJuridica getNaturezaJuridica() {
        return localNaturezaJuridica;
    }

    /**
     * Auto generated setter method
     * @param param NaturezaJuridica
     */
    public void setNaturezaJuridica(NaturezaJuridica param) {
        localNaturezaJuridicaTracker = param != null;

        this.localNaturezaJuridica = param;
    }

    public boolean isAtividadeEconomicaPrincipalSpecified() {
        return localAtividadeEconomicaPrincipalTracker;
    }

    /**
     * Auto generated getter method
     * @return RamoAtividade
     */
    public RamoAtividade getAtividadeEconomicaPrincipal() {
        return localAtividadeEconomicaPrincipal;
    }

    /**
     * Auto generated setter method
     * @param param AtividadeEconomicaPrincipal
     */
    public void setAtividadeEconomicaPrincipal(RamoAtividade param) {
        localAtividadeEconomicaPrincipalTracker = param != null;

        this.localAtividadeEconomicaPrincipal = param;
    }

    public boolean isAtividadeEconomicaSecundariaSpecified() {
        return localAtividadeEconomicaSecundariaTracker;
    }

    /**
     * Auto generated getter method
     * @return RamoAtividade[]
     */
    public RamoAtividade[] getAtividadeEconomicaSecundaria() {
        return localAtividadeEconomicaSecundaria;
    }

    /**
     * validate the array for AtividadeEconomicaSecundaria
     */
    protected void validateAtividadeEconomicaSecundaria(
            RamoAtividade[] param) {
    }

    /**
     * Auto generated setter method
     * @param param AtividadeEconomicaSecundaria
     */
    public void setAtividadeEconomicaSecundaria(RamoAtividade[] param) {
        validateAtividadeEconomicaSecundaria(param);

        localAtividadeEconomicaSecundariaTracker = param != null;

        this.localAtividadeEconomicaSecundaria = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param RamoAtividade
     */
    public void addAtividadeEconomicaSecundaria(RamoAtividade param) {
        if (localAtividadeEconomicaSecundaria == null) {
            localAtividadeEconomicaSecundaria = new RamoAtividade[] {  };
        }

        //update the setting tracker
        localAtividadeEconomicaSecundariaTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localAtividadeEconomicaSecundaria);
        list.add(param);
        this.localAtividadeEconomicaSecundaria = (RamoAtividade[]) list.toArray(new RamoAtividade[list.size()]);
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataFundacao() {
        return localDataFundacao;
    }

    /**
     * Auto generated setter method
     * @param param DataFundacao
     */
    public void setDataFundacao(java.util.Calendar param) {
        this.localDataFundacao = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmail() {
        return localEmail;
    }

    /**
     * Auto generated setter method
     * @param param Email
     */
    public void setEmail(java.lang.String param) {
        this.localEmail = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getHomePage() {
        return localHomePage;
    }

    /**
     * Auto generated setter method
     * @param param HomePage
     */
    public void setHomePage(java.lang.String param) {
        this.localHomePage = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getInscricaoEstadual() {
        return localInscricaoEstadual;
    }

    /**
     * Auto generated setter method
     * @param param InscricaoEstadual
     */
    public void setInscricaoEstadual(long param) {
        this.localInscricaoEstadual = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeComercial() {
        return localNomeComercial;
    }

    /**
     * Auto generated setter method
     * @param param NomeComercial
     */
    public void setNomeComercial(java.lang.String param) {
        this.localNomeComercial = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getNumeroNIRENIRC() {
        return localNumeroNIRENIRC;
    }

    /**
     * Auto generated setter method
     * @param param NumeroNIRENIRC
     */
    public void setNumeroNIRENIRC(long param) {
        this.localNumeroNIRENIRC = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRazaoSocial() {
        return localRazaoSocial;
    }

    /**
     * Auto generated setter method
     * @param param RazaoSocial
     */
    public void setRazaoSocial(java.lang.String param) {
        this.localRazaoSocial = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRazaoSocialAnterior() {
        return localRazaoSocialAnterior;
    }

    /**
     * Auto generated setter method
     * @param param RazaoSocialAnterior
     */
    public void setRazaoSocialAnterior(java.lang.String param) {
        this.localRazaoSocialAnterior = param;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getValorCapitalSocial() {
        return localValorCapitalSocial;
    }

    /**
     * Auto generated setter method
     * @param param ValorCapitalSocial
     */
    public void setValorCapitalSocial(java.math.BigDecimal param) {
        this.localValorCapitalSocial = param;
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
                        namespacePrefix + ":Pessoa-Juridica", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Pessoa-Juridica", xmlWriter);
            }
        }

        if (localDataFundacao != null) {
            writeAttribute("", "data-fundacao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataFundacao), xmlWriter);
        }

        if (localEmail != null) {
            writeAttribute("", "email",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localEmail), xmlWriter);
        }

        if (localHomePage != null) {
            writeAttribute("", "home-page",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localHomePage), xmlWriter);
        }

        if (localInscricaoEstadual != java.lang.Long.MIN_VALUE) {
            writeAttribute("", "inscricao-estadual",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localInscricaoEstadual), xmlWriter);
        }

        if (localNomeComercial != null) {
            writeAttribute("", "nome-comercial",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNomeComercial), xmlWriter);
        }

        if (localNumeroNIRENIRC != java.lang.Long.MIN_VALUE) {
            writeAttribute("", "numero-NIRE-NIRC",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNumeroNIRENIRC), xmlWriter);
        }

        if (localRazaoSocial != null) {
            writeAttribute("", "razao-social",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRazaoSocial), xmlWriter);
        }

        if (localRazaoSocialAnterior != null) {
            writeAttribute("", "razao-social-anterior",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRazaoSocialAnterior), xmlWriter);
        }

        if (localValorCapitalSocial != null) {
            writeAttribute("", "valor-capital-social",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localValorCapitalSocial), xmlWriter);
        }

        if (localCnpjTracker) {
            if (localCnpj == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cnpj cannot be null!!");
            }

            localCnpj.serialize(new javax.xml.namespace.QName("", "cnpj"),
                    xmlWriter);
        }

        if (localSituacaoCnpjTracker) {
            if (localSituacaoCnpj == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "situacao-cnpj cannot be null!!");
            }

            localSituacaoCnpj.serialize(new javax.xml.namespace.QName("",
                    "situacao-cnpj"), xmlWriter);
        }

        if (localSituacaoInscricaoEstadualTracker) {
            if (localSituacaoInscricaoEstadual == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "situacao-inscricao-estadual cannot be null!!");
            }

            localSituacaoInscricaoEstadual.serialize(new javax.xml.namespace.QName(
                    "", "situacao-inscricao-estadual"), xmlWriter);
        }

        if (localEnderecoTracker) {
            if (localEndereco == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "endereco cannot be null!!");
            }

            localEndereco.serialize(new javax.xml.namespace.QName("",
                    "endereco"), xmlWriter);
        }

        if (localTelefoneTracker) {
            if (localTelefone == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "telefone cannot be null!!");
            }

            localTelefone.serialize(new javax.xml.namespace.QName("",
                    "telefone"), xmlWriter);
        }

        if (localFaxTracker) {
            if (localFax == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "fax cannot be null!!");
            }

            localFax.serialize(new javax.xml.namespace.QName("", "fax"),
                    xmlWriter);
        }

        if (localNaturezaJuridicaTracker) {
            if (localNaturezaJuridica == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "natureza-juridica cannot be null!!");
            }

            localNaturezaJuridica.serialize(new javax.xml.namespace.QName(
                    "", "natureza-juridica"), xmlWriter);
        }

        if (localAtividadeEconomicaPrincipalTracker) {
            if (localAtividadeEconomicaPrincipal == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "atividade-economica-principal cannot be null!!");
            }

            localAtividadeEconomicaPrincipal.serialize(new javax.xml.namespace.QName(
                    "", "atividade-economica-principal"), xmlWriter);
        }

        if (localAtividadeEconomicaSecundariaTracker) {
            if (localAtividadeEconomicaSecundaria != null) {
                for (int i = 0;
                     i < localAtividadeEconomicaSecundaria.length;
                     i++) {
                    if (localAtividadeEconomicaSecundaria[i] != null) {
                        localAtividadeEconomicaSecundaria[i].serialize(new javax.xml.namespace.QName(
                                        "", "atividade-economica-secundaria"),
                                xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "atividade-economica-secundaria cannot be null!!");
            }
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
        public static PessoaJuridica parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            PessoaJuridica object = new PessoaJuridica();

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

                        if (!"Pessoa-Juridica".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (PessoaJuridica) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "data-fundacao"
                java.lang.String tempAttribDataFundacao = reader.getAttributeValue(null,
                        "data-fundacao");

                if (tempAttribDataFundacao != null) {
                    java.lang.String content = tempAttribDataFundacao;

                    object.setDataFundacao(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataFundacao));
                } else {
                }

                handledAttributes.add("data-fundacao");

                // handle attribute "email"
                java.lang.String tempAttribEmail = reader.getAttributeValue(null,
                        "email");

                if (tempAttribEmail != null) {
                    java.lang.String content = tempAttribEmail;

                    object.setEmail(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribEmail));
                } else {
                }

                handledAttributes.add("email");

                // handle attribute "home-page"
                java.lang.String tempAttribHomePage = reader.getAttributeValue(null,
                        "home-page");

                if (tempAttribHomePage != null) {
                    java.lang.String content = tempAttribHomePage;

                    object.setHomePage(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribHomePage));
                } else {
                }

                handledAttributes.add("home-page");

                // handle attribute "inscricao-estadual"
                java.lang.String tempAttribInscricaoEstadual = reader.getAttributeValue(null,
                        "inscricao-estadual");

                if (tempAttribInscricaoEstadual != null) {
                    java.lang.String content = tempAttribInscricaoEstadual;

                    object.setInscricaoEstadual(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            tempAttribInscricaoEstadual));
                } else {
                    object.setInscricaoEstadual(java.lang.Long.MIN_VALUE);
                }

                handledAttributes.add("inscricao-estadual");

                // handle attribute "nome-comercial"
                java.lang.String tempAttribNomeComercial = reader.getAttributeValue(null,
                        "nome-comercial");

                if (tempAttribNomeComercial != null) {
                    java.lang.String content = tempAttribNomeComercial;

                    object.setNomeComercial(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNomeComercial));
                } else {
                }

                handledAttributes.add("nome-comercial");

                // handle attribute "numero-NIRE-NIRC"
                java.lang.String tempAttribNumeroNIRENIRC = reader.getAttributeValue(null,
                        "numero-NIRE-NIRC");

                if (tempAttribNumeroNIRENIRC != null) {
                    java.lang.String content = tempAttribNumeroNIRENIRC;

                    object.setNumeroNIRENIRC(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            tempAttribNumeroNIRENIRC));
                } else {
                    object.setNumeroNIRENIRC(java.lang.Long.MIN_VALUE);
                }

                handledAttributes.add("numero-NIRE-NIRC");

                // handle attribute "razao-social"
                java.lang.String tempAttribRazaoSocial = reader.getAttributeValue(null,
                        "razao-social");

                if (tempAttribRazaoSocial != null) {
                    java.lang.String content = tempAttribRazaoSocial;

                    object.setRazaoSocial(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribRazaoSocial));
                } else {
                }

                handledAttributes.add("razao-social");

                // handle attribute "razao-social-anterior"
                java.lang.String tempAttribRazaoSocialAnterior = reader.getAttributeValue(null,
                        "razao-social-anterior");

                if (tempAttribRazaoSocialAnterior != null) {
                    java.lang.String content = tempAttribRazaoSocialAnterior;

                    object.setRazaoSocialAnterior(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribRazaoSocialAnterior));
                } else {
                }

                handledAttributes.add("razao-social-anterior");

                // handle attribute "valor-capital-social"
                java.lang.String tempAttribValorCapitalSocial = reader.getAttributeValue(null,
                        "valor-capital-social");

                if (tempAttribValorCapitalSocial != null) {
                    java.lang.String content = tempAttribValorCapitalSocial;

                    object.setValorCapitalSocial(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribValorCapitalSocial));
                } else {
                }

                handledAttributes.add("valor-capital-social");

                reader.next();

                java.util.ArrayList list9 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "cnpj").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "cnpj").equals(
                                reader.getName())) {
                    object.setCnpj(Cnpj.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "situacao-cnpj").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "situacao-cnpj").equals(
                                reader.getName())) {
                    object.setSituacaoCnpj(SituacaoDocumentoWS.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "situacao-inscricao-estadual").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "situacao-inscricao-estadual").equals(
                                reader.getName())) {
                    object.setSituacaoInscricaoEstadual(SituacaoDocumentoWS.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "endereco").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "endereco").equals(
                                reader.getName())) {
                    object.setEndereco(Endereco.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "telefone").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "telefone").equals(
                                reader.getName())) {
                    object.setTelefone(Telefone.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "fax").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "fax").equals(
                                reader.getName())) {
                    object.setFax(Telefone.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "natureza-juridica").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "natureza-juridica").equals(reader.getName())) {
                    object.setNaturezaJuridica(NaturezaJuridica.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "atividade-economica-principal").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "atividade-economica-principal").equals(
                                reader.getName())) {
                    object.setAtividadeEconomicaPrincipal(RamoAtividade.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "atividade-economica-secundaria").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "atividade-economica-secundaria").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list9.add(RamoAtividade.Factory.parse(reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone9 = false;

                    while (!loopDone9) {
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
                            loopDone9 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "atividade-economica-secundaria").equals(
                                    reader.getName())) {
                                list9.add(RamoAtividade.Factory.parse(
                                        reader));
                            } else {
                                loopDone9 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setAtividadeEconomicaSecundaria((RamoAtividade[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            RamoAtividade.class, list9));
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

