package casestudy;

import java.io.*;

public class DiskSpace {
	public static void main(String args[]) {
		try {
			DiskSpace space= new DiskSpace();
			BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter path: ");
			String filesize =reader.readLine();
			long spaceinfolder=space.getsize(new File (filesize));
			//System.out.println("spaceinfolder :" + spaceinfolder);
		}
		catch (Exception e) {}
	}

	public long getsize(File folder) {
		long length=0;
		for(File file:folder.listFiles()) {
			if(file.isFile()) {
				System.out.println(folder+ "\\"+ file.getName()+ " "+file.length());
				 length = file.length();
			}
			else
				length +=getsize(file);
			
		}
		
		return length;
	}

}
