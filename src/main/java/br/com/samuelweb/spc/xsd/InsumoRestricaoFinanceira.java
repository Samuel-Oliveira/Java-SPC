package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:37
 */
public class InsumoRestricaoFinanceira implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Restricao-Financeira
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for NaturezaAnotacao
     */
    protected NaturezaAnotacao localNaturezaAnotacao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNaturezaAnotacaoTracker = false;

    /**
     * field for Subjudice
     */
    protected Subjudice localSubjudice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSubjudiceTracker = false;

    /**
     * field for DadosBancarios
     */
    protected DadosBancarios localDadosBancarios;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDadosBancariosTracker = false;

    /**
     * field for Cidade
     */
    protected Cidade localCidade;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCidadeTracker = false;

    /**
     * field for Avalista
     * This was an Attribute!
     */
    protected boolean localAvalista;

    /**
     * field for Contrato
     * This was an Attribute!
     */
    protected java.lang.String localContrato;

    /**
     * field for DataOcorrencia
     * This was an Attribute!
     */
    protected java.util.Calendar localDataOcorrencia;

    /**
     * field for Filial
     * This was an Attribute!
     */
    protected java.lang.String localFilial;

    /**
     * field for IndicadorSubjudice
     * This was an Attribute!
     */
    protected boolean localIndicadorSubjudice;

    /**
     * field for Origem
     * This was an Attribute!
     */
    protected java.lang.String localOrigem;

    /**
     * field for TituloOcorrencia
     * This was an Attribute!
     */
    protected java.lang.String localTituloOcorrencia;

    /**
     * field for ValorPendencia
     * This was an Attribute!
     */
    protected java.math.BigDecimal localValorPendencia;

    public boolean isNaturezaAnotacaoSpecified() {
        return localNaturezaAnotacaoTracker;
    }

    /**
     * Auto generated getter method
     * @return NaturezaAnotacao
     */
    public NaturezaAnotacao getNaturezaAnotacao() {
        return localNaturezaAnotacao;
    }

    /**
     * Auto generated setter method
     * @param param NaturezaAnotacao
     */
    public void setNaturezaAnotacao(NaturezaAnotacao param) {
        localNaturezaAnotacaoTracker = param != null;

        this.localNaturezaAnotacao = param;
    }

    public boolean isSubjudiceSpecified() {
        return localSubjudiceTracker;
    }

    /**
     * Auto generated getter method
     * @return Subjudice
     */
    public Subjudice getSubjudice() {
        return localSubjudice;
    }

    /**
     * Auto generated setter method
     * @param param Subjudice
     */
    public void setSubjudice(Subjudice param) {
        localSubjudiceTracker = param != null;

        this.localSubjudice = param;
    }

    public boolean isDadosBancariosSpecified() {
        return localDadosBancariosTracker;
    }

    /**
     * Auto generated getter method
     * @return DadosBancarios
     */
    public DadosBancarios getDadosBancarios() {
        return localDadosBancarios;
    }

    /**
     * Auto generated setter method
     * @param param DadosBancarios
     */
    public void setDadosBancarios(DadosBancarios param) {
        localDadosBancariosTracker = param != null;

        this.localDadosBancarios = param;
    }

    public boolean isCidadeSpecified() {
        return localCidadeTracker;
    }

    /**
     * Auto generated getter method
     * @return Cidade
     */
    public Cidade getCidade() {
        return localCidade;
    }

    /**
     * Auto generated setter method
     * @param param Cidade
     */
    public void setCidade(Cidade param) {
        localCidadeTracker = param != null;

        this.localCidade = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getAvalista() {
        return localAvalista;
    }

    /**
     * Auto generated setter method
     * @param param Avalista
     */
    public void setAvalista(boolean param) {
        this.localAvalista = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getContrato() {
        return localContrato;
    }

    /**
     * Auto generated setter method
     * @param param Contrato
     */
    public void setContrato(java.lang.String param) {
        this.localContrato = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataOcorrencia() {
        return localDataOcorrencia;
    }

    /**
     * Auto generated setter method
     * @param param DataOcorrencia
     */
    public void setDataOcorrencia(java.util.Calendar param) {
        this.localDataOcorrencia = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFilial() {
        return localFilial;
    }

    /**
     * Auto generated setter method
     * @param param Filial
     */
    public void setFilial(java.lang.String param) {
        this.localFilial = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIndicadorSubjudice() {
        return localIndicadorSubjudice;
    }

    /**
     * Auto generated setter method
     * @param param IndicadorSubjudice
     */
    public void setIndicadorSubjudice(boolean param) {
        this.localIndicadorSubjudice = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOrigem() {
        return localOrigem;
    }

    /**
     * Auto generated setter method
     * @param param Origem
     */
    public void setOrigem(java.lang.String param) {
        this.localOrigem = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTituloOcorrencia() {
        return localTituloOcorrencia;
    }

    /**
     * Auto generated setter method
     * @param param TituloOcorrencia
     */
    public void setTituloOcorrencia(java.lang.String param) {
        this.localTituloOcorrencia = param;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getValorPendencia() {
        return localValorPendencia;
    }

    /**
     * Auto generated setter method
     * @param param ValorPendencia
     */
    public void setValorPendencia(java.math.BigDecimal param) {
        this.localValorPendencia = param;
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
                        namespacePrefix + ":Insumo-Restricao-Financeira",
                        xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Restricao-Financeira", xmlWriter);
            }
        }

        if (true) {
            writeAttribute("", "avalista",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localAvalista), xmlWriter);
        }

        if (localContrato != null) {
            writeAttribute("", "contrato",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localContrato), xmlWriter);
        }

        if (localDataOcorrencia != null) {
            writeAttribute("", "data-ocorrencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataOcorrencia), xmlWriter);
        }

        if (localFilial != null) {
            writeAttribute("", "filial",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localFilial), xmlWriter);
        }

        if (true) {
            writeAttribute("", "indicador-subjudice",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localIndicadorSubjudice), xmlWriter);
        }

        if (localOrigem != null) {
            writeAttribute("", "origem",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localOrigem), xmlWriter);
        }

        if (localTituloOcorrencia != null) {
            writeAttribute("", "titulo-ocorrencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTituloOcorrencia), xmlWriter);
        }

        if (localValorPendencia != null) {
            writeAttribute("", "valor-pendencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localValorPendencia), xmlWriter);
        }

        if (localNaturezaAnotacaoTracker) {
            if (localNaturezaAnotacao == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "natureza-anotacao cannot be null!!");
            }

            localNaturezaAnotacao.serialize(new javax.xml.namespace.QName(
                    "", "natureza-anotacao"), xmlWriter);
        }

        if (localSubjudiceTracker) {
            if (localSubjudice == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "subjudice cannot be null!!");
            }

            localSubjudice.serialize(new javax.xml.namespace.QName("",
                    "subjudice"), xmlWriter);
        }

        if (localDadosBancariosTracker) {
            if (localDadosBancarios == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "dados-bancarios cannot be null!!");
            }

            localDadosBancarios.serialize(new javax.xml.namespace.QName(
                    "", "dados-bancarios"), xmlWriter);
        }

        if (localCidadeTracker) {
            if (localCidade == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cidade cannot be null!!");
            }

            localCidade.serialize(new javax.xml.namespace.QName("", "cidade"),
                    xmlWriter);
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
        public static InsumoRestricaoFinanceira parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoRestricaoFinanceira object = new InsumoRestricaoFinanceira();

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

                        if (!"Insumo-Restricao-Financeira".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoRestricaoFinanceira) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "avalista"
                java.lang.String tempAttribAvalista = reader.getAttributeValue(null,
                        "avalista");

                if (tempAttribAvalista != null) {
                    java.lang.String content = tempAttribAvalista;

                    object.setAvalista(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            tempAttribAvalista));
                } else {
                }

                handledAttributes.add("avalista");

                // handle attribute "contrato"
                java.lang.String tempAttribContrato = reader.getAttributeValue(null,
                        "contrato");

                if (tempAttribContrato != null) {
                    java.lang.String content = tempAttribContrato;

                    object.setContrato(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribContrato));
                } else {
                }

                handledAttributes.add("contrato");

                // handle attribute "data-ocorrencia"
                java.lang.String tempAttribDataOcorrencia = reader.getAttributeValue(null,
                        "data-ocorrencia");

                if (tempAttribDataOcorrencia != null) {
                    java.lang.String content = tempAttribDataOcorrencia;

                    object.setDataOcorrencia(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataOcorrencia));
                } else {
                }

                handledAttributes.add("data-ocorrencia");

                // handle attribute "filial"
                java.lang.String tempAttribFilial = reader.getAttributeValue(null,
                        "filial");

                if (tempAttribFilial != null) {
                    java.lang.String content = tempAttribFilial;

                    object.setFilial(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribFilial));
                } else {
                }

                handledAttributes.add("filial");

                // handle attribute "indicador-subjudice"
                java.lang.String tempAttribIndicadorSubjudice = reader.getAttributeValue(null,
                        "indicador-subjudice");

                if (tempAttribIndicadorSubjudice != null) {
                    java.lang.String content = tempAttribIndicadorSubjudice;

                    object.setIndicadorSubjudice(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            tempAttribIndicadorSubjudice));
                } else {
                }

                handledAttributes.add("indicador-subjudice");

                // handle attribute "origem"
                java.lang.String tempAttribOrigem = reader.getAttributeValue(null,
                        "origem");

                if (tempAttribOrigem != null) {
                    java.lang.String content = tempAttribOrigem;

                    object.setOrigem(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribOrigem));
                } else {
                }

                handledAttributes.add("origem");

                // handle attribute "titulo-ocorrencia"
                java.lang.String tempAttribTituloOcorrencia = reader.getAttributeValue(null,
                        "titulo-ocorrencia");

                if (tempAttribTituloOcorrencia != null) {
                    java.lang.String content = tempAttribTituloOcorrencia;

                    object.setTituloOcorrencia(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribTituloOcorrencia));
                } else {
                }

                handledAttributes.add("titulo-ocorrencia");

                // handle attribute "valor-pendencia"
                java.lang.String tempAttribValorPendencia = reader.getAttributeValue(null,
                        "valor-pendencia");

                if (tempAttribValorPendencia != null) {
                    java.lang.String content = tempAttribValorPendencia;

                    object.setValorPendencia(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribValorPendencia));
                } else {
                }

                handledAttributes.add("valor-pendencia");

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "natureza-anotacao").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "natureza-anotacao").equals(reader.getName())) {
                    object.setNaturezaAnotacao(NaturezaAnotacao.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "subjudice").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "subjudice").equals(
                                reader.getName())) {
                    object.setSubjudice(Subjudice.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "dados-bancarios").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "dados-bancarios").equals(
                                reader.getName())) {
                    object.setDadosBancarios(DadosBancarios.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "cidade").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "cidade").equals(
                                reader.getName())) {
                    object.setCidade(Cidade.Factory.parse(reader));

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

