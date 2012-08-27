
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
		System.out.print("ID��" + this.id);
		System.out.println("������" + this.firstName + this.lastName);
	}

	public static void main(String[] args) {
		User[] users = {new User(1,"�a�c","��"),
				new User(2,"���c","����"),
				new User(3,"����","��"),
				new User(4,"�ēc","�ɐD"),
				new User(5,"����","�L��q"),
				new User(6,"����","�^��"),
				new User(7,"����","���a"),
				new User(8,"����","�G��"),
				new User(9,"����","�m��"),
				new User(10,"�|�}","���"),
				};
		for(User u : users){ 
			u.show();
		}
		User[] ss = 
			{ 
				new Student(1,"���c","����"),
				new Student(2,"����","��"),
				new Student(3,"���i","�T��"),
				new Student(4,"�ēc","�ɐD"),
				new Student(5,"���c","����"),
				new Student(6,"����","�L��q"),
				new Student(7,"����","�^��" ),
				new Student(8,"�|��","���a"),
				new Student(9,"����","�G��"),
				new Student(10,"����","�m��"),
				new Student(11,"�|�}","���" ),
				new Student(12,"���c","��"),
				new Student(13,"���G","���q"),
				new Student(14,"�ԓc","�P��"),
				new Student(15,"���c","���i"),
				new Student(16,"�i��","�C��"),
				new Student(17,"�ޖؖ�","����"),
				new Student(18,"�R�V��","�m��"),
				new Student(19,"�����]","�k��"),
				new Student(20,"���","���^"),
				new Student(21,"�R��","����"),
				new Student(22,"�F��","�m��"),
				new Teacher(23,"���V","���","�f�U�C��"),
				new Teacher(24,"���f�B","�W�F�C�\��","�f�U�C��"),
				new Teacher(25,"����","��","Web/�A�v��"),
				new Teacher(26,"�R�{","�_�i","3DCG"),
				new Teacher(27,"�n�i�u�T","�m�u���L","�f�U�C�� "),
				new Teacher(28,"�R�k�}","���V�c�O","Web/�A�v��"),
				new Teacher(29,"�n��","����","Web/�A�v��")
			};
		for(User s : ss){
			s.show();

	}

}
}
