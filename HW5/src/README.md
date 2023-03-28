# Calculator

## Classes for numbers types

1. abstract class **GeneralNumbers**;
2. class **ComplexNumber**, which expends **GeneralNumbers**;
3. class **RationalFractions**, which expends **GeneralNumbers**;
4. class **RationalNumbers**, which expends **GeneralNumbers**.

## Interfaces

1. **Calc**, which contains available operations for all types of numbers:
   * **ComplexNumCalc** implements **Calc** interface for calculations with complex numbers;
   * **RationalFractionsCalc** implements **Calc** interface for calculations with rational fractions;
   * **RationalNumCalc** implements **Calc** interface for calculations with rational numbers;
2. **DialogUI**, which contains methods to ask numbers from user;
    * **DialogComplex** implements **DialogUI** interface to ask a complex number input from user;
    * **DialogRationalFractions** implements **DialogUI** interface to ask a rational fraction input from user;
    * **DialogRationalNumbers** implements **DialogUI** interface to ask a rational number input from user;
   
## View Class 
It shows the results of calculations for all types of numbers; 

## Menu classes
1. **mainMenu**, which shows numbers' types choice:
   1. Complex
   2. Rational fractions
   3. Rational numbers

2. **MenuCalc**, which shows available math operations with numbers:
   1. Find sum of two rational fraction numbers
   2. Find subtraction of two rational fraction numbers
   3. Multiply two rational fraction numbers
   4. Divide two rational fraction numbers
   5. Raise the rational fraction number to a natural power
   6. Compare two rational fractions (available only for fractions)

## TwoNumCalculation

Added new class for calculations between numbers, to make calcMenu shorter

## LoggerCalc
It is for logging operations results to the file *.log (xml format).