import java.util.ArrayList;
import java.util.List;

public class main {
public static void main(String[] args) throws CloneNotSupportedException {
        Contact  leandro = new Contact("leandro", "4691525555", "momdoemdoedme");
        leandro.imprimir();
        Contact mateus = (Contact) leandro.clone(); 
        System.out.println("Imprimindo objeto  "+mateus.getNome());
        mateus.imprimir();
        System.out.println("alterando atributos do objeto clonado");
        mateus.setNome("Mateus");
        mateus.setEmail("batatinha123@gmail");
        mateus.imprimir();
            
    }
}
