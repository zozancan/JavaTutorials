package ObjectOrientedProgramming.Interface;

public class SalesPerson implements Worker {
    final double commissionRate = 0.3;
    double feeConstants;
    double commission;

    @Override
    public double fee() {
        return ((feeConstants * rate) + commission);
    }

    @Override
    public void workingPart() {
        System.out.println("Sales Person");
    }

    @Override
    public void setFee(double feeConstants) {
        this.feeConstants = feeConstants;
    }

    public void setSalesCommission(int pieces) {
        commission = pieces * commissionRate;
    }
}
