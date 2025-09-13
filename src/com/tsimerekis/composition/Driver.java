package com.tsimerekis.composition;

public class Driver {
	
	public static void main(String[] args) {
		final Folder root = new Folder("root");
		
		root.addFile(new File("nicholas.txt"));
		root.addFile(new File("pomona.txt"));
		root.addFile(new File("longbeach.txt"));
		
		final Folder myFolder = new Folder("java");
		myFolder.addFile(new File("File.java"));
		myFolder.addFile(new File("Folder.java"));
		myFolder.addFile(new File("Driver.java"));
		
		root.addFile(myFolder);

		System.out.println(root);
	}

}
