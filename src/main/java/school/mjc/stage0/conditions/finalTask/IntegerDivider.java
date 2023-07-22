package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {

        // integer division of dividend be divider, save the value
        // multiply result by divider and will if
        //got value is equal to dividend will print:"can be divided completely",
        // otherwise "cannot be divided completely" or
        //"division by zero".

        if (divider == 0) {
            System.out.println("division by zero");
        } else {
            int result = dividend / divider;
            result *= divider;

            if (result == dividend) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        }

    }
}
