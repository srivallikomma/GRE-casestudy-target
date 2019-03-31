package defaultpackage;
import java.io.*;

public class FolderSize {

	public static void main(String[] args) {
		   try {
		    	
		   FolderSize size = new FolderSize();
        BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in)); 
           System.out.println("Enter path : ");
     String folder = reader.readLine();
    
        long fileSizeByte = size.getFolderSize(new File(folder));
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
