package Hack;

import java.util.ArrayList;

public class BrowseHistory {
	public ArrayList<String> history= new ArrayList<String>();
	void visit(String url) {
		String str;
		str=url.substring(url.length()-4);
		if((str.equals(".com"))||(str.equals(".org"))||(str.equals(".in"))) {
			
			history.add(url);
		}
	}
}
