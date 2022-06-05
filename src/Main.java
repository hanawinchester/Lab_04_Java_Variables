public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 1;
        int intOperandB = 2;
        int intSum = 3;
        int intProduct = 4;
        int intDifference = 5;
        int intQuotient = 6;
        int intModulo = 7;

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
        double doubleSum = 5.50;
        double doubleProduct = 6.50;
        double doubleDifference = 7.50;
        double doubleQuotient = 8.50;


    }
}