package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:43
 */
public class InsumoSPCAutoLocaliza extends AbstractInsumoSPCAuto
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-SPCAutoLocaliza
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for NomeProprietario
     * This was an Attribute!
     */
    protected java.lang.String localNomeProprietario;

    /**
     * field for Placa
     * This was an Attribute!
     */
    protected java.lang.String localPlaca;

    /**
     * field for Renavam
     * This was an Attribute!
     */
    protected int localRenavam;

    /**
     * field for Chassi
     * This was an Attribute!
     */
    protected java.lang.String localChassi;

    /**
     * field for NumeroDut
     * This was an Attribute!
     */
    protected int localNumeroDut;

    /**
     * field for AnoExercicio
     * This was an Attribute!
     */
    protected int localAnoExercicio;

    /**
     * field for DataProcessamento
     * This was an Attribute!
     */
    protected java.lang.String localDataProcessamento;

    /**
     * field for IdPagamentoDut
     * This was an Attribute!
     */
    protected int localIdPagamentoDut;

    /**
     * field for NumeroBanco
     * This was an Attribute!
     */
    protected int localNumeroBanco;

    /**
     * field for UfDut
     * This was an Attribute!
     */
    protected java.lang.String localUfDut;

    /**
     * field for Documento
     * This was an Attribute!
     */
    protected java.lang.String localDocumento;

    /**
     * field for DataEmissaoGuia
     * This was an Attribute!
     */
    protected java.lang.String localDataEmissaoGuia;

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
     * @return int
     */
    public int getNumeroDut() {
        return localNumeroDut;
    }

    /**
     * Auto generated setter method
     * @param param NumeroDut
     */
    public void setNumeroDut(int param) {
        this.localNumeroDut = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getAnoExercicio() {
        return localAnoExercicio;
    }

    /**
     * Auto generated setter method
     * @param param AnoExercicio
     */
    public void setAnoExercicio(int param) {
        this.localAnoExercicio = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDataProcessamento() {
        return localDataProcessamento;
    }

    /**
     * Auto generated setter method
     * @param param DataProcessamento
     */
    public void setDataProcessamento(java.lang.String param) {
        this.localDataProcessamento = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getIdPagamentoDut() {
        return localIdPagamentoDut;
    }

    /**
     * Auto generated setter method
     * @param param IdPagamentoDut
     */
    public void setIdPagamentoDut(int param) {
        this.localIdPagamentoDut = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getNumeroBanco() {
        return localNumeroBanco;
    }

    /**
     * Auto generated setter method
     * @param param NumeroBanco
     */
    public void setNumeroBanco(int param) {
        this.localNumeroBanco = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUfDut() {
        return localUfDut;
    }

    /**
     * Auto generated setter method
     * @param param UfDut
     */
    public void setUfDut(java.lang.String param) {
        this.localUfDut = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDocumento() {
        return localDocumento;
    }

    /**
     * Auto generated setter method
     * @param param Documento
     */
    public void setDocumento(java.lang.String param) {
        this.localDocumento = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDataEmissaoGuia() {
        return localDataEmissaoGuia;
    }

    /**
     * Auto generated setter method
     * @param param DataEmissaoGuia
     */
    public void setDataEmissaoGuia(java.lang.String param) {
        this.localDataEmissaoGuia = param;
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
                    namespacePrefix + ":Insumo-SPCAutoLocaliza", xmlWriter);
        } else {
            writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Insumo-SPCAutoLocaliza", xmlWriter);
        }

        if (localNomeProprietario != null) {
            writeAttribute("", "nome-proprietario",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNomeProprietario), xmlWriter);
        }

        if (localPlaca != null) {
            writeAttribute("", "placa",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPlaca), xmlWriter);
        }

        if (localRenavam != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "renavam",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRenavam), xmlWriter);
        }

        if (localChassi != null) {
            writeAttribute("", "chassi",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localChassi), xmlWriter);
        }

        if (localNumeroDut != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "numero-dut",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNumeroDut), xmlWriter);
        }

        if (localAnoExercicio != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "ano-exercicio",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localAnoExercicio), xmlWriter);
        }

        if (localDataProcessamento != null) {
            writeAttribute("", "data-processamento",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataProcessamento), xmlWriter);
        }

        if (localIdPagamentoDut != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "id-pagamento-dut",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localIdPagamentoDut), xmlWriter);
        }

        if (localNumeroBanco != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "numero-banco",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNumeroBanco), xmlWriter);
        }

        if (localUfDut != null) {
            writeAttribute("", "uf-dut",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localUfDut), xmlWriter);
        }

        if (localDocumento != null) {
            writeAttribute("", "documento",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDocumento), xmlWriter);
        }

        if (localDataEmissaoGuia != null) {
            writeAttribute("", "data-emissao-guia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataEmissaoGuia), xmlWriter);
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
        public static InsumoSPCAutoLocaliza parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoSPCAutoLocaliza object = new InsumoSPCAutoLocaliza();

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

                        if (!"Insumo-SPCAutoLocaliza".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoSPCAutoLocaliza) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

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

                // handle attribute "numero-dut"
                java.lang.String tempAttribNumeroDut = reader.getAttributeValue(null,
                        "numero-dut");

                if (tempAttribNumeroDut != null) {
                    java.lang.String content = tempAttribNumeroDut;

                    object.setNumeroDut(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribNumeroDut));
                } else {
                    object.setNumeroDut(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("numero-dut");

                // handle attribute "ano-exercicio"
                java.lang.String tempAttribAnoExercicio = reader.getAttributeValue(null,
                        "ano-exercicio");

                if (tempAttribAnoExercicio != null) {
                    java.lang.String content = tempAttribAnoExercicio;

                    object.setAnoExercicio(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribAnoExercicio));
                } else {
                    object.setAnoExercicio(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("ano-exercicio");

                // handle attribute "data-processamento"
                java.lang.String tempAttribDataProcessamento = reader.getAttributeValue(null,
                        "data-processamento");

                if (tempAttribDataProcessamento != null) {
                    java.lang.String content = tempAttribDataProcessamento;

                    object.setDataProcessamento(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDataProcessamento));
                } else {
                }

                handledAttributes.add("data-processamento");

                // handle attribute "id-pagamento-dut"
                java.lang.String tempAttribIdPagamentoDut = reader.getAttributeValue(null,
                        "id-pagamento-dut");

                if (tempAttribIdPagamentoDut != null) {
                    java.lang.String content = tempAttribIdPagamentoDut;

                    object.setIdPagamentoDut(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribIdPagamentoDut));
                } else {
                    object.setIdPagamentoDut(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("id-pagamento-dut");

                // handle attribute "numero-banco"
                java.lang.String tempAttribNumeroBanco = reader.getAttributeValue(null,
                        "numero-banco");

                if (tempAttribNumeroBanco != null) {
                    java.lang.String content = tempAttribNumeroBanco;

                    object.setNumeroBanco(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribNumeroBanco));
                } else {
                    object.setNumeroBanco(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("numero-banco");

                // handle attribute "uf-dut"
                java.lang.String tempAttribUfDut = reader.getAttributeValue(null,
                        "uf-dut");

                if (tempAttribUfDut != null) {
                    java.lang.String content = tempAttribUfDut;

                    object.setUfDut(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribUfDut));
                } else {
                }

                handledAttributes.add("uf-dut");

                // handle attribute "documento"
                java.lang.String tempAttribDocumento = reader.getAttributeValue(null,
                        "documento");

                if (tempAttribDocumento != null) {
                    java.lang.String content = tempAttribDocumento;

                    object.setDocumento(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDocumento));
                } else {
                }

                handledAttributes.add("documento");

                // handle attribute "data-emissao-guia"
                java.lang.String tempAttribDataEmissaoGuia = reader.getAttributeValue(null,
                        "data-emissao-guia");

                if (tempAttribDataEmissaoGuia != null) {
                    java.lang.String content = tempAttribDataEmissaoGuia;

                    object.setDataEmissaoGuia(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDataEmissaoGuia));
                } else {
                }

                handledAttributes.add("data-emissao-guia");

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

