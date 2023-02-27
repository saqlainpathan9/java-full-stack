import java.util.*;

class Employee {
    private int empno;
    private String ename;
    private String department;
    private String gender;
    private String address;
    private String contact;
    private String companyName;
    private int salary;
     
    public Employee(int empno, String ename, String department, String gender, String address, String contact,
			String companyName, int salary) {
		this.empno = empno;
		this.ename = ename;
		this.department = department;
		this.gender = gender;
		this.address = address;
		this.contact = contact;
		this.companyName = companyName;
		this.salary = salary;
	}
	
    public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public String getDepartment() {
		return department;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

	public String getContact() {
		return contact;
	}

	public String getCompanyName() {
		return companyName;
	}

	public int getSalary() {
		return salary;
	}

	public String toString() {
        return empno + " " + ename + " " + department + " " + gender + " " + address + " " + contact + " " + companyName + " " + salary;
    }
}
class crudOperation {
    public static void main(String args[]) {
        List < Employee > c = new ArrayList < Employee > ();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("6.EXIT");
            System.out.println("Enter your choice : ");
            ch = s.nextInt();
            switch (ch) {
                //Insert Operation
                case 1:
                    System.out.print("Enter Employee no : ");
                    int eno = s.nextInt();
                    
                    System.out.print("Enter Employee Name : ");
                    String ename = s1.nextLine();
                    
                    System.out.print("Enter Employee Department : ");
                    String department = s1.nextLine();
                    
                    System.out.print("Enter Employee Gender : ");
                    String gender = s1.nextLine();
                    
                    System.out.print("Enter Employee Address : ");
                    String address = s1.nextLine();
                    
                    System.out.print("Enter Employee Contact : ");
                    String contact = s1.nextLine();
                    
                    System.out.print("Enter Employee CompanyName : ");
                    String companyName = s1.nextLine();
                    
                    System.out.print("Enter Salary : ");
                    int salary = s.nextInt();
                    
                    c.add(new Employee(eno, ename, department, gender, address, contact, companyName, salary));
                    System.out.println("---------------------");
                    System.out.println("Record Inserted Sucessfully");
                    System.out.println("---------------------");
                    break;
                //Display Operation
                case 2:
                    System.out.println("---------------------");
                    Iterator < Employee > i = c.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        System.out.println(e+"\t");
                    }
                    System.out.println("---------------------");
                    break;
                //Search Opeartion
                case 3:
                    boolean found = false;
                    System.out.print("Enter Empno to Search : ");
                    int empno = s.nextInt();
                    System.out.println("---------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        if (e.getEmpno() == empno) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    }
                    System.out.println("---------------------");
                    break;
                //Delete Operation
                case 4:
                    found = false;
                    System.out.print("Enter Empno to Delete : ");
                    empno = s.nextInt();
                    System.out.println("---------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        if (e.getEmpno() == empno) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record is Deleted Sucessfully");
                    }
                    System.out.println("---------------------");
                    break;
                //Update Opeartion
                case 5:
                    found = false;
                    System.out.print("Enter Employee no to Update : ");
                    empno = s.nextInt();
                    ListIterator < Employee > li = c.listIterator();
                    while (li.hasNext()) {
                        Employee e = li.next();
                        if (e.getEmpno() == empno) {
             
                            System.out.print("Enter New Employee Name : ");
                            String ename1 = s1.nextLine();
                            
                            System.out.print("Enter New Employee Department : ");
                            String department1 = s1.nextLine();
                            
                            System.out.print("Enter New Employee Gender : ");
                            String gender1 = s1.nextLine();
                            
                            System.out.print("Enter New Employee Address : ");
                            String address1 = s1.nextLine();
                            
                            System.out.print("Enter New Employee Contact : ");
                            String contact1 = s1.nextLine();
                            
                            System.out.print("Enter New Employee CompanyName : ");
                            String companyName1 = s1.nextLine();
                            
                            System.out.print("Enter New Salary : ");
                            int salary1 = s.nextInt();
                            
                            li.set(new Employee(empno,ename1, department1, gender1, address1, contact1, companyName1, salary1));
                            found = true;
                        }
                    }
                    System.out.println("---------------------");
                    if (!found) {
                        System.out.println("Record Not Found");
                    } 
                    else {
                        System.out.println("Record is Updated Sucessfully");
                    }
                    System.out.println("---------------------");
                    break;
                    
                   case 6:
                	   System.exit(0);
                    	
            }
        }
        while (ch != 6);
    }

}
