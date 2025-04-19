import java.util.List;

public interface Builder {
    void buildMasa(String masa);
    void buildSalsa(String salsa);
    void buildQueso(String queso);
    void buildIngredientes(List<String> ingredientes);

    void buildExtraQueso();
    void buildPepperoni();
    void buildChampiñones(String champiñones);
    void buildCebolla(String cebolla);
    void buildJamon(String jamon);
    void buildAceitunas(String aceitunas);
    void buildPimientos(String pimientos);
    void buildGlutenFree();
    void buildTamaño(int tamaño);

    Pizza getPizza();

}/*
private Pizza(Pizza.PizzaBuilder builder) {
    this.nombre = builder.nombre;
    this.masa = builder.masa;
    this.salsa = builder.salsa;
    this.queso = builder.queso;
    this.ingredientes = builder.ingredientes;
    this.extraQueso = builder.extraQueso;
    this.pepperoni = builder.pepperoni;
    this.champiñones = builder.champiñones;
    this.cebolla = builder.cebolla;
    this.jamon = builder.jamon;
    this.aceitunas = builder.aceitunas;
    this.pimientos = builder.pimientos;
    this.glutenFree = builder.glutenFree;
    this.tamaño = builder.tamaño;
}*/