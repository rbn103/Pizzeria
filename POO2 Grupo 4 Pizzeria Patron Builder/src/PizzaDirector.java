import java.util.List;

public class PizzaDirector{
    private Builder builder;

    public PizzaDirector(Builder builder) {
        this.builder = builder;
    }

    public void construirMargaritaExtraQueso() {
        builder.buildMasa("fina");
        builder.buildSalsa("tomate");
        builder.buildQueso("mozzarella");
        builder.buildExtraQueso();
    }

    public void construirPepperoniSinPicor() {
        builder.buildMasa("tradicional");
        builder.buildSalsa("tomate");
        builder.buildQueso("mozzarella");
        builder.buildPepperoni();
    }

    public void construirVegetarianaJamon() {
        builder.buildMasa("integral");
        builder.buildSalsa("pesto");
        builder.buildQueso("mozzarella");
        builder.buildChampiñones("blancos");
        builder.buildCebolla("blanca");
        builder.buildAceitunas("negras");
        builder.buildPimientos("verdes");
        builder.buildIngredientes(List.of("brocoli", "rábano", "espinaca"));
        builder.buildJamon("true");
    }

    public void construirPersonalizada() {
        builder.buildMasa("mazapán");
        builder.buildSalsa("barbacoa");
        builder.buildQueso("cheddar");
        builder.buildIngredientes(List.of("pollo"));
    }
    public Pizza getPizza() {
        return builder.getPizza();
    }
}