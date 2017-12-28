package dispensables.duplicate_code.pull_up_method;

public class Shop {
}

class Grocery extends Shop {
    public void printReceipt() {
        System.out.println("Today's date");
        System.out.println("Items chosen");
        System.out.println("Thank you foo coming!");
    }
}

class BookStore extends Shop {
    public void printReceipt() {
        System.out.println("Today's date");
        System.out.println("Items chosen");
        System.out.println("Thank you foo coming!");
    }
}