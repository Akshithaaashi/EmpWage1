package EmpWage;

public class EmpWageUC3 {
	 public static void main(String[] args) {
	        int isFullTimeEmp = 1;
	        int isPartTimeEmp =2;
	        int wagePerHrs = 20;
	        int empHrs = 0;
	        double random = Math.floor(Math.random() * 10) % 3;
	        if (random == isFullTimeEmp) {
	            System.out.println("Employee is present");
	            empHrs =8;

	        } else if (random==isPartTimeEmp){
	            System.out.println("Employee is part time present");
	            empHrs =4;

	        }else
	            System.out.println("Employee is absent");
	        System.out.println("Employee Wage is " + wagePerHrs * empHrs);
	    }
}
