package de.furryhome.WUApiLib;

import com.jacob.com.Dispatch;

public class UpdateCollection {
	public static final String IDENTIFIER = "Microsoft.Update.UpdateColl";
	private Dispatch instance = null;
	
	private Dispatch getInstance() {
		return instance;
	}

	private void setInstance(Dispatch instance) {
		this.instance = instance;
	}
	
	public UpdateCollection() {
		setInstance(new Dispatch(IDENTIFIER));
	}
	
	public UpdateCollection(Dispatch d) {
		setInstance(d);
	}
	
	public int Count() {
		return Dispatch.get(getInstance(), "count").getInt();
	}
	
	public Update Item(int i) {
		return new Update(Dispatch.call(getInstance(), "Item", i).getDispatch());
	}
}
