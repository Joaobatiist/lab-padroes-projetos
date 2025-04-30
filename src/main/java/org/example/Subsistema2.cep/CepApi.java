package org.example.Subsistema2.cep;

public class CepApi {
    public static CepApi Instance = new CepApi();

    private CepApi(){
        super();
    }
    public static CepApi getInstance(){
        return Instance;
    }
    public String recuperarCidade(String cep){
        return "Araraquara";

    }

    public String recuperarEstado(String cep){
        return "Sp";
    }
}
