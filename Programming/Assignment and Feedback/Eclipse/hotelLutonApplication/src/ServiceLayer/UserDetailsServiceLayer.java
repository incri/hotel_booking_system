package ServiceLayer;

import java.util.ArrayList;

import DatabaseLayer.UserDetailsDatabaseLayer;
import Models.DefultModel;


public class UserDetailsServiceLayer {
	DefultModel defultModel;
	
	public UserDetailsServiceLayer() {
		this.defultModel = new DefultModel();
	}

	public DefultModel getDefultModel() {
		return defultModel;
	}
	
	public ArrayList<DefultModel> getAllData() throws Exception {
		try {
			UserDetailsDatabaseLayer userDetailsDL = new UserDetailsDatabaseLayer(this.defultModel);
			return userDetailsDL.loadUserDetails();
		}catch(Exception e) {
			throw e;
		}
	}
}
