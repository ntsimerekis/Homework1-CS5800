package com.tsimerekis.composition;

public class Driver {
	
	public static void main(String[] args) {
		System.out.println("--- Creating structure ---");
		final Folder demo1 = new Folder("demo1");
		final Folder sourceFiles = new Folder("Source Files");
		sourceFiles.addFile(new Folder(".phalcon"));
		
		final Folder app = new Folder("app");
		app.addFile(new Folder("config"));
		app.addFile(new Folder("controllers"));
		app.addFile(new Folder("library"));
		app.addFile(new Folder("migrations"));
		app.addFile(new Folder("models"));
		app.addFile(new Folder("views"));
		sourceFiles.addFile(app);
		
		sourceFiles.addFile(new Folder("cache"));
		
		final Folder publicFolder = new Folder("public");
		publicFolder.addFile(new File(".htaccess"));
		publicFolder.addFile(new File(".htrouter.php"));
		publicFolder.addFile(new File("index.html"));
		sourceFiles.addFile(publicFolder);
		
		demo1.addFile(sourceFiles);
		
		demo1.addFile(new Folder("Include Path"));
		demo1.addFile(new Folder("Remote Files"));
		
		System.out.println(demo1);
		
		System.out.println("--- Deleting app ---");
		sourceFiles.removeFile(app);
		System.out.println(demo1);
		
		System.out.println("--- Deleting public ---");
		sourceFiles.removeFile(publicFolder);
		System.out.println(demo1);

	}

}
