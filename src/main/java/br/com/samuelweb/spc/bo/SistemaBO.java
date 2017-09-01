package br.com.samuelweb.spc.bo;

import br.com.samuelweb.spc.xsd.Filtro;
import br.com.samuelweb.spc.xsd.FiltroConsulta;
import br.com.samuelweb.spc.xsd.Resultado;
import br.com.samuelweb.spc.xsd.TipoPessoa;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axis2.databinding.ADBException;

import java.rmi.RemoteException;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 11:50
 */
public class SistemaBO {

    /**
     * Efetua a consulta no WS
     */
    public static void consulta(){

        try {

            FiltroConsulta filtroConsulta = new FiltroConsulta();
            filtroConsulta.setCodigoProduto("13");
            filtroConsulta.setTipoConsumidor(TipoPessoa.F);
            filtroConsulta.setDocumentoConsumidor("00752477714");
            filtroConsulta.setUtilizaCMC7(true);

            Filtro filtro = new Filtro();
            filtro.setFiltro(filtroConsulta);

            Resultado resultado = ConsultaBO.consulta(filtro);
            System.out.println("Data: "+resultado.getResultado().getData().getTime());
            System.out.println("Protocolo: "+resultado.getResultado().getProtocolo().getNumero());
            System.out.println("Operador: "+resultado.getResultado().getOperador().getNome());
            System.out.println("Consumidor: "+resultado.getResultado().getConsumidor().getConsumidorPessoaFisica().getNome());

        System.out.println("Xml Completo: "+ resultado.getOMElement(Resultado.MY_QNAME, OMAbstractFactory.getOMFactory()));
        }catch (RemoteException | ADBException e){
            e.printStackTrace();
        }


    }
}
