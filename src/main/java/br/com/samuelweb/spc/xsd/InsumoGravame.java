package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:41
 */
public class InsumoGravame extends AbstractInsumoSPCAuto implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Gravame
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Chassi
     * This was an Attribute!
     */
    protected java.lang.String localChassi;

    /**
     * field for RemarcacaoChassi
     * This was an Attribute!
     */
    protected java.lang.String localRemarcacaoChassi;

    /**
     * field for Renavam
     * This was an Attribute!
     */
    protected int localRenavam;

    /**
     * field for StatusVeiculo
     * This was an Attribute!
     */
    protected java.lang.String localStatusVeiculo;

    /**
     * field for UfPlaca
     * This was an Attribute!
     */
    protected java.lang.String localUfPlaca;

    /**
     * field for Placa
     * This was an Attribute!
     */
    protected java.lang.String localPlaca;

    /**
     * field for UfLicenciamento
     * This was an Attribute!
     */
    protected java.lang.String localUfLicenciamento;

    /**
     * field for DocumentoFinanciado
     * This was an Attribute!
     */
    protected java.lang.String localDocumentoFinanciado;

    /**
     * field for NomeFinanciado
     * This was an Attribute!
     */
    protected java.lang.String localNomeFinanciado;

    /**
     * field for NomeAgente
     * This was an Attribute!
     */
    protected java.lang.String localNomeAgente;

    /**
     * field for DocumentoAgente
     * This was an Attribute!
     */
    protected java.lang.String localDocumentoAgente;

    /**
     * field for DataInclusaoGravame
     * This was an Attribute!
     */
    protected java.lang.String localDataInclusaoGravame;

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
    public java.lang.String getStatusVeiculo() {
        return localStatusVeiculo;
    }

    /**
     * Auto generated setter method
     * @param param StatusVeiculo
     */
    public void setStatusVeiculo(java.lang.String param) {
        this.localStatusVeiculo = param;
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
    public java.lang.String getUfLicenciamento() {
        return localUfLicenciamento;
    }

    /**
     * Auto generated setter method
     * @param param UfLicenciamento
     */
    public void setUfLicenciamento(java.lang.String param) {
        this.localUfLicenciamento = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDocumentoFinanciado() {
        return localDocumentoFinanciado;
    }

    /**
     * Auto generated setter method
     * @param param DocumentoFinanciado
     */
    public void setDocumentoFinanciado(java.lang.String param) {
        this.localDocumentoFinanciado = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeFinanciado() {
        return localNomeFinanciado;
    }

    /**
     * Auto generated setter method
     * @param param NomeFinanciado
     */
    public void setNomeFinanciado(java.lang.String param) {
        this.localNomeFinanciado = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeAgente() {
        return localNomeAgente;
    }

    /**
     * Auto generated setter method
     * @param param NomeAgente
     */
    public void setNomeAgente(java.lang.String param) {
        this.localNomeAgente = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDocumentoAgente() {
        return localDocumentoAgente;
    }

    /**
     * Auto generated setter method
     * @param param DocumentoAgente
     */
    public void setDocumentoAgente(java.lang.String param) {
        this.localDocumentoAgente = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDataInclusaoGravame() {
        return localDataInclusaoGravame;
    }

    /**
     * Auto generated setter method
     * @param param DataInclusaoGravame
     */
    public void setDataInclusaoGravame(java.lang.String param) {
        this.localDataInclusaoGravame = param;
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
                    namespacePrefix + ":Insumo-Gravame", xmlWriter);
        } else {
            writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Insumo-Gravame", xmlWriter);
        }

        if (localChassi != null) {
            writeAttribute("", "chassi",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localChassi), xmlWriter);
        }

        if (localRemarcacaoChassi != null) {
            writeAttribute("", "remarcacao-chassi",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRemarcacaoChassi), xmlWriter);
        }

        if (localRenavam != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "renavam",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRenavam), xmlWriter);
        }

        if (localStatusVeiculo != null) {
            writeAttribute("", "status-veiculo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localStatusVeiculo), xmlWriter);
        }

        if (localUfPlaca != null) {
            writeAttribute("", "uf-placa",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localUfPlaca), xmlWriter);
        }

        if (localPlaca != null) {
            writeAttribute("", "placa",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPlaca), xmlWriter);
        }

        if (localUfLicenciamento != null) {
            writeAttribute("", "uf-licenciamento",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localUfLicenciamento), xmlWriter);
        }

        if (localDocumentoFinanciado != null) {
            writeAttribute("", "documento-financiado",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDocumentoFinanciado), xmlWriter);
        }

        if (localNomeFinanciado != null) {
            writeAttribute("", "nome-financiado",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNomeFinanciado), xmlWriter);
        }

        if (localNomeAgente != null) {
            writeAttribute("", "nome-agente",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNomeAgente), xmlWriter);
        }

        if (localDocumentoAgente != null) {
            writeAttribute("", "documento-agente",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDocumentoAgente), xmlWriter);
        }

        if (localDataInclusaoGravame != null) {
            writeAttribute("", "data-inclusao-gravame",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataInclusaoGravame), xmlWriter);
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
        public static InsumoGravame parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoGravame object = new InsumoGravame();

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

                        if (!"Insumo-Gravame".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoGravame) ExtensionMapper.getTypeObject(nsUri,
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

                // handle attribute "status-veiculo"
                java.lang.String tempAttribStatusVeiculo = reader.getAttributeValue(null,
                        "status-veiculo");

                if (tempAttribStatusVeiculo != null) {
                    java.lang.String content = tempAttribStatusVeiculo;

                    object.setStatusVeiculo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribStatusVeiculo));
                } else {
                }

                handledAttributes.add("status-veiculo");

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

                // handle attribute "uf-licenciamento"
                java.lang.String tempAttribUfLicenciamento = reader.getAttributeValue(null,
                        "uf-licenciamento");

                if (tempAttribUfLicenciamento != null) {
                    java.lang.String content = tempAttribUfLicenciamento;

                    object.setUfLicenciamento(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribUfLicenciamento));
                } else {
                }

                handledAttributes.add("uf-licenciamento");

                // handle attribute "documento-financiado"
                java.lang.String tempAttribDocumentoFinanciado = reader.getAttributeValue(null,
                        "documento-financiado");

                if (tempAttribDocumentoFinanciado != null) {
                    java.lang.String content = tempAttribDocumentoFinanciado;

                    object.setDocumentoFinanciado(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDocumentoFinanciado));
                } else {
                }

                handledAttributes.add("documento-financiado");

                // handle attribute "nome-financiado"
                java.lang.String tempAttribNomeFinanciado = reader.getAttributeValue(null,
                        "nome-financiado");

                if (tempAttribNomeFinanciado != null) {
                    java.lang.String content = tempAttribNomeFinanciado;

                    object.setNomeFinanciado(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNomeFinanciado));
                } else {
                }

                handledAttributes.add("nome-financiado");

                // handle attribute "nome-agente"
                java.lang.String tempAttribNomeAgente = reader.getAttributeValue(null,
                        "nome-agente");

                if (tempAttribNomeAgente != null) {
                    java.lang.String content = tempAttribNomeAgente;

                    object.setNomeAgente(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNomeAgente));
                } else {
                }

                handledAttributes.add("nome-agente");

                // handle attribute "documento-agente"
                java.lang.String tempAttribDocumentoAgente = reader.getAttributeValue(null,
                        "documento-agente");

                if (tempAttribDocumentoAgente != null) {
                    java.lang.String content = tempAttribDocumentoAgente;

                    object.setDocumentoAgente(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDocumentoAgente));
                } else {
                }

                handledAttributes.add("documento-agente");

                // handle attribute "data-inclusao-gravame"
                java.lang.String tempAttribDataInclusaoGravame = reader.getAttributeValue(null,
                        "data-inclusao-gravame");

                if (tempAttribDataInclusaoGravame != null) {
                    java.lang.String content = tempAttribDataInclusaoGravame;

                    object.setDataInclusaoGravame(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDataInclusaoGravame));
                } else {
                }

                handledAttributes.add("data-inclusao-gravame");

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

