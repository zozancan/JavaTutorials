package ObjectOrientedProgramming.Interface;

public interface Worker { //interface defined
    double rate = 0.7; //variable defined. initial value assignment is mandatory

    double fee();

    void workingPart();

    void setFee(double feeConstant);
//defined methods to be defined in the classes that will use this interface


}