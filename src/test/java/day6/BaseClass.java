package day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseClass 
{
	static File f;
	static FileInputStream  fis;
	static Properties  mainProp;
	static Properties  chilprop;
	static String  projectRootPath = System.getProperty("user.dir");
	static String  resourcePath = "//src//test//resources//";
	
	
	public static void init() throws Exception
	{
		f = new File(projectRootPath+resourcePath+"env.properties");
		fis = new FileInputStream(f);
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("environment");
		System.out.println(e);
		
		f = new File(projectRootPath+resourcePath+e+".properties");
		fis = new FileInputStream(f);
		chilprop = new Properties();
		chilprop.load(fis);
		String url = chilprop.getProperty("amazonurl");
		System.out.println(url);
	}

}
