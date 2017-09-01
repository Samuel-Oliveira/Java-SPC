package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:09
 */
public class InsumoParticipacaoEmpresas
        extends InsumoQuadroSocietario implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Participacao-Empresas
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Participante
     * This was an Array!
     */
    protected InsumoQuadroSocietario[] localParticipante;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localParticipanteTracker = false;

    /**
     * field for IndicadorRestricao
     * This was an Attribute!
     */
    protected boolean localIndicadorRestricao;

    public boolean isParticipanteSpecified() {
        return localParticipanteTracker;
    }

    /**
     * Auto generated getter method
     * @return InsumoQuadroSocietario[]
     */
    public InsumoQuadroSocietario[] getParticipante() {
        return localParticipante;
    }

    /**
     * validate the array for Participante
     */
    protected void validateParticipante(InsumoQuadroSocietario[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Participante
     */
    public void setParticipante(InsumoQuadroSocietario[] param) {
        validateParticipante(param);

        localParticipanteTracker = param != null;

        this.localParticipante = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param InsumoQuadroSocietario
     */
    public void addParticipante(InsumoQuadroSocietario param) {
        if (localParticipante == null) {
            localParticipante = new InsumoQuadroSocietario[] {  };
        }

        //update the setting tracker
        localParticipanteTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localParticipante);
        list.add(param);
        this.localParticipante = (InsumoQuadroSocietario[]) list.toArray(new InsumoQuadroSocietario[list.size()]);
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIndicadorRestricao() {
        return localIndicadorRestricao;
    }

    /**
     * Auto generated setter method
     * @param param IndicadorRestricao
     */
    public void setIndicadorRestricao(boolean param) {
        this.localIndicadorRestricao = param;
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

        java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                "http://webservice.consulta.spcjava.spcbrasil.org/");

        if ((namespacePrefix != null) &&
                (namespacePrefix.trim().length() > 0)) {
            writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":Insumo-Participacao-Empresas", xmlWriter);
        } else {
            writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Insumo-Participacao-Empresas", xmlWriter);
        }

        if (localCargoAdministracao != null) {
            writeAttribute("", "cargo-administracao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCargoAdministracao), xmlWriter);
        }

        if (localCargoDirecao != null) {
            writeAttribute("", "cargo-direcao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCargoDirecao), xmlWriter);
        }

        if (localCondicao != null) {
            writeAttribute("", "condicao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCondicao), xmlWriter);
        }

        if (localDataEntrada != null) {
            writeAttribute("", "data-entrada",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataEntrada), xmlWriter);
        }

        if (localDataSaida != null) {
            writeAttribute("", "data-saida",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataSaida), xmlWriter);
        }

        if (localDocumento != null) {
            writeAttribute("", "documento",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDocumento), xmlWriter);
        }

        if (localMunicipioEMBRATEL != null) {
            writeAttribute("", "municipio-EMBRATEL",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localMunicipioEMBRATEL), xmlWriter);
        }

        if (localNome != null) {
            writeAttribute("", "nome",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNome), xmlWriter);
        }

        if (localPorcentualParticipacao != null) {
            writeAttribute("", "porcentual-participacao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localPorcentualParticipacao), xmlWriter);
        }

        if (localSituacaoDocumento != null) {
            writeAttribute("", "situacao-documento",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSituacaoDocumento), xmlWriter);
        }

        if (localTipoRelacionamento != null) {
            writeAttribute("", "tipo-relacionamento",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTipoRelacionamento), xmlWriter);
        }

        if (localDataUltimaAtualizacao != null) {
            writeAttribute("", "data-ultima-atualizacao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataUltimaAtualizacao), xmlWriter);
        }

        if (localValorParticipacao != null) {
            writeAttribute("", "valor-participacao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localValorParticipacao), xmlWriter);
        }

        if (true) {
            writeAttribute("", "indicador-restricao",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localIndicadorRestricao), xmlWriter);
        }

        if (localNacionalidadeTracker) {
            if (localNacionalidade == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "nacionalidade cannot be null!!");
            }

            localNacionalidade.serialize(new javax.xml.namespace.QName("",
                    "nacionalidade"), xmlWriter);
        }

        if (localEstadoEMBRATELTracker) {
            if (localEstadoEMBRATEL == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "estado-EMBRATEL cannot be null!!");
            }

            localEstadoEMBRATEL.serialize(new javax.xml.namespace.QName(
                    "", "estado-EMBRATEL"), xmlWriter);
        }

        if (localParticipanteTracker) {
            if (localParticipante != null) {
                for (int i = 0; i < localParticipante.length; i++) {
                    if (localParticipante[i] != null) {
                        localParticipante[i].serialize(new javax.xml.namespace.QName(
                                "", "participante"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "participante cannot be null!!");
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
        public static InsumoParticipacaoEmpresas parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoParticipacaoEmpresas object = new InsumoParticipacaoEmpresas();

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

                        if (!"Insumo-Participacao-Empresas".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoParticipacaoEmpresas) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "cargo-administracao"
                java.lang.String tempAttribCargoAdministracao = reader.getAttributeValue(null,
                        "cargo-administracao");

                if (tempAttribCargoAdministracao != null) {
                    java.lang.String content = tempAttribCargoAdministracao;

                    object.setCargoAdministracao(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCargoAdministracao));
                } else {
                }

                handledAttributes.add("cargo-administracao");

                // handle attribute "cargo-direcao"
                java.lang.String tempAttribCargoDirecao = reader.getAttributeValue(null,
                        "cargo-direcao");

                if (tempAttribCargoDirecao != null) {
                    java.lang.String content = tempAttribCargoDirecao;

                    object.setCargoDirecao(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCargoDirecao));
                } else {
                }

                handledAttributes.add("cargo-direcao");

                // handle attribute "condicao"
                java.lang.String tempAttribCondicao = reader.getAttributeValue(null,
                        "condicao");

                if (tempAttribCondicao != null) {
                    java.lang.String content = tempAttribCondicao;

                    object.setCondicao(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribCondicao));
                } else {
                }

                handledAttributes.add("condicao");

                // handle attribute "data-entrada"
                java.lang.String tempAttribDataEntrada = reader.getAttributeValue(null,
                        "data-entrada");

                if (tempAttribDataEntrada != null) {
                    java.lang.String content = tempAttribDataEntrada;

                    object.setDataEntrada(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataEntrada));
                } else {
                }

                handledAttributes.add("data-entrada");

                // handle attribute "data-saida"
                java.lang.String tempAttribDataSaida = reader.getAttributeValue(null,
                        "data-saida");

                if (tempAttribDataSaida != null) {
                    java.lang.String content = tempAttribDataSaida;

                    object.setDataSaida(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataSaida));
                } else {
                }

                handledAttributes.add("data-saida");

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

                // handle attribute "municipio-EMBRATEL"
                java.lang.String tempAttribMunicipioEMBRATEL = reader.getAttributeValue(null,
                        "municipio-EMBRATEL");

                if (tempAttribMunicipioEMBRATEL != null) {
                    java.lang.String content = tempAttribMunicipioEMBRATEL;

                    object.setMunicipioEMBRATEL(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMunicipioEMBRATEL));
                } else {
                }

                handledAttributes.add("municipio-EMBRATEL");

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

                // handle attribute "porcentual-participacao"
                java.lang.String tempAttribPorcentualParticipacao = reader.getAttributeValue(null,
                        "porcentual-participacao");

                if (tempAttribPorcentualParticipacao != null) {
                    java.lang.String content = tempAttribPorcentualParticipacao;

                    object.setPorcentualParticipacao(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribPorcentualParticipacao));
                } else {
                }

                handledAttributes.add("porcentual-participacao");

                // handle attribute "situacao-documento"
                java.lang.String tempAttribSituacaoDocumento = reader.getAttributeValue(null,
                        "situacao-documento");

                if (tempAttribSituacaoDocumento != null) {
                    java.lang.String content = tempAttribSituacaoDocumento;

                    object.setSituacaoDocumento(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribSituacaoDocumento));
                } else {
                }

                handledAttributes.add("situacao-documento");

                // handle attribute "tipo-relacionamento"
                java.lang.String tempAttribTipoRelacionamento = reader.getAttributeValue(null,
                        "tipo-relacionamento");

                if (tempAttribTipoRelacionamento != null) {
                    java.lang.String content = tempAttribTipoRelacionamento;

                    object.setTipoRelacionamento(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribTipoRelacionamento));
                } else {
                }

                handledAttributes.add("tipo-relacionamento");

                // handle attribute "data-ultima-atualizacao"
                java.lang.String tempAttribDataUltimaAtualizacao = reader.getAttributeValue(null,
                        "data-ultima-atualizacao");

                if (tempAttribDataUltimaAtualizacao != null) {
                    java.lang.String content = tempAttribDataUltimaAtualizacao;

                    object.setDataUltimaAtualizacao(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataUltimaAtualizacao));
                } else {
                }

                handledAttributes.add("data-ultima-atualizacao");

                // handle attribute "valor-participacao"
                java.lang.String tempAttribValorParticipacao = reader.getAttributeValue(null,
                        "valor-participacao");

                if (tempAttribValorParticipacao != null) {
                    java.lang.String content = tempAttribValorParticipacao;

                    object.setValorParticipacao(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            tempAttribValorParticipacao));
                } else {
                }

                handledAttributes.add("valor-participacao");

                // handle attribute "indicador-restricao"
                java.lang.String tempAttribIndicadorRestricao = reader.getAttributeValue(null,
                        "indicador-restricao");

                if (tempAttribIndicadorRestricao != null) {
                    java.lang.String content = tempAttribIndicadorRestricao;

                    object.setIndicadorRestricao(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            tempAttribIndicadorRestricao));
                } else {
                }

                handledAttributes.add("indicador-restricao");

                reader.next();

                java.util.ArrayList list3 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "nacionalidade").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "nacionalidade").equals(
                                reader.getName())) {
                    object.setNacionalidade(Pais.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "estado-EMBRATEL").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "estado-EMBRATEL").equals(
                                reader.getName())) {
                    object.setEstadoEMBRATEL(Estado.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "participante").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "participante").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list3.add(InsumoQuadroSocietario.Factory.parse(reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone3 = false;

                    while (!loopDone3) {
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
                            loopDone3 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "participante").equals(
                                    reader.getName())) {
                                list3.add(InsumoQuadroSocietario.Factory.parse(
                                        reader));
                            } else {
                                loopDone3 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setParticipante((InsumoQuadroSocietario[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            InsumoQuadroSocietario.class, list3));
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

