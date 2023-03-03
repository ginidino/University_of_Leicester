package Lab06;

import java.util.Date;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": " + this.name;
    }
}


class Student extends Person {
	private int status;
	static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;

	public Student(String name, String address, String phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}

	public void setStatus(int status) {
		this.status = status; 
	}

	public String getStatus() {
		String status = "";
		if (this.status == 1) {
			status = "freshman";
		} else if (this.status == 2) {
			status = "sophomore";
		} else if (this.status == 3) {
			status = "junior";
		} else if (this.status == 4) {
			status = "senior";
		}
		return status;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nStatus: " + this.getStatus();
	}
}

class Employee extends Person {
	private String office;
    private double salary;
    private Date dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

	public String getOffice() {
        return this.office;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDateHired() {
        return this.dateHired;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
    
    @Override
	public String toString() {
		return super.toString() + "\nOffice: " + this.office + "\nSalary: £" + this.salary + "\nDate hired: " + this.dateHired;
	}
}


class Faculty extends Employee {
	private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

	public String getOfficeHours() {
		return this.officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String toString() {
		return super.toString() + "\nOffice hours: " + this.officeHours + "\nRank: " + this.rank;
	}
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return super.toString() + "\nTitle: " + this.title;
	}
}
