package de.furryhome.WUApiLib;

import com.jacob.com.Dispatch;

public class UpdateSearcher {
	public static final String IDENTIFIER = "Microsoft.Update.Searcher";
	private Dispatch instance = null;
	
	private Dispatch getInstance() {
		return instance;
	}

	private void setInstance(Dispatch instance) {
		this.instance = instance;
	}
	
	public UpdateSearcher() {
		setInstance(new Dispatch(IDENTIFIER));
	}
	
	public UpdateSearcher(Dispatch d) {
		setInstance(d);
	}
	
	public SearchResult Search(String s) {
		return new SearchResult(Dispatch.call(getInstance(), "Search", s).getDispatch());
	}
}
