package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:49
 */
public class BaseExternaAgente implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://webservice.consulta.spcjava.spcbrasil.org/",
            "baseExternaAgente", "ns1");
    private static java.util.HashMap _table_ = new java.util.HashMap();
    public static final java.lang.String _SRF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SRF");
    public static final java.lang.String _RENIC = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "RENIC");
    public static final java.lang.String _USEFN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "USEFN");
    public static final java.lang.String _ACSP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ACSP");
    public static final java.lang.String _EQUIF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EQUIF");
    public static final java.lang.String _SRASA_TRADUTOR_CONCENTRE = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SRASA_TRADUTOR_CONCENTRE");
    public static final java.lang.String _SRASA_RELATO = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SRASA_RELATO");
    public static final java.lang.String _SRASA_CHEQUENET = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SRASA_CHEQUENET");
    public static final java.lang.String _SRASA_CONCTR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SRASA_CONCTR");
    public static final java.lang.String _FORNECEDOR_INTEGRACAO = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FORNECEDOR_INTEGRACAO");
    public static final java.lang.String _FORNECEDOR_INTEGRACAO_CHEQUE = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FORNECEDOR_INTEGRACAO_CHEQUE");
    public static final java.lang.String _SSPDSCE = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SSPDSCE");
    public static final java.lang.String _CHECKAUTO = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CHECKAUTO");
    public static final java.lang.String _SRASA_CREDNET = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SRASA_CREDNET");
    public static final java.lang.String _SRASA_CREDIT_BUREAU = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SRASA_CREDIT_BUREAU");
    public static final java.lang.String _ASSECC_FONE = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ASSECC_FONE");
    public static final java.lang.String _FIBER_RENDA_PRESUMIDA = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FIBER_RENDA_PRESUMIDA");
    public static final java.lang.String _IBOPE = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "IBOPE");
    public static final java.lang.String _RENDA_PRESUMIDA = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "RENDA_PRESUMIDA");
    public static final java.lang.String _CARFACTS = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CARFACTS");
    public static final java.lang.String _UNICHECK = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "UNICHECK");
    public static final BaseExternaAgente SRF = new BaseExternaAgente(_SRF,
            true);
    public static final BaseExternaAgente RENIC = new BaseExternaAgente(_RENIC,
            true);
    public static final BaseExternaAgente USEFN = new BaseExternaAgente(_USEFN,
            true);
    public static final BaseExternaAgente ACSP = new BaseExternaAgente(_ACSP,
            true);
    public static final BaseExternaAgente EQUIF = new BaseExternaAgente(_EQUIF,
            true);
    public static final BaseExternaAgente SRASA_TRADUTOR_CONCENTRE = new BaseExternaAgente(_SRASA_TRADUTOR_CONCENTRE,
            true);
    public static final BaseExternaAgente SRASA_RELATO = new BaseExternaAgente(_SRASA_RELATO,
            true);
    public static final BaseExternaAgente SRASA_CHEQUENET = new BaseExternaAgente(_SRASA_CHEQUENET,
            true);
    public static final BaseExternaAgente SRASA_CONCTR = new BaseExternaAgente(_SRASA_CONCTR,
            true);
    public static final BaseExternaAgente FORNECEDOR_INTEGRACAO = new BaseExternaAgente(_FORNECEDOR_INTEGRACAO,
            true);
    public static final BaseExternaAgente FORNECEDOR_INTEGRACAO_CHEQUE = new BaseExternaAgente(_FORNECEDOR_INTEGRACAO_CHEQUE,
            true);
    public static final BaseExternaAgente SSPDSCE = new BaseExternaAgente(_SSPDSCE,
            true);
    public static final BaseExternaAgente CHECKAUTO = new BaseExternaAgente(_CHECKAUTO,
            true);
    public static final BaseExternaAgente SRASA_CREDNET = new BaseExternaAgente(_SRASA_CREDNET,
            true);
    public static final BaseExternaAgente SRASA_CREDIT_BUREAU = new BaseExternaAgente(_SRASA_CREDIT_BUREAU,
            true);
    public static final BaseExternaAgente ASSECC_FONE = new BaseExternaAgente(_ASSECC_FONE,
            true);
    public static final BaseExternaAgente FIBER_RENDA_PRESUMIDA = new BaseExternaAgente(_FIBER_RENDA_PRESUMIDA,
            true);
    public static final BaseExternaAgente IBOPE = new BaseExternaAgente(_IBOPE,
            true);
    public static final BaseExternaAgente RENDA_PRESUMIDA = new BaseExternaAgente(_RENDA_PRESUMIDA,
            true);
    public static final BaseExternaAgente CARFACTS = new BaseExternaAgente(_CARFACTS,
            true);
    public static final BaseExternaAgente UNICHECK = new BaseExternaAgente(_UNICHECK,
            true);

    /**
     * field for BaseExternaAgente
     */
    protected java.lang.String localBaseExternaAgente;

    // Constructor
    protected BaseExternaAgente(java.lang.String value,
                                boolean isRegisterValue) {
        localBaseExternaAgente = value;

        if (isRegisterValue) {
            _table_.put(localBaseExternaAgente, this);
        }
    }

    public java.lang.String getValue() {
        return localBaseExternaAgente;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj == this);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public java.lang.String toString() {
        return localBaseExternaAgente.toString();
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
                this, MY_QNAME));
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
        //We can safely assume an element has only one type associated with it
        java.lang.String namespace = parentQName.getNamespaceURI();
        java.lang.String _localName = parentQName.getLocalPart();

        writeStartElement(null, namespace, _localName, xmlWriter);

        // add the type details if this is used in a simple type
        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://webservice.consulta.spcjava.spcbrasil.org/");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":baseExternaAgente", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "baseExternaAgente", xmlWriter);
            }
        }

        if (localBaseExternaAgente == null) {
            throw new org.apache.axis2.databinding.ADBException(
                    "baseExternaAgente cannot be null !!");
        } else {
            xmlWriter.writeCharacters(localBaseExternaAgente);
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

        public static BaseExternaAgente fromValue(java.lang.String value)
                throws java.lang.IllegalArgumentException {
            BaseExternaAgente enumeration = (BaseExternaAgente) _table_.get(value);

            // handle unexpected enumeration values properly
            if (enumeration == null) {
                throw new java.lang.IllegalArgumentException();
            }

            return enumeration;
        }

        public static BaseExternaAgente fromString(java.lang.String value,
                                                   java.lang.String namespaceURI)
                throws java.lang.IllegalArgumentException {
            try {
                return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        value));
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalArgumentException();
            }
        }

        public static BaseExternaAgente fromString(
                javax.xml.stream.XMLStreamReader xmlStreamReader,
                java.lang.String content) {
            if (content.indexOf(":") > -1) {
                java.lang.String prefix = content.substring(0,
                        content.indexOf(":"));
                java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext()
                        .getNamespaceURI(prefix);

                return BaseExternaAgente.Factory.fromString(content,
                        namespaceUri);
            } else {
                return BaseExternaAgente.Factory.fromString(content, "");
            }
        }

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static BaseExternaAgente parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            BaseExternaAgente object = null;

            // initialize a hash map to keep values
            java.util.Map attributeMap = new java.util.HashMap();
            java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement() || reader.hasText()) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "baseExternaAgente" +
                                            "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        if (content.indexOf(":") > 0) {
                            // this seems to be a Qname so find the namespace and send
                            prefix = content.substring(0,
                                    content.indexOf(":"));
                            namespaceuri = reader.getNamespaceURI(prefix);
                            object = BaseExternaAgente.Factory.fromString(content,
                                    namespaceuri);
                        } else {
                            // this seems to be not a qname send and empty namespace incase of it is
                            // check is done in fromString method
                            object = BaseExternaAgente.Factory.fromString(content,
                                    "");
                        }
                    } else {
                        reader.next();
                    }
                } // end of while loop
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}

