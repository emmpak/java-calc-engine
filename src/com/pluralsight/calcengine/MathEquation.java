package com.pluralsight.calcengine;

public class MathEquation {
    private double leftValue;
    private double rightValue;
    private char opCode;
    private double result;

    public double getLeftValue() { return leftValue; }
    public void setLeftValue(double value) { this.leftValue = value; }
    public double getRightValue() { return rightValue; }
    public void setRightValue(double value) { this.rightValue = value; }
    public char getOpCode() { return opCode; }
    public void setOpCode(char code) { this.opCode = code; }
    public double getResult() { return result; }

    public void execute() {
        switch(opCode) {
            case 'a':
                result = leftValue + rightValue;
                break;
            case 's':
                result = leftValue - rightValue;
                break;
            case 'm':
                result = leftValue * rightValue;
                break;
            case 'd':
                result = rightValue == 0.0d ? rightValue : leftValue / rightValue;
                break;
            default:
                System.out.println("Error - unknown opCode");
                result = 0.0d;
                break;
        }
    }

}