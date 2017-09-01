package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:35
 */
public class InsumoProtesto implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Protesto
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Cartorio
     */
    protected Cartorio localCartorio;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCartorioTracker = false;

    /**
     * field for NaturezaAnotacao
     */
    protected NaturezaAnotacao localNaturezaAnotacao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNaturezaAnotacaoTracker = false;

    /**
     * field for Subjudice
     */
    protected Subjudice localSubjudice;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSubjudiceTracker = false;

    /**
     * field for Moeda
     */
    protected Moeda localMoeda;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMoedaTracker = false;

    /**
     * field for CartaAnuencia
     * This was an Attribute!
     */
    protected CartaAnuencia localCartaAnuencia;

    /**
     * field for DataCartaAnuencia
     * This was an Attribute!
     */
    protected java.util.Calendar localDataCartaAnuencia;

    /**
     * field for DataInclusao
     * This was an Attribute!
     */
    protected java.util.Calendar localDataInclusao;

    /**
     * field for DataProtesto
     * This was an Attribute!
     */
    protected java.util.Calendar localDataProtesto;

    /**
     * field for RequerenteCredor
     * This was an Attribute!
     */
    protected java.lang.String localRequerenteCredor;

    /**
     * field for NumeroProtesto
     * This was an Attribute!
     */
    protected java.lang.String localNumeroProtesto;

    /**
     * field for Valor
     * This was an Attribute!
     */
    protected java.math.BigDecimal localValor;

    public boolean isCartorioSpecified() {
        return localCartorioTracker;
    }

    /**
     * Auto generated getter method
     * @return Cartorio
     */
    public Cartorio getCartorio() {
        return localCartorio;
    }

    /**
     * Auto generated setter method
     * @param param Cartorio
     */
    public void setCartorio(Cartorio param) {
        localCartorioTracker = param != null;

        this.localCartorio = param;
    }

    public boolean isNaturezaAnotacaoSpecified() {
        return localNaturezaAnotacaoTracker;
    }

    /**
     * Auto generated getter method
     * @return NaturezaAnotacao
     */
    public NaturezaAnotacao getNaturezaAnotacao() {
        return localNaturezaAnotacao;
    }

    /**
     * Auto generated setter method
     * @param param NaturezaAnotacao
     */
    public void setNaturezaAnotacao(NaturezaAnotacao param) {
        localNaturezaAnotacaoTracker = param != null;

        this.localNaturezaAnotacao = param;
    }

    public boolean isSubjudiceSpecified() {
        return localSubjudiceTracker;
    }

    /**
     * Auto generated getter method
     * @return Subjudice
     */
    public Subjudice getSubjudice() {
        return localSubjudice;
    }

    /**
     * Auto generated setter method
     * @param param Subjudice
     */
    public void setSubjudice(Subjudice param) {
        localSubjudiceTracker = param != null;

        this.localSubjudice = param;
    }

    public boolean isMoedaSpecified() {
        return localMoedaTracker;
    }

    /**
     * Auto generated getter method
     * @return Moeda
     */
    public Moeda getMoeda() {
        return localMoeda;
    }

    /**
     * Auto generated setter method
     * @param param Moeda
     */
    public void setMoeda(Moeda param) {
        localMoedaTracker = param != null;

        this.localMoeda = param;
    }

    /**
     * Auto generated getter method
     * @return CartaAnuencia
     */
    public CartaAnuencia getCartaAnuencia() {
        return localCartaAnuencia;
    }

    /**
     * Auto generated setter method
     * @param param CartaAnuencia
     */
    public void setCartaAnuencia(CartaAnuencia param) {
        this.localCartaAnuencia = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataCartaAnuencia() {
        return localDataCartaAnuencia;
    }

    /**
     * Auto generated setter method
     * @param param DataCartaAnuencia
     */
    public void setDataCartaAnuencia(java.util.Calendar param) {
        this.localDataCartaAnuencia = param;
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
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataProtesto() {
        return localDataProtesto;
    }

    /**
     * Auto generated setter method
     * @param param DataProtesto
     */
    public void setDataProtesto(java.util.Calendar param) {
        this.localDataProtesto = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRequerenteCredor() {
        return localRequerenteCredor;
    }

    /**
     * Auto generated setter method
     * @param param RequerenteCredor
     */
    public void setRequerenteCredor(java.lang.String param) {
        this.localRequerenteCredor = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumeroProtesto() {
        return localNumeroProtesto;
    }

    /**
     * Auto generated setter method
     * @param param NumeroProtesto
     */
    public void setNumeroProtesto(java.lang.String param) {
        this.localNumeroProtesto = param;
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
                        namespacePrefix + ":Insumo-Protesto", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Protesto", xmlWriter);
            }
        }

        if (localCartaAnuencia != null) {
            writeAttribute("", "carta-anuencia",
                    localCartaAnuencia.toString(), xmlWriter);
        }

        if (localDataCartaAnuencia != null) {
            writeAttribute("", "data-carta-anuencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataCartaAnuencia), xmlWriter);
        }

        if (localDataInclusao != null) {
            writeAttribute("", "data-inclusao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataInclusao), xmlWriter);
        }

        if (localDataProtesto != null) {
            writeAttribute("", "data-protesto",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataProtesto), xmlWriter);
        }

        if (localRequerenteCredor != null) {
            writeAttribute("", "requerente-credor",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRequerenteCredor), xmlWriter);
        }

        if (localNumeroProtesto != null) {
            writeAttribute("", "numero-protesto",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNumeroProtesto), xmlWriter);
        }

        if (localValor != null) {
            writeAttribute("", "valor",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localValor), xmlWriter);
        }

        if (localCartorioTracker) {
            if (localCartorio == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cartorio cannot be null!!");
            }

            localCartorio.serialize(new javax.xml.namespace.QName("",
                    "cartorio"), xmlWriter);
        }

        if (localNaturezaAnotacaoTracker) {
            if (localNaturezaAnotacao == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "natureza-anotacao cannot be null!!");
            }

            localNaturezaAnotacao.serialize(new javax.xml.namespace.QName(
                    "", "natureza-anotacao"), xmlWriter);
        }

        if (localSubjudiceTracker) {
            if (localSubjudice == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "subjudice cannot be null!!");
            }

            localSubjudice.serialize(new javax.xml.namespace.QName("",
                    "subjudice"), xmlWriter);
        }

        if (localMoedaTracker) {
            if (localMoeda == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "moeda cannot be null!!");
            }

            localMoeda.serialize(new javax.xml.namespace.QName("", "moeda"),
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
        public static InsumoProtesto parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoProtesto object = new InsumoProtesto();

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

                        if (!"Insumo-Protesto".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoProtesto) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "carta-anuencia"
                java.lang.String tempAttribCartaAnuencia = reader.getAttributeValue(null,
                        "carta-anuencia");

                if (tempAttribCartaAnuencia != null) {
                    java.lang.String content = tempAttribCartaAnuencia;

                    object.setCartaAnuencia(CartaAnuencia.Factory.fromString(
                            reader, tempAttribCartaAnuencia));
                } else {
                }

                handledAttributes.add("carta-anuencia");

                // handle attribute "data-carta-anuencia"
                java.lang.String tempAttribDataCartaAnuencia = reader.getAttributeValue(null,
                        "data-carta-anuencia");

                if (tempAttribDataCartaAnuencia != null) {
                    java.lang.String content = tempAttribDataCartaAnuencia;

                    object.setDataCartaAnuencia(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataCartaAnuencia));
                } else {
                }

                handledAttributes.add("data-carta-anuencia");

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

                // handle attribute "data-protesto"
                java.lang.String tempAttribDataProtesto = reader.getAttributeValue(null,
                        "data-protesto");

                if (tempAttribDataProtesto != null) {
                    java.lang.String content = tempAttribDataProtesto;

                    object.setDataProtesto(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataProtesto));
                } else {
                }

                handledAttributes.add("data-protesto");

                // handle attribute "requerente-credor"
                java.lang.String tempAttribRequerenteCredor = reader.getAttributeValue(null,
                        "requerente-credor");

                if (tempAttribRequerenteCredor != null) {
                    java.lang.String content = tempAttribRequerenteCredor;

                    object.setRequerenteCredor(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribRequerenteCredor));
                } else {
                }

                handledAttributes.add("requerente-credor");

                // handle attribute "numero-protesto"
                java.lang.String tempAttribNumeroProtesto = reader.getAttributeValue(null,
                        "numero-protesto");

                if (tempAttribNumeroProtesto != null) {
                    java.lang.String content = tempAttribNumeroProtesto;

                    object.setNumeroProtesto(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNumeroProtesto));
                } else {
                }

                handledAttributes.add("numero-protesto");

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
                        new javax.xml.namespace.QName("", "cartorio").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "cartorio").equals(
                                reader.getName())) {
                    object.setCartorio(Cartorio.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "natureza-anotacao").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "natureza-anotacao").equals(reader.getName())) {
                    object.setNaturezaAnotacao(NaturezaAnotacao.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "subjudice").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "subjudice").equals(
                                reader.getName())) {
                    object.setSubjudice(Subjudice.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "moeda").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "moeda").equals(
                                reader.getName())) {
                    object.setMoeda(Moeda.Factory.parse(reader));

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

