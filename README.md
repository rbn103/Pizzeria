¿Por qué usar el patrón Builder para las pizzas?
En lugar de tener un constructor con demasiados parámetros (difícil de leer y propenso a errores), el patrón Builder permite construir una pizza paso a paso usando métodos con nombres significativos ademas se pueden crear builders especializados o métodos estáticos para pizzas predefinidas.
¿Qué ventajas tiene este enfoque si mañana añaden una pizza "Hawaiana?
Se agrega un nuevo método estático en PizzaBuilder y el método construirHawaiana() en PizzaDirector. No hay que modificar el constructor ni romper código existente
 ¿Cómo garantizamos que las pizzas obligatorias siempre tengan sus ingredientes base?
PizzaDirector se encarga de verificar que los ingredientes escenciales estén presentes antes de crear la instancia.
