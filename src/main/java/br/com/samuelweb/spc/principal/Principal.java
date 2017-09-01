package br.com.samuelweb.spc.principal;

import br.com.samuelweb.spc.bo.SistemaBO;
import br.com.samuelweb.spc.wsdl.ConsultaWebServiceStub;
import br.com.samuelweb.spc.xsd.Filtro;
import br.com.samuelweb.spc.xsd.FiltroConsulta;
import br.com.samuelweb.spc.xsd.Resultado;
import br.com.samuelweb.spc.xsd.TipoPessoa;
import org.apache.axiom.om.OMAbstractFactory;

import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 00:55
 */
public class Principal {

    public static void main(String[] args) {

        SistemaBO.consulta();

    }

}
