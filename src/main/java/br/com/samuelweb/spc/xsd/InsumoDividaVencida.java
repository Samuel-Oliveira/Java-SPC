package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:21
 */
public class InsumoDividaVencida implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Divida-Vencida
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
     * field for Moeda
     */
    protected Moeda localMoeda;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMoedaTracker = false;

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
     * field for DataOcorrencia
     * This was an Attribute!
     */
    protected java.util.Calendar localDataOcorrencia;

    /**
     * field for InstituicaoFinanceira
     * This was an Attribute!
     */
    protected java.lang.String localInstituicaoFinanceira;

    /**
     * field for Local
     * This was an Attribute!
     */
    protected java.lang.String localLocal;

    /**
     * field for Modalidade
     * This was an Attribute!
     */
    protected java.lang.String localModalidade;

    /**
     * field for Titulo
     * This was an Attribute!
     */
    protected java.lang.String localTitulo;

    /**
     * field for ValorDivida
     * This was an Attribute!
     */
    protected java.math.BigDecimal localValorDivida;

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

    public boolean isMoedaSpecified() {
        return localMoedaTracker;
    }

    /**
     * Auto generated getter method
     * @return Moeda
     */
    public Moeda getMoeda() {
        return localMoeda;
    }

    /**
     * Auto generated setter method
     * @param param Moeda
     */
    public void setMoeda(Moeda param) {
        localMoedaTracker = param != null;

        this.localMoeda = param;
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
    public java.lang.String getInstituicaoFinanceira() {
        return localInstituicaoFinanceira;
    }

    /**
     * Auto generated setter method
     * @param param InstituicaoFinanceira
     */
    public void setInstituicaoFinanceira(java.lang.String param) {
        this.localInstituicaoFinanceira = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLocal() {
        return localLocal;
    }

    /**
     * Auto generated setter method
     * @param param Local
     */
    public void setLocal(java.lang.String param) {
        this.localLocal = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getModalidade() {
        return localModalidade;
    }

    /**
     * Auto generated setter method
     * @param param Modalidade
     */
    public void setModalidade(java.lang.String param) {
        this.localModalidade = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTitulo() {
        return localTitulo;
    }

    /**
     * Auto generated setter method
     * @param param Titulo
     */
    public void setTitulo(java.lang.String param) {
        this.localTitulo = param;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getValorDivida() {
        return localValorDivida;
    }

    /**
     * Auto generated setter method
     * @param param ValorDivida
     */
    public void setValorDivida(java.math.BigDecimal param) {
        this.localValorDivida = param;
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
                        namespacePrefix + ":Insumo-Divida-Vencida", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Divida-Vencida", xmlWriter);
            }
        }

        if (localDataOcorrencia != null) {
            writeAttribute("", "data-ocorrencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataOcorrencia), xmlWriter);
        }

        if (localInstituicaoFinanceira != null) {
            writeAttribute("", "instituicao-financeira",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localInstituicaoFinanceira), xmlWriter);
        }

        if (localLocal != null) {
            writeAttribute("", "local",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localLocal), xmlWriter);
        }

        if (localModalidade != null) {
            writeAttribute("", "modalidade",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localModalidade), xmlWriter);
        }

        if (localTitulo != null) {
            writeAttribute("", "titulo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTitulo), xmlWriter);
        }

        if (localValorDivida != null) {
            writeAttribute("", "valor-divida",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localValorDivida), xmlWriter);
        }

        if (localNaturezaAnotacaoTracker) {
            if (localNaturezaAnotacao == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "natureza-anotacao cannot be null!!");
            }

            localNaturezaAnotacao.serialize(new javax.xml.namespace.QName(
                    "", "natureza-anotacao"), xmlWriter);
        }

        if (localMoedaTracker) {
            if (localMoeda == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "moeda cannot be null!!");
            }

            localMoeda.serialize(new javax.xml.namespace.QName("", "moeda"),
                    xmlWriter);
        }

        if (localSubjudiceTracker) {
            if (localSubjudice == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "subjudice cannot be null!!");
            }

            localSubjudice.serialize(new javax.xml.namespace.QName("",
                    "subjudice"), xmlWriter);
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
        public static InsumoDividaVencida parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoDividaVencida object = new InsumoDividaVencida();

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

                        if (!"Insumo-Divida-Vencida".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoDividaVencida) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

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

                // handle attribute "instituicao-financeira"
                java.lang.String tempAttribInstituicaoFinanceira = reader.getAttributeValue(null,
                        "instituicao-financeira");

                if (tempAttribInstituicaoFinanceira != null) {
                    java.lang.String content = tempAttribInstituicaoFinanceira;

                    object.setInstituicaoFinanceira(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribInstituicaoFinanceira));
                } else {
                }

                handledAttributes.add("instituicao-financeira");

                // handle attribute "local"
                java.lang.String tempAttribLocal = reader.getAttributeValue(null,
                        "local");

                if (tempAttribLocal != null) {
                    java.lang.String content = tempAttribLocal;

                    object.setLocal(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribLocal));
                } else {
                }

                handledAttributes.add("local");

                // handle attribute "modalidade"
                java.lang.String tempAttribModalidade = reader.getAttributeValue(null,
                        "modalidade");

                if (tempAttribModalidade != null) {
                    java.lang.String content = tempAttribModalidade;

                    object.setModalidade(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribModalidade));
                } else {
                }

                handledAttributes.add("modalidade");

                // handle attribute "titulo"
                java.lang.String tempAttribTitulo = reader.getAttributeValue(null,
                        "titulo");

                if (tempAttribTitulo != null) {
                    java.lang.String content = tempAttribTitulo;

                    object.setTitulo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribTitulo));
                } else {
                }

                handledAttributes.add("titulo");

                // handle attribute "valor-divida"
                java.lang.String tempAttribValorDivida = reader.getAttributeValue(null,
                        "valor-divida");

                if (tempAttribValorDivida != null) {
                    java.lang.String content = tempAttribValorDivida;

                    object.setValorDivida(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribValorDivida));
                } else {
                }

                handledAttributes.add("valor-divida");

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
                        new javax.xml.namespace.QName("", "moeda").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "moeda").equals(
                                reader.getName())) {
                    object.setMoeda(Moeda.Factory.parse(reader));

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

