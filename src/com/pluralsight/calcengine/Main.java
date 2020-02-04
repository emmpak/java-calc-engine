package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(110.0d, 50.0d, 'a');
        equations[1] = create(240.0d, 80.0d, 's');
        equations[2] = create(360.0d, 60.0d, 'm');
        equations[3] = create(710.0d, 40.0d, 'd');

        for(MathEquation equation: equations) {
            equation.execute();
            System.out.print("The result is ");
            System.out.println(equation.getResult());
        }
    }

    private static MathEquation create(double leftValue, double rightValue, char opCode) {
        MathEquation equation = new MathEquation();
        equation.setLeftValue(leftValue);
        equation.setRightValue(rightValue);
        equation.setOpCode(opCode);
        return equation;
    }
}
