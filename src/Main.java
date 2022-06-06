public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 20.20;
        double salesTax = purchasePrice * .05;
        double Total = purchasePrice + salesTax;
        System.out.println("The sales tax for a purchase of $" + purchasePrice + " is $" + salesTax + ". Your total price is $" + Total + ".");
    }
}