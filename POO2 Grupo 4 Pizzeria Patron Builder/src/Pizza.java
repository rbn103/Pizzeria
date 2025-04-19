import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nombre;
    private String masa;
    private String salsa;
    private String queso;
    private List<String> ingredientes;
    private boolean extraQueso;
    private boolean pepperoni;
    private boolean champiñones;
    private boolean cebolla;
    private boolean jamon;
    private boolean aceitunas;
    private boolean pimientos;
    private boolean glutenFree;
    private int tamaño;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getQueso() {
        return queso;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public boolean isAceitunas() {
        return aceitunas;
    }

    public void setAceitunas(boolean aceitunas) {
        this.aceitunas = aceitunas;
    }

    public boolean isPimientos() {
        return pimientos;
    }

    public void setPimientos(boolean pimientos) {
        this.pimientos = pimientos;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}

  /*  @Override
    public String toString() {
        return "Pizza " + nombre + " -- [tamaño : " + tamaño + ", masa : " + masa + ", gluten : " + glutenFree + ", salsa : " + salsa + ", queso : "  + queso +
             ", ingrediente : " + ingredientes +  ", pepperoni : " + pepperoni + ", champiñones : " + champiñones + "]";
    }
    public static class PizzaBuilder {
        private String nombre;
        private String masa;
        private String salsa;
        private String queso;
        private List<String> ingredientes = new ArrayList<>();
        private boolean extraQueso;
        private boolean pepperoni;
        private boolean champiñones;
        private boolean cebolla;
        private boolean jamon;
        private boolean aceitunas;
        private boolean pimientos;
        private boolean glutenFree;
        private int tamaño;

        public PizzaBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public PizzaBuilder setMasa(String masa) {
            this.masa = masa;
            return this;
        }

        public PizzaBuilder setSalsa(String salsa) {
            this.salsa = salsa;
            return this;
        }

        public PizzaBuilder setQueso(String queso) {
            this.queso = queso;
            return this;
        }

        public PizzaBuilder addIngrediente(String ingrediente) {
            this.ingredientes.add(ingrediente);
            return this;
        }

        public PizzaBuilder setExtraQueso(boolean extraQueso) {
            this.extraQueso = extraQueso;
            return this;
        }

        public PizzaBuilder setPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder setJamon(boolean jamon) {
            this.jamon = jamon;
            return this;
        }

        public PizzaBuilder setGlutenFree(boolean glutenFree) {
            this.glutenFree = glutenFree;
            return this;
        }

        public PizzaBuilder setTamaño(int tamaño) {
            this.tamaño = tamaño;
            return this;
        }

        // Métodos estáticos para crear pizzas predefinidas
        public static PizzaBuilder margaritaBuilder() {
            return new PizzaBuilder()
                    .setNombre("Margarita")
                    .setMasa("fina")
                    .setSalsa("tomate")
                    .setQueso("mozzarella")

                    .setTamaño(30);
        }

        public static PizzaBuilder pepperoniBuilder() {
            return new PizzaBuilder()
                    .setNombre("Pepperoni")
                    .setMasa("tradicional")
                    .setSalsa("picante")
                    .setQueso("mozzarella")
                    .setPepperoni(true)
                    .setTamaño(30);
        }

        public static PizzaBuilder vegetarianaBuilder() {
            return new PizzaBuilder()
                    .setNombre("Vegetariana")
                    .setMasa(" integral ")
                    .setSalsa(" pesto ")
                    .setQueso(" mozzarella ")
                    .setTamaño(30);
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }


}*/