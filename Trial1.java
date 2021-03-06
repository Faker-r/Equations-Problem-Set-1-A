//Andrew Wang
//Sept 20, 2021
//Problem Set 1-A
class Trial1 {
    public static void main(String[] args){
        //Quadratic Formula
        double a = 1; //Coefficient for x^2
        double b = 5; //Coefficient for x 
        double c = 6; //Constant
        double solution1 = (-b + Math.sqrt(b*b -(4*a*c)))/(2*a); //This is the quadratic that adds the square root
        double solution2 = (-b - Math.sqrt(b*b -(4*a*c)))/(2*a); //This is the quadratic that subtracts the square root
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + (int)a + "x^2 + " + (int)b + "x + " + (int)c + " are " + solution2 +" and " + solution1 + ".");
        
        //Slope Formula
        double sx1 = 0; //x value of first point
        double sx2 = 2; //y value of first point
        double sy1 = 0; //x value of second point
        double sy2 = 3; //y value of second point
        System.out.println(); //To skip another line
        System.out.println("SLOPE FORMULA"); //Formula is (sy2-sy1)/(sx2-sx1)
        System.out.println("A line connecting the points (" + (int)sx1 + ", " + (int)sy1 + ") and (" + (int)sx2 + ", " + (int)sy2 + ") has a slope of " + (sy2-sy1)/(sx2-sx1));
        
        //Midpoint Formula
        System.out.println(); //Same Variables as slope formula
        System.out.println("MIDPOINT FORMULA"); //Formula is (sx2+sx1)/2 for x value and (sy2+sy1)/2 for y
        System.out.println("The midpoint between (" + (int)sx1 + ", " + (int)sy1 + ") and (" + (int)sx2 + ", " + (int)sy2 + ") is (" + (sx2+sx1)/2 + ", " + (sy2+sy1)/2 + ")");
        
        //Sum of an arithmetic series
        double first = 1; //Start of series, first term
        double change = 1; //The rate of change
        int numTerms = 5; //Number of terms in series
        System.out.println();
        System.out.println("SUM OF AN ARITHMETIC SERIES"); //Formula is (first + last) times number of terms divided by 2 
        System.out.println("The sum of the first " + numTerms + " terms of an arithmetic series that starts with " + first);
        //Changing lines so it isn't all in one line
        System.out.println("and increases by " + change + " is " + (first*2 + (numTerms-1)*change)*numTerms/2);
        
        //Sum of a finite geometric series
        double start = 3; //Start value
        double rate = 2; //Rate of change
        int terms = 3; //Num of terms
        System.out.println();
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES"); //Used formula start * (1-rate^terms)/1-rate
        System.out.println("The sum of the first " + terms + " terms of a finite geometric series that starts with " + start );
        //Changing lines so it isn't all in one line
        System.out.println("and increases by a rate of " + rate + " is " + start * ((1-Math.pow(rate,terms))/(1-rate)));
        
    }
}
