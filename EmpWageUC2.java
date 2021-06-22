package EmpWage;

public class EmpWageUC2 {

	    public static void main(String[] args) {
	        int isFullTimeEmp = 1;
	        int wagePerHrs = 20;
	        int fullDayHrs = 8;
	        double random = Math.floor(Math.random() * 10) % 2;
	        if (random == isFullTimeEmp) {
	            System.out.println("Employee is present");

	        } else
	            System.out.println("Employee is absent");
	        System.out.println("Employee Wage is " + wagePerHrs * fullDayHrs);
	    }
	}

