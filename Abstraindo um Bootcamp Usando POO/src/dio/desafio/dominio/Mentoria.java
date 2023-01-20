package dio.desafio.dominio;


import java.time.LocalDate;
import java.util.Objects;

public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mentoria mentoria = (Mentoria) o;
        return Objects.equals(data, mentoria.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData(){
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                '}';
    }
}
