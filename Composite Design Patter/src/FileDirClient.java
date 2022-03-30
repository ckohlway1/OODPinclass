
public class FileDirClient {
	public static void main(String[] args) {
		File java = new File("java");
		File cpp = new File("C++");
		Directory code = new Directory("Code");
		File toast = new File("Toast");
		Directory Toaster = new Directory("Toaster");
		Directory root = new Directory("Root");
		Toaster.add(toast);
		code.add(cpp);
		code.add(java);
		root.add(Toaster);
		root.add(code);
		
		root.ls();
		
	}
}
