package EmpWage;

public class CalculateEmpWage {
	public class calculateEmpWage {
	    public static final int IS_FULL_TIME = 1;
	    public static final int IS_PART_TIME = 2;
	    public static final int WORKING_DAY_FOR_MONTH = 20;
	    public static final int WAGE_PER_HRS = 20;

	    public  int CalculateEmpWage(){
	        int empHrs = 0;
	        int empWage=0;
	        int total=0;
	        int workingDays=0;
	        int totalWorkingHrs=0;
	        while(workingDays < WORKING_DAY_FOR_MONTH && totalWorkingHrs<=100){
	            workingDays++;
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
	            totalWorkingHrs = totalWorkingHrs+empHrs;
	            empWage = WAGE_PER_HRS * empHrs;
	            total = total+empWage;
	            System.out.println("Employee Wage is " + empWage);
	        }
	        return total;
	    }
	}
}
