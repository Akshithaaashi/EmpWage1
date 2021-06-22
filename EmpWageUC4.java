package EmpWage;

public class EmpWageUC4 {
	public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static void main(String[] args) {
        int wagePerHrs = 20;
        int empHrs = 0;
        int random =(int) Math.floor(Math.random() * 10) % 3;
        switch(random) {
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            case IS_PART_TIME:
                empHrs = 4;
                break;
            default:
                break;

        }
        System.out.println("Employee Wage is " + wagePerHrs * empHrs);
    }
}
