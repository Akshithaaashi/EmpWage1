package EmpWage;

public class EmpWageUC5 {
	 public static final int IS_FULL_TIME = 1;
	    public static final int IS_PART_TIME = 2;
	    public static final int WORKING_DAY_FOR_MONTH = 20;
	    public static final int WAGE_PER_HRS = 20;
	    public static void main(String[] args) {
	        int empHrs = 0;
	        int empWage=0;
	        int total=0;
	        for (int i =0; i<WORKING_DAY_FOR_MONTH; i++){
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
	        empWage = WAGE_PER_HRS * empHrs;
	        total = total+empWage;
	        System.out.println("Employee Wage is " + empWage);
	    }
	        System.out.println("Total Emp wage is : " +total);
	    }

}
