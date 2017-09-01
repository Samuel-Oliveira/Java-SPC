package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:20
 */
public class PerfilFinanceiroContasAtivo implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = perfilFinanceiroContasAtivo
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Bloco
     */
    protected java.lang.String localBloco;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBlocoTracker = false;

    /**
     * field for Clientes
     */
    protected java.lang.String localClientes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localClientesTracker = false;

    /**
     * field for CodigoNivelConta
     */
    protected java.lang.String localCodigoNivelConta;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCodigoNivelContaTracker = false;

    /**
     * field for Estoques
     */
    protected java.lang.String localEstoques;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEstoquesTracker = false;

    /**
     * field for NomeConta
     */
    protected java.lang.String localNomeConta;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomeContaTracker = false;

    /**
     * field for NumeroConta
     */
    protected java.lang.String localNumeroConta;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumeroContaTracker = false;

    /**
     * field for Sinal
     */
    protected java.lang.String localSinal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSinalTracker = false;

    /**
     * field for Valor
     */
    protected int localValor;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localValorTracker = false;

    public boolean isBlocoSpecified() {
        return localBlocoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBloco() {
        return localBloco;
    }

    /**
     * Auto generated setter method
     * @param param Bloco
     */
    public void setBloco(java.lang.String param) {
        localBlocoTracker = param != null;

        this.localBloco = param;
    }

    public boolean isClientesSpecified() {
        return localClientesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getClientes() {
        return localClientes;
    }

    /**
     * Auto generated setter method
     * @param param Clientes
     */
    public void setClientes(java.lang.String param) {
        localClientesTracker = param != null;

        this.localClientes = param;
    }

    public boolean isCodigoNivelContaSpecified() {
        return localCodigoNivelContaTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCodigoNivelConta() {
        return localCodigoNivelConta;
    }

    /**
     * Auto generated setter method
     * @param param CodigoNivelConta
     */
    public void setCodigoNivelConta(java.lang.String param) {
        localCodigoNivelContaTracker = param != null;

        this.localCodigoNivelConta = param;
    }

    public boolean isEstoquesSpecified() {
        return localEstoquesTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEstoques() {
        return localEstoques;
    }

    /**
     * Auto generated setter method
     * @param param Estoques
     */
    public void setEstoques(java.lang.String param) {
        localEstoquesTracker = param != null;

        this.localEstoques = param;
    }

    public boolean isNomeContaSpecified() {
        return localNomeContaTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeConta() {
        return localNomeConta;
    }

    /**
     * Auto generated setter method
     * @param param NomeConta
     */
    public void setNomeConta(java.lang.String param) {
        localNomeContaTracker = param != null;

        this.localNomeConta = param;
    }

    public boolean isNumeroContaSpecified() {
        return localNumeroContaTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumeroConta() {
        return localNumeroConta;
    }

    /**
     * Auto generated setter method
     * @param param NumeroConta
     */
    public void setNumeroConta(java.lang.String param) {
        localNumeroContaTracker = param != null;

        this.localNumeroConta = param;
    }

    public boolean isSinalSpecified() {
        return localSinalTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSinal() {
        return localSinal;
    }

    /**
     * Auto generated setter method
     * @param param Sinal
     */
    public void setSinal(java.lang.String param) {
        localSinalTracker = param != null;

        this.localSinal = param;
    }

    public boolean isValorSpecified() {
        return localValorTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getValor() {
        return localValor;
    }

    /**
     * Auto generated setter method
     * @param param Valor
     */
    public void setValor(int param) {
        // setting primitive attribute tracker to true
        localValorTracker = param != java.lang.Integer.MIN_VALUE;

        this.localValor = param;
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
                        namespacePrefix + ":perfilFinanceiroContasAtivo",
                        xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "perfilFinanceiroContasAtivo", xmlWriter);
            }
        }

        if (localBlocoTracker) {
            namespace = "";
            writeStartElement(null, namespace, "bloco", xmlWriter);

            if (localBloco == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "bloco cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localBloco);
            }

            xmlWriter.writeEndElement();
        }

        if (localClientesTracker) {
            namespace = "";
            writeStartElement(null, namespace, "clientes", xmlWriter);

            if (localClientes == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "clientes cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localClientes);
            }

            xmlWriter.writeEndElement();
        }

        if (localCodigoNivelContaTracker) {
            namespace = "";
            writeStartElement(null, namespace, "codigoNivelConta", xmlWriter);

            if (localCodigoNivelConta == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "codigoNivelConta cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCodigoNivelConta);
            }

            xmlWriter.writeEndElement();
        }

        if (localEstoquesTracker) {
            namespace = "";
            writeStartElement(null, namespace, "estoques", xmlWriter);

            if (localEstoques == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "estoques cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localEstoques);
            }

            xmlWriter.writeEndElement();
        }

        if (localNomeContaTracker) {
            namespace = "";
            writeStartElement(null, namespace, "nomeConta", xmlWriter);

            if (localNomeConta == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "nomeConta cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNomeConta);
            }

            xmlWriter.writeEndElement();
        }

        if (localNumeroContaTracker) {
            namespace = "";
            writeStartElement(null, namespace, "numeroConta", xmlWriter);

            if (localNumeroConta == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "numeroConta cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNumeroConta);
            }

            xmlWriter.writeEndElement();
        }

        if (localSinalTracker) {
            namespace = "";
            writeStartElement(null, namespace, "sinal", xmlWriter);

            if (localSinal == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "sinal cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSinal);
            }

            xmlWriter.writeEndElement();
        }

        if (localValorTracker) {
            namespace = "";
            writeStartElement(null, namespace, "valor", xmlWriter);

            if (localValor == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                        "valor cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localValor));
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
        public static PerfilFinanceiroContasAtivo parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            PerfilFinanceiroContasAtivo object = new PerfilFinanceiroContasAtivo();

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

                        if (!"perfilFinanceiroContasAtivo".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (PerfilFinanceiroContasAtivo) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "bloco").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "bloco").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "bloco" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBloco(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "clientes").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "clientes").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "clientes" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setClientes(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "codigoNivelConta").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "codigoNivelConta").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "codigoNivelConta" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCodigoNivelConta(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "estoques").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "estoques").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "estoques" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEstoques(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "nomeConta").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "nomeConta").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "nomeConta" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNomeConta(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "numeroConta").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "numeroConta").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "numeroConta" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumeroConta(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "sinal").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "sinal").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sinal" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSinal(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "valor").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "valor").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "valor" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setValor(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setValor(java.lang.Integer.MIN_VALUE);
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

