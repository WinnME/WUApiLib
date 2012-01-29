package de.furryhome.WUApiLib;

import com.jacob.com.Dispatch;

public class Update {
	private Dispatch instance = null;
	
	private Dispatch getInstance() {
		return instance;
	}

	private void setInstance(Dispatch instance) {
		this.instance = instance;
	}
	
	public Update(Dispatch d) {
		setInstance(d);
	}
	
	public String Title() {
		return Dispatch.get(getInstance(),"Title").getString();
	}
}
