package Manage.details;

public class student {
    private int rollno;
    private String Name;
    private String phoneno;
    @Override
	public String toString() {
		return "student [rollno=" + rollno + ", Name=" + Name + ", phoneno=" + phoneno + "]";
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

    public student(int rollno,String Name,String phoneno){
        super();
        this.rollno=rollno;
        this.Name=Name;
        this.phoneno=phoneno;
    }

    public student(String Name,String phoneno){
        super();
        this.Name=Name;
        this.phoneno=phoneno;
    }
}
