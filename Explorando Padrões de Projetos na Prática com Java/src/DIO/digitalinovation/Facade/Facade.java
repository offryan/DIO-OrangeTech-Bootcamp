package DIO.digitalinovation.Facade;

import SubSystem2.cep.CEPapi;
import SusSystem1.crm.ServiceCRM;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CEPapi.getInstancia().recuperarCidade(cep);
        String estado = CEPapi.getInstancia().recuperarEstado(cep);


        ServiceCRM.gravarcliente(nome, cep, cidade, estado);
    }

}
