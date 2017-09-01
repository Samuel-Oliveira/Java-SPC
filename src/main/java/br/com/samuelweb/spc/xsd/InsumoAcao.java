package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:34
 */
public class InsumoAcao implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Acao
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Vara
     */
    protected Vara localVara;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localVaraTracker = false;

    /**
     * field for TipoAcao
     */
    protected TipoAcao localTipoAcao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTipoAcaoTracker = false;

    /**
     * field for DataAcao
     * This was an Attribute!
     */
    protected java.util.Calendar localDataAcao;

    /**
     * field for DataInclusao
     * This was an Attribute!
     */
    protected java.util.Calendar localDataInclusao;

    /**
     * field for Distrito
     * This was an Attribute!
     */
    protected java.lang.String localDistrito;

    /**
     * field for NomeAutor
     * This was an Attribute!
     */
    protected java.lang.String localNomeAutor;

    /**
     * field for ValorAcao
     * This was an Attribute!
     */
    protected java.math.BigDecimal localValorAcao;

    public boolean isVaraSpecified() {
        return localVaraTracker;
    }

    /**
     * Auto generated getter method
     * @return Vara
     */
    public Vara getVara() {
        return localVara;
    }

    /**
     * Auto generated setter method
     * @param param Vara
     */
    public void setVara(Vara param) {
        localVaraTracker = param != null;

        this.localVara = param;
    }

    public boolean isTipoAcaoSpecified() {
        return localTipoAcaoTracker;
    }

    /**
     * Auto generated getter method
     * @return TipoAcao
     */
    public TipoAcao getTipoAcao() {
        return localTipoAcao;
    }

    /**
     * Auto generated setter method
     * @param param TipoAcao
     */
    public void setTipoAcao(TipoAcao param) {
        localTipoAcaoTracker = param != null;

        this.localTipoAcao = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataAcao() {
        return localDataAcao;
    }

    /**
     * Auto generated setter method
     * @param param DataAcao
     */
    public void setDataAcao(java.util.Calendar param) {
        this.localDataAcao = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataInclusao() {
        return localDataInclusao;
    }

    /**
     * Auto generated setter method
     * @param param DataInclusao
     */
    public void setDataInclusao(java.util.Calendar param) {
        this.localDataInclusao = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDistrito() {
        return localDistrito;
    }

    /**
     * Auto generated setter method
     * @param param Distrito
     */
    public void setDistrito(java.lang.String param) {
        this.localDistrito = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeAutor() {
        return localNomeAutor;
    }

    /**
     * Auto generated setter method
     * @param param NomeAutor
     */
    public void setNomeAutor(java.lang.String param) {
        this.localNomeAutor = param;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getValorAcao() {
        return localValorAcao;
    }

    /**
     * Auto generated setter method
     * @param param ValorAcao
     */
    public void setValorAcao(java.math.BigDecimal param) {
        this.localValorAcao = param;
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
                        namespacePrefix + ":Insumo-Acao", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Acao", xmlWriter);
            }
        }

        if (localDataAcao != null) {
            writeAttribute("", "data-acao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataAcao), xmlWriter);
        }

        if (localDataInclusao != null) {
            writeAttribute("", "data-inclusao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataInclusao), xmlWriter);
        }

        if (localDistrito != null) {
            writeAttribute("", "distrito",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDistrito), xmlWriter);
        }

        if (localNomeAutor != null) {
            writeAttribute("", "nome-autor",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNomeAutor), xmlWriter);
        }

        if (localValorAcao != null) {
            writeAttribute("", "valor-acao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localValorAcao), xmlWriter);
        }

        if (localVaraTracker) {
            if (localVara == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "vara cannot be null!!");
            }

            localVara.serialize(new javax.xml.namespace.QName("", "vara"),
                    xmlWriter);
        }

        if (localTipoAcaoTracker) {
            if (localTipoAcao == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "tipo-acao cannot be null!!");
            }

            localTipoAcao.serialize(new javax.xml.namespace.QName("",
                    "tipo-acao"), xmlWriter);
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
        public static InsumoAcao parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoAcao object = new InsumoAcao();

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

                        if (!"Insumo-Acao".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoAcao) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "data-acao"
                java.lang.String tempAttribDataAcao = reader.getAttributeValue(null,
                        "data-acao");

                if (tempAttribDataAcao != null) {
                    java.lang.String content = tempAttribDataAcao;

                    object.setDataAcao(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataAcao));
                } else {
                }

                handledAttributes.add("data-acao");

                // handle attribute "data-inclusao"
                java.lang.String tempAttribDataInclusao = reader.getAttributeValue(null,
                        "data-inclusao");

                if (tempAttribDataInclusao != null) {
                    java.lang.String content = tempAttribDataInclusao;

                    object.setDataInclusao(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataInclusao));
                } else {
                }

                handledAttributes.add("data-inclusao");

                // handle attribute "distrito"
                java.lang.String tempAttribDistrito = reader.getAttributeValue(null,
                        "distrito");

                if (tempAttribDistrito != null) {
                    java.lang.String content = tempAttribDistrito;

                    object.setDistrito(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDistrito));
                } else {
                }

                handledAttributes.add("distrito");

                // handle attribute "nome-autor"
                java.lang.String tempAttribNomeAutor = reader.getAttributeValue(null,
                        "nome-autor");

                if (tempAttribNomeAutor != null) {
                    java.lang.String content = tempAttribNomeAutor;

                    object.setNomeAutor(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNomeAutor));
                } else {
                }

                handledAttributes.add("nome-autor");

                // handle attribute "valor-acao"
                java.lang.String tempAttribValorAcao = reader.getAttributeValue(null,
                        "valor-acao");

                if (tempAttribValorAcao != null) {
                    java.lang.String content = tempAttribValorAcao;

                    object.setValorAcao(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribValorAcao));
                } else {
                }

                handledAttributes.add("valor-acao");

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "vara").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "vara").equals(
                                reader.getName())) {
                    object.setVara(Vara.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "tipo-acao").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "tipo-acao").equals(
                                reader.getName())) {
                    object.setTipoAcao(TipoAcao.Factory.parse(reader));

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

