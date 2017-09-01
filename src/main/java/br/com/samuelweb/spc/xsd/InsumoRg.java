package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:38
 */
public class InsumoRg implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Rg
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Foto
     * This was an Attribute!
     */
    protected java.lang.String localFoto;

    /**
     * field for Municipio
     * This was an Attribute!
     */
    protected java.lang.String localMunicipio;

    /**
     * field for NomePai
     * This was an Attribute!
     */
    protected java.lang.String localNomePai;

    /**
     * field for NomeMae
     * This was an Attribute!
     */
    protected java.lang.String localNomeMae;

    /**
     * field for DataNascimentoRg
     * This was an Attribute!
     */
    protected java.util.Calendar localDataNascimentoRg;

    /**
     * field for Nome
     * This was an Attribute!
     */
    protected java.lang.String localNome;

    /**
     * field for UfEmissaoRg
     * This was an Attribute!
     */
    protected java.lang.String localUfEmissaoRg;

    /**
     * field for NumeroRg
     * This was an Attribute!
     */
    protected java.lang.String localNumeroRg;

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFoto() {
        return localFoto;
    }

    /**
     * Auto generated setter method
     * @param param Foto
     */
    public void setFoto(java.lang.String param) {
        this.localFoto = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMunicipio() {
        return localMunicipio;
    }

    /**
     * Auto generated setter method
     * @param param Municipio
     */
    public void setMunicipio(java.lang.String param) {
        this.localMunicipio = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomePai() {
        return localNomePai;
    }

    /**
     * Auto generated setter method
     * @param param NomePai
     */
    public void setNomePai(java.lang.String param) {
        this.localNomePai = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeMae() {
        return localNomeMae;
    }

    /**
     * Auto generated setter method
     * @param param NomeMae
     */
    public void setNomeMae(java.lang.String param) {
        this.localNomeMae = param;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataNascimentoRg() {
        return localDataNascimentoRg;
    }

    /**
     * Auto generated setter method
     * @param param DataNascimentoRg
     */
    public void setDataNascimentoRg(java.util.Calendar param) {
        this.localDataNascimentoRg = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNome() {
        return localNome;
    }

    /**
     * Auto generated setter method
     * @param param Nome
     */
    public void setNome(java.lang.String param) {
        this.localNome = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUfEmissaoRg() {
        return localUfEmissaoRg;
    }

    /**
     * Auto generated setter method
     * @param param UfEmissaoRg
     */
    public void setUfEmissaoRg(java.lang.String param) {
        this.localUfEmissaoRg = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumeroRg() {
        return localNumeroRg;
    }

    /**
     * Auto generated setter method
     * @param param NumeroRg
     */
    public void setNumeroRg(java.lang.String param) {
        this.localNumeroRg = param;
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
                        namespacePrefix + ":Insumo-Rg", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Rg", xmlWriter);
            }
        }

        if (localFoto != null) {
            writeAttribute("", "foto",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localFoto), xmlWriter);
        }

        if (localMunicipio != null) {
            writeAttribute("", "municipio",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localMunicipio), xmlWriter);
        }

        if (localNomePai != null) {
            writeAttribute("", "nome-pai",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNomePai), xmlWriter);
        }

        if (localNomeMae != null) {
            writeAttribute("", "nome-mae",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNomeMae), xmlWriter);
        }

        if (localDataNascimentoRg != null) {
            writeAttribute("", "data-nascimento-rg",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataNascimentoRg), xmlWriter);
        }

        if (localNome != null) {
            writeAttribute("", "nome",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNome), xmlWriter);
        }

        if (localUfEmissaoRg != null) {
            writeAttribute("", "uf-emissao-rg",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localUfEmissaoRg), xmlWriter);
        }

        if (localNumeroRg != null) {
            writeAttribute("", "numero-rg",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNumeroRg), xmlWriter);
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
        public static InsumoRg parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoRg object = new InsumoRg();

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

                        if (!"Insumo-Rg".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoRg) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "foto"
                java.lang.String tempAttribFoto = reader.getAttributeValue(null,
                        "foto");

                if (tempAttribFoto != null) {
                    java.lang.String content = tempAttribFoto;

                    object.setFoto(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribFoto));
                } else {
                }

                handledAttributes.add("foto");

                // handle attribute "municipio"
                java.lang.String tempAttribMunicipio = reader.getAttributeValue(null,
                        "municipio");

                if (tempAttribMunicipio != null) {
                    java.lang.String content = tempAttribMunicipio;

                    object.setMunicipio(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMunicipio));
                } else {
                }

                handledAttributes.add("municipio");

                // handle attribute "nome-pai"
                java.lang.String tempAttribNomePai = reader.getAttributeValue(null,
                        "nome-pai");

                if (tempAttribNomePai != null) {
                    java.lang.String content = tempAttribNomePai;

                    object.setNomePai(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNomePai));
                } else {
                }

                handledAttributes.add("nome-pai");

                // handle attribute "nome-mae"
                java.lang.String tempAttribNomeMae = reader.getAttributeValue(null,
                        "nome-mae");

                if (tempAttribNomeMae != null) {
                    java.lang.String content = tempAttribNomeMae;

                    object.setNomeMae(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNomeMae));
                } else {
                }

                handledAttributes.add("nome-mae");

                // handle attribute "data-nascimento-rg"
                java.lang.String tempAttribDataNascimentoRg = reader.getAttributeValue(null,
                        "data-nascimento-rg");

                if (tempAttribDataNascimentoRg != null) {
                    java.lang.String content = tempAttribDataNascimentoRg;

                    object.setDataNascimentoRg(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataNascimentoRg));
                } else {
                }

                handledAttributes.add("data-nascimento-rg");

                // handle attribute "nome"
                java.lang.String tempAttribNome = reader.getAttributeValue(null,
                        "nome");

                if (tempAttribNome != null) {
                    java.lang.String content = tempAttribNome;

                    object.setNome(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNome));
                } else {
                }

                handledAttributes.add("nome");

                // handle attribute "uf-emissao-rg"
                java.lang.String tempAttribUfEmissaoRg = reader.getAttributeValue(null,
                        "uf-emissao-rg");

                if (tempAttribUfEmissaoRg != null) {
                    java.lang.String content = tempAttribUfEmissaoRg;

                    object.setUfEmissaoRg(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribUfEmissaoRg));
                } else {
                }

                handledAttributes.add("uf-emissao-rg");

                // handle attribute "numero-rg"
                java.lang.String tempAttribNumeroRg = reader.getAttributeValue(null,
                        "numero-rg");

                if (tempAttribNumeroRg != null) {
                    java.lang.String content = tempAttribNumeroRg;

                    object.setNumeroRg(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNumeroRg));
                } else {
                }

                handledAttributes.add("numero-rg");

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

