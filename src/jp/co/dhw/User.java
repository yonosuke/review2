package jp.co.dhw.review1;

public class User {
	public Integer id;
	public String firstName;
	public String lastName;
	
	public void showName() {
		System.out.println(this.firstName + ":" + this.lastName);
	}
	public User(Integer id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void show(){
		System.out.print("ID¨" + this.id);
		System.out.println("¼¨" + this.firstName + this.lastName);
	}

	public static void main(String[] args) {
		User[] users = {new User(1,"ac","Ö"),
				new User(2,"c","²"),
				new User(3,"Ø",""),
				new User(4,"Äc","ÉD"),
				new User(5,"·ö","Lóq"),
				new User(6,"ð©","^å"),
				new User(7,"","a"),
				new User(8," è","G¡"),
				new User(9,"â","mî"),
				new User(10,"|}","åå"),
				};
		for(User u : users){ 
			u.show();
		}
		User[] ss = 
			{ 
				new Student(1,"c","²"),
				new Student(2,"Ø",""),
				new Student(3,"¿i","Tî"),
				new Student(4,"Äc","ÉD"),
				new Student(5,"c","²"),
				new Student(6,"·ö","Lóq"),
				new Student(7,"ð©","^å" ),
				new Student(8,"|","a"),
				new Student(9," è","G¡"),
				new Student(10,"â","mî"),
				new Student(11,"|}","åå" ),
				new Student(12,"¡c","Ä"),
				new Student(13,"¼G","±q"),
				new Student(14,"Ôc","Pê"),
				new Student(15,"´c","´i"),
				new Student(16,"iì","C½"),
				new Student(17,"ÞØì","ê"),
				new Student(18,"RVà","m½"),
				new Student(19,"à]","k¡"),
				new Student(20,"ìû","´^"),
				new Student(21,"Rì","¡"),
				new Student(22,"Fì","mî"),
				new Teacher(23,"·àV","åã","fUC"),
				new Teacher(24,"fB","WFC\","fUC"),
				new Teacher(25,"ä","²","Web/Av"),
				new Teacher(26,"R{","_i","3DCG"),
				new Teacher(27,"niuT","muL","fUC "),
				new Teacher(28,"Rk}","VcO","Web/Av"),
				new Teacher(29,"n","¸¡","Web/Av")
			};
		for(User s : ss){
			s.show();

	}

}
}
