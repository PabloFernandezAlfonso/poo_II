package _2_Inheritance;



public class OsoMejorado extends AnimalMejorado{

    public OsoMejorado(double peso) {
        super(peso);
    }

    public OsoMejorado(String color) {
        super(color);
    }

    public OsoMejorado(double peso, String color) {
        super(peso, color);
    }

    
    
    
    @Override
    public void identificar(){
        System.out.print("Soy un OSO Mejorado");
    }
    @Override
    public void emitirSonido(){
        super.emitirSonido();
        System.out.println("Groaw");
    }
}
