package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:40
 */
public class InsumoChequeLojista implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Cheque-Lojista
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Alinea
     */
    protected Alinea localAlinea;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAlineaTracker = false;

    /**
     * field for ChequeInicial
     */
    protected ChequeLojista localChequeInicial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localChequeInicialTracker = false;

    /**
     * field for ChequeFinal
     */
    protected ChequeFinal localChequeFinal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localChequeFinalTracker = false;

    /**
     * field for CidadeAssociado
     */
    protected Cidade localCidadeAssociado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCidadeAssociadoTracker = false;

    /**
     * field for TelefoneAssociado
     */
    protected Telefone localTelefoneAssociado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneAssociadoTracker = false;

    /**
     * field for NomeAssociado
     * This was an Attribute!
     */
    protected java.lang.String localNomeAssociado;

    /**
     * field for CodigoEntidade
     * This was an Attribute!
     */
    protected long localCodigoEntidade;

    /**
     * field for DataInclusao
     * This was an Attribute!
     */
    protected java.util.Calendar localDataInclusao;

    /**
     * field for NomeEntidade
     * This was an Attribute!
     */
    protected java.lang.String localNomeEntidade;

    /**
     * field for Informante
     * This was an Attribute!
     */
    protected java.lang.String localInformante;

    /**
     * field for Origem
     * This was an Attribute!
     */
    protected java.lang.String localOrigem;

    public boolean isAlineaSpecified() {
        return localAlineaTracker;
    }

    /**
     * Auto generated getter method
     * @return Alinea
     */
    public Alinea getAlinea() {
        return localAlinea;
    }

    /**
     * Auto generated setter method
     * @param param Alinea
     */
    public void setAlinea(Alinea param) {
        localAlineaTracker = param != null;

        this.localAlinea = param;
    }

    public boolean isChequeInicialSpecified() {
        return localChequeInicialTracker;
    }

    /**
     * Auto generated getter method
     * @return ChequeLojista
     */
    public ChequeLojista getChequeInicial() {
        return localChequeInicial;
    }

    /**
     * Auto generated setter method
     * @param param ChequeInicial
     */
    public void setChequeInicial(ChequeLojista param) {
        localChequeInicialTracker = param != null;

        this.localChequeInicial = param;
    }

    public boolean isChequeFinalSpecified() {
        return localChequeFinalTracker;
    }

    /**
     * Auto generated getter method
     * @return ChequeFinal
     */
    public ChequeFinal getChequeFinal() {
        return localChequeFinal;
    }

    /**
     * Auto generated setter method
     * @param param ChequeFinal
     */
    public void setChequeFinal(ChequeFinal param) {
        localChequeFinalTracker = param != null;

        this.localChequeFinal = param;
    }

    public boolean isCidadeAssociadoSpecified() {
        return localCidadeAssociadoTracker;
    }

    /**
     * Auto generated getter method
     * @return Cidade
     */
    public Cidade getCidadeAssociado() {
        return localCidadeAssociado;
    }

    /**
     * Auto generated setter method
     * @param param CidadeAssociado
     */
    public void setCidadeAssociado(Cidade param) {
        localCidadeAssociadoTracker = param != null;

        this.localCidadeAssociado = param;
    }

    public boolean isTelefoneAssociadoSpecified() {
        return localTelefoneAssociadoTracker;
    }

    /**
     * Auto generated getter method
     * @return Telefone
     */
    public Telefone getTelefoneAssociado() {
        return localTelefoneAssociado;
    }

    /**
     * Auto generated setter method
     * @param param TelefoneAssociado
     */
    public void setTelefoneAssociado(Telefone param) {
        localTelefoneAssociadoTracker = param != null;

        this.localTelefoneAssociado = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeAssociado() {
        return localNomeAssociado;
    }

    /**
     * Auto generated setter method
     * @param param NomeAssociado
     */
    public void setNomeAssociado(java.lang.String param) {
        this.localNomeAssociado = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getCodigoEntidade() {
        return localCodigoEntidade;
    }

    /**
     * Auto generated setter method
     * @param param CodigoEntidade
     */
    public void setCodigoEntidade(long param) {
        this.localCodigoEntidade = param;
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
    public java.lang.String getNomeEntidade() {
        return localNomeEntidade;
    }

    /**
     * Auto generated setter method
     * @param param NomeEntidade
     */
    public void setNomeEntidade(java.lang.String param) {
        this.localNomeEntidade = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getInformante() {
        return localInformante;
    }

    /**
     * Auto generated setter method
     * @param param Informante
     */
    public void setInformante(java.lang.String param) {
        this.localInformante = param;
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
                        namespacePrefix + ":Insumo-Cheque-Lojista", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Cheque-Lojista", xmlWriter);
            }
        }

        if (localNomeAssociado != null) {
            writeAttribute("", "nome-associado",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNomeAssociado), xmlWriter);
        }

        if (localCodigoEntidade != java.lang.Long.MIN_VALUE) {
            writeAttribute("", "codigo-entidade",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCodigoEntidade), xmlWriter);
        }

        if (localDataInclusao != null) {
            writeAttribute("", "data-inclusao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataInclusao), xmlWriter);
        }

        if (localNomeEntidade != null) {
            writeAttribute("", "nome-entidade",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNomeEntidade), xmlWriter);
        }

        if (localInformante != null) {
            writeAttribute("", "informante",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localInformante), xmlWriter);
        }

        if (localOrigem != null) {
            writeAttribute("", "origem",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localOrigem), xmlWriter);
        }

        if (localAlineaTracker) {
            if (localAlinea == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "alinea cannot be null!!");
            }

            localAlinea.serialize(new javax.xml.namespace.QName("", "alinea"),
                    xmlWriter);
        }

        if (localChequeInicialTracker) {
            if (localChequeInicial == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cheque-inicial cannot be null!!");
            }

            localChequeInicial.serialize(new javax.xml.namespace.QName("",
                    "cheque-inicial"), xmlWriter);
        }

        if (localChequeFinalTracker) {
            if (localChequeFinal == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cheque-final cannot be null!!");
            }

            localChequeFinal.serialize(new javax.xml.namespace.QName("",
                    "cheque-final"), xmlWriter);
        }

        if (localCidadeAssociadoTracker) {
            if (localCidadeAssociado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cidade-associado cannot be null!!");
            }

            localCidadeAssociado.serialize(new javax.xml.namespace.QName(
                    "", "cidade-associado"), xmlWriter);
        }

        if (localTelefoneAssociadoTracker) {
            if (localTelefoneAssociado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "telefone-associado cannot be null!!");
            }

            localTelefoneAssociado.serialize(new javax.xml.namespace.QName(
                    "", "telefone-associado"), xmlWriter);
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
        public static InsumoChequeLojista parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoChequeLojista object = new InsumoChequeLojista();

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

                        if (!"Insumo-Cheque-Lojista".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoChequeLojista) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "nome-associado"
                java.lang.String tempAttribNomeAssociado = reader.getAttributeValue(null,
                        "nome-associado");

                if (tempAttribNomeAssociado != null) {
                    java.lang.String content = tempAttribNomeAssociado;

                    object.setNomeAssociado(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNomeAssociado));
                } else {
                }

                handledAttributes.add("nome-associado");

                // handle attribute "codigo-entidade"
                java.lang.String tempAttribCodigoEntidade = reader.getAttributeValue(null,
                        "codigo-entidade");

                if (tempAttribCodigoEntidade != null) {
                    java.lang.String content = tempAttribCodigoEntidade;

                    object.setCodigoEntidade(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            tempAttribCodigoEntidade));
                } else {
                    object.setCodigoEntidade(java.lang.Long.MIN_VALUE);
                }

                handledAttributes.add("codigo-entidade");

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

                // handle attribute "nome-entidade"
                java.lang.String tempAttribNomeEntidade = reader.getAttributeValue(null,
                        "nome-entidade");

                if (tempAttribNomeEntidade != null) {
                    java.lang.String content = tempAttribNomeEntidade;

                    object.setNomeEntidade(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNomeEntidade));
                } else {
                }

                handledAttributes.add("nome-entidade");

                // handle attribute "informante"
                java.lang.String tempAttribInformante = reader.getAttributeValue(null,
                        "informante");

                if (tempAttribInformante != null) {
                    java.lang.String content = tempAttribInformante;

                    object.setInformante(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribInformante));
                } else {
                }

                handledAttributes.add("informante");

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

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "alinea").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "alinea").equals(
                                reader.getName())) {
                    object.setAlinea(Alinea.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "cheque-inicial").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "cheque-inicial").equals(
                                reader.getName())) {
                    object.setChequeInicial(ChequeLojista.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "cheque-final").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "cheque-final").equals(
                                reader.getName())) {
                    object.setChequeFinal(ChequeFinal.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "cidade-associado").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "cidade-associado").equals(
                                reader.getName())) {
                    object.setCidadeAssociado(Cidade.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "telefone-associado").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "telefone-associado").equals(reader.getName())) {
                    object.setTelefoneAssociado(Telefone.Factory.parse(
                            reader));

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

