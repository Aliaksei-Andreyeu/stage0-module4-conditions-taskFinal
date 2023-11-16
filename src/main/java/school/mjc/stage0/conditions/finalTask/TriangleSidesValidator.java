package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double firstCouple = firstSide + secondSide;
        double secondCouple = thirdSide + secondSide;
        double thirdCouple = firstSide + thirdSide;
        if (firstSide > 0 && secondSide > 0 && thirdSide > 0) {
            if (firstCouple > thirdSide && secondCouple > firstSide && thirdCouple > secondSide) {
                System.out.println("this is a valid triangle");
            } else {
                System.out.println("it's not a triangle");
            }
        } else {
            System.out.println("it's not a triangle");
        }
    }
}