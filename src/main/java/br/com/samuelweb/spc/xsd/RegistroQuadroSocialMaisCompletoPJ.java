package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:26
 */
public class RegistroQuadroSocialMaisCompletoPJ implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Registro-Quadro-Social-Mais-Completo-PJ
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for DetalhesSocio1
     */
    protected Detalhe1QuadroSocialMaisCompletoPJ localDetalhesSocio1;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDetalhesSocio1Tracker = false;

    /**
     * field for DetalhesSocio2
     */
    protected Detalhe2QuadroSocialMaisCompletoPJ localDetalhesSocio2;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDetalhesSocio2Tracker = false;

    /**
     * field for Administrativo
     */
    protected QuadroAdministrativoQuadroSocialMaisCompletoPJ localAdministrativo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAdministrativoTracker = false;

    /**
     * field for InformacoesAdicionais1
     */
    protected InformacoesAdicionais1Socios localInformacoesAdicionais1;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localInformacoesAdicionais1Tracker = false;

    /**
     * field for InformacoesAdicionais2
     */
    protected InformacoesAdicionais2Socios localInformacoesAdicionais2;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localInformacoesAdicionais2Tracker = false;

    /**
     * field for InformacoesAdicionais3
     */
    protected InformacoesAdicionais3Socios localInformacoesAdicionais3;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localInformacoesAdicionais3Tracker = false;

    /**
     * field for Restricoes
     * This was an Array!
     */
    protected Restricao[] localRestricoes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRestricoesTracker = false;

    /**
     * field for SemRestricoes
     * This was an Array!
     */
    protected SemRestricao[] localSemRestricoes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSemRestricoesTracker = false;

    public boolean isDetalhesSocio1Specified() {
        return localDetalhesSocio1Tracker;
    }

    /**
     * Auto generated getter method
     * @return Detalhe1QuadroSocialMaisCompletoPJ
     */
    public Detalhe1QuadroSocialMaisCompletoPJ getDetalhesSocio1() {
        return localDetalhesSocio1;
    }

    /**
     * Auto generated setter method
     * @param param DetalhesSocio1
     */
    public void setDetalhesSocio1(Detalhe1QuadroSocialMaisCompletoPJ param) {
        localDetalhesSocio1Tracker = param != null;

        this.localDetalhesSocio1 = param;
    }

    public boolean isDetalhesSocio2Specified() {
        return localDetalhesSocio2Tracker;
    }

    /**
     * Auto generated getter method
     * @return Detalhe2QuadroSocialMaisCompletoPJ
     */
    public Detalhe2QuadroSocialMaisCompletoPJ getDetalhesSocio2() {
        return localDetalhesSocio2;
    }

    /**
     * Auto generated setter method
     * @param param DetalhesSocio2
     */
    public void setDetalhesSocio2(Detalhe2QuadroSocialMaisCompletoPJ param) {
        localDetalhesSocio2Tracker = param != null;

        this.localDetalhesSocio2 = param;
    }

    public boolean isAdministrativoSpecified() {
        return localAdministrativoTracker;
    }

    /**
     * Auto generated getter method
     * @return QuadroAdministrativoQuadroSocialMaisCompletoPJ
     */
    public QuadroAdministrativoQuadroSocialMaisCompletoPJ getAdministrativo() {
        return localAdministrativo;
    }

    /**
     * Auto generated setter method
     * @param param Administrativo
     */
    public void setAdministrativo(
            QuadroAdministrativoQuadroSocialMaisCompletoPJ param) {
        localAdministrativoTracker = param != null;

        this.localAdministrativo = param;
    }

    public boolean isInformacoesAdicionais1Specified() {
        return localInformacoesAdicionais1Tracker;
    }

    /**
     * Auto generated getter method
     * @return InformacoesAdicionais1Socios
     */
    public InformacoesAdicionais1Socios getInformacoesAdicionais1() {
        return localInformacoesAdicionais1;
    }

    /**
     * Auto generated setter method
     * @param param InformacoesAdicionais1
     */
    public void setInformacoesAdicionais1(
            InformacoesAdicionais1Socios param) {
        localInformacoesAdicionais1Tracker = param != null;

        this.localInformacoesAdicionais1 = param;
    }

    public boolean isInformacoesAdicionais2Specified() {
        return localInformacoesAdicionais2Tracker;
    }

    /**
     * Auto generated getter method
     * @return InformacoesAdicionais2Socios
     */
    public InformacoesAdicionais2Socios getInformacoesAdicionais2() {
        return localInformacoesAdicionais2;
    }

    /**
     * Auto generated setter method
     * @param param InformacoesAdicionais2
     */
    public void setInformacoesAdicionais2(
            InformacoesAdicionais2Socios param) {
        localInformacoesAdicionais2Tracker = param != null;

        this.localInformacoesAdicionais2 = param;
    }

    public boolean isInformacoesAdicionais3Specified() {
        return localInformacoesAdicionais3Tracker;
    }

    /**
     * Auto generated getter method
     * @return InformacoesAdicionais3Socios
     */
    public InformacoesAdicionais3Socios getInformacoesAdicionais3() {
        return localInformacoesAdicionais3;
    }

    /**
     * Auto generated setter method
     * @param param InformacoesAdicionais3
     */
    public void setInformacoesAdicionais3(
            InformacoesAdicionais3Socios param) {
        localInformacoesAdicionais3Tracker = param != null;

        this.localInformacoesAdicionais3 = param;
    }

    public boolean isRestricoesSpecified() {
        return localRestricoesTracker;
    }

    /**
     * Auto generated getter method
     * @return Restricao[]
     */
    public Restricao[] getRestricoes() {
        return localRestricoes;
    }

    /**
     * validate the array for Restricoes
     */
    protected void validateRestricoes(Restricao[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Restricoes
     */
    public void setRestricoes(Restricao[] param) {
        validateRestricoes(param);

        localRestricoesTracker = param != null;

        this.localRestricoes = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param Restricao
     */
    public void addRestricoes(Restricao param) {
        if (localRestricoes == null) {
            localRestricoes = new Restricao[] {  };
        }

        //update the setting tracker
        localRestricoesTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localRestricoes);
        list.add(param);
        this.localRestricoes = (Restricao[]) list.toArray(new Restricao[list.size()]);
    }

    public boolean isSemRestricoesSpecified() {
        return localSemRestricoesTracker;
    }

    /**
     * Auto generated getter method
     * @return SemRestricao[]
     */
    public SemRestricao[] getSemRestricoes() {
        return localSemRestricoes;
    }

    /**
     * validate the array for SemRestricoes
     */
    protected void validateSemRestricoes(SemRestricao[] param) {
    }

    /**
     * Auto generated setter method
     * @param param SemRestricoes
     */
    public void setSemRestricoes(SemRestricao[] param) {
        validateSemRestricoes(param);

        localSemRestricoesTracker = param != null;

        this.localSemRestricoes = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param SemRestricao
     */
    public void addSemRestricoes(SemRestricao param) {
        if (localSemRestricoes == null) {
            localSemRestricoes = new SemRestricao[] {  };
        }

        //update the setting tracker
        localSemRestricoesTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localSemRestricoes);
        list.add(param);
        this.localSemRestricoes = (SemRestricao[]) list.toArray(new SemRestricao[list.size()]);
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
                                ":Registro-Quadro-Social-Mais-Completo-PJ", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Registro-Quadro-Social-Mais-Completo-PJ", xmlWriter);
            }
        }

        if (localDetalhesSocio1Tracker) {
            if (localDetalhesSocio1 == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "detalhes-socio-1 cannot be null!!");
            }

            localDetalhesSocio1.serialize(new javax.xml.namespace.QName(
                    "", "detalhes-socio-1"), xmlWriter);
        }

        if (localDetalhesSocio2Tracker) {
            if (localDetalhesSocio2 == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "detalhes-socio-2 cannot be null!!");
            }

            localDetalhesSocio2.serialize(new javax.xml.namespace.QName(
                    "", "detalhes-socio-2"), xmlWriter);
        }

        if (localAdministrativoTracker) {
            if (localAdministrativo == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "administrativo cannot be null!!");
            }

            localAdministrativo.serialize(new javax.xml.namespace.QName(
                    "", "administrativo"), xmlWriter);
        }

        if (localInformacoesAdicionais1Tracker) {
            if (localInformacoesAdicionais1 == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "informacoes-adicionais-1 cannot be null!!");
            }

            localInformacoesAdicionais1.serialize(new javax.xml.namespace.QName(
                    "", "informacoes-adicionais-1"), xmlWriter);
        }

        if (localInformacoesAdicionais2Tracker) {
            if (localInformacoesAdicionais2 == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "informacoes-adicionais-2 cannot be null!!");
            }

            localInformacoesAdicionais2.serialize(new javax.xml.namespace.QName(
                    "", "informacoes-adicionais-2"), xmlWriter);
        }

        if (localInformacoesAdicionais3Tracker) {
            if (localInformacoesAdicionais3 == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "informacoes-adicionais-3 cannot be null!!");
            }

            localInformacoesAdicionais3.serialize(new javax.xml.namespace.QName(
                    "", "informacoes-adicionais-3"), xmlWriter);
        }

        if (localRestricoesTracker) {
            if (localRestricoes != null) {
                for (int i = 0; i < localRestricoes.length; i++) {
                    if (localRestricoes[i] != null) {
                        localRestricoes[i].serialize(new javax.xml.namespace.QName(
                                "", "restricoes"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "restricoes cannot be null!!");
            }
        }

        if (localSemRestricoesTracker) {
            if (localSemRestricoes != null) {
                for (int i = 0; i < localSemRestricoes.length; i++) {
                    if (localSemRestricoes[i] != null) {
                        localSemRestricoes[i].serialize(new javax.xml.namespace.QName(
                                "", "sem-restricoes"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "sem-restricoes cannot be null!!");
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
        public static RegistroQuadroSocialMaisCompletoPJ parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            RegistroQuadroSocialMaisCompletoPJ object = new RegistroQuadroSocialMaisCompletoPJ();

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

                        if (!"Registro-Quadro-Social-Mais-Completo-PJ".equals(
                                type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (RegistroQuadroSocialMaisCompletoPJ) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list7 = new java.util.ArrayList();

                java.util.ArrayList list8 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "detalhes-socio-1").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "detalhes-socio-1").equals(
                                reader.getName())) {
                    object.setDetalhesSocio1(Detalhe1QuadroSocialMaisCompletoPJ.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "detalhes-socio-2").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "detalhes-socio-2").equals(
                                reader.getName())) {
                    object.setDetalhesSocio2(Detalhe2QuadroSocialMaisCompletoPJ.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "administrativo").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "administrativo").equals(
                                reader.getName())) {
                    object.setAdministrativo(QuadroAdministrativoQuadroSocialMaisCompletoPJ.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "informacoes-adicionais-1").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "informacoes-adicionais-1").equals(
                                reader.getName())) {
                    object.setInformacoesAdicionais1(InformacoesAdicionais1Socios.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "informacoes-adicionais-2").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "informacoes-adicionais-2").equals(
                                reader.getName())) {
                    object.setInformacoesAdicionais2(InformacoesAdicionais2Socios.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "informacoes-adicionais-3").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "informacoes-adicionais-3").equals(
                                reader.getName())) {
                    object.setInformacoesAdicionais3(InformacoesAdicionais3Socios.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "restricoes").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "restricoes").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list7.add(Restricao.Factory.parse(reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone7 = false;

                    while (!loopDone7) {
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
                            loopDone7 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "restricoes").equals(
                                    reader.getName())) {
                                list7.add(Restricao.Factory.parse(reader));
                            } else {
                                loopDone7 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setRestricoes((Restricao[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            Restricao.class, list7));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "sem-restricoes").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "sem-restricoes").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list8.add(SemRestricao.Factory.parse(reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone8 = false;

                    while (!loopDone8) {
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
                            loopDone8 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "sem-restricoes").equals(
                                    reader.getName())) {
                                list8.add(SemRestricao.Factory.parse(reader));
                            } else {
                                loopDone8 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setSemRestricoes((SemRestricao[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            SemRestricao.class, list8));
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

