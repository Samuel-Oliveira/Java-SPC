package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:04
 */
public class PessoaFisica implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Pessoa-Fisica
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Cpf
     */
    protected Cpf localCpf;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCpfTracker = false;

    /**
     * field for SituacaoCpf
     */
    protected SituacaoDocumentoWS localSituacaoCpf;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSituacaoCpfTracker = false;

    /**
     * field for EstadoRg
     */
    protected Estado localEstadoRg;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEstadoRgTracker = false;

    /**
     * field for Endereco
     */
    protected Endereco localEndereco;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnderecoTracker = false;

    /**
     * field for TelefoneResidencial
     */
    protected Telefone localTelefoneResidencial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneResidencialTracker = false;

    /**
     * field for TelefoneCelular
     */
    protected Telefone localTelefoneCelular;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneCelularTracker = false;

    /**
     * field for TelefoneComercial
     */
    protected Telefone localTelefoneComercial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneComercialTracker = false;

    /**
     * field for Fax
     */
    protected Telefone localFax;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFaxTracker = false;

    /**
     * field for DataNascimento
     * This was an Attribute!
     */
    protected java.util.Calendar localDataNascimento;

    /**
     * field for Email
     * This was an Attribute!
     */
    protected java.lang.String localEmail;

    /**
     * field for EstadoCivil
     * This was an Attribute!
     */
    protected EstadoCivil localEstadoCivil;

    /**
     * field for Idade
     * This was an Attribute!
     */
    protected int localIdade;

    /**
     * field for Nome
     * This was an Attribute!
     */
    protected java.lang.String localNome;

    /**
     * field for NomeMae
     * This was an Attribute!
     */
    protected java.lang.String localNomeMae;

    /**
     * field for NomePai
     * This was an Attribute!
     */
    protected java.lang.String localNomePai;

    /**
     * field for NumeroRg
     * This was an Attribute!
     */
    protected java.lang.String localNumeroRg;

    /**
     * field for NumeroTituloEleitor
     * This was an Attribute!
     */
    protected long localNumeroTituloEleitor;

    /**
     * field for Sexo
     * This was an Attribute!
     */
    protected Sexo localSexo;

    /**
     * field for Signo
     * This was an Attribute!
     */
    protected Signo localSigno;

    public boolean isCpfSpecified() {
        return localCpfTracker;
    }

    /**
     * Auto generated getter method
     * @return Cpf
     */
    public Cpf getCpf() {
        return localCpf;
    }

    /**
     * Auto generated setter method
     * @param param Cpf
     */
    public void setCpf(Cpf param) {
        localCpfTracker = param != null;

        this.localCpf = param;
    }

    public boolean isSituacaoCpfSpecified() {
        return localSituacaoCpfTracker;
    }

    /**
     * Auto generated getter method
     * @return SituacaoDocumentoWS
     */
    public SituacaoDocumentoWS getSituacaoCpf() {
        return localSituacaoCpf;
    }

    /**
     * Auto generated setter method
     * @param param SituacaoCpf
     */
    public void setSituacaoCpf(SituacaoDocumentoWS param) {
        localSituacaoCpfTracker = param != null;

        this.localSituacaoCpf = param;
    }

    public boolean isEstadoRgSpecified() {
        return localEstadoRgTracker;
    }

    /**
     * Auto generated getter method
     * @return Estado
     */
    public Estado getEstadoRg() {
        return localEstadoRg;
    }

    /**
     * Auto generated setter method
     * @param param EstadoRg
     */
    public void setEstadoRg(Estado param) {
        localEstadoRgTracker = param != null;

        this.localEstadoRg = param;
    }

    public boolean isEnderecoSpecified() {
        return localEnderecoTracker;
    }

    /**
     * Auto generated getter method
     * @return Endereco
     */
    public Endereco getEndereco() {
        return localEndereco;
    }

    /**
     * Auto generated setter method
     * @param param Endereco
     */
    public void setEndereco(Endereco param) {
        localEnderecoTracker = param != null;

        this.localEndereco = param;
    }

    public boolean isTelefoneResidencialSpecified() {
        return localTelefoneResidencialTracker;
    }

    /**
     * Auto generated getter method
     * @return Telefone
     */
    public Telefone getTelefoneResidencial() {
        return localTelefoneResidencial;
    }

    /**
     * Auto generated setter method
     * @param param TelefoneResidencial
     */
    public void setTelefoneResidencial(Telefone param) {
        localTelefoneResidencialTracker = param != null;

        this.localTelefoneResidencial = param;
    }

    public boolean isTelefoneCelularSpecified() {
        return localTelefoneCelularTracker;
    }

    /**
     * Auto generated getter method
     * @return Telefone
     */
    public Telefone getTelefoneCelular() {
        return localTelefoneCelular;
    }

    /**
     * Auto generated setter method
     * @param param TelefoneCelular
     */
    public void setTelefoneCelular(Telefone param) {
        localTelefoneCelularTracker = param != null;

        this.localTelefoneCelular = param;
    }

    public boolean isTelefoneComercialSpecified() {
        return localTelefoneComercialTracker;
    }

    /**
     * Auto generated getter method
     * @return Telefone
     */
    public Telefone getTelefoneComercial() {
        return localTelefoneComercial;
    }

    /**
     * Auto generated setter method
     * @param param TelefoneComercial
     */
    public void setTelefoneComercial(Telefone param) {
        localTelefoneComercialTracker = param != null;

        this.localTelefoneComercial = param;
    }

    public boolean isFaxSpecified() {
        return localFaxTracker;
    }

    /**
     * Auto generated getter method
     * @return Telefone
     */
    public Telefone getFax() {
        return localFax;
    }

    /**
     * Auto generated setter method
     * @param param Fax
     */
    public void setFax(Telefone param) {
        localFaxTracker = param != null;

        this.localFax = param;
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
    public java.lang.String getEmail() {
        return localEmail;
    }

    /**
     * Auto generated setter method
     * @param param Email
     */
    public void setEmail(java.lang.String param) {
        this.localEmail = param;
    }

    /**
     * Auto generated getter method
     * @return EstadoCivil
     */
    public EstadoCivil getEstadoCivil() {
        return localEstadoCivil;
    }

    /**
     * Auto generated setter method
     * @param param EstadoCivil
     */
    public void setEstadoCivil(EstadoCivil param) {
        this.localEstadoCivil = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getIdade() {
        return localIdade;
    }

    /**
     * Auto generated setter method
     * @param param Idade
     */
    public void setIdade(int param) {
        this.localIdade = param;
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
     * Auto generated getter method
     * @return long
     */
    public long getNumeroTituloEleitor() {
        return localNumeroTituloEleitor;
    }

    /**
     * Auto generated setter method
     * @param param NumeroTituloEleitor
     */
    public void setNumeroTituloEleitor(long param) {
        this.localNumeroTituloEleitor = param;
    }

    /**
     * Auto generated getter method
     * @return Sexo
     */
    public Sexo getSexo() {
        return localSexo;
    }

    /**
     * Auto generated setter method
     * @param param Sexo
     */
    public void setSexo(Sexo param) {
        this.localSexo = param;
    }

    /**
     * Auto generated getter method
     * @return Signo
     */
    public Signo getSigno() {
        return localSigno;
    }

    /**
     * Auto generated setter method
     * @param param Signo
     */
    public void setSigno(Signo param) {
        this.localSigno = param;
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
                        namespacePrefix + ":Pessoa-Fisica", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Pessoa-Fisica", xmlWriter);
            }
        }

        if (localDataNascimento != null) {
            writeAttribute("", "data-nascimento",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localDataNascimento), xmlWriter);
        }

        if (localEmail != null) {
            writeAttribute("", "email",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localEmail), xmlWriter);
        }

        if (localEstadoCivil != null) {
            writeAttribute("", "estado-civil", localEstadoCivil.toString(),
                    xmlWriter);
        }

        if (localIdade != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "idade",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localIdade), xmlWriter);
        }

        if (localNome != null) {
            writeAttribute("", "nome",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNome), xmlWriter);
        }

        if (localNomeMae != null) {
            writeAttribute("", "nome-mae",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNomeMae), xmlWriter);
        }

        if (localNomePai != null) {
            writeAttribute("", "nome-pai",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNomePai), xmlWriter);
        }

        if (localNumeroRg != null) {
            writeAttribute("", "numero-rg",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNumeroRg), xmlWriter);
        }

        if (localNumeroTituloEleitor != java.lang.Long.MIN_VALUE) {
            writeAttribute("", "numero-titulo-eleitor",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNumeroTituloEleitor), xmlWriter);
        }

        if (localSexo != null) {
            writeAttribute("", "sexo", localSexo.toString(), xmlWriter);
        }

        if (localSigno != null) {
            writeAttribute("", "signo", localSigno.toString(), xmlWriter);
        }

        if (localCpfTracker) {
            if (localCpf == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "cpf cannot be null!!");
            }

            localCpf.serialize(new javax.xml.namespace.QName("", "cpf"),
                    xmlWriter);
        }

        if (localSituacaoCpfTracker) {
            if (localSituacaoCpf == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "situacao-cpf cannot be null!!");
            }

            localSituacaoCpf.serialize(new javax.xml.namespace.QName("",
                    "situacao-cpf"), xmlWriter);
        }

        if (localEstadoRgTracker) {
            if (localEstadoRg == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "estado-rg cannot be null!!");
            }

            localEstadoRg.serialize(new javax.xml.namespace.QName("",
                    "estado-rg"), xmlWriter);
        }

        if (localEnderecoTracker) {
            if (localEndereco == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "endereco cannot be null!!");
            }

            localEndereco.serialize(new javax.xml.namespace.QName("",
                    "endereco"), xmlWriter);
        }

        if (localTelefoneResidencialTracker) {
            if (localTelefoneResidencial == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "telefone-residencial cannot be null!!");
            }

            localTelefoneResidencial.serialize(new javax.xml.namespace.QName(
                    "", "telefone-residencial"), xmlWriter);
        }

        if (localTelefoneCelularTracker) {
            if (localTelefoneCelular == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "telefone-celular cannot be null!!");
            }

            localTelefoneCelular.serialize(new javax.xml.namespace.QName(
                    "", "telefone-celular"), xmlWriter);
        }

        if (localTelefoneComercialTracker) {
            if (localTelefoneComercial == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "telefone-comercial cannot be null!!");
            }

            localTelefoneComercial.serialize(new javax.xml.namespace.QName(
                    "", "telefone-comercial"), xmlWriter);
        }

        if (localFaxTracker) {
            if (localFax == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "fax cannot be null!!");
            }

            localFax.serialize(new javax.xml.namespace.QName("", "fax"),
                    xmlWriter);
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
        public static PessoaFisica parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            PessoaFisica object = new PessoaFisica();

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

                        if (!"Pessoa-Fisica".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (PessoaFisica) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "data-nascimento"
                java.lang.String tempAttribDataNascimento = reader.getAttributeValue(null,
                        "data-nascimento");

                if (tempAttribDataNascimento != null) {
                    java.lang.String content = tempAttribDataNascimento;

                    object.setDataNascimento(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            tempAttribDataNascimento));
                } else {
                }

                handledAttributes.add("data-nascimento");

                // handle attribute "email"
                java.lang.String tempAttribEmail = reader.getAttributeValue(null,
                        "email");

                if (tempAttribEmail != null) {
                    java.lang.String content = tempAttribEmail;

                    object.setEmail(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribEmail));
                } else {
                }

                handledAttributes.add("email");

                // handle attribute "estado-civil"
                java.lang.String tempAttribEstadoCivil = reader.getAttributeValue(null,
                        "estado-civil");

                if (tempAttribEstadoCivil != null) {
                    java.lang.String content = tempAttribEstadoCivil;

                    object.setEstadoCivil(EstadoCivil.Factory.fromString(
                            reader, tempAttribEstadoCivil));
                } else {
                }

                handledAttributes.add("estado-civil");

                // handle attribute "idade"
                java.lang.String tempAttribIdade = reader.getAttributeValue(null,
                        "idade");

                if (tempAttribIdade != null) {
                    java.lang.String content = tempAttribIdade;

                    object.setIdade(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribIdade));
                } else {
                    object.setIdade(java.lang.Integer.MIN_VALUE);
                }

                handledAttributes.add("idade");

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

                // handle attribute "numero-titulo-eleitor"
                java.lang.String tempAttribNumeroTituloEleitor = reader.getAttributeValue(null,
                        "numero-titulo-eleitor");

                if (tempAttribNumeroTituloEleitor != null) {
                    java.lang.String content = tempAttribNumeroTituloEleitor;

                    object.setNumeroTituloEleitor(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            tempAttribNumeroTituloEleitor));
                } else {
                    object.setNumeroTituloEleitor(java.lang.Long.MIN_VALUE);
                }

                handledAttributes.add("numero-titulo-eleitor");

                // handle attribute "sexo"
                java.lang.String tempAttribSexo = reader.getAttributeValue(null,
                        "sexo");

                if (tempAttribSexo != null) {
                    java.lang.String content = tempAttribSexo;

                    object.setSexo(Sexo.Factory.fromString(reader,
                            tempAttribSexo));
                } else {
                }

                handledAttributes.add("sexo");

                // handle attribute "signo"
                java.lang.String tempAttribSigno = reader.getAttributeValue(null,
                        "signo");

                if (tempAttribSigno != null) {
                    java.lang.String content = tempAttribSigno;

                    object.setSigno(Signo.Factory.fromString(reader,
                            tempAttribSigno));
                } else {
                }

                handledAttributes.add("signo");

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "cpf").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "cpf").equals(
                                reader.getName())) {
                    object.setCpf(Cpf.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "situacao-cpf").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "situacao-cpf").equals(
                                reader.getName())) {
                    object.setSituacaoCpf(SituacaoDocumentoWS.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "estado-rg").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "estado-rg").equals(
                                reader.getName())) {
                    object.setEstadoRg(Estado.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "endereco").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "endereco").equals(
                                reader.getName())) {
                    object.setEndereco(Endereco.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "telefone-residencial").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "telefone-residencial").equals(reader.getName())) {
                    object.setTelefoneResidencial(Telefone.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "telefone-celular").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "telefone-celular").equals(
                                reader.getName())) {
                    object.setTelefoneCelular(Telefone.Factory.parse(reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "telefone-comercial").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "telefone-comercial").equals(reader.getName())) {
                    object.setTelefoneComercial(Telefone.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "fax").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "fax").equals(
                                reader.getName())) {
                    object.setFax(Telefone.Factory.parse(reader));

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

