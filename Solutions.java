class Solutions extends Training {
    public int exerciseOne() {
        // START
        int myVariable = 10;
        myVariable = 5;
        // END
        return myVariable;
    }

    public int exerciseTwo(int inputVariable) {
        // START
        int myVariable = 10;
        myVariable = myVariable + inputVariable;
        // END
        return myVariable;
    }
    
    public boolean exerciseThree(int inputVariable) {
        // START
        boolean isLarge;
        isLarge = (inputVariable > 10);
        // END
        return isLarge;
    }

    public void exerciseFour() {
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
        int myVariable = 0;

        if (inputVariable > 100) {
            myVariable = 1;
        } else {
            if (inputVariable > 0) {
                myVariable = 2;
            } else {
                myVariable = 3;
            }
        }
        // END
        return myVariable;
    }

    double limitWheelSpeed(double curSpeed) {
        if (curSpeed > 0.8) {
            return 0.8;
        }

        return curSpeed;
    }

    public double exerciseSix(double rightFrontSpeed, double leftFrontSpeed, double rightRearSpeed, double leftRearSpeed) {
        // START
        rightFrontSpeed = limitWheelSpeed(rightFrontSpeed);
        leftFrontSpeed = limitWheelSpeed(leftFrontSpeed);
        rightRearSpeed = limitWheelSpeed(rightRearSpeed);
        leftRearSpeed = limitWheelSpeed(leftRearSpeed);
        // END
        return rightFrontSpeed + leftFrontSpeed + rightRearSpeed + leftRearSpeed;
    }

    public double exerciseSeven() {
        // START
        testMotor = new Motor(0.34);
        testMotor.maxSpeed = 0.87;
        // END
        return testMotor.maxSpeed;
    }
}