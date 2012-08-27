
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
		System.out.print("ID→" + this.id);
		System.out.println("氏名→" + this.firstName + this.lastName);
	}

	public static void main(String[] args) {
		User[] users = {new User(1,"和田","敦"),
				new User(2,"武田","憲隆"),
				new User(3,"高木","香"),
				new User(4,"柴田","伊織"),
				new User(5,"長尾","有希子"),
				new User(6,"酒見","真悟"),
				new User(7,"武末","憲和"),
				new User(8,"國崎","宏治"),
				new User(9,"割鞘","洋介"),
				new User(10,"榎枝","大悟"),
				};
		for(User u : users){ 
			u.show();
		}
		User[] ss = 
			{ 
				new Student(1,"武田","憲隆"),
				new Student(2,"高木","香"),
				new Student(3,"徳永","裕介"),
				new Student(4,"柴田","伊織"),
				new Student(5,"武田","憲隆"),
				new Student(6,"長尾","有希子"),
				new Student(7,"酒見","真悟" ),
				new Student(8,"竹末","憲和"),
				new Student(9,"國崎","宏治"),
				new Student(10,"割鞘","洋介"),
				new Student(11,"榎枝","大悟" ),
				new Student(12,"今田","尭"),
				new Student(13,"松隈","恭子"),
				new Student(14,"花田","恒一"),
				new Student(15,"原田","清司"),
				new Student(16,"永野","修平"),
				new Student(17,"奈木野","純一"),
				new Student(18,"山之内","洋平"),
				new Student(19,"鐘ヶ江","耕治"),
				new Student(20,"野口","龍真"),
				new Student(21,"山野","兼治"),
				new Student(22,"皆川","洋介"),
				new Teacher(23,"長澤","大輔","デザイン"),
				new Teacher(24,"ラディ","ジェイソン","デザイン"),
				new Teacher(25,"薄井","隆","Web/アプリ"),
				new Teacher(26,"山本","浩司","3DCG"),
				new Teacher(27,"ハナブサ","ノブユキ","デザイン "),
				new Teacher(28,"コヌマ","ヨシツグ","Web/アプリ"),
				new Teacher(29,"渡部","昇治","Web/アプリ")
			};
		for(User s : ss){
			s.show();

	}

}
}
