package Files;

public class GetCurrentWorkingDirectory {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.out.println("Directory of user is :"+ path);

	}

}
