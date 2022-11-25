package engtelecom.poo;

// Criando uma classe generica com diamond <T>

// podendo atribuir qualquer objeto dentro dela 

// podendo ser passado atraves do extends, uma classe, usando hierarquia
public class CaixaDois<T extends Circulo> {
    private T dado;

    public void set(T obj) {
        this.dado = obj;
    }

    public T getDado() {
        return this.dado;
    }
}
