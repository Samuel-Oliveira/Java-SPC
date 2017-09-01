package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:47
 */
public class Subjudice implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Subjudice
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for PracaSubjudice
     * This was an Attribute!
     */
    protected java.lang.String localPracaSubjudice;

    /**
     * field for DistritoSubjudice
     * This was an Attribute!
     */
    protected java.lang.String localDistritoSubjudice;

    /**
     * field for VaraSubjudice
     * This was an Attribute!
     */
    protected java.lang.String localVaraSubjudice;

    /**
     * field for DataSubjudice
     * This was an Attribute!
     */
    protected java.util.Calendar localDataSubjudice;

    /**
     * field for ProcessoSubjudice
     * This was an Attribute!
     */
    protected java.lang.String localProcessoSubjudice;

    /**
     * field for MensagemSubjudice
     * This was an Attribute!
     */
    protected java.lang.String localMensagemSubjudice;

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPracaSubjudice() {
        return localPracaSubjudice;
    }

    /**
     * Auto generated setter method
     * @param param PracaSubjudice
     */
    public void setPracaSubjudice(java.lang.String param) {
        this.localPracaSubjudice = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDistritoSubjudice() {
        return localDistritoSubjudice;
    }

    /**
     * Auto generated setter method
     * @param param DistritoSubjudice
     */
    public void setDistritoSubjudice(java.lang.String param) {
        this.localDistritoSubjudice = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getVaraSubjudice() {
        return localVaraSubjudice;
    }

    /**
     * Auto generated setter method
     * @param param VaraSubjudice
     */
    public void setVaraSubjudice(java.lang.String param) {
        this.localVaraSubjudice = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataSubjudice() {
        return localDataSubjudice;
    }

    /**
     * Auto generated setter method
     * @param param DataSubjudice
     */
    public void setDataSubjudice(java.util.Calendar param) {
        this.localDataSubjudice = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getProcessoSubjudice() {
        return localProcessoSubjudice;
    }

    /**
     * Auto generated setter method
     * @param param ProcessoSubjudice
     */
    public void setProcessoSubjudice(java.lang.String param) {
        this.localProcessoSubjudice = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMensagemSubjudice() {
        return localMensagemSubjudice;
    }

    /**
     * Auto generated setter method
     * @param param MensagemSubjudice
     */
    public void setMensagemSubjudice(java.lang.String param) {
        this.localMensagemSubjudice = param;
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
                        namespacePrefix + ":Subjudice", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Subjudice", xmlWriter);
            }
        }

        if (localPracaSubjudice != null) {
            writeAttribute("", "praca-subjudice",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPracaSubjudice), xmlWriter);
        }

        if (localDistritoSubjudice != null) {
            writeAttribute("", "distrito-subjudice",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDistritoSubjudice), xmlWriter);
        }

        if (localVaraSubjudice != null) {
            writeAttribute("", "vara-subjudice",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localVaraSubjudice), xmlWriter);
        }

        if (localDataSubjudice != null) {
            writeAttribute("", "data-subjudice",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataSubjudice), xmlWriter);
        }

        if (localProcessoSubjudice != null) {
            writeAttribute("", "processo-subjudice",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localProcessoSubjudice), xmlWriter);
        }

        if (localMensagemSubjudice != null) {
            writeAttribute("", "mensagem-subjudice",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localMensagemSubjudice), xmlWriter);
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
        public static Subjudice parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            Subjudice object = new Subjudice();

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

                        if (!"Subjudice".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (Subjudice) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "praca-subjudice"
                java.lang.String tempAttribPracaSubjudice = reader.getAttributeValue(null,
                        "praca-subjudice");

                if (tempAttribPracaSubjudice != null) {
                    java.lang.String content = tempAttribPracaSubjudice;

                    object.setPracaSubjudice(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribPracaSubjudice));
                } else {
                }

                handledAttributes.add("praca-subjudice");

                // handle attribute "distrito-subjudice"
                java.lang.String tempAttribDistritoSubjudice = reader.getAttributeValue(null,
                        "distrito-subjudice");

                if (tempAttribDistritoSubjudice != null) {
                    java.lang.String content = tempAttribDistritoSubjudice;

                    object.setDistritoSubjudice(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDistritoSubjudice));
                } else {
                }

                handledAttributes.add("distrito-subjudice");

                // handle attribute "vara-subjudice"
                java.lang.String tempAttribVaraSubjudice = reader.getAttributeValue(null,
                        "vara-subjudice");

                if (tempAttribVaraSubjudice != null) {
                    java.lang.String content = tempAttribVaraSubjudice;

                    object.setVaraSubjudice(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribVaraSubjudice));
                } else {
                }

                handledAttributes.add("vara-subjudice");

                // handle attribute "data-subjudice"
                java.lang.String tempAttribDataSubjudice = reader.getAttributeValue(null,
                        "data-subjudice");

                if (tempAttribDataSubjudice != null) {
                    java.lang.String content = tempAttribDataSubjudice;

                    object.setDataSubjudice(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataSubjudice));
                } else {
                }

                handledAttributes.add("data-subjudice");

                // handle attribute "processo-subjudice"
                java.lang.String tempAttribProcessoSubjudice = reader.getAttributeValue(null,
                        "processo-subjudice");

                if (tempAttribProcessoSubjudice != null) {
                    java.lang.String content = tempAttribProcessoSubjudice;

                    object.setProcessoSubjudice(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribProcessoSubjudice));
                } else {
                }

                handledAttributes.add("processo-subjudice");

                // handle attribute "mensagem-subjudice"
                java.lang.String tempAttribMensagemSubjudice = reader.getAttributeValue(null,
                        "mensagem-subjudice");

                if (tempAttribMensagemSubjudice != null) {
                    java.lang.String content = tempAttribMensagemSubjudice;

                    object.setMensagemSubjudice(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMensagemSubjudice));
                } else {
                }

                handledAttributes.add("mensagem-subjudice");

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

