package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 09:55
 */
public class InsumoChequeSemFundoAchei implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Cheque-Sem-Fundo-Achei
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Cheque
     */
    protected Cheque localCheque;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localChequeTracker = false;

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
     * field for NaturezaAnotacao
     */
    protected NaturezaAnotacao localNaturezaAnotacao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNaturezaAnotacaoTracker = false;

    /**
     * field for Alinea
     */
    protected Alinea localAlinea;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAlineaTracker = false;

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
     * field for DataOcorrencia
     * This was an Attribute!
     */
    protected java.util.Calendar localDataOcorrencia;

    /**
     * field for QuantidadeBanco
     * This was an Attribute!
     */
    protected int localQuantidadeBanco;

    /**
     * field for TitularidadeContaCorrente
     * This was an Attribute!
     */
    protected java.lang.String localTitularidadeContaCorrente;

    public boolean isChequeSpecified() {
        return localChequeTracker;
    }

    /**
     * Auto generated getter method
     * @return Cheque
     */
    public Cheque getCheque() {
        return localCheque;
    }

    /**
     * Auto generated setter method
     * @param param Cheque
     */
    public void setCheque(Cheque param) {
        localChequeTracker = param != null;

        this.localCheque = param;
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

    public boolean isAlineaSpecified() {
        return localAlineaTracker;
    }

    /**
     * Auto generated getter method
     * @return Alinea
     */
    public Alinea getAlinea() {
        return localAlinea;
    }

    /**
     * Auto generated setter method
     * @param param Alinea
     */
    public void setAlinea(Alinea param) {
        localAlineaTracker = param != null;

        this.localAlinea = param;
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
     * @return int
     */
    public int getQuantidadeBanco() {
        return localQuantidadeBanco;
    }

    /**
     * Auto generated setter method
     * @param param QuantidadeBanco
     */
    public void setQuantidadeBanco(int param) {
        this.localQuantidadeBanco = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTitularidadeContaCorrente() {
        return localTitularidadeContaCorrente;
    }

    /**
     * Auto generated setter method
     * @param param TitularidadeContaCorrente
     */
    public void setTitularidadeContaCorrente(java.lang.String param) {
        this.localTitularidadeContaCorrente = param;
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
                        namespacePrefix + ":Insumo-Cheque-Sem-Fundo-Achei",
                        xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Cheque-Sem-Fundo-Achei", xmlWriter);
            }
        }

        if (localDataOcorrencia != null) {
            writeAttribute("", "data-ocorrencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataOcorrencia), xmlWriter);
        }

        if (localQuantidadeBanco != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "quantidade-banco",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localQuantidadeBanco), xmlWriter);
        }

        if (localTitularidadeContaCorrente != null) {
            writeAttribute("", "titularidade-conta-corrente",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTitularidadeContaCorrente), xmlWriter);
        }

        if (localChequeTracker) {
            if (localCheque == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cheque cannot be null!!");
            }

            localCheque.serialize(new javax.xml.namespace.QName("", "cheque"),
                    xmlWriter);
        }

        if (localCidadeTracker) {
            if (localCidade == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cidade cannot be null!!");
            }

            localCidade.serialize(new javax.xml.namespace.QName("", "cidade"),
                    xmlWriter);
        }

        if (localNaturezaAnotacaoTracker) {
            if (localNaturezaAnotacao == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "natureza-anotacao cannot be null!!");
            }

            localNaturezaAnotacao.serialize(new javax.xml.namespace.QName(
                    "", "natureza-anotacao"), xmlWriter);
        }

        if (localAlineaTracker) {
            if (localAlinea == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "alinea cannot be null!!");
            }

            localAlinea.serialize(new javax.xml.namespace.QName("", "alinea"),
                    xmlWriter);
        }

        if (localMoedaTracker) {
            if (localMoeda == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "moeda cannot be null!!");
            }

            localMoeda.serialize(new javax.xml.namespace.QName("", "moeda"),
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
        public static InsumoChequeSemFundoAchei parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoChequeSemFundoAchei object = new InsumoChequeSemFundoAchei();

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

                        if (!"Insumo-Cheque-Sem-Fundo-Achei".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoChequeSemFundoAchei) ExtensionMapper.getTypeObject(nsUri,
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

                // handle attribute "quantidade-banco"
                java.lang.String tempAttribQuantidadeBanco = reader.getAttributeValue(null,
                        "quantidade-banco");

                if (tempAttribQuantidadeBanco != null) {
                    java.lang.String content = tempAttribQuantidadeBanco;

                    object.setQuantidadeBanco(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribQuantidadeBanco));
                } else {
                    object.setQuantidadeBanco(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("quantidade-banco");

                // handle attribute "titularidade-conta-corrente"
                java.lang.String tempAttribTitularidadeContaCorrente = reader.getAttributeValue(null,
                        "titularidade-conta-corrente");

                if (tempAttribTitularidadeContaCorrente != null) {
                    java.lang.String content = tempAttribTitularidadeContaCorrente;

                    object.setTitularidadeContaCorrente(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribTitularidadeContaCorrente));
                } else {
                }

                handledAttributes.add("titularidade-conta-corrente");

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "cheque").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "cheque").equals(
                                reader.getName())) {
                    object.setCheque(Cheque.Factory.parse(reader));

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
                        new javax.xml.namespace.QName("", "alinea").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "alinea").equals(
                                reader.getName())) {
                    object.setAlinea(Alinea.Factory.parse(reader));

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

