import java.io.*;
import java.util.*;


class EmployeeInfo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Employee Details (Emp ID, Name, Salary) in Single Line:");
		String empDetail = br.readLine();

		StringTokenizer st = new StringTokenizer(empDetail," ");
						//Parameter: (StringName, "StringSepratorCharacter")
					//StringSepratorCharacter should be String always i.e. (" ") 
		
		//	Method 1: Without trim() used for normal Inputs

		//String token1 = st.nextToken();	//Allowed
		//String token2 = st.nextToken();	//Allowed
		//String token3 = st.nextToken();	//Allowed

		//	Method 2: Along with trim() used to remove unwanted space during tokenization

		String token1 = (st.nextToken()).trim();//trim(): used to remove unwanted Spaces in String
		String token2 = (st.nextToken()).trim();//trim() belongs to StringTokenizer Class
		String token3 = (st.nextToken()).trim();//Needs to be stored after trim() is used

		int empId = Integer.parseInt(token1);
		String empName = token2;
		int empSal = Integer.parseInt(token3);
		
		System.out.println("Employee ID: "+ empId);
		System.out.println("Employee Name: "+ empName);
		System.out.println("Employee Salary: "+ empSal);
	}
}
