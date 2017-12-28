package dispensables.duplicate_code.form_template_method;

abstract class Restaurant {
    public void serveDinner() {
        serveCoffee();
        serveSoup();
        serveSalad();
        serveMainDish();
        serveDrink();
    }

    private void serveCoffee() {
        System.out.println("Coffee");
    }

    protected abstract void serveSoup();

    private void serveSalad() {
        System.out.println("Salad");
    }

    protected abstract void serveMainDish();

    private void serveDrink() {
        System.out.println("Juice");
    }
}

class ItalianRestaurant extends Restaurant {
    @Override
    protected void serveSoup() {
        System.out.println("Tomato soup");
    }

    @Override
    protected void serveMainDish() {
        System.out.println("Pasta");
    }
}

class FrenchRestaurant extends Restaurant {
    @Override
    protected void serveSoup() {
        System.out.println("Onion soup");
    }

    @Override
    protected void serveMainDish() {
        System.out.println("French chicken");
    }

}




