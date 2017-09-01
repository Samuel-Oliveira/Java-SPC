package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:02
 */
public class FiltroConsultaScore implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Filtro-Consulta-Score
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for NumeroProtocolo
     */
    protected long localNumeroProtocolo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumeroProtocoloTracker = false;

    /**
     * field for NumeroDocumento
     */
    protected java.lang.String localNumeroDocumento;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumeroDocumentoTracker = false;

    /**
     * field for CodigoProdutoPrincipal
     */
    protected long localCodigoProdutoPrincipal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCodigoProdutoPrincipalTracker = false;

    /**
     * field for TipoPessoa
     */
    protected java.lang.String localTipoPessoa;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTipoPessoaTracker = false;

    /**
     * field for HorizonteScore
     * This was an Array!
     */
    protected long[] localHorizonteScore;

    public boolean isNumeroProtocoloSpecified() {
        return localNumeroProtocoloTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getNumeroProtocolo() {
        return localNumeroProtocolo;
    }

    /**
     * Auto generated setter method
     * @param param NumeroProtocolo
     */
    public void setNumeroProtocolo(long param) {
        // setting primitive attribute tracker to true
        localNumeroProtocoloTracker = param != java.lang.Long.MIN_VALUE;

        this.localNumeroProtocolo = param;
    }

    public boolean isNumeroDocumentoSpecified() {
        return localNumeroDocumentoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumeroDocumento() {
        return localNumeroDocumento;
    }

    /**
     * Auto generated setter method
     * @param param NumeroDocumento
     */
    public void setNumeroDocumento(java.lang.String param) {
        localNumeroDocumentoTracker = param != null;

        this.localNumeroDocumento = param;
    }

    public boolean isCodigoProdutoPrincipalSpecified() {
        return localCodigoProdutoPrincipalTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getCodigoProdutoPrincipal() {
        return localCodigoProdutoPrincipal;
    }

    /**
     * Auto generated setter method
     * @param param CodigoProdutoPrincipal
     */
    public void setCodigoProdutoPrincipal(long param) {
        // setting primitive attribute tracker to true
        localCodigoProdutoPrincipalTracker = param != java.lang.Long.MIN_VALUE;

        this.localCodigoProdutoPrincipal = param;
    }

    public boolean isTipoPessoaSpecified() {
        return localTipoPessoaTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTipoPessoa() {
        return localTipoPessoa;
    }

    /**
     * Auto generated setter method
     * @param param TipoPessoa
     */
    public void setTipoPessoa(java.lang.String param) {
        localTipoPessoaTracker = param != null;

        this.localTipoPessoa = param;
    }

    /**
     * Auto generated getter method
     * @return long[]
     */
    public long[] getHorizonteScore() {
        return localHorizonteScore;
    }

    /**
     * validate the array for HorizonteScore
     */
    protected void validateHorizonteScore(long[] param) {
        if ((param != null) && (param.length < 1)) {
            throw new java.lang.RuntimeException(
                    "Input values do not follow defined XSD restrictions");
        }
    }

    /**
     * Auto generated setter method
     * @param param HorizonteScore
     */
    public void setHorizonteScore(long[] param) {
        validateHorizonteScore(param);

        this.localHorizonteScore = param;
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
                        namespacePrefix + ":Filtro-Consulta-Score", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Filtro-Consulta-Score", xmlWriter);
            }
        }

        if (localNumeroProtocoloTracker) {
            namespace = "";
            writeStartElement(null, namespace, "numero-protocolo", xmlWriter);

            if (localNumeroProtocolo == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                        "numero-protocolo cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNumeroProtocolo));
            }

            xmlWriter.writeEndElement();
        }

        if (localNumeroDocumentoTracker) {
            namespace = "";
            writeStartElement(null, namespace, "numero-documento", xmlWriter);

            if (localNumeroDocumento == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "numero-documento cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNumeroDocumento);
            }

            xmlWriter.writeEndElement();
        }

        if (localCodigoProdutoPrincipalTracker) {
            namespace = "";
            writeStartElement(null, namespace, "codigo-produto-principal",
                    xmlWriter);

            if (localCodigoProdutoPrincipal == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                        "codigo-produto-principal cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localCodigoProdutoPrincipal));
            }

            xmlWriter.writeEndElement();
        }

        if (localTipoPessoaTracker) {
            namespace = "";
            writeStartElement(null, namespace, "tipo-pessoa", xmlWriter);

            if (localTipoPessoa == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "tipo-pessoa cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTipoPessoa);
            }

            xmlWriter.writeEndElement();
        }

        if (localHorizonteScore != null) {
            namespace = "";

            for (int i = 0; i < localHorizonteScore.length; i++) {
                if (localHorizonteScore[i] != java.lang.Long.MIN_VALUE) {
                    writeStartElement(null, namespace, "horizonte-score",
                            xmlWriter);

                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localHorizonteScore[i]));
                    xmlWriter.writeEndElement();
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                            "horizonte-score cannot be null!!");
                }
            }
        } else {
            throw new org.apache.axis2.databinding.ADBException(
                    "horizonte-score cannot be null!!");
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
        public static FiltroConsultaScore parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            FiltroConsultaScore object = new FiltroConsultaScore();

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

                        if (!"Filtro-Consulta-Score".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (FiltroConsultaScore) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list5 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "numero-protocolo").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "numero-protocolo").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "numero-protocolo" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumeroProtocolo(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setNumeroProtocolo(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "numero-documento").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "numero-documento").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "numero-documento" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumeroDocumento(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "codigo-produto-principal").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "codigo-produto-principal").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "codigo-produto-principal" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCodigoProdutoPrincipal(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setCodigoProdutoPrincipal(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "tipo-pessoa").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "tipo-pessoa").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "tipo-pessoa" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTipoPessoa(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "horizonte-score").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "horizonte-score").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list5.add(reader.getElementText());

                    //loop until we find a start element that is not part of this array
                    boolean loopDone5 = false;

                    while (!loopDone5) {
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
                            loopDone5 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "horizonte-score").equals(
                                    reader.getName())) {
                                list5.add(reader.getElementText());
                            } else {
                                loopDone5 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setHorizonteScore((long[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            long.class, list5));
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
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

