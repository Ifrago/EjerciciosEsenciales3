package edu.upc.eetac.dsa.ejerciciosesenciales3;

import java.io.*;
import java.net.*;


public class ThreadUser extends Thread {
	
	Socket ClientSocket=null;
	PrintWriter out=null;
	BufferedReader in=null;
	String MsgReciev=null;
	String MsgSend=null;
	int Id=0;
	
	public ThreadUser ( Socket con, int id){
		
	}
	

}