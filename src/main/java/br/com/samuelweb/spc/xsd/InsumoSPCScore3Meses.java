package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:40
 */
public class InsumoSPCScore3Meses implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Insumo-SPC-Score-3-Meses
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Classe
     * This was an Attribute!
     */
    protected java.lang.String localClasse;

    /**
     * field for Horizonte
     * This was an Attribute!
     */
    protected int localHorizonte;

    /**
     * field for MesagemInterpretativaScore
     * This was an Attribute!
     */
    protected java.lang.String localMesagemInterpretativaScore;

    /**
     * field for MesagemInterpretativaProbabilidade
     * This was an Attribute!
     */
    protected java.lang.String localMesagemInterpretativaProbabilidade;

    /**
     * field for MesagemSemaforo
     * This was an Attribute!
     */
    protected java.lang.String localMesagemSemaforo;

    /**
     * field for Probabilidade
     * This was an Attribute!
     */
    protected double localProbabilidade;

    /**
     * field for Score
     * This was an Attribute!
     */
    protected int localScore;

    /**
     * field for TipoClienteScore
     * This was an Attribute!
     */
    protected TipoClienteScore localTipoClienteScore;

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getClasse() {
        return localClasse;
    }

    /**
     * Auto generated setter method
     * @param param Classe
     */
    public void setClasse(java.lang.String param) {
        this.localClasse = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getHorizonte() {
        return localHorizonte;
    }

    /**
     * Auto generated setter method
     * @param param Horizonte
     */
    public void setHorizonte(int param) {
        this.localHorizonte = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMesagemInterpretativaScore() {
        return localMesagemInterpretativaScore;
    }

    /**
     * Auto generated setter method
     * @param param MesagemInterpretativaScore
     */
    public void setMesagemInterpretativaScore(java.lang.String param) {
        this.localMesagemInterpretativaScore = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMesagemInterpretativaProbabilidade() {
        return localMesagemInterpretativaProbabilidade;
    }

    /**
     * Auto generated setter method
     * @param param MesagemInterpretativaProbabilidade
     */
    public void setMesagemInterpretativaProbabilidade(
            java.lang.String param) {
        this.localMesagemInterpretativaProbabilidade = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMesagemSemaforo() {
        return localMesagemSemaforo;
    }

    /**
     * Auto generated setter method
     * @param param MesagemSemaforo
     */
    public void setMesagemSemaforo(java.lang.String param) {
        this.localMesagemSemaforo = param;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getProbabilidade() {
        return localProbabilidade;
    }

    /**
     * Auto generated setter method
     * @param param Probabilidade
     */
    public void setProbabilidade(double param) {
        this.localProbabilidade = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getScore() {
        return localScore;
    }

    /**
     * Auto generated setter method
     * @param param Score
     */
    public void setScore(int param) {
        this.localScore = param;
    }

    /**
     * Auto generated getter method
     * @return TipoClienteScore
     */
    public TipoClienteScore getTipoClienteScore() {
        return localTipoClienteScore;
    }

    /**
     * Auto generated setter method
     * @param param TipoClienteScore
     */
    public void setTipoClienteScore(TipoClienteScore param) {
        this.localTipoClienteScore = param;
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
                        namespacePrefix + ":Insumo-SPC-Score-3-Meses", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Insumo-SPC-Score-3-Meses", xmlWriter);
            }
        }

        if (localClasse != null) {
            writeAttribute("", "classe",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localClasse), xmlWriter);
        }

        if (localHorizonte != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "horizonte",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localHorizonte), xmlWriter);
        }
        else {
            throw new org.apache.axis2.databinding.ADBException(
                    "required attribute localHorizonte is null");
        }

        if (localMesagemInterpretativaScore != null) {
            writeAttribute("", "mesagem-interpretativa-score",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localMesagemInterpretativaScore), xmlWriter);
        }

        if (localMesagemInterpretativaProbabilidade != null) {
            writeAttribute("", "mesagem-interpretativa-probabilidade",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localMesagemInterpretativaProbabilidade), xmlWriter);
        }

        if (localMesagemSemaforo != null) {
            writeAttribute("", "mesagem-semaforo",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localMesagemSemaforo), xmlWriter);
        }

        if (!java.lang.Double.isNaN(localProbabilidade)) {
            writeAttribute("", "probabilidade",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localProbabilidade), xmlWriter);
        }

        if (localScore != java.lang.Integer.MIN_VALUE) {
            writeAttribute("", "score",
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localScore), xmlWriter);
        }
        else {
            throw new org.apache.axis2.databinding.ADBException(
                    "required attribute localScore is null");
        }

        if (localTipoClienteScore != null) {
            writeAttribute("", "tipo-cliente-score",
                    localTipoClienteScore.toString(), xmlWriter);
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
        public static InsumoSPCScore3Meses parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            InsumoSPCScore3Meses object = new InsumoSPCScore3Meses();

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

                        if (!"Insumo-SPC-Score-3-Meses".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (InsumoSPCScore3Meses) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // handle attribute "classe"
                java.lang.String tempAttribClasse = reader.getAttributeValue(null,
                        "classe");

                if (tempAttribClasse != null) {
                    java.lang.String content = tempAttribClasse;

                    object.setClasse(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribClasse));
                } else {
                }

                handledAttributes.add("classe");

                // handle attribute "horizonte"
                java.lang.String tempAttribHorizonte = reader.getAttributeValue(null,
                        "horizonte");

                if (tempAttribHorizonte != null) {
                    java.lang.String content = tempAttribHorizonte;

                    object.setHorizonte(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribHorizonte));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                            "Required attribute horizonte is missing");
                }

                handledAttributes.add("horizonte");

                // handle attribute "mesagem-interpretativa-score"
                java.lang.String tempAttribMesagemInterpretativaScore = reader.getAttributeValue(null,
                        "mesagem-interpretativa-score");

                if (tempAttribMesagemInterpretativaScore != null) {
                    java.lang.String content = tempAttribMesagemInterpretativaScore;

                    object.setMesagemInterpretativaScore(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMesagemInterpretativaScore));
                } else {
                }

                handledAttributes.add("mesagem-interpretativa-score");

                // handle attribute "mesagem-interpretativa-probabilidade"
                java.lang.String tempAttribMesagemInterpretativaProbabilidade =
                        reader.getAttributeValue(null,
                                "mesagem-interpretativa-probabilidade");

                if (tempAttribMesagemInterpretativaProbabilidade != null) {
                    java.lang.String content = tempAttribMesagemInterpretativaProbabilidade;

                    object.setMesagemInterpretativaProbabilidade(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMesagemInterpretativaProbabilidade));
                } else {
                }

                handledAttributes.add(
                        "mesagem-interpretativa-probabilidade");

                // handle attribute "mesagem-semaforo"
                java.lang.String tempAttribMesagemSemaforo = reader.getAttributeValue(null,
                        "mesagem-semaforo");

                if (tempAttribMesagemSemaforo != null) {
                    java.lang.String content = tempAttribMesagemSemaforo;

                    object.setMesagemSemaforo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            tempAttribMesagemSemaforo));
                } else {
                }

                handledAttributes.add("mesagem-semaforo");

                // handle attribute "probabilidade"
                java.lang.String tempAttribProbabilidade = reader.getAttributeValue(null,
                        "probabilidade");

                if (tempAttribProbabilidade != null) {
                    java.lang.String content = tempAttribProbabilidade;

                    object.setProbabilidade(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            tempAttribProbabilidade));
                } else {
                    object.setProbabilidade(java.lang.Double.NaN);
                }

                handledAttributes.add("probabilidade");

                // handle attribute "score"
                java.lang.String tempAttribScore = reader.getAttributeValue(null,
                        "score");

                if (tempAttribScore != null) {
                    java.lang.String content = tempAttribScore;

                    object.setScore(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            tempAttribScore));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                            "Required attribute score is missing");
                }

                handledAttributes.add("score");

                // handle attribute "tipo-cliente-score"
                java.lang.String tempAttribTipoClienteScore = reader.getAttributeValue(null,
                        "tipo-cliente-score");

                if (tempAttribTipoClienteScore != null) {
                    java.lang.String content = tempAttribTipoClienteScore;

                    object.setTipoClienteScore(TipoClienteScore.Factory.fromString(
                            reader, tempAttribTipoClienteScore));
                } else {
                }

                handledAttributes.add("tipo-cliente-score");

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
