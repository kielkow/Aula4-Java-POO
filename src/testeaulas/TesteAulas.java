package testeaulas;
public class TesteAulas {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        
        c1.setModelo("BIC Cristal");
        c1.setPonta(0.5);
        System.out.println(c1.getModelo());
        System.out.println(c1.getPonta());

           
    }
    
}