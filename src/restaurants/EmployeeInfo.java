package restaurants;

public class EmployeeInfo {
	static String restaurantName;
	String managerName;
	String employeeName;
	int age;
	 
	public void rName() {
		restaurantName = "Dunkin Dounut";
		System.out.println("The name of the restaurant is "+ restaurantName + ".");
	}
	public void mName() {
		managerName = "Maria Jean";
		System.out.println("The name of the manager is " + managerName + ".");
	}
	
	//Constructor 1
	public EmployeeInfo() {
	}
	//Constructor 2
	public EmployeeInfo(String employeeName, String managerName) {
		this.employeeName = employeeName;
		this.managerName = managerName;
		System.out.println("The employee name is " + employeeName + "\nThe name of the manager is " + managerName + ".");
	}
	//Constructor 3
		public EmployeeInfo(String employeeName, int age) {
			this.employeeName = employeeName;
			this.age = age;
			System.out.println("The employee name is " + employeeName + " and his age is " + age + ".");
		}
}
