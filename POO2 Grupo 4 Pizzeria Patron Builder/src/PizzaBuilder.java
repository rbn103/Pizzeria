import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder implements Builder {
    private Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }
    @Override
    public void buildMasa(String masa) {
        pizza.setMasa(masa);
    }

    @Override
    public void buildSalsa(String salsa) {
        pizza.setSalsa(salsa);
    }

    @Override
    public void buildQueso(String queso) {
        pizza.setQueso(queso);
    }

    @Override
    public void buildIngredientes(List<String> ingredientes) {
        pizza.setIngredientes(ingredientes);
    }

    @Override
    public void buildExtraQueso() {
        pizza.setExtraQueso(true);
    }

    @Override
    public void buildPepperoni() {
        pizza.setPepperoni(true);
    }

    @Override
    public void buildChampiñones(String valor) {
        pizza.setChampiñones(Boolean.parseBoolean(valor));
    }

    @Override
    public void buildCebolla(String valor) {
        pizza.setCebolla(Boolean.parseBoolean(valor));
    }

    @Override
    public void buildJamon(String valor) {
        pizza.setJamon(Boolean.parseBoolean(valor));
    }

    @Override
    public void buildAceitunas(String valor) {
        pizza.setAceitunas(Boolean.parseBoolean(valor));
    }

    @Override
    public void buildPimientos(String valor) {
        pizza.setPimientos(Boolean.parseBoolean(valor));
    }

    @Override
    public void buildGlutenFree() {
        pizza.setGlutenFree(true);
    }

    @Override
    public void buildTamaño(int tamaño) {
        pizza.setTamaño(tamaño);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }

    public static Pizza margaritaBuilder() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.buildMasa("fina");
        builder.buildSalsa("tomate");
        builder.buildQueso("mozzarella");
        return builder.getPizza();
    }

    public static Pizza pepperoniBuilder() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.buildMasa("tradicional");
        builder.buildSalsa("picante");
        builder.buildQueso("mozzarella");
        builder.buildPepperoni();
        return builder.getPizza();
    }

    public static Pizza vegetarianaBuilder() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.buildMasa("integral");
        builder.buildSalsa("pesto");
        builder.buildQueso("mozzarella");
        builder.buildAceitunas("verdes");
        builder.buildCebolla("blanca");
        builder.buildChampiñones("blancos");
        builder.buildPimientos("rojos");
        builder.buildIngredientes(List.of("brocoli, rábano"));
        return builder.getPizza();
    }
}