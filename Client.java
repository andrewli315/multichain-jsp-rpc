import java.net.*;

import com.googlecode.jsonrpc4j.*;

public class Client {
	
	public static void main(String[] args){
		Client test = new Client();
	}
	public Client(){
		final String rpcuser ="multichainrpc";    	     	
   	 	final String rpcpassword ="";
   	 	String str = null;
   	 	Authenticator.setDefault(new Authenticator() {
   	      protected PasswordAuthentication getPasswordAuthentication() {
   	          return new PasswordAuthentication (rpcuser, rpcpassword.toCharArray());
   	      }
   	 	});
   	  
   	 	JsonRpcHttpClient client = null;
		try {
			client = new JsonRpcHttpClient(new URL("http://127.0.0.1:4388"));
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			str = (String)client.invoke("getinfo",null,String.class);
		}catch(Throwable t){
			t.printStackTrace();
		}
		System.out.println("temp = "+str);
		return;
	}
	public void resolveRespond(String arg){
		
	}
	

}
