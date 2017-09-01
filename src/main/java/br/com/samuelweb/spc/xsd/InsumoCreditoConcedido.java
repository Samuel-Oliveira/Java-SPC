package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:11
 */
public class InsumoCreditoConcedido implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Credito-Concedido
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Numero_contrato
     */
    protected java.lang.String localNumero_contrato;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumero_contratoTracker = false;

    /**
     * field for AnoVencimento
     * This was an Attribute!
     */
    protected int localAnoVencimento;

    /**
     * field for MesVencimento
     * This was an Attribute!
     */
    protected int localMesVencimento;

    /**
     * field for QuantidadeCredito
     * This was an Attribute!
     */
    protected int localQuantidadeCredito;

    /**
     * field for Valor
     * This was an Attribute!
     */
    protected java.math.BigDecimal localValor;

    public boolean isNumero_contratoSpecified() {
        return localNumero_contratoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumero_contrato() {
        return localNumero_contrato;
    }

    /**
     * Auto generated setter method
     * @param param Numero_contrato
     */
    public void setNumero_contrato(java.lang.String param) {
        localNumero_contratoTracker = param != null;

        this.localNumero_contrato = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getAnoVencimento() {
        return localAnoVencimento;
    }

    /**
     * Auto generated setter method
     * @param param AnoVencimento
     */
    public void setAnoVencimento(int param) {
        this.localAnoVencimento = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getMesVencimento() {
        return localMesVencimento;
    }

    /**
     * Auto generated setter method
     * @param param MesVencimento
     */
    public void setMesVencimento(int param) {
        this.localMesVencimento = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getQuantidadeCredito() {
        return localQuantidadeCredito;
    }

    /**
     * Auto generated setter method
     * @param param QuantidadeCredito
     */
    public void setQuantidadeCredito(int param) {
        this.localQuantidadeCredito = param;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getValor() {
        return localValor;
    }

    /**
     * Auto generated setter method
     * @param param Valor
     */
    public void setValor(java.math.BigDecimal param) {
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
                        namespacePrefix + ":Insumo-Credito-Concedido", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Credito-Concedido", xmlWriter);
            }
        }

        if (localAnoVencimento != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "ano-vencimento",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localAnoVencimento), xmlWriter);
        }

        if (localMesVencimento != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "mes-vencimento",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localMesVencimento), xmlWriter);
        }

        if (localQuantidadeCredito != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "quantidade-credito",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localQuantidadeCredito), xmlWriter);
        }

        if (localValor != null) {
            writeAttribute("", "valor",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localValor), xmlWriter);
        }

        if (localNumero_contratoTracker) {
            namespace = "";
            writeStartElement(null, namespace, "numero_contrato", xmlWriter);

            if (localNumero_contrato == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "numero_contrato cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNumero_contrato);
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
        public static InsumoCreditoConcedido parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoCreditoConcedido object = new InsumoCreditoConcedido();

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

                        if (!"Insumo-Credito-Concedido".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoCreditoConcedido) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "ano-vencimento"
                java.lang.String tempAttribAnoVencimento = reader.getAttributeValue(null,
                        "ano-vencimento");

                if (tempAttribAnoVencimento != null) {
                    java.lang.String content = tempAttribAnoVencimento;

                    object.setAnoVencimento(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribAnoVencimento));
                } else {
                    object.setAnoVencimento(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("ano-vencimento");

                // handle attribute "mes-vencimento"
                java.lang.String tempAttribMesVencimento = reader.getAttributeValue(null,
                        "mes-vencimento");

                if (tempAttribMesVencimento != null) {
                    java.lang.String content = tempAttribMesVencimento;

                    object.setMesVencimento(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribMesVencimento));
                } else {
                    object.setMesVencimento(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("mes-vencimento");

                // handle attribute "quantidade-credito"
                java.lang.String tempAttribQuantidadeCredito = reader.getAttributeValue(null,
                        "quantidade-credito");

                if (tempAttribQuantidadeCredito != null) {
                    java.lang.String content = tempAttribQuantidadeCredito;

                    object.setQuantidadeCredito(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribQuantidadeCredito));
                } else {
                    object.setQuantidadeCredito(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("quantidade-credito");

                // handle attribute "valor"
                java.lang.String tempAttribValor = reader.getAttributeValue(null,
                        "valor");

                if (tempAttribValor != null) {
                    java.lang.String content = tempAttribValor;

                    object.setValor(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribValor));
                } else {
                }

                handledAttributes.add("valor");

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "numero_contrato").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "numero_contrato").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "numero_contrato" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumero_contrato(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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

