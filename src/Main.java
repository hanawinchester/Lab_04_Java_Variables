public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 20.20; // price
        double salesTax = purchasePrice * .05; //tax
        double Total = purchasePrice + salesTax; //total
        System.out.println("The sales tax for a purchase of $" + purchasePrice + " is $" + salesTax + ". Your total price is $" + Total + ".");
    }
}