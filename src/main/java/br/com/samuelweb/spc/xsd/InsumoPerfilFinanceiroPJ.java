package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:10
 */
public class InsumoPerfilFinanceiroPJ implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-Perfil-Financeiro-PJ
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for FraseConclusao
     */
    protected PerfilFinanceiroFraseConclusao localFraseConclusao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFraseConclusaoTracker = false;

    /**
     * field for PerfilFinanceiroIdentificacaoEmpresa
     */
    protected PerfilFinanceiroIdentificacaoEmpresa localPerfilFinanceiroIdentificacaoEmpresa;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPerfilFinanceiroIdentificacaoEmpresaTracker = false;

    /**
     * field for PerfilFinanceiroContasAtivo
     */
    protected PerfilFinanceiroContasAtivo localPerfilFinanceiroContasAtivo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPerfilFinanceiroContasAtivoTracker = false;

    /**
     * field for PerfilFinanceiroContasAtivos
     * This was an Array!
     */
    protected PerfilFinanceiroContasAtivo[] localPerfilFinanceiroContasAtivos;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPerfilFinanceiroContasAtivosTracker = false;

    /**
     * field for PerfilFinanceiroContasPassivo
     */
    protected PerfilFinanceiroContasPassivo localPerfilFinanceiroContasPassivo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPerfilFinanceiroContasPassivoTracker = false;

    /**
     * field for PerfilFinanceirosContasPassivos
     * This was an Array!
     */
    protected PerfilFinanceiroContasPassivo[] localPerfilFinanceirosContasPassivos;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPerfilFinanceirosContasPassivosTracker = false;

    /**
     * field for PerfilFinanceiroResultado
     */
    protected PerfilFinanceiroResultado localPerfilFinanceiroResultado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPerfilFinanceiroResultadoTracker = false;

    /**
     * field for PerfilFinanceiroResultados
     * This was an Array!
     */
    protected PerfilFinanceiroResultado[] localPerfilFinanceiroResultados;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPerfilFinanceiroResultadosTracker = false;

    /**
     * field for PerfilFinanceiroIdentificacaoBalanco
     */
    protected PerfilFinanceiroIdentificacaoBalanco localPerfilFinanceiroIdentificacaoBalanco;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPerfilFinanceiroIdentificacaoBalancoTracker = false;

    /**
     * field for PerfilFinanceiroIndicesIntegrado
     */
    protected PerfilFinanceiroIndicesFinanceiroIntegrado localPerfilFinanceiroIndicesIntegrado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPerfilFinanceiroIndicesIntegradoTracker = false;

    /**
     * field for PerfilFinanceiroIndicesIntegrados
     * This was an Array!
     */
    protected PerfilFinanceiroIndicesFinanceiroIntegrado[] localPerfilFinanceiroIndicesIntegrados;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPerfilFinanceiroIndicesIntegradosTracker = false;

    public boolean isFraseConclusaoSpecified() {
        return localFraseConclusaoTracker;
    }

    /**
     * Auto generated getter method
     * @return PerfilFinanceiroFraseConclusao
     */
    public PerfilFinanceiroFraseConclusao getFraseConclusao() {
        return localFraseConclusao;
    }

    /**
     * Auto generated setter method
     * @param param FraseConclusao
     */
    public void setFraseConclusao(PerfilFinanceiroFraseConclusao param) {
        localFraseConclusaoTracker = param != null;

        this.localFraseConclusao = param;
    }

    public boolean isPerfilFinanceiroIdentificacaoEmpresaSpecified() {
        return localPerfilFinanceiroIdentificacaoEmpresaTracker;
    }

    /**
     * Auto generated getter method
     * @return PerfilFinanceiroIdentificacaoEmpresa
     */
    public PerfilFinanceiroIdentificacaoEmpresa getPerfilFinanceiroIdentificacaoEmpresa() {
        return localPerfilFinanceiroIdentificacaoEmpresa;
    }

    /**
     * Auto generated setter method
     * @param param PerfilFinanceiroIdentificacaoEmpresa
     */
    public void setPerfilFinanceiroIdentificacaoEmpresa(
            PerfilFinanceiroIdentificacaoEmpresa param) {
        localPerfilFinanceiroIdentificacaoEmpresaTracker = param != null;

        this.localPerfilFinanceiroIdentificacaoEmpresa = param;
    }

    public boolean isPerfilFinanceiroContasAtivoSpecified() {
        return localPerfilFinanceiroContasAtivoTracker;
    }

    /**
     * Auto generated getter method
     * @return PerfilFinanceiroContasAtivo
     */
    public PerfilFinanceiroContasAtivo getPerfilFinanceiroContasAtivo() {
        return localPerfilFinanceiroContasAtivo;
    }

    /**
     * Auto generated setter method
     * @param param PerfilFinanceiroContasAtivo
     */
    public void setPerfilFinanceiroContasAtivo(
            PerfilFinanceiroContasAtivo param) {
        localPerfilFinanceiroContasAtivoTracker = param != null;

        this.localPerfilFinanceiroContasAtivo = param;
    }

    public boolean isPerfilFinanceiroContasAtivosSpecified() {
        return localPerfilFinanceiroContasAtivosTracker;
    }

    /**
     * Auto generated getter method
     * @return PerfilFinanceiroContasAtivo[]
     */
    public PerfilFinanceiroContasAtivo[] getPerfilFinanceiroContasAtivos() {
        return localPerfilFinanceiroContasAtivos;
    }

    /**
     * validate the array for PerfilFinanceiroContasAtivos
     */
    protected void validatePerfilFinanceiroContasAtivos(
            PerfilFinanceiroContasAtivo[] param) {
    }

    /**
     * Auto generated setter method
     * @param param PerfilFinanceiroContasAtivos
     */
    public void setPerfilFinanceiroContasAtivos(
            PerfilFinanceiroContasAtivo[] param) {
        validatePerfilFinanceiroContasAtivos(param);

        localPerfilFinanceiroContasAtivosTracker = param != null;

        this.localPerfilFinanceiroContasAtivos = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param PerfilFinanceiroContasAtivo
     */
    public void addPerfilFinanceiroContasAtivos(
            PerfilFinanceiroContasAtivo param) {
        if (localPerfilFinanceiroContasAtivos == null) {
            localPerfilFinanceiroContasAtivos = new PerfilFinanceiroContasAtivo[] {

            };
        }

        //update the setting tracker
        localPerfilFinanceiroContasAtivosTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localPerfilFinanceiroContasAtivos);
        list.add(param);
        this.localPerfilFinanceiroContasAtivos = (PerfilFinanceiroContasAtivo[]) list.toArray(new PerfilFinanceiroContasAtivo[list.size()]);
    }

    public boolean isPerfilFinanceiroContasPassivoSpecified() {
        return localPerfilFinanceiroContasPassivoTracker;
    }

    /**
     * Auto generated getter method
     * @return PerfilFinanceiroContasPassivo
     */
    public PerfilFinanceiroContasPassivo getPerfilFinanceiroContasPassivo() {
        return localPerfilFinanceiroContasPassivo;
    }

    /**
     * Auto generated setter method
     * @param param PerfilFinanceiroContasPassivo
     */
    public void setPerfilFinanceiroContasPassivo(
            PerfilFinanceiroContasPassivo param) {
        localPerfilFinanceiroContasPassivoTracker = param != null;

        this.localPerfilFinanceiroContasPassivo = param;
    }

    public boolean isPerfilFinanceirosContasPassivosSpecified() {
        return localPerfilFinanceirosContasPassivosTracker;
    }

    /**
     * Auto generated getter method
     * @return PerfilFinanceiroContasPassivo[]
     */
    public PerfilFinanceiroContasPassivo[] getPerfilFinanceirosContasPassivos() {
        return localPerfilFinanceirosContasPassivos;
    }

    /**
     * validate the array for PerfilFinanceirosContasPassivos
     */
    protected void validatePerfilFinanceirosContasPassivos(
            PerfilFinanceiroContasPassivo[] param) {
    }

    /**
     * Auto generated setter method
     * @param param PerfilFinanceirosContasPassivos
     */
    public void setPerfilFinanceirosContasPassivos(
            PerfilFinanceiroContasPassivo[] param) {
        validatePerfilFinanceirosContasPassivos(param);

        localPerfilFinanceirosContasPassivosTracker = param != null;

        this.localPerfilFinanceirosContasPassivos = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param PerfilFinanceiroContasPassivo
     */
    public void addPerfilFinanceirosContasPassivos(
            PerfilFinanceiroContasPassivo param) {
        if (localPerfilFinanceirosContasPassivos == null) {
            localPerfilFinanceirosContasPassivos = new PerfilFinanceiroContasPassivo[] {

            };
        }

        //update the setting tracker
        localPerfilFinanceirosContasPassivosTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localPerfilFinanceirosContasPassivos);
        list.add(param);
        this.localPerfilFinanceirosContasPassivos = (PerfilFinanceiroContasPassivo[]) list.toArray(new PerfilFinanceiroContasPassivo[list.size()]);
    }

    public boolean isPerfilFinanceiroResultadoSpecified() {
        return localPerfilFinanceiroResultadoTracker;
    }

    /**
     * Auto generated getter method
     * @return PerfilFinanceiroResultado
     */
    public PerfilFinanceiroResultado getPerfilFinanceiroResultado() {
        return localPerfilFinanceiroResultado;
    }

    /**
     * Auto generated setter method
     * @param param PerfilFinanceiroResultado
     */
    public void setPerfilFinanceiroResultado(
            PerfilFinanceiroResultado param) {
        localPerfilFinanceiroResultadoTracker = param != null;

        this.localPerfilFinanceiroResultado = param;
    }

    public boolean isPerfilFinanceiroResultadosSpecified() {
        return localPerfilFinanceiroResultadosTracker;
    }

    /**
     * Auto generated getter method
     * @return PerfilFinanceiroResultado[]
     */
    public PerfilFinanceiroResultado[] getPerfilFinanceiroResultados() {
        return localPerfilFinanceiroResultados;
    }

    /**
     * validate the array for PerfilFinanceiroResultados
     */
    protected void validatePerfilFinanceiroResultados(
            PerfilFinanceiroResultado[] param) {
    }

    /**
     * Auto generated setter method
     * @param param PerfilFinanceiroResultados
     */
    public void setPerfilFinanceiroResultados(
            PerfilFinanceiroResultado[] param) {
        validatePerfilFinanceiroResultados(param);

        localPerfilFinanceiroResultadosTracker = param != null;

        this.localPerfilFinanceiroResultados = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param PerfilFinanceiroResultado
     */
    public void addPerfilFinanceiroResultados(
            PerfilFinanceiroResultado param) {
        if (localPerfilFinanceiroResultados == null) {
            localPerfilFinanceiroResultados = new PerfilFinanceiroResultado[] {

            };
        }

        //update the setting tracker
        localPerfilFinanceiroResultadosTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localPerfilFinanceiroResultados);
        list.add(param);
        this.localPerfilFinanceiroResultados = (PerfilFinanceiroResultado[]) list.toArray(new PerfilFinanceiroResultado[list.size()]);
    }

    public boolean isPerfilFinanceiroIdentificacaoBalancoSpecified() {
        return localPerfilFinanceiroIdentificacaoBalancoTracker;
    }

    /**
     * Auto generated getter method
     * @return PerfilFinanceiroIdentificacaoBalanco
     */
    public PerfilFinanceiroIdentificacaoBalanco getPerfilFinanceiroIdentificacaoBalanco() {
        return localPerfilFinanceiroIdentificacaoBalanco;
    }

    /**
     * Auto generated setter method
     * @param param PerfilFinanceiroIdentificacaoBalanco
     */
    public void setPerfilFinanceiroIdentificacaoBalanco(
            PerfilFinanceiroIdentificacaoBalanco param) {
        localPerfilFinanceiroIdentificacaoBalancoTracker = param != null;

        this.localPerfilFinanceiroIdentificacaoBalanco = param;
    }

    public boolean isPerfilFinanceiroIndicesIntegradoSpecified() {
        return localPerfilFinanceiroIndicesIntegradoTracker;
    }

    /**
     * Auto generated getter method
     * @return PerfilFinanceiroIndicesFinanceiroIntegrado
     */
    public PerfilFinanceiroIndicesFinanceiroIntegrado getPerfilFinanceiroIndicesIntegrado() {
        return localPerfilFinanceiroIndicesIntegrado;
    }

    /**
     * Auto generated setter method
     * @param param PerfilFinanceiroIndicesIntegrado
     */
    public void setPerfilFinanceiroIndicesIntegrado(
            PerfilFinanceiroIndicesFinanceiroIntegrado param) {
        localPerfilFinanceiroIndicesIntegradoTracker = param != null;

        this.localPerfilFinanceiroIndicesIntegrado = param;
    }

    public boolean isPerfilFinanceiroIndicesIntegradosSpecified() {
        return localPerfilFinanceiroIndicesIntegradosTracker;
    }

    /**
     * Auto generated getter method
     * @return PerfilFinanceiroIndicesFinanceiroIntegrado[]
     */
    public PerfilFinanceiroIndicesFinanceiroIntegrado[] getPerfilFinanceiroIndicesIntegrados() {
        return localPerfilFinanceiroIndicesIntegrados;
    }

    /**
     * validate the array for PerfilFinanceiroIndicesIntegrados
     */
    protected void validatePerfilFinanceiroIndicesIntegrados(
            PerfilFinanceiroIndicesFinanceiroIntegrado[] param) {
    }

    /**
     * Auto generated setter method
     * @param param PerfilFinanceiroIndicesIntegrados
     */
    public void setPerfilFinanceiroIndicesIntegrados(
            PerfilFinanceiroIndicesFinanceiroIntegrado[] param) {
        validatePerfilFinanceiroIndicesIntegrados(param);

        localPerfilFinanceiroIndicesIntegradosTracker = param != null;

        this.localPerfilFinanceiroIndicesIntegrados = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param PerfilFinanceiroIndicesFinanceiroIntegrado
     */
    public void addPerfilFinanceiroIndicesIntegrados(
            PerfilFinanceiroIndicesFinanceiroIntegrado param) {
        if (localPerfilFinanceiroIndicesIntegrados == null) {
            localPerfilFinanceiroIndicesIntegrados = new PerfilFinanceiroIndicesFinanceiroIntegrado[] {

            };
        }

        //update the setting tracker
        localPerfilFinanceiroIndicesIntegradosTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localPerfilFinanceiroIndicesIntegrados);
        list.add(param);
        this.localPerfilFinanceiroIndicesIntegrados = (PerfilFinanceiroIndicesFinanceiroIntegrado[]) list.toArray(new PerfilFinanceiroIndicesFinanceiroIntegrado[list.size()]);
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
                        namespacePrefix + ":Insumo-Perfil-Financeiro-PJ",
                        xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-Perfil-Financeiro-PJ", xmlWriter);
            }
        }

        if (localFraseConclusaoTracker) {
            if (localFraseConclusao == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "frase-conclusao cannot be null!!");
            }

            localFraseConclusao.serialize(new javax.xml.namespace.QName(
                    "", "frase-conclusao"), xmlWriter);
        }

        if (localPerfilFinanceiroIdentificacaoEmpresaTracker) {
            if (localPerfilFinanceiroIdentificacaoEmpresa == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "perfil-financeiro-identificacao-empresa cannot be null!!");
            }

            localPerfilFinanceiroIdentificacaoEmpresa.serialize(new javax.xml.namespace.QName(
                            "", "perfil-financeiro-identificacao-empresa"),
                    xmlWriter);
        }

        if (localPerfilFinanceiroContasAtivoTracker) {
            if (localPerfilFinanceiroContasAtivo == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "perfil-financeiro-contas-ativo cannot be null!!");
            }

            localPerfilFinanceiroContasAtivo.serialize(new javax.xml.namespace.QName(
                    "", "perfil-financeiro-contas-ativo"), xmlWriter);
        }

        if (localPerfilFinanceiroContasAtivosTracker) {
            if (localPerfilFinanceiroContasAtivos != null) {
                for (int i = 0;
                     i < localPerfilFinanceiroContasAtivos.length;
                     i++) {
                    if (localPerfilFinanceiroContasAtivos[i] != null) {
                        localPerfilFinanceiroContasAtivos[i].serialize(new javax.xml.namespace.QName(
                                        "", "perfil-financeiro-contas-ativos"),
                                xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "perfil-financeiro-contas-ativos cannot be null!!");
            }
        }

        if (localPerfilFinanceiroContasPassivoTracker) {
            if (localPerfilFinanceiroContasPassivo == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "perfil-financeiro-contas-passivo cannot be null!!");
            }

            localPerfilFinanceiroContasPassivo.serialize(new javax.xml.namespace.QName(
                    "", "perfil-financeiro-contas-passivo"), xmlWriter);
        }

        if (localPerfilFinanceirosContasPassivosTracker) {
            if (localPerfilFinanceirosContasPassivos != null) {
                for (int i = 0;
                     i < localPerfilFinanceirosContasPassivos.length;
                     i++) {
                    if (localPerfilFinanceirosContasPassivos[i] != null) {
                        localPerfilFinanceirosContasPassivos[i].serialize(new javax.xml.namespace.QName(
                                        "", "perfil-financeiros-contas-passivos"),
                                xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "perfil-financeiros-contas-passivos cannot be null!!");
            }
        }

        if (localPerfilFinanceiroResultadoTracker) {
            if (localPerfilFinanceiroResultado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "perfil-financeiro-resultado cannot be null!!");
            }

            localPerfilFinanceiroResultado.serialize(new javax.xml.namespace.QName(
                    "", "perfil-financeiro-resultado"), xmlWriter);
        }

        if (localPerfilFinanceiroResultadosTracker) {
            if (localPerfilFinanceiroResultados != null) {
                for (int i = 0; i < localPerfilFinanceiroResultados.length;
                     i++) {
                    if (localPerfilFinanceiroResultados[i] != null) {
                        localPerfilFinanceiroResultados[i].serialize(new javax.xml.namespace.QName(
                                        "", "perfil-financeiro-resultados"),
                                xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "perfil-financeiro-resultados cannot be null!!");
            }
        }

        if (localPerfilFinanceiroIdentificacaoBalancoTracker) {
            if (localPerfilFinanceiroIdentificacaoBalanco == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "perfil-financeiro-identificacao-balanco cannot be null!!");
            }

            localPerfilFinanceiroIdentificacaoBalanco.serialize(new javax.xml.namespace.QName(
                            "", "perfil-financeiro-identificacao-balanco"),
                    xmlWriter);
        }

        if (localPerfilFinanceiroIndicesIntegradoTracker) {
            if (localPerfilFinanceiroIndicesIntegrado == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "perfil-financeiro-indices-integrado cannot be null!!");
            }

            localPerfilFinanceiroIndicesIntegrado.serialize(new javax.xml.namespace.QName(
                    "", "perfil-financeiro-indices-integrado"), xmlWriter);
        }

        if (localPerfilFinanceiroIndicesIntegradosTracker) {
            if (localPerfilFinanceiroIndicesIntegrados != null) {
                for (int i = 0;
                     i < localPerfilFinanceiroIndicesIntegrados.length;
                     i++) {
                    if (localPerfilFinanceiroIndicesIntegrados[i] != null) {
                        localPerfilFinanceiroIndicesIntegrados[i].serialize(new javax.xml.namespace.QName(
                                        "", "perfil-financeiro-indices-integrados"),
                                xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "perfil-financeiro-indices-integrados cannot be null!!");
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
        public static InsumoPerfilFinanceiroPJ parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoPerfilFinanceiroPJ object = new InsumoPerfilFinanceiroPJ();

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

                        if (!"Insumo-Perfil-Financeiro-PJ".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoPerfilFinanceiroPJ) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list4 = new java.util.ArrayList();

                java.util.ArrayList list6 = new java.util.ArrayList();

                java.util.ArrayList list8 = new java.util.ArrayList();

                java.util.ArrayList list11 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "frase-conclusao").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "frase-conclusao").equals(
                                reader.getName())) {
                    object.setFraseConclusao(PerfilFinanceiroFraseConclusao.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-identificacao-empresa").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-identificacao-empresa").equals(
                                reader.getName())) {
                    object.setPerfilFinanceiroIdentificacaoEmpresa(PerfilFinanceiroIdentificacaoEmpresa.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-contas-ativo").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-contas-ativo").equals(
                                reader.getName())) {
                    object.setPerfilFinanceiroContasAtivo(PerfilFinanceiroContasAtivo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-contas-ativos").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-contas-ativos").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list4.add(PerfilFinanceiroContasAtivo.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone4 = false;

                    while (!loopDone4) {
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
                            loopDone4 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "perfil-financeiro-contas-ativos").equals(
                                    reader.getName())) {
                                list4.add(PerfilFinanceiroContasAtivo.Factory.parse(
                                        reader));
                            } else {
                                loopDone4 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setPerfilFinanceiroContasAtivos((PerfilFinanceiroContasAtivo[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            PerfilFinanceiroContasAtivo.class, list4));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-contas-passivo").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-contas-passivo").equals(
                                reader.getName())) {
                    object.setPerfilFinanceiroContasPassivo(PerfilFinanceiroContasPassivo.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "perfil-financeiros-contas-passivos").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "perfil-financeiros-contas-passivos").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list6.add(PerfilFinanceiroContasPassivo.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone6 = false;

                    while (!loopDone6) {
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
                            loopDone6 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "perfil-financeiros-contas-passivos").equals(
                                    reader.getName())) {
                                list6.add(PerfilFinanceiroContasPassivo.Factory.parse(
                                        reader));
                            } else {
                                loopDone6 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setPerfilFinanceirosContasPassivos((PerfilFinanceiroContasPassivo[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            PerfilFinanceiroContasPassivo.class, list6));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-resultado").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-resultado").equals(
                                reader.getName())) {
                    object.setPerfilFinanceiroResultado(PerfilFinanceiroResultado.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-resultados").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-resultados").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list8.add(PerfilFinanceiroResultado.Factory.parse(
                            reader));

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
                                    "perfil-financeiro-resultados").equals(
                                    reader.getName())) {
                                list8.add(PerfilFinanceiroResultado.Factory.parse(
                                        reader));
                            } else {
                                loopDone8 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setPerfilFinanceiroResultados((PerfilFinanceiroResultado[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            PerfilFinanceiroResultado.class, list8));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-identificacao-balanco").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-identificacao-balanco").equals(
                                reader.getName())) {
                    object.setPerfilFinanceiroIdentificacaoBalanco(PerfilFinanceiroIdentificacaoBalanco.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-indices-integrado").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-indices-integrado").equals(
                                reader.getName())) {
                    object.setPerfilFinanceiroIndicesIntegrado(PerfilFinanceiroIndicesFinanceiroIntegrado.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-indices-integrados").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("",
                                "perfil-financeiro-indices-integrados").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list11.add(PerfilFinanceiroIndicesFinanceiroIntegrado.Factory.parse(
                            reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone11 = false;

                    while (!loopDone11) {
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
                            loopDone11 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "perfil-financeiro-indices-integrados").equals(
                                    reader.getName())) {
                                list11.add(PerfilFinanceiroIndicesFinanceiroIntegrado.Factory.parse(
                                        reader));
                            } else {
                                loopDone11 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setPerfilFinanceiroIndicesIntegrados((PerfilFinanceiroIndicesFinanceiroIntegrado[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            PerfilFinanceiroIndicesFinanceiroIntegrado.class,
                            list11));
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

