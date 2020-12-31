package jsonServer;

public class jsonServerRunner {
	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("cmd /c start res\\jsonServer.bat");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
