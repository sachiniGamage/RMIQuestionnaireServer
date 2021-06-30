package com.hospital.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import com.hospital.rmiinterface.RMIInterface;

import io.quickchart.QuickChart;

public class Server {

	public Server() throws Exception {
	}
	public static void main(String[] args) throws RemoteException {
		
		/**
		 * Entry point of the server. 
		 * 
		 */
		

		try {

		Registry registry = LocateRegistry.createRegistry(5099);//port
		System.out.println("Server is running1");

			registry.rebind("hello", new QueServerImplementation());
			System.out.println("Server is running");
		}catch(Exception e) {
			System.out.println("s1");
			e.printStackTrace();
		}
			
			
			
//		RMIInterface questions = new QueServerImplementation();
//		reg = LocateRegistry.createRegistry(5099);//port
//		reg.rebind("hello", reg);
//		System.out.println("Started RMI Server");
			
	
		}
}
