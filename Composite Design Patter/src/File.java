
public class File implements AbstractFile {
	String name;
	
	public File(String name) {
		super();
		this.name = name;
	}

	public void ls() {
		System.out.println("	File: " + this.name);
	}
}
