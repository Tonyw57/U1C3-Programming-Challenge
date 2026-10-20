public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

    public Solution(String model, int id) {
        //implement code here
        this.calcModel = model;
        this.idNumber = id;
    }

    public Solution(int id) {
        //implement code here
        this.calcModel = "TI-84";
        this.idNumber = id;
    }

    public String getCalcModel() {
        //implement code here
        return this.calcModel;
    }

    public void setCalcModel(String newModel) {
        //implement code here
        this.calcModel = newModel;
    }

    public int getIdNumber() {
        //implement code here
        return this.idNumber;
    }

    public void setIdNumber(int newId) {
        //implement code here
        this.idNumber = newId;
    }

    public void incrementId() {
        //implement code here
        this.idNumber++;
    }

    public double add(double num1, double num2) {
        //implement code here
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        //implement code here
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        //implement code here
        return num1 * num2;
    }

    public int quotient(int num1, int num2) {
        //implement code here
        return num1 / num2;
    }

    public int remainder(int num1, int num2) {
        //implement code here
        return num1 % num2;
    }

    public String divisionResult(int num1, int num2) {
        //implement code here
        return quotient(num1, num2) + " R " + remainder(num1, num2);
    }

    public String coordinatePair(int x, int y) {
        //implement code here
        return "(" + x + ", " + y + ")";
    }

    public int average(int num1, int num2) {
        //implement code here
        return (num1 + num2 + 1) / 2;


    }

    public String info() {
        //implement code here
        return "This calculator is a model " + this.calcModel + " with id " + this.idNumber;
    }

}
