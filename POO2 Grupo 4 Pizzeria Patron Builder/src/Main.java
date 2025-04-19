public class Main {
    public static void main(String[] args) {

        PizzaBuilder margaritaBuilder = new PizzaBuilder();
        PizzaDirector directorMargarita = new PizzaDirector(margaritaBuilder);
        directorMargarita.construirMargaritaExtraQueso();
        Pizza margaritaExtra = margaritaBuilder.getPizza();

        PizzaBuilder pepperoniBuilder = new PizzaBuilder();
        PizzaDirector directorPepperoni = new PizzaDirector(pepperoniBuilder);
        directorPepperoni.construirPepperoniSinPicor();
        Pizza pepperoniSinPicante = pepperoniBuilder.getPizza();

        PizzaBuilder vegetarianaBuilder = new PizzaBuilder();
        PizzaDirector directorVegetariana = new PizzaDirector(vegetarianaBuilder);
        directorVegetariana.construirVegetarianaJamon();
        Pizza vegetarianaConJamon = vegetarianaBuilder.getPizza();

        PizzaBuilder personalizadaBuilder = new PizzaBuilder();
        PizzaDirector directorPersonalizada = new PizzaDirector(personalizadaBuilder);
        directorPersonalizada.construirPersonalizada();
        Pizza personalizada = personalizadaBuilder.getPizza();


        System.out.println("Margarita Extra Queso -- Masa: " + margaritaExtra.getMasa() + ", Salsa: " + margaritaExtra.getSalsa() + ", Queso: " + margaritaExtra.getQueso() + ", Extra queso: " + margaritaExtra.isExtraQueso());
        System.out.println("Pepperoni sin picante -- Masa: " + pepperoniSinPicante.getMasa() + ", Salsa: " + pepperoniSinPicante.getSalsa() + ", Queso: " + pepperoniSinPicante.getQueso() + ", Pepperoni: " + pepperoniSinPicante.isPepperoni());
        System.out.println("Vegetariana con Jamón -- Masa: " + vegetarianaConJamon.getMasa() + ", Salsa: " + vegetarianaConJamon.getSalsa() + ", Queso: " + vegetarianaConJamon.getQueso() + ", Champiñones: " + vegetarianaConJamon.isChampiñones() + ", Cebolla: " + vegetarianaConJamon.isCebolla() + ", Aceituna: " + vegetarianaConJamon.isAceitunas() + ", Pimientos " + vegetarianaConJamon.isPimientos() + " Vegetales extras : " + vegetarianaConJamon.getIngredientes() + ", Jamón: " + vegetarianaConJamon.isJamon());
        System.out.println("Personalizada -- Masa: " + personalizada.getMasa() + ", Salsa:" + personalizada.getSalsa() + ", ingrediente extra: " + personalizada.getIngredientes());
    }
}
