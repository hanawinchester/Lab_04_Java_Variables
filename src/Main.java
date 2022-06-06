public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 1;
        int intOperandB = 2;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;

        intSum = intOperandA + intOperandB; //+
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intSum * intOperandB; //*
        System.out.println("The product of ints " + intSum + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandB - intOperandA; //-
        System.out.println("The difference of ints " + intOperandB + " and " + intOperandA + " is " + intDifference);

        intQuotient = intProduct/ intSum; // /
        System.out.println("The quotient of ints " + intProduct + " and " + intSum + " is " + intQuotient);

        intModulo = intSum % intOperandB; // %
        System.out.println("The remainder of " + intSum + " divided by " + intOperandB + " is " + intModulo);


        double doubleOperandA = 3.50;
        double doubleOperandB = 4.50;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;

        doubleSum = doubleOperandA + doubleOperandB; //+
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleSum * doubleOperandB; //*
        System.out.println("The product of doubles " + doubleSum + " and " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandB - doubleOperandA; //-
        System.out.println("The difference of doubles " + doubleOperandB + " and " + doubleOperandA + " is " + doubleDifference);

        doubleQuotient = doubleProduct/ doubleSum; // /
        System.out.println("The quotient of doubles " + doubleProduct + " and " + doubleSum + " is " + doubleQuotient);

        doubleModulo = doubleSum % doubleOperandB; // %
        System.out.println("The remainder of " + doubleSum + " divided by " + doubleOperandB + " is " + doubleModulo);

        //Variables
        double myLunchCost = 12.50;
        int numOfKids = 2;
        double gasPrice = 5.50;
        int favoriteNumber = 21;
        double shoeSize = 8.5;
        String birthMonth = "December";
        String fullName = "Hana Rose Winchester";

    }
}