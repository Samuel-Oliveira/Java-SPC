/**
 * ConsultaWebServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:26 BST)
 */
package br.com.samuelweb.spc.wsdl;


import br.com.samuelweb.spc.xsd.ProdutoE;
import br.com.samuelweb.spc.xsd.Produtos;
import br.com.samuelweb.spc.xsd.Resultado;
import br.com.samuelweb.spc.xsd.ResultadoConsultaScoreE;

/**
 *  ConsultaWebServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class ConsultaWebServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public ConsultaWebServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public ConsultaWebServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for consultaScore method
     * override this method for handling normal response from consultaScore operation
     */
    public void receiveResultconsultaScore(
        ResultadoConsultaScoreE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultaScore operation
     */
    public void receiveErrorconsultaScore(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for detalharProduto method
     * override this method for handling normal response from detalharProduto operation
     */
    public void receiveResultdetalharProduto(
        ProdutoE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from detalharProduto operation
     */
    public void receiveErrordetalharProduto(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for listarProdutos method
     * override this method for handling normal response from listarProdutos operation
     */
    public void receiveResultlistarProdutos(
        Produtos result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from listarProdutos operation
     */
    public void receiveErrorlistarProdutos(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for consultar method
     * override this method for handling normal response from consultar operation
     */
    public void receiveResultconsultar(
        Resultado result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultar operation
     */
    public void receiveErrorconsultar(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for consultaComplementar method
     * override this method for handling normal response from consultaComplementar operation
     */
    public void receiveResultconsultaComplementar(
        Resultado result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultaComplementar operation
     */
    public void receiveErrorconsultaComplementar(java.lang.Exception e) {
    }
}
