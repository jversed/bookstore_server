package bookstore_server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BookStore extends Remote{
	public int giveId() throws RemoteException;
}
