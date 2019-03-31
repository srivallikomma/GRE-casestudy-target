package defaultpackage;
import java.io.*;

public class FolderSize {

	public static void main(String[] args) {
		 String folder = "C:\\MyStuff\\interview";
		    try {
		    	
		    	FolderSize size = new FolderSize();
		    	size.getFolderSize(new File(folder));
	}
        catch (Exception e) {
        	}
        }
	
		    public static long getFolderSize(File dir) {
		        long size = 0;
		        for (File file : dir.listFiles()) {
		            if (file.isFile()) {
		                System.out.println(dir +"\\" + file.getName() + " " + file.length());
		                size += file.length();
		            }
		            else
		                size += getFolderSize(file);
		        }
		        return size;
		    }
}
