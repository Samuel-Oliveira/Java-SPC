package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:06
 */
public class InsumoCapitalSocial implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Capital-Social
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Nacionalidade
     * This was an Attribute!
     */
    protected java.lang.String localNacionalidade;

    /**
     * field for Natureza
     * This was an Attribute!
     */
    protected java.lang.String localNatureza;

    /**
     * field for Origem
     * This was an Attribute!
     */
    protected java.lang.String localOrigem;

    /**
     * field for DataUltimaAtualizacao
     * This was an Attribute!
     */
    protected java.util.Calendar localDataUltimaAtualizacao;

    /**
     * field for ValorCapitalAutorizado
     * This was an Attribute!
     */
    protected java.math.BigDecimal localValorCapitalAutorizado;

    /**
     * field for ValorCapitalRealizado
     * This was an Attribute!
     */
    protected java.math.BigDecimal localValorCapitalRealizado;

    /**
     * field for ValorCapitalSocial
     * This was an Attribute!
     */
    protected java.math.BigDecimal localValorCapitalSocial;

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNacionalidade() {
        return localNacionalidade;
    }

    /**
     * Auto generated setter method
     * @param param Nacionalidade
     */
    public void setNacionalidade(java.lang.String param) {
        this.localNacionalidade = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNatureza() {
        return localNatureza;
    }

    /**
     * Auto generated setter method
     * @param param Natureza
     */
    public void setNatureza(java.lang.String param) {
        this.localNatureza = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOrigem() {
        return localOrigem;
    }

    /**
     * Auto generated setter method
     * @param param Origem
     */
    public void setOrigem(java.lang.String param) {
        this.localOrigem = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataUltimaAtualizacao() {
        return localDataUltimaAtualizacao;
    }

    /**
     * Auto generated setter method
     * @param param DataUltimaAtualizacao
     */
    public void setDataUltimaAtualizacao(java.util.Calendar param) {
        this.localDataUltimaAtualizacao = param;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getValorCapitalAutorizado() {
        return localValorCapitalAutorizado;
    }

    /**
     * Auto generated setter method
     * @param param ValorCapitalAutorizado
     */
    public void setValorCapitalAutorizado(java.math.BigDecimal param) {
        this.localValorCapitalAutorizado = param;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getValorCapitalRealizado() {
        return localValorCapitalRealizado;
    }

    /**
     * Auto generated setter method
     * @param param ValorCapitalRealizado
     */
    public void setValorCapitalRealizado(java.math.BigDecimal param) {
        this.localValorCapitalRealizado = param;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getValorCapitalSocial() {
        return localValorCapitalSocial;
    }

    /**
     * Auto generated setter method
     * @param param ValorCapitalSocial
     */
    public void setValorCapitalSocial(java.math.BigDecimal param) {
        this.localValorCapitalSocial = param;
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
                        namespacePrefix + ":Insumo-Capital-Social", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Capital-Social", xmlWriter);
            }
        }

        if (localNacionalidade != null) {
            writeAttribute("", "nacionalidade",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNacionalidade), xmlWriter);
        }

        if (localNatureza != null) {
            writeAttribute("", "natureza",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNatureza), xmlWriter);
        }

        if (localOrigem != null) {
            writeAttribute("", "origem",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localOrigem), xmlWriter);
        }

        if (localDataUltimaAtualizacao != null) {
            writeAttribute("", "data-ultima-atualizacao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataUltimaAtualizacao), xmlWriter);
        }

        if (localValorCapitalAutorizado != null) {
            writeAttribute("", "valor-capital-autorizado",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localValorCapitalAutorizado), xmlWriter);
        }

        if (localValorCapitalRealizado != null) {
            writeAttribute("", "valor-capital-realizado",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localValorCapitalRealizado), xmlWriter);
        }

        if (localValorCapitalSocial != null) {
            writeAttribute("", "valor-capital-social",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localValorCapitalSocial), xmlWriter);
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
        public static InsumoCapitalSocial parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoCapitalSocial object = new InsumoCapitalSocial();

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

                        if (!"Insumo-Capital-Social".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoCapitalSocial) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "nacionalidade"
                java.lang.String tempAttribNacionalidade = reader.getAttributeValue(null,
                        "nacionalidade");

                if (tempAttribNacionalidade != null) {
                    java.lang.String content = tempAttribNacionalidade;

                    object.setNacionalidade(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNacionalidade));
                } else {
                }

                handledAttributes.add("nacionalidade");

                // handle attribute "natureza"
                java.lang.String tempAttribNatureza = reader.getAttributeValue(null,
                        "natureza");

                if (tempAttribNatureza != null) {
                    java.lang.String content = tempAttribNatureza;

                    object.setNatureza(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNatureza));
                } else {
                }

                handledAttributes.add("natureza");

                // handle attribute "origem"
                java.lang.String tempAttribOrigem = reader.getAttributeValue(null,
                        "origem");

                if (tempAttribOrigem != null) {
                    java.lang.String content = tempAttribOrigem;

                    object.setOrigem(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribOrigem));
                } else {
                }

                handledAttributes.add("origem");

                // handle attribute "data-ultima-atualizacao"
                java.lang.String tempAttribDataUltimaAtualizacao = reader.getAttributeValue(null,
                        "data-ultima-atualizacao");

                if (tempAttribDataUltimaAtualizacao != null) {
                    java.lang.String content = tempAttribDataUltimaAtualizacao;

                    object.setDataUltimaAtualizacao(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataUltimaAtualizacao));
                } else {
                }

                handledAttributes.add("data-ultima-atualizacao");

                // handle attribute "valor-capital-autorizado"
                java.lang.String tempAttribValorCapitalAutorizado = reader.getAttributeValue(null,
                        "valor-capital-autorizado");

                if (tempAttribValorCapitalAutorizado != null) {
                    java.lang.String content = tempAttribValorCapitalAutorizado;

                    object.setValorCapitalAutorizado(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribValorCapitalAutorizado));
                } else {
                }

                handledAttributes.add("valor-capital-autorizado");

                // handle attribute "valor-capital-realizado"
                java.lang.String tempAttribValorCapitalRealizado = reader.getAttributeValue(null,
                        "valor-capital-realizado");

                if (tempAttribValorCapitalRealizado != null) {
                    java.lang.String content = tempAttribValorCapitalRealizado;

                    object.setValorCapitalRealizado(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribValorCapitalRealizado));
                } else {
                }

                handledAttributes.add("valor-capital-realizado");

                // handle attribute "valor-capital-social"
                java.lang.String tempAttribValorCapitalSocial = reader.getAttributeValue(null,
                        "valor-capital-social");

                if (tempAttribValorCapitalSocial != null) {
                    java.lang.String content = tempAttribValorCapitalSocial;

                    object.setValorCapitalSocial(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribValorCapitalSocial));
                } else {
                }

                handledAttributes.add("valor-capital-social");

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

