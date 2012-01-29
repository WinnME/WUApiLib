package de.furryhome.WUApiLib;

import com.jacob.com.Dispatch;

public class UpdateSession {
	public static final String IDENTIFIER = "Microsoft.Update.Session";
	private Dispatch instance = null;
	
	private Dispatch getInstance() {
		return instance;
	}

	private void setInstance(Dispatch instance) {
		this.instance = instance;
	}
	
	public UpdateSession() {
		setInstance(new Dispatch(IDENTIFIER));
	}
	
	public UpdateSearcher CreateUpdateSearcher() {
		return new UpdateSearcher(Dispatch.call(getInstance(), "CreateUpdateSearcher").getDispatch());
	}
	
}
