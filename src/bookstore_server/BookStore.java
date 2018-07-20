package bookstore_server;

import java.rmi.Remote;
import java.rmi.RemoteException;
/*
 * interface for BookStore same on the client side;
 */
public interface BookStore extends Remote{
	public int giveId() throws RemoteException;
}
