package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:20
 */
public class InsumoParticipacaoFalencia implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Participacao-Falencia
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

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
     * field for NaturezaAnotacao
     */
    protected NaturezaAnotacao localNaturezaAnotacao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNaturezaAnotacaoTracker = false;

    /**
     * field for VaraCivel
     */
    protected Vara localVaraCivel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localVaraCivelTracker = false;

    /**
     * field for DataAcao
     * This was an Attribute!
     */
    protected java.util.Calendar localDataAcao;

    /**
     * field for DescricaoTipoParticipacao
     * This was an Attribute!
     */
    protected java.lang.String localDescricaoTipoParticipacao;

    /**
     * field for EmpresaParticipacao
     * This was an Attribute!
     */
    protected java.lang.String localEmpresaParticipacao;

    /**
     * field for QualificacaoParticipanteEmpresaFalida
     * This was an Attribute!
     */
    protected java.lang.String localQualificacaoParticipanteEmpresaFalida;

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

    public boolean isVaraCivelSpecified() {
        return localVaraCivelTracker;
    }

    /**
     * Auto generated getter method
     * @return Vara
     */
    public Vara getVaraCivel() {
        return localVaraCivel;
    }

    /**
     * Auto generated setter method
     * @param param VaraCivel
     */
    public void setVaraCivel(Vara param) {
        localVaraCivelTracker = param != null;

        this.localVaraCivel = param;
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
     * @return java.lang.String
     */
    public java.lang.String getDescricaoTipoParticipacao() {
        return localDescricaoTipoParticipacao;
    }

    /**
     * Auto generated setter method
     * @param param DescricaoTipoParticipacao
     */
    public void setDescricaoTipoParticipacao(java.lang.String param) {
        this.localDescricaoTipoParticipacao = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmpresaParticipacao() {
        return localEmpresaParticipacao;
    }

    /**
     * Auto generated setter method
     * @param param EmpresaParticipacao
     */
    public void setEmpresaParticipacao(java.lang.String param) {
        this.localEmpresaParticipacao = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getQualificacaoParticipanteEmpresaFalida() {
        return localQualificacaoParticipanteEmpresaFalida;
    }

    /**
     * Auto generated setter method
     * @param param QualificacaoParticipanteEmpresaFalida
     */
    public void setQualificacaoParticipanteEmpresaFalida(
            java.lang.String param) {
        this.localQualificacaoParticipanteEmpresaFalida = param;
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
                        namespacePrefix + ":Insumo-Participacao-Falencia",
                        xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Participacao-Falencia", xmlWriter);
            }
        }

        if (localDataAcao != null) {
            writeAttribute("", "data-acao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataAcao), xmlWriter);
        }

        if (localDescricaoTipoParticipacao != null) {
            writeAttribute("", "descricao-tipo-participacao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDescricaoTipoParticipacao), xmlWriter);
        }

        if (localEmpresaParticipacao != null) {
            writeAttribute("", "empresa-participacao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localEmpresaParticipacao), xmlWriter);
        }

        if (localQualificacaoParticipanteEmpresaFalida != null) {
            writeAttribute("", "qualificacao-participante-empresa-falida",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localQualificacaoParticipanteEmpresaFalida), xmlWriter);
        }

        if (localTipoAcaoTracker) {
            if (localTipoAcao == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "tipo-acao cannot be null!!");
            }

            localTipoAcao.serialize(new javax.xml.namespace.QName("",
                    "tipo-acao"), xmlWriter);
        }

        if (localNaturezaAnotacaoTracker) {
            if (localNaturezaAnotacao == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "natureza-anotacao cannot be null!!");
            }

            localNaturezaAnotacao.serialize(new javax.xml.namespace.QName(
                    "", "natureza-anotacao"), xmlWriter);
        }

        if (localVaraCivelTracker) {
            if (localVaraCivel == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "vara-civel cannot be null!!");
            }

            localVaraCivel.serialize(new javax.xml.namespace.QName("",
                    "vara-civel"), xmlWriter);
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
        public static InsumoParticipacaoFalencia parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoParticipacaoFalencia object = new InsumoParticipacaoFalencia();

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

                        if (!"Insumo-Participacao-Falencia".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoParticipacaoFalencia) ExtensionMapper.getTypeObject(nsUri,
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

                // handle attribute "descricao-tipo-participacao"
                java.lang.String tempAttribDescricaoTipoParticipacao = reader.getAttributeValue(null,
                        "descricao-tipo-participacao");

                if (tempAttribDescricaoTipoParticipacao != null) {
                    java.lang.String content = tempAttribDescricaoTipoParticipacao;

                    object.setDescricaoTipoParticipacao(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDescricaoTipoParticipacao));
                } else {
                }

                handledAttributes.add("descricao-tipo-participacao");

                // handle attribute "empresa-participacao"
                java.lang.String tempAttribEmpresaParticipacao = reader.getAttributeValue(null,
                        "empresa-participacao");

                if (tempAttribEmpresaParticipacao != null) {
                    java.lang.String content = tempAttribEmpresaParticipacao;

                    object.setEmpresaParticipacao(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribEmpresaParticipacao));
                } else {
                }

                handledAttributes.add("empresa-participacao");

                // handle attribute "qualificacao-participante-empresa-falida"
                java.lang.String tempAttribQualificacaoParticipanteEmpresaFalida =
                        reader.getAttributeValue(null,
                                "qualificacao-participante-empresa-falida");

                if (tempAttribQualificacaoParticipanteEmpresaFalida != null) {
                    java.lang.String content = tempAttribQualificacaoParticipanteEmpresaFalida;

                    object.setQualificacaoParticipanteEmpresaFalida(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribQualificacaoParticipanteEmpresaFalida));
                } else {
                }

                handledAttributes.add(
                        "qualificacao-participante-empresa-falida");

                reader.next();

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
                        new javax.xml.namespace.QName("", "vara-civel").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "vara-civel").equals(
                                reader.getName())) {
                    object.setVaraCivel(Vara.Factory.parse(reader));

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

