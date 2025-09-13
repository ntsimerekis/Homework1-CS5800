package com.tsimerekis.composition;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {

	private List<File> contents = new ArrayList<File>();
	
	public Folder(String name) {
		super(name);
	}
	
	public void clearContents() {
		contents.clear();
	}
	
	public boolean addFile(final File file) {
		if (!contents
				.stream()
				.anyMatch(f -> 
				f.getName().equals(file.getName()))) {
			return contents.add(file);
		}
		
		return false;
	}
	
	public List<File> getContents() {
		return new ArrayList<File>(contents);
	}
	
	public boolean removeFile(final String fileName) {
		return contents.removeIf(f -> f.getName().equals(fileName));
	}
	
	public static int compare(File f1, File f2) {
		final boolean f1IsFolder = f1 instanceof Folder;
		final boolean f2IsFolder = f2 instanceof Folder;
		
		if (!f1IsFolder && f2IsFolder)
			return 1;
		if (f1IsFolder && !f2IsFolder)
			return -1;
		
		return f1.getName().compareTo(f2.getName());
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		appendTree(sb, this, 0);
		return sb.toString();
	}
	
	
	public void appendTree(StringBuilder sb, Folder folder, int depth) {
		
		final List<File> files = folder.getContents();
		files.sort(Folder::compare);
		
		sb.append("  ".repeat(depth))
		  .append(folder.getName())
		  .append("/")
		  .append(System.lineSeparator());

		for (final File f : files) {
	        if (f instanceof Folder childFolder) {
	            appendTree(sb, childFolder, depth + 1);
	        } else {
				sb.append("  ".repeat(depth+1))
				  .append(f)
				  .append(System.lineSeparator());
	        }
		}
	}
	
}
