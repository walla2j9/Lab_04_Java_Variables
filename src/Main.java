//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int intOperandA = 1;
    int intOperandB = 2;
    int intSum = 3;
    int intProduct = 4;
    int intDifference = 5;
    int intQuotient = 6;
    int intModulo = 7;
    double doubleOperandA = 3.50;
    double doubleOperandB = 4.50;
    double doubleSum = 8.40;
    double doubleProduct = 15.75;
    double doubleDifference = 1.30;
    double doubleQuotient = 0.78;
    intSum = intOperandA + intOperandB;
    System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
    intDifference = intOperandA - intOperandB;
    System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
    intProduct = intOperandA * intOperandB;
    System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
    intQuotient = intOperandA / intOperandB;
    System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
    intModulo = intOperandA % intOperandB;
    System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);
    doubleSum = doubleOperandA + doubleOperandB;
    System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
    doubleDifference = doubleOperandA - doubleOperandB;
    System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
    doubleProduct = doubleOperandA * doubleOperandB;
    System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
    doubleQuotient = doubleOperandA / doubleOperandB;
    System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
}
