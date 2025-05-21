package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFiles {

	public static void main(String[] args) throws IOException {
   
	  
		//1.File : Location of the file
		//C:\Users\Admin\eclipse-workspace\Automation213_216\config.properties
	    //. OR C:\Users\Admin\eclipse-workspace\Automation213_216
		String pL=System.getProperty("user.dir");
		File file=new File(pL+"/config.properties");
		FileInputStream fis=new FileInputStream(file);
		
		//if you want to read a file whose extention is .properties 
		//Properties;
		Properties pr=new Properties();
		//tell properteis which file we want to read
		//.load()
		pr.load(fis);
		
		//proerty i need 1 value : key --> value
		
	  String str=	pr.getProperty("browser");
	  
	  System.out.println(str);
		
	}

}
