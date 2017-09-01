package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:20
 */
public class ResumoInsumo implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Resumo-Insumo
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for QuantidadeTotal
     * This was an Attribute!
     */
    protected int localQuantidadeTotal;

    /**
     * field for MesanoPrimeiraOcorrencia
     * This was an Attribute!
     */
    protected java.lang.String localMesanoPrimeiraOcorrencia;

    /**
     * field for MesanoUltimaOcorrencia
     * This was an Attribute!
     */
    protected java.lang.String localMesanoUltimaOcorrencia;

    /**
     * field for DataPrimeiraOcorrencia
     * This was an Attribute!
     */
    protected java.util.Calendar localDataPrimeiraOcorrencia;

    /**
     * field for DataUltimaOcorrencia
     * This was an Attribute!
     */
    protected java.util.Calendar localDataUltimaOcorrencia;

    /**
     * field for ValorTotal
     * This was an Attribute!
     */
    protected java.math.BigDecimal localValorTotal;

    /**
     * field for ValorUltimaOcorrencia
     * This was an Attribute!
     */
    protected java.math.BigDecimal localValorUltimaOcorrencia;

    /**
     * Auto generated getter method
     * @return int
     */
    public int getQuantidadeTotal() {
        return localQuantidadeTotal;
    }

    /**
     * Auto generated setter method
     * @param param QuantidadeTotal
     */
    public void setQuantidadeTotal(int param) {
        this.localQuantidadeTotal = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMesanoPrimeiraOcorrencia() {
        return localMesanoPrimeiraOcorrencia;
    }

    /**
     * Auto generated setter method
     * @param param MesanoPrimeiraOcorrencia
     */
    public void setMesanoPrimeiraOcorrencia(java.lang.String param) {
        this.localMesanoPrimeiraOcorrencia = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMesanoUltimaOcorrencia() {
        return localMesanoUltimaOcorrencia;
    }

    /**
     * Auto generated setter method
     * @param param MesanoUltimaOcorrencia
     */
    public void setMesanoUltimaOcorrencia(java.lang.String param) {
        this.localMesanoUltimaOcorrencia = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataPrimeiraOcorrencia() {
        return localDataPrimeiraOcorrencia;
    }

    /**
     * Auto generated setter method
     * @param param DataPrimeiraOcorrencia
     */
    public void setDataPrimeiraOcorrencia(java.util.Calendar param) {
        this.localDataPrimeiraOcorrencia = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataUltimaOcorrencia() {
        return localDataUltimaOcorrencia;
    }

    /**
     * Auto generated setter method
     * @param param DataUltimaOcorrencia
     */
    public void setDataUltimaOcorrencia(java.util.Calendar param) {
        this.localDataUltimaOcorrencia = param;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getValorTotal() {
        return localValorTotal;
    }

    /**
     * Auto generated setter method
     * @param param ValorTotal
     */
    public void setValorTotal(java.math.BigDecimal param) {
        this.localValorTotal = param;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getValorUltimaOcorrencia() {
        return localValorUltimaOcorrencia;
    }

    /**
     * Auto generated setter method
     * @param param ValorUltimaOcorrencia
     */
    public void setValorUltimaOcorrencia(java.math.BigDecimal param) {
        this.localValorUltimaOcorrencia = param;
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
                        namespacePrefix + ":Resumo-Insumo", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Resumo-Insumo", xmlWriter);
            }
        }

        if (localQuantidadeTotal != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "quantidade-total",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localQuantidadeTotal), xmlWriter);
        }

        if (localMesanoPrimeiraOcorrencia != null) {
            writeAttribute("", "mesano-primeira-ocorrencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localMesanoPrimeiraOcorrencia), xmlWriter);
        }

        if (localMesanoUltimaOcorrencia != null) {
            writeAttribute("", "mesano-ultima-ocorrencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localMesanoUltimaOcorrencia), xmlWriter);
        }

        if (localDataPrimeiraOcorrencia != null) {
            writeAttribute("", "data-primeira-ocorrencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataPrimeiraOcorrencia), xmlWriter);
        }

        if (localDataUltimaOcorrencia != null) {
            writeAttribute("", "data-ultima-ocorrencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataUltimaOcorrencia), xmlWriter);
        }

        if (localValorTotal != null) {
            writeAttribute("", "valor-total",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localValorTotal), xmlWriter);
        }

        if (localValorUltimaOcorrencia != null) {
            writeAttribute("", "valor-ultima-ocorrencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localValorUltimaOcorrencia), xmlWriter);
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
        public static ResumoInsumo parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            ResumoInsumo object = new ResumoInsumo();

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

                        if (!"Resumo-Insumo".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (ResumoInsumo) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "quantidade-total"
                java.lang.String tempAttribQuantidadeTotal = reader.getAttributeValue(null,
                        "quantidade-total");

                if (tempAttribQuantidadeTotal != null) {
                    java.lang.String content = tempAttribQuantidadeTotal;

                    object.setQuantidadeTotal(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribQuantidadeTotal));
                } else {
                    object.setQuantidadeTotal(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("quantidade-total");

                // handle attribute "mesano-primeira-ocorrencia"
                java.lang.String tempAttribMesanoPrimeiraOcorrencia = reader.getAttributeValue(null,
                        "mesano-primeira-ocorrencia");

                if (tempAttribMesanoPrimeiraOcorrencia != null) {
                    java.lang.String content = tempAttribMesanoPrimeiraOcorrencia;

                    object.setMesanoPrimeiraOcorrencia(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMesanoPrimeiraOcorrencia));
                } else {
                }

                handledAttributes.add("mesano-primeira-ocorrencia");

                // handle attribute "mesano-ultima-ocorrencia"
                java.lang.String tempAttribMesanoUltimaOcorrencia = reader.getAttributeValue(null,
                        "mesano-ultima-ocorrencia");

                if (tempAttribMesanoUltimaOcorrencia != null) {
                    java.lang.String content = tempAttribMesanoUltimaOcorrencia;

                    object.setMesanoUltimaOcorrencia(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMesanoUltimaOcorrencia));
                } else {
                }

                handledAttributes.add("mesano-ultima-ocorrencia");

                // handle attribute "data-primeira-ocorrencia"
                java.lang.String tempAttribDataPrimeiraOcorrencia = reader.getAttributeValue(null,
                        "data-primeira-ocorrencia");

                if (tempAttribDataPrimeiraOcorrencia != null) {
                    java.lang.String content = tempAttribDataPrimeiraOcorrencia;

                    object.setDataPrimeiraOcorrencia(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataPrimeiraOcorrencia));
                } else {
                }

                handledAttributes.add("data-primeira-ocorrencia");

                // handle attribute "data-ultima-ocorrencia"
                java.lang.String tempAttribDataUltimaOcorrencia = reader.getAttributeValue(null,
                        "data-ultima-ocorrencia");

                if (tempAttribDataUltimaOcorrencia != null) {
                    java.lang.String content = tempAttribDataUltimaOcorrencia;

                    object.setDataUltimaOcorrencia(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataUltimaOcorrencia));
                } else {
                }

                handledAttributes.add("data-ultima-ocorrencia");

                // handle attribute "valor-total"
                java.lang.String tempAttribValorTotal = reader.getAttributeValue(null,
                        "valor-total");

                if (tempAttribValorTotal != null) {
                    java.lang.String content = tempAttribValorTotal;

                    object.setValorTotal(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribValorTotal));
                } else {
                }

                handledAttributes.add("valor-total");

                // handle attribute "valor-ultima-ocorrencia"
                java.lang.String tempAttribValorUltimaOcorrencia = reader.getAttributeValue(null,
                        "valor-ultima-ocorrencia");

                if (tempAttribValorUltimaOcorrencia != null) {
                    java.lang.String content = tempAttribValorUltimaOcorrencia;

                    object.setValorUltimaOcorrencia(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribValorUltimaOcorrencia));
                } else {
                }

                handledAttributes.add("valor-ultima-ocorrencia");

                reader.next();

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

