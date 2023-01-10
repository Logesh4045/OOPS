package oops2;

public class Doctor extends Human {
	
		private String degree;
		private int salary;
		private String licenseId;
		
		public Doctor(String name,int age,String gender,String degree,int salary,String licenseId) {
			super(name,age,gender);
			this.degree=degree;
			this.salary=salary;
			this.licenseId=licenseId;
			
		}
		public String toString() {
			return super.toString()+"Degree:"+degree+"Salary:"+salary+"LicenseId:"+licenseId;
		}

		public void setDegree(String Degree){
			this.degree=degree;
			
		}
		public String getDegree() {
			return degree;
			
		}
		public void setSalary(int Salary){
			this.salary=salary;
		}
		public int  getSalary() {
			return salary;
		}
		public void setLicenseId(String LicenseId){
			this.licenseId=licenseId;
			
		}
		public String getLicenseId() {
			return licenseId;
			
		}
		

}
