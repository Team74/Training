import java.lang.reflect.*;

class Frc {

    public static void main(String[] args) {
        Training training = new Training();
        Solutions solutions = new Solutions();
        System.out.println("Success!");
        System.out.println(training.exerciseOne());
        System.out.println(solutions.exerciseOne());
        System.out.println(training.exerciseTwo(5));
        System.out.println(solutions.exerciseTwo(5));
        System.out.println(training.exerciseThree(11));
        System.out.println(solutions.exerciseThree(11));
        System.out.println(training.exerciseFive(75));
        System.out.println(solutions.exerciseFive(75));
        System.out.println(solutions.limitWheelSpeed(0.99));
        System.out.println(training.exerciseSix(0.5, 0.9, 0.5, 0.2));
        System.out.println(solutions.exerciseSix(0.5, 0.9, 0.5, 0.2));
        System.out.println(training.exerciseSeven());
        System.out.println(solutions.exerciseSeven());
    }

}