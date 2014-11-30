package moh.academic.files;

import java.io.File;
import java.io.PrintWriter;
import org.apache.log4j.Logger;

public class Io1 {
	static {
		System.out.println("d3");
	}

	public static void printCurrentFolderName() {
		try {
			java.io.File f = new File("./");
			System.err.println("Current Folder (-) :" + f.getAbsolutePath());
			f = f.getCanonicalFile();
			System.err.println("Canonical Folder :" + f);
		} catch (Exception e) {
			System.err.println("Error getting current folder ./ :" + e);
			e.printStackTrace(System.err);
		}
	}
	private static final Logger logger = Logger.getLogger(Io1.class);
	public final static String NAME = "MOH";
	private Helper hlp = new Helper();
	
	// "/data/ddt/config/ma

	public static void main(String[] args) {
		logger.debug("started " );
		Io1 app = new Io1();
		
		File f = app.saveFile("hi there \n at " + new java.util.Date(), "avi", "my.txt", false);
		//System.out.println("File saved " + f.getAbsolutePath());
		
		logger.info("File saved " + f.getAbsolutePath());

	}
	

	public File saveFile(String contents, String pathPre, String extn, boolean unique) {
		PrintWriter ps = null;

		File parent = hlp.getFolder();
		try {
			if (!parent.exists()) {
				parent.mkdirs();
			}
			File fileOut = null;
			if (unique) {
				fileOut = File.createTempFile(pathPre, extn, parent);
			} else {
				fileOut = new File(parent, pathPre + extn);
			}
			ps = new PrintWriter(fileOut);
			ps.write(contents);
			return fileOut;
		} catch (Exception e) {
			System.out.println("Error " + e + " pre " + pathPre);
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e2) {
					System.out.println("Error close " + e2);

				}
			}
		}
		return null;
	}
	
	public File saveFile2(String contents, String pathPre, String extn, boolean unique) {
		PrintWriter ps = null;
		//try with res
		File parent = hlp.getFolder();
		try {
			if (!parent.exists()) {
				parent.mkdirs();
			}
			File fileOut = null;
			if (unique) {
				fileOut = File.createTempFile(pathPre, extn, parent);
			} else {
				fileOut = new File(parent, pathPre + extn);
			}
			ps = new PrintWriter(fileOut);
			ps.write(contents);
			return fileOut;
		} catch (Exception e) {
			System.out.println("Error " + e + " pre " + pathPre);
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e2) {
					System.out.println("Error close " + e2);

				}
			}
		}
		return null;
	}

	// File saved /apps/dat/w43w/2014/17/25/avimy.txt
}