package org.example.Facade;

import org.example.Subsistema1.CrmService;
import org.example.Subsistema2.cep.CepApi;

public class Facade {
    public void migraCliente(String nome, String cep){
      String cidade = CepApi.getInstance().recuperarCidade(cep);
      String estado = CepApi.getInstance().recuperarEstado(cep);

      CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
