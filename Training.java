class Training {
    int exampleInstruction1, exampleInstruction2, exampleInstruction3, exampleInt, myVariable;
    double exampleDouble;
    boolean exampleBool, isLarge;
    String exampleString;
    Motor testMotor = new Motor();
    
    public Training() {
        /**
         * ****
         * FRC Robotics - Intro to Programming and Java
         * ****
         * 
         * This presentation covers the basic fundamentals of computer programming in Java to the extent needed to use Java to program FRC robots.
         */

        /**
         * ****
         * What is code?
         * ****
         * 
         * Code is a list of instructions a computer will follow.
         * 
         * The computer will execute each line of code, one a time, in order, from top to bottom.
         * 
         * Although it is possible for the program to tell the computer to skip certain lines of code or to jump to running code somewhere else in the program.
         * 
         * In java, each instruction ends in a semicolon ( ; ).  This is sort of like the period marking the end of a sentence.
         */
        exampleInstruction1 = 5 + 8;
        exampleInstruction2 = 5 - 8;
        exampleInstruction3 = 5 * 8;

        /**
         * ****
         * What does code on a robot do?
         * ****
         * 
         * Gather data:
         *      - From controls manned by human operators.
         *      - From sensors and cameras on the robot.
         * 
         * Make decisions:
         *      - Whether to send power to a motor or not.
         * 
         * Perform calculations:
         *      - How much power to send to a motor.
         * 
         * Output data:
         *      - Sending power to a motor.
         *      - Sending feedback to the human operators.
         */

        /**
         * ****
         * Comments
         * ****
         * 
         * Comments are text within code that explain the purpose of the code to humans reading the code.  The computer ignores comments completely.
         * 
         * Multi-line comments start with /* and end with */

         // Single line comments start with // (and continue to the end of the line)

        /**
         * ****
         * Types of Data
         * ****
         * 
         * Computers can store and manipulate different types of data.
         */

        // Integers (whole numbers) - aka "int"
        exampleInt = 5;
        exampleInt = -3;

        // Floating point numbers (numbers with decimals) - aka "double"
        exampleDouble = -0.3;
        exampleDouble = 0.5;
        exampleDouble = 8.34;

        // Boolean
        // A boolean piece of data has exactly two possible values; they could represent:
        // true and false, on and off, yes and no, 1 and 0, pressed or not pressed, etc.
        // When writing code, the keywords "true" and "false" are used to represent the value.
        exampleBool = true;
        exampleBool = false;

        // Text - aka "String"
        // When writing code, text is always enclosed in quotation marks.
        // The quotation marks allow the computer to differentiate between code and text.
        exampleString = "some example text here";

        /**
         * ****
         * Variables
         * ****
         * 
         * A variable is a location in computer memory where a computer stores a value so it can use the value later.
         * 
         * Each variable has a type, a name, and a value.  
         * 
         * Using code, we tell the computer which variables a program has.  We tell the computer each variable's name, type, and value.
         * 
         * The name and type never change, but the value may change.
         * 
         * A variable can only contain values matching its type - so a variable of type int can only contains numbers.
         */

        // type is double
        // name is maxSpeed - the name can be any combination of letters and numbers that we choose
        // value is 1.0 - the value must be of the appropriate type
        double maxSpeed = 1.0;

        /**
         * ****
         * Variable definition and assignment
         * ****
         */

        // We can define a variable and assign it an initial value at the same time
        double currentSpeed = 0.0;

        // We can also define a variable without assigning any value
        boolean aButtonIsPressed;

        // We can assign a new value to a variable later, which will overwrite the previous value
        currentSpeed = 1.0;
        aButtonIsPressed = true;
    }

    public int exerciseOne() {
        /**
         * After the line "// START":
         * (1) Define an int variable named myVariable with an initial value of 10
         * (2) Then change the value of the same variable to 5.
         */
        // START

        // END
        return myVariable;
    }

    public void trainingTwo() {
        /**
         * ****
         * Expressions
         * ****
         * 
         * An expression is code the computer evaluates to simplify down to a single value.
         */
        exampleInstruction1 = 5 + 5; // expression value is 25
        exampleInstruction1 = 15 - (5 + 6); // expression value is 4
        exampleInstruction1 = 5; // a single value is also an expression expression value is 5

        /**
         * ****
         * Assigning variables using expressions
         * ****
         * 
         * The value we assign to a variable can be any expression.
         */
        double speedIncrement = 0.5 + 0.1; // variable value is 0.6

        /**
         * ****
         * Using variables
         * ****
         * 
         * The value stored in a variable can be used in an expression by typing the name of the value into the expression in place of a number.
         */
        double currentSpeed = 0.1;
        exampleDouble = 0.5 + currentSpeed; // expression value is 0.6
    }

    public int exerciseTwo(int inputVariable) {
        /**
         * After the line "// START":
         * (1) Define an int variable named myVariable with an initial value of 10
         * (2) Assume another variable named inputVariable has already been defined
         * (3) Add inputVariable and myVariable and store the result back in myVariable
         */
        // START

        // END
        return myVariable;
    }

    public void trainingThree() {
        /**
         * ****
         * Performing calculations - int and double
         * ****
         */

        // Addition
        exampleInt = 5 + 2; // value is 7

        // Subtraction
        exampleInt = 5 - 2; // value is 3

        // Multiplication
        exampleInt = 5 * 2; // value is 10

        // Division
        exampleInt = 6 /3; // value is 2

        // Remainder
        exampleInt = 5 % 2; // value is 3

        /**
         * ****
         * Performing calculations - boolean
         * ****
         */

        // "AND"
        exampleBool = true && true; // value is true
        exampleBool = true && false; // value is false
        exampleBool = false && false; // value is false

        // "OR"
        exampleBool = true || true; // value is true
        exampleBool = true || false; // value is true
        exampleBool = false || false; // value is false

        // "NOT"
        exampleBool = !true; // value is false
        exampleBool = !false; // value is true
        
        /**
         * ****
         * Comparisons
         * ****
         * 
         * Computers can compare values (usually values stored in variables) to make decisions.
         * These comparisons are expressions and have a boolean value type
         */

        // Are two values equal?
        // Note that double equals (==) is used to compare values, while single equals (=) is used to assign a value to a variable
        exampleBool = (5 == 5); // value is true
        exampleBool = (5 == 6); // value is false

        // Are two values not equal?
        exampleBool = (5 != 5); // value is false
        exampleBool = (5 != 6); // value is true

        // Is one value greater than the other
        exampleBool = (5 > 5); // value is false
        exampleBool = (5 > 6); // value is false
        exampleBool = (5 < 5); // value is false
        exampleBool = (5 < 6); // value is true
        
        // Is one value greater than or equal to the other
        // Note that the equals sign always goes on the right of the > or < sign
        exampleBool = (5 >= 5); // value is true
        exampleBool = (5 >= 6); // value is false
        exampleBool = (5 <= 5); // value is true
        exampleBool = (5 <= 6); // value is true
    }

    public boolean exerciseThree(int inputVariable) {
        /**
         * After the line "// START":
         * (1) Define a boolean variable named isLarge without any initial value
         * (2) Assume another variable named inputVariable has already been defined
         * (3) Set isLarge to true if inputVariable is greater than 10
         */
        // START

        // END
        return isLarge;
    }

    public void trainingFour() {
        /**
         * ****
         * if block
         * ****
         * 
         * An "if" block allows code to be skipped depending on the value of a boolean expression.
         * 
         * An if block consists of:
         *      The keyword "if"
         *      A boolean expression that defines whether or not you want to run the code in the block
         *      The block of code you want to run if the expression is true
         *      That code is surrounded by curly braces: { and } 
         */
        double maxSpeed = 1.0;
        double currentSpeed = 0.7;
        boolean isGoingTooFast;

        if (currentSpeed > maxSpeed) {
            isGoingTooFast = true;
        }
        
        /**
         * ****
         * else block
         * ****
         * 
         * An else block can be combined with an if block to run one block of code
         */
        int maxArmPosition = 100;
        int currentArmPosition = 50;
        double armMotorSpeed;

        if (currentArmPosition >= maxArmPosition) {
            armMotorSpeed = 0;
        } else {
            armMotorSpeed = 0.5;
        }
        
        /**
         * ****
         * Nesting
         * ****
         * 
         * If statements can be nested within each other.
         */
        boolean downButtonPressed = false;
        boolean upButtonPressed = false;
        int minArmPosition = 0;

        if (upButtonPressed == true) {
            if (currentArmPosition >= maxArmPosition) {
                armMotorSpeed = 0;
            } else {
                armMotorSpeed = 0.5;
            }
        } else {
            if (downButtonPressed == true) {
                if (currentArmPosition <= minArmPosition) {
                    armMotorSpeed = 0;
                } else {
                    armMotorSpeed = -0.5;
                }
            }
        }

        /**
         * ****
         * Indentation
         * ****
         * 
         * To make code easier to read, we indent code that is within curly braces to make it visually easier to group together.
         * 
         * Use the tab key to indent a line.  You can also select multiple lines and press tab to indent them all, or shift+tab to unindent them all.
         * 
         * The indentation has no functional effect on the execution of the code.
         * 
         * Compare the code below to the code above.  Both do exactly the same thing, but one is a lot easier to read.
         */
        if (upButtonPressed == true) {
        if (currentArmPosition >= maxArmPosition) {
        armMotorSpeed = 0;
        } else {
        armMotorSpeed = 0.5;
        }
        } else {
        if (downButtonPressed == true) {
        if (currentArmPosition <= minArmPosition) {
        armMotorSpeed = 0;
        } else {
        armMotorSpeed = -0.5;
        }
        }
        }
    }

    public void exerciseFour() {
        /**
         * Fix the indentation on the following code.
         */
        boolean upButtonPressed = false;
        boolean downButtonPressed = false;
        boolean isLimitReached = false;
        double armMotorSpeed;
        int currentArmPosition = 50;
        int maxArmPosition = 100;
        int minArmPosition = 0;

        if (upButtonPressed == true) {
        if (currentArmPosition >= maxArmPosition) {
        armMotorSpeed = 0;
        isLimitReached = true;
        } else {
        armMotorSpeed = 0.5;
        isLimitReached = false;
        }
        } else {
        if (downButtonPressed == true) {
        if (currentArmPosition <= minArmPosition) {
        armMotorSpeed = 0;
        isLimitReached = true;
        } else {
        armMotorSpeed = -0.5;
        isLimitReached = false;
        }
        }
        }
    }

    public int exerciseFive(int inputVariable) {
        /**
         * After the line // START:
         * (1) Define an int variable named myVariable with an initial value of 0
         * (2) Assume an int variable named inputVariable has been defined already
         * (3) Using exactly two if blocks:
         *      Set myVariable to 1 if inputVariable is greater than 100
         *      Set myVariable to 2 if inputVariable is between 0 and 100
         *      Set myVariable to 3 if inputVariable is less than 0
         */
        // START

        // END
        return myVariable;
    }

    public void trainingFive() {
        /**
         * ****
         * Methods
         * ****
         * 
         * Code in Java is organized into "methods".  These are small, re-usable blocks of code.  They are sort of like a mini program-within-a-program.
         * 
         * Just like a full program, each method has input, calculations, decision-making, and output.
         * 
         * One of the most useful properties of methods is the ability to re-use logic without having to type the same logic many times.
         * 
         * For example, the following code could be used to control the four wheels of a robot by putting a speed limit on each wheel.
         */
        double rightFrontSpeed = 0.75;
        double leftFrontSpeed = 0.75;
        double rightRearSpeed = 0.75;
        double leftRearSpeed = 0.75;

        if (rightFrontSpeed > 0.8) {
            rightFrontSpeed = 0.8;
        }

        if (rightRearSpeed > 0.8) {
            rightRearSpeed = 0.8;
        }

        if (leftFrontSpeed > 0.8) {
            leftFrontSpeed = 0.8;
        }

        if (leftRearSpeed > 0.8) {
            leftRearSpeed = 0.8;
        }

        /**
         * However, consider that If you wanted to change the speed limit from 0.8 to 0.9, you would have to update 8 lines of code to do so!
         * 
         * This code is essentially the same logic repeated 4 times (once per wheel).  For each wheel, we have:
         *      Input: the current speed of the wheel
         *      Logic: is the current speed too fast
         *      Output: the new speed of the wheel
         */
    }

    /**
     * To declare a method in Java, we need to tell the computer:
     *      The type of the method's output (a method can only output one value)
     *      The type and name of the input values (a method can have any number of input values)
     *      The name of the method - like a variable, this can be any characters and numbers.  This is used by the programmer when writing code that uses the method.
     *      The code (calculations and decision-making) that belong to the method.
     */
    // the type of the output is int
    // the name of the method is myMethodWhichAdds
    // the method accepts two input parameters; these are defined in a comma-separated list
    //      the first parameter is an int named myInputValue1
    //      the second parametr is an int named myInputValue2
    // the code for the method goes within curly braces: { and }
    // a special keyword, "return", is used to stop executing the code in the method and specify the output value.  Any expression can be used as the output.
    int myMethodWhichAdds(int myInputValue1, int myInputValue2) {
        int sum = myInputValue1 + myInputValue2;
        return (sum + 3);
    }

    /**
     * The return method stops execution immediately.  In this example, sum is never set to -5; the output is always 10.
     */
    int myMethodWhichSubtracts() {
        int sum = 10;
        return sum;
        sum = -5;
    }

    public void trainingSix() {
        /**
         * The code in a method can be executed / run by writing:
         *      The name of the method
         *      An opening (
         *      A comma-separated list of input parameters - these are all expressions
         *      A closing )
         *      A semicolon ;
         */
        int sum1 = myMethodWhichAdds(5, 8); // value of sum1 is 5+8+3 = 16
        int sum2 = 6 + myMethodWhichAdds(7, 4); // value of sum2 is 6+7+4+3 = 20
        int myInt1 = 1;
        int sum3 = myMethodWhichAdds(myInt1, 2+2) + myMethodWhichAdds(4, 5); // value of sum3 is 1+2+2+3+4+5+3 = 20
    }

    /**
     * After the line // START:
     * (1) Write a method named limitWheelSpeed to limit the speed of a wheel to 0.8.  The method should:
     *      Accept the current speed of the wheel as a double (input)
     *      Set the new speed of the wheel to 0.8 if the current speed is greater than 0.8.
     *      Otherwise, the new speed of the wheel can remain the same as the current speed.
     *      Output the new speed of the wheel as a double (output / return)
     */
    // START

    // END
    
    public double exerciseSix(double rightFrontSpeed, double leftFrontSpeed, double rightRearSpeed, double leftRearSpeed) {
        /**
         * After the line // START:
         * (1) Assume there are four double variables named: rightFrontSpeed, leftFrontSpeed, rightRearSpeed, leftRearSpeed
         * (2) Using your limitWheelSpeed method, limit the maximum value of each of the four variables to 0.8
         */
        // START

        // END
        return rightFrontSpeed + leftFrontSpeed + rightRearSpeed + leftRearSpeed;
    }

    public void trainingSeven() {
        /**
         * ****
         * Objects
         * ****
         * 
         * int, double, and boolean are all simple types of values, however Java also supports complex types of variables called objects.
         * 
         * If you consider variables of those simple types to be boxes which contain values, an object is a box which contains other boxes.
         * 
         * There are many different types of objects, and you can also define your own.  A type of object is called a "Class".
         * 
         * For example, you might have an object type ("class") called a "Motor", and it might contain values for the motor's speed and maximum speed.
         * 
         * When defining a variable that contains an object, you use the name of the type of object as the type of the variable:
         */
        Motor leftFront;

        /**
         * Unlike simple values, objects must be "created".  They are created using the "new" keyword and the name of the object type ("class").
         * The syntax looks very similar to calling a method, except for the use of the "new" keyword.
         */
        leftFront = new Motor();

        /**
         * Similar to a method, it is also possible to pass input values into an object when creating it.
         * An object might use those input values to define the initial values for the variables it stores.
         */
        double maxSpeed = 0.8;
        leftFront = new Motor(maxSpeed);

        /**
         * You can create multiple instances of the same object type (class).  Each one has its own set of contained values (they are not shared).
         */
        double leftRearMaxSpeed = 0.75;
        double rightRearMaxSpeed = 0.65;
        Motor leftRear = new Motor(leftRearMaxSpeed);
        Motor rightRear = new Motor(rightRearMaxSpeed);

        /**
         * You can access variables that are within an object using the . symbol.
         * First write the name of the variable containing the object, then a ., then the name of the variable within the object that you want to access
         */
        exampleDouble = leftRear.maxSpeed; // exampleDouble value is set to 0.75
        exampleDouble = rightRear.maxSpeed; // exampleDouble value is set to 0.65
    }

    public double exerciseSeven() {
        /**
         * After the line // START:
         * (1) Create a variable of type Motor named testmotor with an initial max speed of 0.34
         * (2) Change the max speed to 0.87
         */
        // START

        // END
        return testMotor.maxSpeed;
    }

    public void trainingEight() {
        /**
         * In addition to containing variables, objects can also contain methods.
         * To call a method within an object, use a ., follwed by (, then any input parameters for the method, and finally a )
         */
        double maxSpeed1 = 0.75;
        Motor testMotor1 = new Motor(maxSpeed1);

        double maxSpeed2 = 1.5;
        Motor testMotor2 = new Motor(maxSpeed2);

        testMotor1.setSpeed(0.9);
        exampleDouble = testMotor1.currentSpeed; // current speed will be 0.75 because 0.9 exceeds the max speed of motor1

        testMotor2.setSpeed(0.9);
        exampleDouble = testMotor2.currentSpeed; // current speed will be 0.9 because testMotor2 has a higher max speed than motor1

        testMotor1.setSpeed(0.55);
        exampleDouble = testMotor1.currentSpeed; // current speed will be 0.55 because 0.55 does not exceed the max speed of motor1

        /**
         * ****
         * Defining object types (classes)
         * ****
         * 
         * Classes allow you to define your own object types in Java.
         * A class is like a blueprint, while an object is like a specific instance of a thing built from that blueprint.
         * 
         * Java programs are typically written with each class in its own separate file.
         * 
         * Class defintions start with the word class, followed by the name of the class.  Then within curly brackets you define the variables and methods
         * that exist within the class.
         */
        class ArmMotor {
            // This class defines two variables
            double maxSpeed = 0.75;
            double currentSpeed = 0.0;

            // This class defines one method
            double setSpeed(double newSpeed) {
                // Within the method, you can use variables defined by the class (ex: currentSpeed, maxSpeed)
                if (newSpeed > maxSpeed) {
                    currentSpeed = maxSpeed;
                } else {
                    currentSpeed = newSpeed;
                }

                return currentSpeed;
            }
        }

        ArmMotor myArmMotor1 = new ArmMotor();
        myArmMotor1.setSpeed(0.8);
        exampleDouble = myArmMotor1.currentSpeed; // current speed will be 0.75

        /**
         * ****
         * Scope
         * ****
         * 
         * Variables have limited "jurisdiction" (called "scope") within a program - they are not accessible everywhere in the code.
         * 
         * A variable is defined when you specify its type.
         */
        // This defines the variable
        double currentSpeed = 0.0;

        // This does not define the variable, it only sets it
        currentSpeed = 1.0;
    }

    /**
     * The scope of a variable depends on where you define it.
     * 
     * If the variable is defined in a method, it is ONLY accessible within that method.
     * The input variables for methods are also ONLY accessible within that method.
     * Furthermore, variables do not "remember" their past value when a method runs.
     */
    double method1() {
        double myVariable1 = 0;
        myVariable1 = myVariable1 + 1;
        return myVariable1;
    }

    double method1Example() {
        exampleDouble = method1();  // value is 1
        exampleDouble = method1();  // value is still 1 - the value of myVariable1 is NOT remembered when method1 runs again
        return exampleDouble;
    }

    double method2() {
        // method2 cannot use myVariable1 - it is not defined here
        double myVariable2 = 9;
        return myVariable2;
    }

    public void trainingNine() {
        /**
         * If the variable is defined in a class, the variable can be used by ANY method in the class.
         * Variables defined in a class DO remember their value.
         * Each object (instance of a class) has its own SEPARATE set of class variables - they are not shared
         */
        class ArmMotor {
            // This class defines two variables
            double maxSpeed = 0.75;
            double currentSpeed = 0.0;

            double setSpeed(double newSpeed) {
                // This method can use currentSpeed and maxSpeed because both are defined at the class level
                // This method cannot use checkSpeed because it is defined only in the isSpeedTooHigh method
                if (isSpeedTooHigh(newSpeed)) {
                    currentSpeed = maxSpeed;
                } else {
                    currentSpeed = newSpeed;
                }

                return currentSpeed;
            }

            boolean isSpeedTooHigh(double checkSpeed) {
                // This method can use currentSpeed and maxSpeed because both are defined at the class level
                // This method cannot use newSpeed because it is defined only in the newSpeed method
                return (checkSpeed > maxSpeed);
            }

            double addToSpeed(double amountToAdd) {
                // This method can use currentSpeed and maxSpeed because both are defined at the class level
                return setSpeed(currentSpeed + amountToAdd);
            }
        }

        ArmMotor myLeftArm = new ArmMotor();
        ArmMotor myRightArm = new ArmMotor();

        myLeftArm.addToSpeed(0.1); // the current speed will be 0.1
        myLeftArm.addToSpeed(0.2); // the current speed will be 0.3 - the value of currentSpeed is remembered
        myRightArm.addToSpeed(0.05); // the current speed will be 0.05 - the value of currentSpeed for myLeftArm is DIFFERENT from the value of currentSpeed for myRightArm
    }

    /**
     * There is a lot to Java not covered here, but these basics will help get you started.
     * There are also many different ways of doing exactly the same thing in Java.
     * When you see something in code and don't understand what it's doing, just ask!
     */
}