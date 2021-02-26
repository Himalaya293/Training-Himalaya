package assign9;

import java.io.Serializable;
import java.util.Date;

public class employee implements Serializable{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 String name;
 Date dateofbirth;
 String department;
 String designation;
 Double salary;
 public employee() {
	 super();
 }
 public employee(String name,Date dateofbirth,String department,String designation,Double salary) {
	 super();
	 this.name=name;
	 dateofbirth=dateofbirth;
	 this.department=department;
	 this.designation=designation;
	 this.salary=salary;
 }
 public void setname(String name) {
	 this.name=name;
 }
 public void setdateofbirth(Date dateofbirth) {
	 dateofbirth=dateofbirth;
 }
 public void setdepartment(String department) {
	 this.department=department;
 }
 public void setdesignation(String designation) {
	 this.designation=designation;
 }
 public void setsalary(Double salary) {
	 this.salary=salary;
 }
 public String getname() {
	 return getname();
 }
 public java.util.Date getdateofbirth() {
	 return getdateofbirth();
 }
 public String getdepartment() {
	 return getdepartment();
 }
 public String getdesignation() {
	 return getdesignation();
 }
public Double getsalary() {
	 return getsalary();
 }
}
