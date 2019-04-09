package ObjectOrientedProgramming.Interface;

public class Director implements Worker {
    double feeConstants;

    @Override
    public double fee() {
        return feeConstants * rate;
    }

    @Override
    public void workingPart() {
        System.out.println("Director");
    }

    @Override
    public void setFee(double feeConstants) {
        this.feeConstants = feeConstants;
    }
}
