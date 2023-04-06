package Hack;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Browser {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BrowseHistory browser=new BrowseHistory();
		System.out.println("enter the urls:");
		for(int i=0;i<3;i++) {
			String str=sc.nextLine();
			browser.visit(str);
		}
		
		Hacker Hack=new Hacker("moxilla.com");
		for(String s:browser.history) {
			Hack.history1.add(s);
		}
		
		System.out.println("Enter the new history to add: ");
		String str=sc.nextLine();
		Hack.history1.add(str);
		
		
		Hack.writeTo(Hack.history1);
		
		System.out.println("reading the file of hacker history :\n");
		Hack.readFrom();	
		System.out.println("The browser history before updation\n");
		for(String s:browser.history) {
			System.out.println(s);
		}
		//System.out.println(sampleData);
		//Hack.history1.removeAll(browser.history);
		
		for(String s:Hack.history1) {
			if(!browser.history.contains(s)) {
				browser.history.add(s);
			}
			}
		System.out.println("The browser history after updation\n");
		for(String s:browser.history) {
			System.out.println(s);
		}
	}
	
}
