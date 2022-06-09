package OOPs;

class User {
int userId;
String userName;
String emailId;

// constructor - if add any return type, comopiler will consider it as method not as constructor 
// no compilation error will be given
public User(int id,String name,String email)// explicitely constructor cannot have return type but implicitely it return instance of class
{
	userId=id;
	userName=name;
	emailId=email;
}

@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + "]";
}


}// end of class

public class ConstructorDemo {
	public static void main(String[] args) {
		User user=new User(101,"Tauqir","tauqir@gmail");
		System.out.println(user);
	
}
}