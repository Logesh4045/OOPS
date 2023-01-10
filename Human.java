package oops2;

public class Human {
	private String name;
	private int age;
	private String gender;
	
	public Human(String name,int age,String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		
	}
	public String toString() {
		return ("Name:"+name+"Age:"+age+"Gender:"+gender);
	}

	public void setName(String Name){
		this.name=name;
		
	}
	public String getName() {
		return name;
		
	}
	public void setAge(int Age){
		this.age=age;
	}
	public int  getAge() {
		return age;
	}
	public void setGender(String Gender){
		this.gender=gender;
		
	}
	public String getGender() {
		return gender;
		
	}
	
}
