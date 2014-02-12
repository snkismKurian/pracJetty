package api;

import java.beans.ConstructorProperties;

public class DevelopperAPI {
	
	public String hashkey;

	// TODO 未実装
	@ConstructorProperties(value = { "hashkey" })
	public DevelopperAPI(String hashkey) {
		this.hashkey = hashkey;
	}

}
