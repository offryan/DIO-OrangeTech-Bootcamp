package SubSystem2.cep;

public class CEPapi {
    private static CEPapi instancia = new CEPapi();

    private CEPapi(){
        super();
    }
    public static CEPapi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Sao Joao de Meriti";
    }

    public String recuperarEstado(String cep){
        return "RJ";
    }


}
