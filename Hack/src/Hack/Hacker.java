package Hack;
import java.util.ArrayList;
import java.io.*;

public class Hacker {
	  public ArrayList<String> history1 =new ArrayList<String>();
      Hacker(String url) throws Exception{
    	  history1.add(url);
    	  
      }
      public void writeTo(ArrayList<String> data) throws Exception{
    	  try {
    		  File file1=new File("/Users/surumi-pt7163/Documents/JavaCodes/Hack/History.txt");
    		 FileWriter w=new FileWriter(file1);
    		 for(String u:data) {
    			 //byte Byte[]=u.getBytes();
       		  w.write(u+" \n"); 
    		 }
    		  
    		  w.close();   
              
    	  }
    	  catch(Exception E) {
    		  System.out.println("error E has occured");
    	  }
      }
      public void readFrom() throws Exception{
    	  try {
    	  File file1=new File ("/Users/surumi-pt7163/Documents/JavaCodes/Hack/History.txt");
    	  FileReader file=new FileReader(file1);
    	  BufferedReader buffer =new BufferedReader(file); 
  		String line;
  		while( (line=buffer.readLine())!=null) {
  			//history1.add(line);
  			System.out.println(line);
  		}
   
          file.close();   
    	  }
    	  catch(Exception E) {
    		  System.out.println("error E has occurred");
    	  }
    	  
      }
      //void  addFunction(String string) {
      //	  if (!history1.contains(string)) {
    	//      history1.add(string);
    	  //  }
    	  //history1.add(string);
    	 
      //}
}
