package br.com.samuelweb.spc.bo;

import org.apache.axis2.transport.http.impl.httpclient4.HttpTransportPropertiesImpl;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 09:29
 */
public class AutenticacaoBO {

    private static final String USUARIO = "398316";
    private static final String SENHA = "27072017";

    /**
     * Retorna Autenticação para Consumo do Ws
     * @return
     */
    public static HttpTransportPropertiesImpl.Authenticator getAutenticacao(){

        HttpTransportPropertiesImpl.Authenticator autenticacao = new HttpTransportPropertiesImpl.Authenticator();
        autenticacao.setUsername(USUARIO);
        autenticacao.setPassword(SENHA);

        return autenticacao;

    }
}
