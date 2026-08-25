package mypackage;

class Person {
	String name;
	 int id;
	String gender;
	
	public Person(String name,int id,String gender) {
		this.name=name;
		this.id=id;
		this.gender=gender;
	}
	public void displayInfo() {
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
		System.out.println("Gender:"+gender);
	}

}
