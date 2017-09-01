package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:12
 */
public class InsumoAtividadeEmpresa implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Atividade-Empresa
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for RamoAtividade
     */
    protected RamoAtividade localRamoAtividade;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRamoAtividadeTracker = false;

    /**
     * field for AtividadesEconomicasSecundarias
     * This was an Array!
     */
    protected RamoAtividade[] localAtividadesEconomicasSecundarias;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAtividadesEconomicasSecundariasTracker = false;

    /**
     * field for NumeroCnae
     * This was an Attribute!
     */
    protected java.lang.String localNumeroCnae;

    /**
     * field for PercentualCompra
     * This was an Attribute!
     */
    protected double localPercentualCompra;

    /**
     * field for PercentualVendas
     * This was an Attribute!
     */
    protected double localPercentualVendas;

    /**
     * field for QuantidadeEmpregados
     * This was an Attribute!
     */
    protected int localQuantidadeEmpregados;

    /**
     * field for QuantidadeFiliais
     * This was an Attribute!
     */
    protected int localQuantidadeFiliais;

    public boolean isRamoAtividadeSpecified() {
        return localRamoAtividadeTracker;
    }

    /**
     * Auto generated getter method
     * @return RamoAtividade
     */
    public RamoAtividade getRamoAtividade() {
        return localRamoAtividade;
    }

    /**
     * Auto generated setter method
     * @param param RamoAtividade
     */
    public void setRamoAtividade(RamoAtividade param) {
        localRamoAtividadeTracker = param != null;

        this.localRamoAtividade = param;
    }

    public boolean isAtividadesEconomicasSecundariasSpecified() {
        return localAtividadesEconomicasSecundariasTracker;
    }

    /**
     * Auto generated getter method
     * @return RamoAtividade[]
     */
    public RamoAtividade[] getAtividadesEconomicasSecundarias() {
        return localAtividadesEconomicasSecundarias;
    }

    /**
     * validate the array for AtividadesEconomicasSecundarias
     */
    protected void validateAtividadesEconomicasSecundarias(
            RamoAtividade[] param) {
    }

    /**
     * Auto generated setter method
     * @param param AtividadesEconomicasSecundarias
     */
    public void setAtividadesEconomicasSecundarias(RamoAtividade[] param) {
        validateAtividadesEconomicasSecundarias(param);

        localAtividadesEconomicasSecundariasTracker = param != null;

        this.localAtividadesEconomicasSecundarias = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param RamoAtividade
     */
    public void addAtividadesEconomicasSecundarias(RamoAtividade param) {
        if (localAtividadesEconomicasSecundarias == null) {
            localAtividadesEconomicasSecundarias = new RamoAtividade[] {  };
        }

        //update the setting tracker
        localAtividadesEconomicasSecundariasTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localAtividadesEconomicasSecundarias);
        list.add(param);
        this.localAtividadesEconomicasSecundarias = (RamoAtividade[]) list.toArray(new RamoAtividade[list.size()]);
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumeroCnae() {
        return localNumeroCnae;
    }

    /**
     * Auto generated setter method
     * @param param NumeroCnae
     */
    public void setNumeroCnae(java.lang.String param) {
        this.localNumeroCnae = param;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getPercentualCompra() {
        return localPercentualCompra;
    }

    /**
     * Auto generated setter method
     * @param param PercentualCompra
     */
    public void setPercentualCompra(double param) {
        this.localPercentualCompra = param;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getPercentualVendas() {
        return localPercentualVendas;
    }

    /**
     * Auto generated setter method
     * @param param PercentualVendas
     */
    public void setPercentualVendas(double param) {
        this.localPercentualVendas = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getQuantidadeEmpregados() {
        return localQuantidadeEmpregados;
    }

    /**
     * Auto generated setter method
     * @param param QuantidadeEmpregados
     */
    public void setQuantidadeEmpregados(int param) {
        this.localQuantidadeEmpregados = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getQuantidadeFiliais() {
        return localQuantidadeFiliais;
    }

    /**
     * Auto generated setter method
     * @param param QuantidadeFiliais
     */
    public void setQuantidadeFiliais(int param) {
        this.localQuantidadeFiliais = param;
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
                        namespacePrefix + ":Insumo-Atividade-Empresa", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Atividade-Empresa", xmlWriter);
            }
        }

        if (localNumeroCnae != null) {
            writeAttribute("", "numero-cnae",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNumeroCnae), xmlWriter);
        }

        if (!java.lang.Double.isNaN(localPercentualCompra)) {
            writeAttribute("", "percentual-compra",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPercentualCompra), xmlWriter);
        }

        if (!java.lang.Double.isNaN(localPercentualVendas)) {
            writeAttribute("", "percentual-vendas",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPercentualVendas), xmlWriter);
        }

        if (localQuantidadeEmpregados != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "quantidade-empregados",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localQuantidadeEmpregados), xmlWriter);
        }

        if (localQuantidadeFiliais != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "quantidade-filiais",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localQuantidadeFiliais), xmlWriter);
        }

        if (localRamoAtividadeTracker) {
            if (localRamoAtividade == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "ramo-atividade cannot be null!!");
            }

            localRamoAtividade.serialize(new javax.xml.namespace.QName("",
                    "ramo-atividade"), xmlWriter);
        }

        if (localAtividadesEconomicasSecundariasTracker) {
            if (localAtividadesEconomicasSecundarias != null) {
                for (int i = 0;
                     i < localAtividadesEconomicasSecundarias.length;
                     i++) {
                    if (localAtividadesEconomicasSecundarias[i] != null) {
                        localAtividadesEconomicasSecundarias[i].serialize(new javax.xml.namespace.QName(
                                        "", "atividades-economicas-secundarias"),
                                xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "atividades-economicas-secundarias cannot be null!!");
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
        public static InsumoAtividadeEmpresa parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoAtividadeEmpresa object = new InsumoAtividadeEmpresa();

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

                        if (!"Insumo-Atividade-Empresa".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoAtividadeEmpresa) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "numero-cnae"
                java.lang.String tempAttribNumeroCnae = reader.getAttributeValue(null,
                        "numero-cnae");

                if (tempAttribNumeroCnae != null) {
                    java.lang.String content = tempAttribNumeroCnae;

                    object.setNumeroCnae(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribNumeroCnae));
                } else {
                }

                handledAttributes.add("numero-cnae");

                // handle attribute "percentual-compra"
                java.lang.String tempAttribPercentualCompra = reader.getAttributeValue(null,
                        "percentual-compra");

                if (tempAttribPercentualCompra != null) {
                    java.lang.String content = tempAttribPercentualCompra;

                    object.setPercentualCompra(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            tempAttribPercentualCompra));
                } else {
                    object.setPercentualCompra(java.lang.Double.NaN);
                }

                handledAttributes.add("percentual-compra");

                // handle attribute "percentual-vendas"
                java.lang.String tempAttribPercentualVendas = reader.getAttributeValue(null,
                        "percentual-vendas");

                if (tempAttribPercentualVendas != null) {
                    java.lang.String content = tempAttribPercentualVendas;

                    object.setPercentualVendas(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            tempAttribPercentualVendas));
                } else {
                    object.setPercentualVendas(java.lang.Double.NaN);
                }

                handledAttributes.add("percentual-vendas");

                // handle attribute "quantidade-empregados"
                java.lang.String tempAttribQuantidadeEmpregados = reader.getAttributeValue(null,
                        "quantidade-empregados");

                if (tempAttribQuantidadeEmpregados != null) {
                    java.lang.String content = tempAttribQuantidadeEmpregados;

                    object.setQuantidadeEmpregados(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribQuantidadeEmpregados));
                } else {
                    object.setQuantidadeEmpregados(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("quantidade-empregados");

                // handle attribute "quantidade-filiais"
                java.lang.String tempAttribQuantidadeFiliais = reader.getAttributeValue(null,
                        "quantidade-filiais");

                if (tempAttribQuantidadeFiliais != null) {
                    java.lang.String content = tempAttribQuantidadeFiliais;

                    object.setQuantidadeFiliais(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribQuantidadeFiliais));
                } else {
                    object.setQuantidadeFiliais(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("quantidade-filiais");

                reader.next();

                java.util.ArrayList list2 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ramo-atividade").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "ramo-atividade").equals(
                                reader.getName())) {
                    object.setRamoAtividade(RamoAtividade.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "atividades-economicas-secundarias").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "atividades-economicas-secundarias").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list2.add(RamoAtividade.Factory.parse(reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone2 = false;

                    while (!loopDone2) {
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
                            loopDone2 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "atividades-economicas-secundarias").equals(
                                    reader.getName())) {
                                list2.add(RamoAtividade.Factory.parse(
                                        reader));
                            } else {
                                loopDone2 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setAtividadesEconomicasSecundarias((RamoAtividade[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            RamoAtividade.class, list2));
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

