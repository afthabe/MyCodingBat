package moh.sample.threads;

import org.s2n.ddt.util.http.HttpData;
import org.s2n.ddt.util.http.NetSend;

public class GetFromWeb {

	public static void main(String[] args) {
		HttpData hData = new HttpData();
		//hData.setUrl ("https://sel2in.com/up6.php");
		hData.setUrl ("http://yahoo.com");
		String s = null;
		try {
			s = NetSend.send(hData,"");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Got: " + s +".");
	}
}



