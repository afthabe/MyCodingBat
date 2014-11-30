package moh.academic.files;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Io {
	final private SimpleDateFormat df = new SimpleDateFormat("/yyyy/MM/dd"); 
	public static void main(String[] args) {
	   Io ap = new Io();
	   //ap.saveFile("Hi there at :"+ new java.util.Date(),"avi","my.txt");
	   ap.saveFile("Hi there Changed at  :"+ new java.util.Date(),"avi","my.txt",false);
       System.out.println("File Saved");
		
	}

	public File saveFile(String contents, String prefix,String suffix,boolean unique) {
//		PrintWriter ps = null;
		File parent = getFolder();
		
		//File parent = new File("/apps/dat/");
		File fout =null;			
//		try {
//			if (!parent.exists()) {
//				 parent.mkdirs();
//			}
//			if (unique) {
//			   fout = File.createTempFile(prefix,suffix,parent);
//			} else {
//			   fout = new File (parent,prefix+suffix);	
//			}
//			ps= new PrintWriter(fout);
//			ps.write(contents);
//			return fout;
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			
//			try {
//				if (ps != null) {
//					ps.close();
//				}
//			} catch (Exception e) {
//				System.out.println("Error: File Close");
//			}
//			
//		}
	try {
		if (!parent.exists()) {
			 parent.mkdirs();
		}
		if (unique) {
		   fout = File.createTempFile(prefix,suffix,parent);
		} else {
		   fout = new File (parent,prefix+suffix);	
		}
		try (PrintWriter ps= new PrintWriter(fout)) {
			ps.write(contents);
		};
		return fout;
	} catch (IOException e) {
		e.printStackTrace();
	}
	return null;
	}

	private File getFolder() {
		String pid = "w12345";
		Date dt = new Date();
		String datePart = df.format(dt);
		File parent = new File("/apps/dat/" + pid + datePart);
		return parent;
	}
}
