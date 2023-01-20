package SusSystem1.crm;

public class ServiceCRM {
    private ServiceCRM(){
        super();
    }

    public static void gravarcliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema do CRM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
