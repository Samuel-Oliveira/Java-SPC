package br.com.samuelweb.spc.bo;

import br.com.samuelweb.spc.wsdl.ConsultaWebServiceStub;
import br.com.samuelweb.spc.xsd.Filtro;
import br.com.samuelweb.spc.xsd.Resultado;

import java.rmi.RemoteException;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 09:26
 */
public class ConsultaBO {

    private static final String ENDERECO = "https://treina.spc.org.br/spc/remoting/ws/consulta/consultaWebService";

    /**
     * Evetua a consulta de acordo com o Filtro Passado e retorna a Resposta do WS
     *
     * @param filtro
     * @return
     * @throws RemoteException
     */
    public static Resultado consulta(Filtro filtro) throws RemoteException {

        ConsultaWebServiceStub stub = new ConsultaWebServiceStub(ENDERECO);
        stub._getServiceClient().getOptions().setProperty(org.apache.axis2.transport.http.HTTPConstants.AUTHENTICATE, AutenticacaoBO.getAutenticacao());
        return stub.consultar(filtro);

    }
}
