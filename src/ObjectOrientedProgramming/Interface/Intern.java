package ObjectOrientedProgramming.Interface;

public class Intern implements Worker {
    double feeConstants;

    @Override
    public double fee() {
        return feeConstants * rate;
    }

    @Override
    public void workingPart() {
        System.out.println("Intern");
    }

    @Override
    public void setFee(double feeConstants) {
        this.feeConstants = feeConstants;
    }
}
