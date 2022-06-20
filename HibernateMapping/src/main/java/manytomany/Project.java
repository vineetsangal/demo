package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Project {
	@Id
	private int pid;
	private String name;
	@ManyToMany
	private List<Emp> employee;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Emp> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Emp> employee) {
		this.employee = employee;
		
	}
	public Project(int pid, String name, List<Emp> employee) {
		super();
		this.pid = pid;
		this.name = name;
		this.employee = employee;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
