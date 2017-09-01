package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:32
 */
public class InformacoesAdicionais1Socios implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = InformacoesAdicionais1Socios
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Cidade
     * This was an Attribute!
     */
    protected java.lang.String localCidade;

    /**
     * field for DataNascimento
     * This was an Attribute!
     */
    protected java.util.Calendar localDataNascimento;

    /**
     * field for Documento
     * This was an Attribute!
     */
    protected java.lang.String localDocumento;

    /**
     * field for Cep
     * This was an Attribute!
     */
    protected java.lang.String localCep;

    /**
     * field for Rg
     * This was an Attribute!
     */
    protected java.lang.String localRg;

    /**
     * field for Ddd
     * This was an Attribute!
     */
    protected java.lang.String localDdd;

    /**
     * field for Uf
     * This was an Attribute!
     */
    protected java.lang.String localUf;

    /**
     * field for Vinculo
     * This was an Attribute!
     */
    protected java.lang.String localVinculo;

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCidade() {
        return localCidade;
    }

    /**
     * Auto generated setter method
     * @param param Cidade
     */
    public void setCidade(java.lang.String param) {
        this.localCidade = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataNascimento() {
        return localDataNascimento;
    }

    /**
     * Auto generated setter method
     * @param param DataNascimento
     */
    public void setDataNascimento(java.util.Calendar param) {
        this.localDataNascimento = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDocumento() {
        return localDocumento;
    }

    /**
     * Auto generated setter method
     * @param param Documento
     */
    public void setDocumento(java.lang.String param) {
        this.localDocumento = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCep() {
        return localCep;
    }

    /**
     * Auto generated setter method
     * @param param Cep
     */
    public void setCep(java.lang.String param) {
        this.localCep = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRg() {
        return localRg;
    }

    /**
     * Auto generated setter method
     * @param param Rg
     */
    public void setRg(java.lang.String param) {
        this.localRg = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDdd() {
        return localDdd;
    }

    /**
     * Auto generated setter method
     * @param param Ddd
     */
    public void setDdd(java.lang.String param) {
        this.localDdd = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUf() {
        return localUf;
    }

    /**
     * Auto generated setter method
     * @param param Uf
     */
    public void setUf(java.lang.String param) {
        this.localUf = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getVinculo() {
        return localVinculo;
    }

    /**
     * Auto generated setter method
     * @param param Vinculo
     */
    public void setVinculo(java.lang.String param) {
        this.localVinculo = param;
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
                        namespacePrefix + ":InformacoesAdicionais1Socios",
                        xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "InformacoesAdicionais1Socios", xmlWriter);
            }
        }

        if (localCidade != null) {
            writeAttribute("", "cidade",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCidade), xmlWriter);
        }

        if (localDataNascimento != null) {
            writeAttribute("", "dataNascimento",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataNascimento), xmlWriter);
        }

        if (localDocumento != null) {
            writeAttribute("", "documento",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDocumento), xmlWriter);
        }

        if (localCep != null) {
            writeAttribute("", "cep",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCep), xmlWriter);
        }

        if (localRg != null) {
            writeAttribute("", "rg",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localRg), xmlWriter);
        }

        if (localDdd != null) {
            writeAttribute("", "ddd",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDdd), xmlWriter);
        }

        if (localUf != null) {
            writeAttribute("", "uf",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localUf), xmlWriter);
        }

        if (localVinculo != null) {
            writeAttribute("", "vinculo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localVinculo), xmlWriter);
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
        public static InformacoesAdicionais1Socios parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InformacoesAdicionais1Socios object = new InformacoesAdicionais1Socios();

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

                        if (!"InformacoesAdicionais1Socios".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InformacoesAdicionais1Socios) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "cidade"
                java.lang.String tempAttribCidade = reader.getAttributeValue(null,
                        "cidade");

                if (tempAttribCidade != null) {
                    java.lang.String content = tempAttribCidade;

                    object.setCidade(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCidade));
                } else {
                }

                handledAttributes.add("cidade");

                // handle attribute "dataNascimento"
                java.lang.String tempAttribDataNascimento = reader.getAttributeValue(null,
                        "dataNascimento");

                if (tempAttribDataNascimento != null) {
                    java.lang.String content = tempAttribDataNascimento;

                    object.setDataNascimento(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataNascimento));
                } else {
                }

                handledAttributes.add("dataNascimento");

                // handle attribute "documento"
                java.lang.String tempAttribDocumento = reader.getAttributeValue(null,
                        "documento");

                if (tempAttribDocumento != null) {
                    java.lang.String content = tempAttribDocumento;

                    object.setDocumento(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDocumento));
                } else {
                }

                handledAttributes.add("documento");

                // handle attribute "cep"
                java.lang.String tempAttribCep = reader.getAttributeValue(null,
                        "cep");

                if (tempAttribCep != null) {
                    java.lang.String content = tempAttribCep;

                    object.setCep(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCep));
                } else {
                }

                handledAttributes.add("cep");

                // handle attribute "rg"
                java.lang.String tempAttribRg = reader.getAttributeValue(null,
                        "rg");

                if (tempAttribRg != null) {
                    java.lang.String content = tempAttribRg;

                    object.setRg(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribRg));
                } else {
                }

                handledAttributes.add("rg");

                // handle attribute "ddd"
                java.lang.String tempAttribDdd = reader.getAttributeValue(null,
                        "ddd");

                if (tempAttribDdd != null) {
                    java.lang.String content = tempAttribDdd;

                    object.setDdd(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribDdd));
                } else {
                }

                handledAttributes.add("ddd");

                // handle attribute "uf"
                java.lang.String tempAttribUf = reader.getAttributeValue(null,
                        "uf");

                if (tempAttribUf != null) {
                    java.lang.String content = tempAttribUf;

                    object.setUf(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribUf));
                } else {
                }

                handledAttributes.add("uf");

                // handle attribute "vinculo"
                java.lang.String tempAttribVinculo = reader.getAttributeValue(null,
                        "vinculo");

                if (tempAttribVinculo != null) {
                    java.lang.String content = tempAttribVinculo;

                    object.setVinculo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribVinculo));
                } else {
                }

                handledAttributes.add("vinculo");

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

