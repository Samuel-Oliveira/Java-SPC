package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:30
 */
public class InsumoHistoricoCheque implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Historico-Cheque
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for ChequeConsultado
     */
    protected Cheque localChequeConsultado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localChequeConsultadoTracker = false;

    /**
     * field for DataConsultaMaisAntiga
     * This was an Attribute!
     */
    protected java.util.Calendar localDataConsultaMaisAntiga;

    /**
     * field for DataConsultaMaisRecente
     * This was an Attribute!
     */
    protected java.util.Calendar localDataConsultaMaisRecente;

    /**
     * field for NomeEmpresaUltimaConsulta
     * This was an Attribute!
     */
    protected java.lang.String localNomeEmpresaUltimaConsulta;

    /**
     * field for QuantidadeConsultas
     * This was an Attribute!
     */
    protected int localQuantidadeConsultas;

    public boolean isChequeConsultadoSpecified() {
        return localChequeConsultadoTracker;
    }

    /**
     * Auto generated getter method
     * @return Cheque
     */
    public Cheque getChequeConsultado() {
        return localChequeConsultado;
    }

    /**
     * Auto generated setter method
     * @param param ChequeConsultado
     */
    public void setChequeConsultado(Cheque param) {
        localChequeConsultadoTracker = param != null;

        this.localChequeConsultado = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataConsultaMaisAntiga() {
        return localDataConsultaMaisAntiga;
    }

    /**
     * Auto generated setter method
     * @param param DataConsultaMaisAntiga
     */
    public void setDataConsultaMaisAntiga(java.util.Calendar param) {
        this.localDataConsultaMaisAntiga = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataConsultaMaisRecente() {
        return localDataConsultaMaisRecente;
    }

    /**
     * Auto generated setter method
     * @param param DataConsultaMaisRecente
     */
    public void setDataConsultaMaisRecente(java.util.Calendar param) {
        this.localDataConsultaMaisRecente = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeEmpresaUltimaConsulta() {
        return localNomeEmpresaUltimaConsulta;
    }

    /**
     * Auto generated setter method
     * @param param NomeEmpresaUltimaConsulta
     */
    public void setNomeEmpresaUltimaConsulta(java.lang.String param) {
        this.localNomeEmpresaUltimaConsulta = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getQuantidadeConsultas() {
        return localQuantidadeConsultas;
    }

    /**
     * Auto generated setter method
     * @param param QuantidadeConsultas
     */
    public void setQuantidadeConsultas(int param) {
        this.localQuantidadeConsultas = param;
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
                        namespacePrefix + ":Insumo-Historico-Cheque", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Historico-Cheque", xmlWriter);
            }
        }

        if (localDataConsultaMaisAntiga != null) {
            writeAttribute("", "data-consulta-mais-antiga",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataConsultaMaisAntiga), xmlWriter);
        }

        if (localDataConsultaMaisRecente != null) {
            writeAttribute("", "data-consulta-mais-recente",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataConsultaMaisRecente), xmlWriter);
        }

        if (localNomeEmpresaUltimaConsulta != null) {
            writeAttribute("", "nome-empresa-ultima-consulta",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNomeEmpresaUltimaConsulta), xmlWriter);
        }

        if (localQuantidadeConsultas != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "quantidade-consultas",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localQuantidadeConsultas), xmlWriter);
        }

        if (localChequeConsultadoTracker) {
            if (localChequeConsultado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cheque-consultado cannot be null!!");
            }

            localChequeConsultado.serialize(new javax.xml.namespace.QName(
                    "", "cheque-consultado"), xmlWriter);
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
        public static InsumoHistoricoCheque parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoHistoricoCheque object = new InsumoHistoricoCheque();

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

                        if (!"Insumo-Historico-Cheque".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoHistoricoCheque) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "data-consulta-mais-antiga"
                java.lang.String tempAttribDataConsultaMaisAntiga = reader.getAttributeValue(null,
                        "data-consulta-mais-antiga");

                if (tempAttribDataConsultaMaisAntiga != null) {
                    java.lang.String content = tempAttribDataConsultaMaisAntiga;

                    object.setDataConsultaMaisAntiga(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataConsultaMaisAntiga));
                } else {
                }

                handledAttributes.add("data-consulta-mais-antiga");

                // handle attribute "data-consulta-mais-recente"
                java.lang.String tempAttribDataConsultaMaisRecente = reader.getAttributeValue(null,
                        "data-consulta-mais-recente");

                if (tempAttribDataConsultaMaisRecente != null) {
                    java.lang.String content = tempAttribDataConsultaMaisRecente;

                    object.setDataConsultaMaisRecente(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataConsultaMaisRecente));
                } else {
                }

                handledAttributes.add("data-consulta-mais-recente");

                // handle attribute "nome-empresa-ultima-consulta"
                java.lang.String tempAttribNomeEmpresaUltimaConsulta = reader.getAttributeValue(null,
                        "nome-empresa-ultima-consulta");

                if (tempAttribNomeEmpresaUltimaConsulta != null) {
                    java.lang.String content = tempAttribNomeEmpresaUltimaConsulta;

                    object.setNomeEmpresaUltimaConsulta(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNomeEmpresaUltimaConsulta));
                } else {
                }

                handledAttributes.add("nome-empresa-ultima-consulta");

                // handle attribute "quantidade-consultas"
                java.lang.String tempAttribQuantidadeConsultas = reader.getAttributeValue(null,
                        "quantidade-consultas");

                if (tempAttribQuantidadeConsultas != null) {
                    java.lang.String content = tempAttribQuantidadeConsultas;

                    object.setQuantidadeConsultas(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribQuantidadeConsultas));
                } else {
                    object.setQuantidadeConsultas(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("quantidade-consultas");

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "cheque-consultado").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "cheque-consultado").equals(reader.getName())) {
                    object.setChequeConsultado(Cheque.Factory.parse(reader));

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
