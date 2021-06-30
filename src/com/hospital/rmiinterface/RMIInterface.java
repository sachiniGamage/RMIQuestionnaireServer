package com.hospital.rmiinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;

//remote interface
public interface RMIInterface extends Remote{
//	public String echo(String i) throws RemoteException;
	
//	public String viewAns() throws RemoteException;
//question 1
	public String que1(String q1) throws RemoteException;
	//question 2
	public String que2(String q2) throws RemoteException;
	//question 3
	public String que3(String q3) throws RemoteException;
	//question 4
	public String que4(String q4) throws RemoteException;
	//question 5
	public String que5(String q5) throws RemoteException;
	//question 6
	public String que6(String q6) throws RemoteException;
	//question 7
	public String que7(String q7) throws RemoteException;
	//question 8
	public String que8(String q8) throws RemoteException;
	//get questions from db
	public String que8SQL(int no) throws RemoteException;
	//login
	public boolean login(String userName, String pw) throws RemoteException;
	//edit questions
	public void UpdateQue( int queID, String que) throws RemoteException;
	//email chart link
	public String Email(int questionID) throws RemoteException;
	//barchart
	public int[] BarChart(int no) throws Exception;
	//barchart api
	public String graph(int no) throws Exception;
	
	
}
