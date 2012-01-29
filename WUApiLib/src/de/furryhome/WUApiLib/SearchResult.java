package de.furryhome.WUApiLib;

import com.jacob.com.Dispatch;

public class SearchResult {
	private Dispatch instance = null;
	
	private Dispatch getInstance() {
		return instance;
	}

	private void setInstance(Dispatch instance) {
		this.instance = instance;
	}
	
	public SearchResult(Dispatch d) {
		setInstance(d);
	}
	
	public UpdateCollection Updates() {
		return new UpdateCollection(Dispatch.call(getInstance(), "Updates").getDispatch());
	}
}
