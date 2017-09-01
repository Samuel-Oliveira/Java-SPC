package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:25
 */
public class InsumoConsultaRealizadaCheque implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Consulta-Realizada-Cheque
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for ReferenciaComercial
     * This was an Array!
     */
    protected ReferenciaComercial[] localReferenciaComercial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReferenciaComercialTracker = false;

    /**
     * field for DataEmissaoPrimeiroCheque
     * This was an Attribute!
     */
    protected java.util.Calendar localDataEmissaoPrimeiroCheque;

    /**
     * field for DataEmissaoUltimoCheque
     * This was an Attribute!
     */
    protected java.util.Calendar localDataEmissaoUltimoCheque;

    /**
     * field for TotalChequesAPrazoEmitidos
     * This was an Attribute!
     */
    protected int localTotalChequesAPrazoEmitidos;

    /**
     * field for TotalChequesAPrazoEntre31E60Dias
     * This was an Attribute!
     */
    protected int localTotalChequesAPrazoEntre31E60Dias;

    /**
     * field for TotalChequesAPrazoEntre61E90Dias
     * This was an Attribute!
     */
    protected int localTotalChequesAPrazoEntre61E90Dias;

    /**
     * field for TotalChequesAPrazoUltimos30Dias
     * This was an Attribute!
     */
    protected int localTotalChequesAPrazoUltimos30Dias;

    /**
     * field for TotalChequesAVista
     * This was an Attribute!
     */
    protected int localTotalChequesAVista;

    public boolean isReferenciaComercialSpecified() {
        return localReferenciaComercialTracker;
    }

    /**
     * Auto generated getter method
     * @return ReferenciaComercial[]
     */
    public ReferenciaComercial[] getReferenciaComercial() {
        return localReferenciaComercial;
    }

    /**
     * validate the array for ReferenciaComercial
     */
    protected void validateReferenciaComercial(ReferenciaComercial[] param) {
    }

    /**
     * Auto generated setter method
     * @param param ReferenciaComercial
     */
    public void setReferenciaComercial(ReferenciaComercial[] param) {
        validateReferenciaComercial(param);

        localReferenciaComercialTracker = param != null;

        this.localReferenciaComercial = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param ReferenciaComercial
     */
    public void addReferenciaComercial(ReferenciaComercial param) {
        if (localReferenciaComercial == null) {
            localReferenciaComercial = new ReferenciaComercial[] {  };
        }

        //update the setting tracker
        localReferenciaComercialTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localReferenciaComercial);
        list.add(param);
        this.localReferenciaComercial = (ReferenciaComercial[]) list.toArray(new ReferenciaComercial[list.size()]);
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataEmissaoPrimeiroCheque() {
        return localDataEmissaoPrimeiroCheque;
    }

    /**
     * Auto generated setter method
     * @param param DataEmissaoPrimeiroCheque
     */
    public void setDataEmissaoPrimeiroCheque(java.util.Calendar param) {
        this.localDataEmissaoPrimeiroCheque = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataEmissaoUltimoCheque() {
        return localDataEmissaoUltimoCheque;
    }

    /**
     * Auto generated setter method
     * @param param DataEmissaoUltimoCheque
     */
    public void setDataEmissaoUltimoCheque(java.util.Calendar param) {
        this.localDataEmissaoUltimoCheque = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTotalChequesAPrazoEmitidos() {
        return localTotalChequesAPrazoEmitidos;
    }

    /**
     * Auto generated setter method
     * @param param TotalChequesAPrazoEmitidos
     */
    public void setTotalChequesAPrazoEmitidos(int param) {
        this.localTotalChequesAPrazoEmitidos = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTotalChequesAPrazoEntre31E60Dias() {
        return localTotalChequesAPrazoEntre31E60Dias;
    }

    /**
     * Auto generated setter method
     * @param param TotalChequesAPrazoEntre31E60Dias
     */
    public void setTotalChequesAPrazoEntre31E60Dias(int param) {
        this.localTotalChequesAPrazoEntre31E60Dias = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTotalChequesAPrazoEntre61E90Dias() {
        return localTotalChequesAPrazoEntre61E90Dias;
    }

    /**
     * Auto generated setter method
     * @param param TotalChequesAPrazoEntre61E90Dias
     */
    public void setTotalChequesAPrazoEntre61E90Dias(int param) {
        this.localTotalChequesAPrazoEntre61E90Dias = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTotalChequesAPrazoUltimos30Dias() {
        return localTotalChequesAPrazoUltimos30Dias;
    }

    /**
     * Auto generated setter method
     * @param param TotalChequesAPrazoUltimos30Dias
     */
    public void setTotalChequesAPrazoUltimos30Dias(int param) {
        this.localTotalChequesAPrazoUltimos30Dias = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTotalChequesAVista() {
        return localTotalChequesAVista;
    }

    /**
     * Auto generated setter method
     * @param param TotalChequesAVista
     */
    public void setTotalChequesAVista(int param) {
        this.localTotalChequesAVista = param;
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
                        namespacePrefix + ":Insumo-Consulta-Realizada-Cheque",
                        xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Consulta-Realizada-Cheque", xmlWriter);
            }
        }

        if (localDataEmissaoPrimeiroCheque != null) {
            writeAttribute("", "data-emissao-primeiro-cheque",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataEmissaoPrimeiroCheque), xmlWriter);
        }

        if (localDataEmissaoUltimoCheque != null) {
            writeAttribute("", "data-emissao-ultimo-cheque",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataEmissaoUltimoCheque), xmlWriter);
        }

        if (localTotalChequesAPrazoEmitidos != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "total-cheques-a-prazo-emitidos",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTotalChequesAPrazoEmitidos), xmlWriter);
        }

        if (localTotalChequesAPrazoEntre31E60Dias != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "total-cheques-a-prazo-entre-31-e-60dias",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTotalChequesAPrazoEntre31E60Dias), xmlWriter);
        }

        if (localTotalChequesAPrazoEntre61E90Dias != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "total-cheques-a-prazo-entre-61-e-90dias",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTotalChequesAPrazoEntre61E90Dias), xmlWriter);
        }

        if (localTotalChequesAPrazoUltimos30Dias != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "total-cheques-a-prazo-ultimos-30dias",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTotalChequesAPrazoUltimos30Dias), xmlWriter);
        }

        if (localTotalChequesAVista != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "total-cheques-a-vista",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTotalChequesAVista), xmlWriter);
        }

        if (localReferenciaComercialTracker) {
            if (localReferenciaComercial != null) {
                for (int i = 0; i < localReferenciaComercial.length; i++) {
                    if (localReferenciaComercial[i] != null) {
                        localReferenciaComercial[i].serialize(new javax.xml.namespace.QName(
                                "", "referencia-comercial"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "referencia-comercial cannot be null!!");
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
        public static InsumoConsultaRealizadaCheque parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoConsultaRealizadaCheque object = new InsumoConsultaRealizadaCheque();

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

                        if (!"Insumo-Consulta-Realizada-Cheque".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoConsultaRealizadaCheque) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "data-emissao-primeiro-cheque"
                java.lang.String tempAttribDataEmissaoPrimeiroCheque = reader.getAttributeValue(null,
                        "data-emissao-primeiro-cheque");

                if (tempAttribDataEmissaoPrimeiroCheque != null) {
                    java.lang.String content = tempAttribDataEmissaoPrimeiroCheque;

                    object.setDataEmissaoPrimeiroCheque(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataEmissaoPrimeiroCheque));
                } else {
                }

                handledAttributes.add("data-emissao-primeiro-cheque");

                // handle attribute "data-emissao-ultimo-cheque"
                java.lang.String tempAttribDataEmissaoUltimoCheque = reader.getAttributeValue(null,
                        "data-emissao-ultimo-cheque");

                if (tempAttribDataEmissaoUltimoCheque != null) {
                    java.lang.String content = tempAttribDataEmissaoUltimoCheque;

                    object.setDataEmissaoUltimoCheque(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataEmissaoUltimoCheque));
                } else {
                }

                handledAttributes.add("data-emissao-ultimo-cheque");

                // handle attribute "total-cheques-a-prazo-emitidos"
                java.lang.String tempAttribTotalChequesAPrazoEmitidos = reader.getAttributeValue(null,
                        "total-cheques-a-prazo-emitidos");

                if (tempAttribTotalChequesAPrazoEmitidos != null) {
                    java.lang.String content = tempAttribTotalChequesAPrazoEmitidos;

                    object.setTotalChequesAPrazoEmitidos(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribTotalChequesAPrazoEmitidos));
                } else {
                    object.setTotalChequesAPrazoEmitidos(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("total-cheques-a-prazo-emitidos");

                // handle attribute "total-cheques-a-prazo-entre-31-e-60dias"
                java.lang.String tempAttribTotalChequesAPrazoEntre31E60Dias = reader.getAttributeValue(null,
                        "total-cheques-a-prazo-entre-31-e-60dias");

                if (tempAttribTotalChequesAPrazoEntre31E60Dias != null) {
                    java.lang.String content = tempAttribTotalChequesAPrazoEntre31E60Dias;

                    object.setTotalChequesAPrazoEntre31E60Dias(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribTotalChequesAPrazoEntre31E60Dias));
                } else {
                    object.setTotalChequesAPrazoEntre31E60Dias(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add(
                        "total-cheques-a-prazo-entre-31-e-60dias");

                // handle attribute "total-cheques-a-prazo-entre-61-e-90dias"
                java.lang.String tempAttribTotalChequesAPrazoEntre61E90Dias = reader.getAttributeValue(null,
                        "total-cheques-a-prazo-entre-61-e-90dias");

                if (tempAttribTotalChequesAPrazoEntre61E90Dias != null) {
                    java.lang.String content = tempAttribTotalChequesAPrazoEntre61E90Dias;

                    object.setTotalChequesAPrazoEntre61E90Dias(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribTotalChequesAPrazoEntre61E90Dias));
                } else {
                    object.setTotalChequesAPrazoEntre61E90Dias(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add(
                        "total-cheques-a-prazo-entre-61-e-90dias");

                // handle attribute "total-cheques-a-prazo-ultimos-30dias"
                java.lang.String tempAttribTotalChequesAPrazoUltimos30Dias = reader.getAttributeValue(null,
                        "total-cheques-a-prazo-ultimos-30dias");

                if (tempAttribTotalChequesAPrazoUltimos30Dias != null) {
                    java.lang.String content = tempAttribTotalChequesAPrazoUltimos30Dias;

                    object.setTotalChequesAPrazoUltimos30Dias(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribTotalChequesAPrazoUltimos30Dias));
                } else {
                    object.setTotalChequesAPrazoUltimos30Dias(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add(
                        "total-cheques-a-prazo-ultimos-30dias");

                // handle attribute "total-cheques-a-vista"
                java.lang.String tempAttribTotalChequesAVista = reader.getAttributeValue(null,
                        "total-cheques-a-vista");

                if (tempAttribTotalChequesAVista != null) {
                    java.lang.String content = tempAttribTotalChequesAVista;

                    object.setTotalChequesAVista(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribTotalChequesAVista));
                } else {
                    object.setTotalChequesAVista(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("total-cheques-a-vista");

                reader.next();

                java.util.ArrayList list1 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "referencia-comercial").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "referencia-comercial").equals(reader.getName())) {
                    // Process the array and step past its final element's end.
                    list1.add(ReferenciaComercial.Factory.parse(reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone1 = false;

                    while (!loopDone1) {
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
                            loopDone1 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "referencia-comercial").equals(
                                    reader.getName())) {
                                list1.add(ReferenciaComercial.Factory.parse(
                                        reader));
                            } else {
                                loopDone1 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setReferenciaComercial((ReferenciaComercial[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            ReferenciaComercial.class, list1));
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

