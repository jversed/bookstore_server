package bookstore_server;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		BookStoreImp bsImpl = new BookStoreImp();
		Registry reg = LocateRegistry.createRegistry(123);
		reg.rebind("store", bsImpl);
		System.out.println("BookStore server started!");
	}

}
