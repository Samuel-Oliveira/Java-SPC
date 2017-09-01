package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:38
 */
public class PerfilFinanceiroIndicesFinanceiroIntegrado implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = perfilFinanceiroIndicesFinanceiroIntegrado
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for DesCategoriaIndice
     */
    protected java.lang.String localDesCategoriaIndice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDesCategoriaIndiceTracker = false;

    /**
     * field for FormatoDoIndice
     */
    protected java.lang.String localFormatoDoIndice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFormatoDoIndiceTracker = false;

    /**
     * field for IndiceDoBalanco
     */
    protected java.lang.String localIndiceDoBalanco;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIndiceDoBalancoTracker = false;

    /**
     * field for IndiceDoBalancoPadrao
     */
    protected java.lang.String localIndiceDoBalancoPadrao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIndiceDoBalancoPadraoTracker = false;

    /**
     * field for QtdDecimal
     */
    protected int localQtdDecimal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQtdDecimalTracker = false;

    /**
     * field for QtdInteiro
     */
    protected int localQtdInteiro;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQtdInteiroTracker = false;

    /**
     * field for SinalDoIndiceBalanco
     */
    protected java.lang.String localSinalDoIndiceBalanco;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSinalDoIndiceBalancoTracker = false;

    /**
     * field for SinalDoIndiceBalancoPadrao
     */
    protected java.lang.String localSinalDoIndiceBalancoPadrao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSinalDoIndiceBalancoPadraoTracker = false;

    public boolean isDesCategoriaIndiceSpecified() {
        return localDesCategoriaIndiceTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDesCategoriaIndice() {
        return localDesCategoriaIndice;
    }

    /**
     * Auto generated setter method
     * @param param DesCategoriaIndice
     */
    public void setDesCategoriaIndice(java.lang.String param) {
        localDesCategoriaIndiceTracker = param != null;

        this.localDesCategoriaIndice = param;
    }

    public boolean isFormatoDoIndiceSpecified() {
        return localFormatoDoIndiceTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFormatoDoIndice() {
        return localFormatoDoIndice;
    }

    /**
     * Auto generated setter method
     * @param param FormatoDoIndice
     */
    public void setFormatoDoIndice(java.lang.String param) {
        localFormatoDoIndiceTracker = param != null;

        this.localFormatoDoIndice = param;
    }

    public boolean isIndiceDoBalancoSpecified() {
        return localIndiceDoBalancoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getIndiceDoBalanco() {
        return localIndiceDoBalanco;
    }

    /**
     * Auto generated setter method
     * @param param IndiceDoBalanco
     */
    public void setIndiceDoBalanco(java.lang.String param) {
        localIndiceDoBalancoTracker = param != null;

        this.localIndiceDoBalanco = param;
    }

    public boolean isIndiceDoBalancoPadraoSpecified() {
        return localIndiceDoBalancoPadraoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getIndiceDoBalancoPadrao() {
        return localIndiceDoBalancoPadrao;
    }

    /**
     * Auto generated setter method
     * @param param IndiceDoBalancoPadrao
     */
    public void setIndiceDoBalancoPadrao(java.lang.String param) {
        localIndiceDoBalancoPadraoTracker = param != null;

        this.localIndiceDoBalancoPadrao = param;
    }

    public boolean isQtdDecimalSpecified() {
        return localQtdDecimalTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getQtdDecimal() {
        return localQtdDecimal;
    }

    /**
     * Auto generated setter method
     * @param param QtdDecimal
     */
    public void setQtdDecimal(int param) {
        // setting primitive attribute tracker to true
        localQtdDecimalTracker = param != java.lang.Integer.MIN_VALUE;

        this.localQtdDecimal = param;
    }

    public boolean isQtdInteiroSpecified() {
        return localQtdInteiroTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getQtdInteiro() {
        return localQtdInteiro;
    }

    /**
     * Auto generated setter method
     * @param param QtdInteiro
     */
    public void setQtdInteiro(int param) {
        // setting primitive attribute tracker to true
        localQtdInteiroTracker = param != java.lang.Integer.MIN_VALUE;

        this.localQtdInteiro = param;
    }

    public boolean isSinalDoIndiceBalancoSpecified() {
        return localSinalDoIndiceBalancoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSinalDoIndiceBalanco() {
        return localSinalDoIndiceBalanco;
    }

    /**
     * Auto generated setter method
     * @param param SinalDoIndiceBalanco
     */
    public void setSinalDoIndiceBalanco(java.lang.String param) {
        localSinalDoIndiceBalancoTracker = param != null;

        this.localSinalDoIndiceBalanco = param;
    }

    public boolean isSinalDoIndiceBalancoPadraoSpecified() {
        return localSinalDoIndiceBalancoPadraoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSinalDoIndiceBalancoPadrao() {
        return localSinalDoIndiceBalancoPadrao;
    }

    /**
     * Auto generated setter method
     * @param param SinalDoIndiceBalancoPadrao
     */
    public void setSinalDoIndiceBalancoPadrao(java.lang.String param) {
        localSinalDoIndiceBalancoPadraoTracker = param != null;

        this.localSinalDoIndiceBalancoPadrao = param;
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
                        namespacePrefix +
                                ":perfilFinanceiroIndicesFinanceiroIntegrado", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "perfilFinanceiroIndicesFinanceiroIntegrado", xmlWriter);
            }
        }

        if (localDesCategoriaIndiceTracker) {
            namespace = "";
            writeStartElement(null, namespace, "desCategoriaIndice",
                    xmlWriter);

            if (localDesCategoriaIndice == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "desCategoriaIndice cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDesCategoriaIndice);
            }

            xmlWriter.writeEndElement();
        }

        if (localFormatoDoIndiceTracker) {
            namespace = "";
            writeStartElement(null, namespace, "formatoDoIndice", xmlWriter);

            if (localFormatoDoIndice == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "formatoDoIndice cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localFormatoDoIndice);
            }

            xmlWriter.writeEndElement();
        }

        if (localIndiceDoBalancoTracker) {
            namespace = "";
            writeStartElement(null, namespace, "indiceDoBalanco", xmlWriter);

            if (localIndiceDoBalanco == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "indiceDoBalanco cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localIndiceDoBalanco);
            }

            xmlWriter.writeEndElement();
        }

        if (localIndiceDoBalancoPadraoTracker) {
            namespace = "";
            writeStartElement(null, namespace, "indiceDoBalancoPadrao",
                    xmlWriter);

            if (localIndiceDoBalancoPadrao == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "indiceDoBalancoPadrao cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localIndiceDoBalancoPadrao);
            }

            xmlWriter.writeEndElement();
        }

        if (localQtdDecimalTracker) {
            namespace = "";
            writeStartElement(null, namespace, "qtdDecimal", xmlWriter);

            if (localQtdDecimal == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                        "qtdDecimal cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localQtdDecimal));
            }

            xmlWriter.writeEndElement();
        }

        if (localQtdInteiroTracker) {
            namespace = "";
            writeStartElement(null, namespace, "qtdInteiro", xmlWriter);

            if (localQtdInteiro == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                        "qtdInteiro cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localQtdInteiro));
            }

            xmlWriter.writeEndElement();
        }

        if (localSinalDoIndiceBalancoTracker) {
            namespace = "";
            writeStartElement(null, namespace, "sinalDoIndiceBalanco",
                    xmlWriter);

            if (localSinalDoIndiceBalanco == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "sinalDoIndiceBalanco cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSinalDoIndiceBalanco);
            }

            xmlWriter.writeEndElement();
        }

        if (localSinalDoIndiceBalancoPadraoTracker) {
            namespace = "";
            writeStartElement(null, namespace,
                    "sinalDoIndiceBalancoPadrao", xmlWriter);

            if (localSinalDoIndiceBalancoPadrao == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "sinalDoIndiceBalancoPadrao cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSinalDoIndiceBalancoPadrao);
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
        public static PerfilFinanceiroIndicesFinanceiroIntegrado parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            PerfilFinanceiroIndicesFinanceiroIntegrado object = new PerfilFinanceiroIndicesFinanceiroIntegrado();

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

                        if (!"perfilFinanceiroIndicesFinanceiroIntegrado".equals(
                                type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (PerfilFinanceiroIndicesFinanceiroIntegrado) ExtensionMapper.getTypeObject(nsUri,
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
                        new javax.xml.namespace.QName("",
                                "desCategoriaIndice").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "desCategoriaIndice").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "desCategoriaIndice" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDesCategoriaIndice(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "formatoDoIndice").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "formatoDoIndice").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "formatoDoIndice" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFormatoDoIndice(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "indiceDoBalanco").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "indiceDoBalanco").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "indiceDoBalanco" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIndiceDoBalanco(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "indiceDoBalancoPadrao").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "indiceDoBalancoPadrao").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "indiceDoBalancoPadrao" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIndiceDoBalancoPadrao(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "qtdDecimal").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "qtdDecimal").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "qtdDecimal" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setQtdDecimal(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setQtdDecimal(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "qtdInteiro").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "qtdInteiro").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "qtdInteiro" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setQtdInteiro(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setQtdInteiro(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "sinalDoIndiceBalanco").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "sinalDoIndiceBalanco").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sinalDoIndiceBalanco" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSinalDoIndiceBalanco(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "sinalDoIndiceBalancoPadrao").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "sinalDoIndiceBalancoPadrao").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sinalDoIndiceBalancoPadrao" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSinalDoIndiceBalancoPadrao(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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

