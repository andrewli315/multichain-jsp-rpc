<%@ page import="java.io.*, java.util.*, java.net.*" %>
<html>
<head>
<title>Auto Refresh Header Example</title>
</head>
<body>
<center>
<h2>Auto Refresh Header Example</h2>
<%
	try{
 		Socket socket = new Socket("127.0.0.1",4327);
 		InputStream inSocket = socket.getInputStream();
        OutputStream outSocket = socket.getOutputStream();
        int character;
        String str = "{\"method\":\"getinfo\",\"params\":[],\"id\":1,\"chain_name\":\"chain1\"}";
        byte buffer[] = str.getBytes();
        outSocket.write(buffer);

        while ((character = inSocket.read()) != -1) {
            out.println((char)character);
        }
        socket.close();
 	}catch(Exception e){
 
 	}
%>
</center>
</body>
</html>