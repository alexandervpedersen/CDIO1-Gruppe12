package control;

import exceptions.DALException;
import funktionality.IDatalogic;
import funktionality.Datalogic;

public class DataController implements IDatalogic{
	Datalogic data = new Datalogic();

	@Override
	public String createUser(String name, String CPR, boolean admin) {
		// TODO Auto-generated method stub
		String password = "";
		try{
		password = data.createOperator(name,CPR,admin);
		}catch(DALException e){
			System.out.println("FEJL SKETE");
		}
		return password;
	}

	@Override
	public boolean validateUser(String CPR, String password) throws DALException {
		
		return data.validateUser(CPR, password);
		
	}

	@Override
	public void removeUser(String oprID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[][] getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUserAdmin(String CPR) {
		return data.isUserAdmin(CPR);
	}

	@Override
	public String convertToName(String CPR) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void createDefaultUsers() {
		createUser("Martin Hansen", "123412-1234", false);
		createUser("sysadmin", "000000-1234", true);
		createUser("Bent T. Ulrichsen", "666666-7777", false);
	}

}
