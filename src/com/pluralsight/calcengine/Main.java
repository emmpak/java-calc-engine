package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        double[] leftVals = {50.0d, 100.0d, 225.0d, 330.0d};
        double[] rightVals = {10.0d, 50.0d, 100.0d, 130.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] results = new double[opCodes.length];

        for (int i = 0; i < leftVals.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] == 0 ? rightVals[i] : leftVals[i] / rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    results[i] = 0.0d;
            }
        }
        for (double theResult : results) {
            System.out.print("The result is ");
            System.out.println(theResult);
        }
    }
}

/* Old Solution
	    double val1 = 100.0d;
	    double val2 = 50.0d;
	    double result;
	    char opCode = 'd';

	    if (opCode == 'a')
	        result = val1 + val2;
	    else if (opCode == 's')
	        result = val1 - val2;
	    else if (opCode == 'm')
	        result = val1 * val2;
	    else if (opCode == 'd')
            result = val2 == 0 ? 0.0d : val1 / val2;
	    else {
            System.out.println("Error - invalid opCode");
            result = 0.0d;
        }
	    System.out.println(result);
    }
} */
