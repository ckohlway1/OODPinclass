import java.util.*;
public class Directory implements AbstractFile {
	String name;
	ArrayList<AbstractFile> includedFiles = new ArrayList<>();
	
	public Directory(String name) {
		this.name = name;
	}
	public void add(AbstractFile file) {
		includedFiles.add(file);
	}

	@Override
	public void ls() {
		System.out.println("Dir: " + this.name);
		for(int i = 0; i < includedFiles.size();i++) {
			System.out.print("	");
			includedFiles.get(i).ls();
		}
	}

}
