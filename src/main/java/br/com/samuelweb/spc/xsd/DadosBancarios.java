package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:36
 */
public class DadosBancarios implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Dados-Bancarios
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

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
     * field for Banco
     */
    protected Banco localBanco;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBancoTracker = false;

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
     * field for NumeroAgencia
     * This was an Attribute!
     */
    protected int localNumeroAgencia;

    /**
     * field for NomeAgencia
     * This was an Attribute!
     */
    protected java.lang.String localNomeAgencia;

    /**
     * field for NumeroContaCorrente
     * This was an Attribute!
     */
    protected java.lang.String localNumeroContaCorrente;

    /**
     * field for DigitoContaCorrente
     * This was an Attribute!
     */
    protected java.lang.String localDigitoContaCorrente;

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

    public boolean isBancoSpecified() {
        return localBancoTracker;
    }

    /**
     * Auto generated getter method
     * @return Banco
     */
    public Banco getBanco() {
        return localBanco;
    }

    /**
     * Auto generated setter method
     * @param param Banco
     */
    public void setBanco(Banco param) {
        localBancoTracker = param != null;

        this.localBanco = param;
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

    /**
     * Auto generated getter method
     * @return int
     */
    public int getNumeroAgencia() {
        return localNumeroAgencia;
    }

    /**
     * Auto generated setter method
     * @param param NumeroAgencia
     */
    public void setNumeroAgencia(int param) {
        this.localNumeroAgencia = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeAgencia() {
        return localNomeAgencia;
    }

    /**
     * Auto generated setter method
     * @param param NomeAgencia
     */
    public void setNomeAgencia(java.lang.String param) {
        this.localNomeAgencia = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumeroContaCorrente() {
        return localNumeroContaCorrente;
    }

    /**
     * Auto generated setter method
     * @param param NumeroContaCorrente
     */
    public void setNumeroContaCorrente(java.lang.String param) {
        this.localNumeroContaCorrente = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDigitoContaCorrente() {
        return localDigitoContaCorrente;
    }

    /**
     * Auto generated setter method
     * @param param DigitoContaCorrente
     */
    public void setDigitoContaCorrente(java.lang.String param) {
        this.localDigitoContaCorrente = param;
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
                        namespacePrefix + ":Dados-Bancarios", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Dados-Bancarios", xmlWriter);
            }
        }

        if (localNumeroAgencia != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "numero-agencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNumeroAgencia), xmlWriter);
        }

        if (localNomeAgencia != null) {
            writeAttribute("", "nome-agencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNomeAgencia), xmlWriter);
        }

        if (localNumeroContaCorrente != null) {
            writeAttribute("", "numero-conta-corrente",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNumeroContaCorrente), xmlWriter);
        }

        if (localDigitoContaCorrente != null) {
            writeAttribute("", "digito-conta-corrente",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDigitoContaCorrente), xmlWriter);
        }

        if (localEnderecoTracker) {
            if (localEndereco == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "endereco cannot be null!!");
            }

            localEndereco.serialize(new javax.xml.namespace.QName("",
                    "endereco"), xmlWriter);
        }

        if (localBancoTracker) {
            if (localBanco == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "banco cannot be null!!");
            }

            localBanco.serialize(new javax.xml.namespace.QName("", "banco"),
                    xmlWriter);
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
        public static DadosBancarios parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            DadosBancarios object = new DadosBancarios();

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

                        if (!"Dados-Bancarios".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (DadosBancarios) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "numero-agencia"
                java.lang.String tempAttribNumeroAgencia = reader.getAttributeValue(null,
                        "numero-agencia");

                if (tempAttribNumeroAgencia != null) {
                    java.lang.String content = tempAttribNumeroAgencia;

                    object.setNumeroAgencia(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribNumeroAgencia));
                } else {
                    object.setNumeroAgencia(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("numero-agencia");

                // handle attribute "nome-agencia"
                java.lang.String tempAttribNomeAgencia = reader.getAttributeValue(null,
                        "nome-agencia");

                if (tempAttribNomeAgencia != null) {
                    java.lang.String content = tempAttribNomeAgencia;

                    object.setNomeAgencia(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNomeAgencia));
                } else {
                }

                handledAttributes.add("nome-agencia");

                // handle attribute "numero-conta-corrente"
                java.lang.String tempAttribNumeroContaCorrente = reader.getAttributeValue(null,
                        "numero-conta-corrente");

                if (tempAttribNumeroContaCorrente != null) {
                    java.lang.String content = tempAttribNumeroContaCorrente;

                    object.setNumeroContaCorrente(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNumeroContaCorrente));
                } else {
                }

                handledAttributes.add("numero-conta-corrente");

                // handle attribute "digito-conta-corrente"
                java.lang.String tempAttribDigitoContaCorrente = reader.getAttributeValue(null,
                        "digito-conta-corrente");

                if (tempAttribDigitoContaCorrente != null) {
                    java.lang.String content = tempAttribDigitoContaCorrente;

                    object.setDigitoContaCorrente(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDigitoContaCorrente));
                } else {
                }

                handledAttributes.add("digito-conta-corrente");

                reader.next();

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
                        new javax.xml.namespace.QName("", "banco").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "banco").equals(
                                reader.getName())) {
                    object.setBanco(Banco.Factory.parse(reader));

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

