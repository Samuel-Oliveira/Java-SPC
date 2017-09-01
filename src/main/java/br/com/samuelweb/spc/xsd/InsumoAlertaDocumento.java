package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:45
 */
public class InsumoAlertaDocumento implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Alerta-Documento
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for TipoDocumentoAlerta
     * This was an Array!
     */
    protected TipoDocumentoAlerta[] localTipoDocumentoAlerta;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTipoDocumentoAlertaTracker = false;

    /**
     * field for DataInclusao
     * This was an Attribute!
     */
    protected java.util.Calendar localDataInclusao;

    /**
     * field for DataOcorrencia
     * This was an Attribute!
     */
    protected java.util.Calendar localDataOcorrencia;

    /**
     * field for EntidadeOrigem
     * This was an Attribute!
     */
    protected java.lang.String localEntidadeOrigem;

    /**
     * field for Motivo
     * This was an Attribute!
     */
    protected java.lang.String localMotivo;

    /**
     * field for Observacao
     * This was an Attribute!
     */
    protected java.lang.String localObservacao;

    public boolean isTipoDocumentoAlertaSpecified() {
        return localTipoDocumentoAlertaTracker;
    }

    /**
     * Auto generated getter method
     * @return TipoDocumentoAlerta[]
     */
    public TipoDocumentoAlerta[] getTipoDocumentoAlerta() {
        return localTipoDocumentoAlerta;
    }

    /**
     * validate the array for TipoDocumentoAlerta
     */
    protected void validateTipoDocumentoAlerta(TipoDocumentoAlerta[] param) {
    }

    /**
     * Auto generated setter method
     * @param param TipoDocumentoAlerta
     */
    public void setTipoDocumentoAlerta(TipoDocumentoAlerta[] param) {
        validateTipoDocumentoAlerta(param);

        localTipoDocumentoAlertaTracker = param != null;

        this.localTipoDocumentoAlerta = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param TipoDocumentoAlerta
     */
    public void addTipoDocumentoAlerta(TipoDocumentoAlerta param) {
        if (localTipoDocumentoAlerta == null) {
            localTipoDocumentoAlerta = new TipoDocumentoAlerta[] {  };
        }

        //update the setting tracker
        localTipoDocumentoAlertaTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localTipoDocumentoAlerta);
        list.add(param);
        this.localTipoDocumentoAlerta = (TipoDocumentoAlerta[]) list.toArray(new TipoDocumentoAlerta[list.size()]);
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
    public java.util.Calendar getDataOcorrencia() {
        return localDataOcorrencia;
    }

    /**
     * Auto generated setter method
     * @param param DataOcorrencia
     */
    public void setDataOcorrencia(java.util.Calendar param) {
        this.localDataOcorrencia = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEntidadeOrigem() {
        return localEntidadeOrigem;
    }

    /**
     * Auto generated setter method
     * @param param EntidadeOrigem
     */
    public void setEntidadeOrigem(java.lang.String param) {
        this.localEntidadeOrigem = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMotivo() {
        return localMotivo;
    }

    /**
     * Auto generated setter method
     * @param param Motivo
     */
    public void setMotivo(java.lang.String param) {
        this.localMotivo = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getObservacao() {
        return localObservacao;
    }

    /**
     * Auto generated setter method
     * @param param Observacao
     */
    public void setObservacao(java.lang.String param) {
        this.localObservacao = param;
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
                        namespacePrefix + ":Insumo-Alerta-Documento", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Alerta-Documento", xmlWriter);
            }
        }

        if (localDataInclusao != null) {
            writeAttribute("", "data-inclusao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataInclusao), xmlWriter);
        }

        if (localDataOcorrencia != null) {
            writeAttribute("", "data-ocorrencia",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataOcorrencia), xmlWriter);
        }

        if (localEntidadeOrigem != null) {
            writeAttribute("", "entidade-origem",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localEntidadeOrigem), xmlWriter);
        }

        if (localMotivo != null) {
            writeAttribute("", "motivo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localMotivo), xmlWriter);
        }

        if (localObservacao != null) {
            writeAttribute("", "observacao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localObservacao), xmlWriter);
        }

        if (localTipoDocumentoAlertaTracker) {
            if (localTipoDocumentoAlerta != null) {
                for (int i = 0; i < localTipoDocumentoAlerta.length; i++) {
                    if (localTipoDocumentoAlerta[i] != null) {
                        localTipoDocumentoAlerta[i].serialize(new javax.xml.namespace.QName(
                                "", "tipo-documento-alerta"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "tipo-documento-alerta cannot be null!!");
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
        public static InsumoAlertaDocumento parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoAlertaDocumento object = new InsumoAlertaDocumento();

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

                        if (!"Insumo-Alerta-Documento".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoAlertaDocumento) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

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

                // handle attribute "data-ocorrencia"
                java.lang.String tempAttribDataOcorrencia = reader.getAttributeValue(null,
                        "data-ocorrencia");

                if (tempAttribDataOcorrencia != null) {
                    java.lang.String content = tempAttribDataOcorrencia;

                    object.setDataOcorrencia(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataOcorrencia));
                } else {
                }

                handledAttributes.add("data-ocorrencia");

                // handle attribute "entidade-origem"
                java.lang.String tempAttribEntidadeOrigem = reader.getAttributeValue(null,
                        "entidade-origem");

                if (tempAttribEntidadeOrigem != null) {
                    java.lang.String content = tempAttribEntidadeOrigem;

                    object.setEntidadeOrigem(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribEntidadeOrigem));
                } else {
                }

                handledAttributes.add("entidade-origem");

                // handle attribute "motivo"
                java.lang.String tempAttribMotivo = reader.getAttributeValue(null,
                        "motivo");

                if (tempAttribMotivo != null) {
                    java.lang.String content = tempAttribMotivo;

                    object.setMotivo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMotivo));
                } else {
                }

                handledAttributes.add("motivo");

                // handle attribute "observacao"
                java.lang.String tempAttribObservacao = reader.getAttributeValue(null,
                        "observacao");

                if (tempAttribObservacao != null) {
                    java.lang.String content = tempAttribObservacao;

                    object.setObservacao(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribObservacao));
                } else {
                }

                handledAttributes.add("observacao");

                reader.next();

                java.util.ArrayList list1 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "tipo-documento-alerta").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "tipo-documento-alerta").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list1.add(TipoDocumentoAlerta.Factory.parse(reader));

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
                                    "tipo-documento-alerta").equals(
                                    reader.getName())) {
                                list1.add(TipoDocumentoAlerta.Factory.parse(
                                        reader));
                            } else {
                                loopDone1 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setTipoDocumentoAlerta((TipoDocumentoAlerta[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            TipoDocumentoAlerta.class, list1));
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

