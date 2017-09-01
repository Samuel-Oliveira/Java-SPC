package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:31
 */
public class Detalhe1QuadroSocialMaisCompletoPJ implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Detalhe1QuadroSocialMaisCompletoPJ
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for DataEntrada
     * This was an Attribute!
     */
    protected java.util.Calendar localDataEntrada;

    /**
     * field for Documento
     * This was an Attribute!
     */
    protected java.lang.String localDocumento;

    /**
     * field for Nacionalidade
     * This was an Attribute!
     */
    protected java.lang.String localNacionalidade;

    /**
     * field for Nome
     * This was an Attribute!
     */
    protected java.lang.String localNome;

    /**
     * field for Percentual
     * This was an Attribute!
     */
    protected double localPercentual;

    /**
     * field for TipoPessoa
     * This was an Attribute!
     */
    protected java.lang.String localTipoPessoa;

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataEntrada() {
        return localDataEntrada;
    }

    /**
     * Auto generated setter method
     * @param param DataEntrada
     */
    public void setDataEntrada(java.util.Calendar param) {
        this.localDataEntrada = param;
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
    public java.lang.String getNacionalidade() {
        return localNacionalidade;
    }

    /**
     * Auto generated setter method
     * @param param Nacionalidade
     */
    public void setNacionalidade(java.lang.String param) {
        this.localNacionalidade = param;
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
     * @return double
     */
    public double getPercentual() {
        return localPercentual;
    }

    /**
     * Auto generated setter method
     * @param param Percentual
     */
    public void setPercentual(double param) {
        this.localPercentual = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTipoPessoa() {
        return localTipoPessoa;
    }

    /**
     * Auto generated setter method
     * @param param TipoPessoa
     */
    public void setTipoPessoa(java.lang.String param) {
        this.localTipoPessoa = param;
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
                        namespacePrefix +
                                ":Detalhe1QuadroSocialMaisCompletoPJ", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Detalhe1QuadroSocialMaisCompletoPJ", xmlWriter);
            }
        }

        if (localDataEntrada != null) {
            writeAttribute("", "dataEntrada",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataEntrada), xmlWriter);
        }

        if (localDocumento != null) {
            writeAttribute("", "documento",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDocumento), xmlWriter);
        }

        if (localNacionalidade != null) {
            writeAttribute("", "nacionalidade",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNacionalidade), xmlWriter);
        }

        if (localNome != null) {
            writeAttribute("", "nome",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNome), xmlWriter);
        }

        if (!java.lang.Double.isNaN(localPercentual)) {
            writeAttribute("", "percentual",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPercentual), xmlWriter);
        }

        if (localTipoPessoa != null) {
            writeAttribute("", "tipoPessoa",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTipoPessoa), xmlWriter);
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
        public static Detalhe1QuadroSocialMaisCompletoPJ parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            Detalhe1QuadroSocialMaisCompletoPJ object = new Detalhe1QuadroSocialMaisCompletoPJ();

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

                        if (!"Detalhe1QuadroSocialMaisCompletoPJ".equals(
                                type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (Detalhe1QuadroSocialMaisCompletoPJ) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "dataEntrada"
                java.lang.String tempAttribDataEntrada = reader.getAttributeValue(null,
                        "dataEntrada");

                if (tempAttribDataEntrada != null) {
                    java.lang.String content = tempAttribDataEntrada;

                    object.setDataEntrada(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataEntrada));
                } else {
                }

                handledAttributes.add("dataEntrada");

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

                // handle attribute "nacionalidade"
                java.lang.String tempAttribNacionalidade = reader.getAttributeValue(null,
                        "nacionalidade");

                if (tempAttribNacionalidade != null) {
                    java.lang.String content = tempAttribNacionalidade;

                    object.setNacionalidade(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNacionalidade));
                } else {
                }

                handledAttributes.add("nacionalidade");

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

                // handle attribute "percentual"
                java.lang.String tempAttribPercentual = reader.getAttributeValue(null,
                        "percentual");

                if (tempAttribPercentual != null) {
                    java.lang.String content = tempAttribPercentual;

                    object.setPercentual(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            tempAttribPercentual));
                } else {
                    object.setPercentual(java.lang.Double.NaN);
                }

                handledAttributes.add("percentual");

                // handle attribute "tipoPessoa"
                java.lang.String tempAttribTipoPessoa = reader.getAttributeValue(null,
                        "tipoPessoa");

                if (tempAttribTipoPessoa != null) {
                    java.lang.String content = tempAttribTipoPessoa;

                    object.setTipoPessoa(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribTipoPessoa));
                } else {
                }

                handledAttributes.add("tipoPessoa");

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
