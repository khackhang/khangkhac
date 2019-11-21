public class Person1{
	String name;
	int age;
	Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
<<<<<<< HEAD
		return name + "_" +age+"Xin Chao Lan 1";
=======
		return name + "_" +age+"Xin Chao Lan 2";
>>>>>>> 31aa637b7c8ee15db4f9be1884f0d112c79e0ef0
	}	

	public static void main(String[] args){
		Person1 peter = new Person1("Peter Paul",21);
		//Person1 robert = new Person1("Robert Chen",22);
		Person1 robert = peter;
		System.out.println(peter.hashCode());
		System.out.println(robert.hashCode());
	}
}
