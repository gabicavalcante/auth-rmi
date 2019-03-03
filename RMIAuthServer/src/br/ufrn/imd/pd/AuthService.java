package br.ufrn.imd.pd;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class AuthService extends UnicastRemoteObject implements AuthServiceInterface {
	ArrayList<String> authn;
	
	protected AuthService() throws RemoteException {
		authn = new ArrayList<String>();
		authn.add("Gabriela");
		authn.add("Juliana");
	} 

	@Override
	public String hello(String name) throws RemoteException {
		if (authn.contains(name)) 
			return "Bem vinda, " + name;
		else
			return "Você não é bem vinda";
	}
}