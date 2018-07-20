package bookstore_server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BookStoreImp extends UnicastRemoteObject implements BookStore{

	protected BookStoreImp() throws RemoteException {
		super();
	}
	public int giveId() {
		return 2109403;
	}
}
