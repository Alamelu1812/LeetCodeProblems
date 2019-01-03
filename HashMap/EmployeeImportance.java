
/*
 * You are given a data structure of employee information, which includes the employee's unique id, his 
 * importance value and his direct subordinates' id.
 * 
 * For example, employee 1 is the leader of employee 2, and employee 2 is the leader of employee 3. They have 
 * importance value 15, 10 and 5, respectively. Then employee 1 has a data structure like [1, 15, [2]], and 
 * employee 2 has [2, 10, [3]], and employee 3 has [3, 5, []]. Note that although employee 3 is also a 
 * subordinate of employee 1, the relationship is not direct.
 * 
 * Now given the employee information of a company, and an employee id, you need to return the total importance 
 * value of this employee and all his subordinates.
 * 
 */

import java.util.*;

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

public class EmployeeImportance {
	public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> empMap = new HashMap<Integer,Employee>();
        
        //Key: EmpID, Value: Employee
        for(Employee emp:employees)
        	empMap.put(emp.id,emp);
        
        //Get Employee Importance
        return getEmployeeImportance(id,empMap);
    }
    
    public int getEmployeeImportance(int employeeId, HashMap<Integer,Employee> empMap) {
    	
    	//Get employee pertaining to ID
        Employee employee = empMap.get(employeeId);
        
        //Get the importance of employee
        int employeeImportance = employee.importance;
        
        //For each subordinate, call this function again
        for(Integer subEmpId:employee.subordinates){
            employeeImportance += getEmployeeImportance(subEmpId,empMap); // add subordinate importance
        }
        
        //Return importance of employee with employeeId + all subordinates importance under them 
        return employeeImportance;
    }
}
