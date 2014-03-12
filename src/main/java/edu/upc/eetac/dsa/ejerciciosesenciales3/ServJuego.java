package edu.upc.eetac.dsa.ejerciciosesenciales3;

import java.net.*;
import java.io.*;
import edu.upc.eetac.dsa.ejerciciosesenciales3.*;

public class ServJuego extends Thread{
	public static void main(String [] args) throws IOException{
		
		//Instanciamos los sockets y el puerto
		ServerSocket ServSocket=null;
		Socket ClientSocket=null;
		int puerto=1010,i=0;
		InetAddress IpUser=null;
		
		//Probamos de escuchar por el puerto que queremos
		try{
			ServSocket = new ServerSocket(puerto);
		}catch(IOException ioe){
			System.err.println("No se puede escuchar por el puerto: "+puerto);
			System.exit(1);
		}
		
		System.out.println("Esperando connexión...");
		
		while(true){
			ClientSocket = ServSocket.accept();
			IpUser= ClientSocket.getInetAddress();
			System.out.println("Conexión establecida con: "+IpUser+" con id: "+i);
			ThreadUser User = new ThreadUser(ClientSocket,i);
			User.start();
			i++;
		}
		
	}
	

}
