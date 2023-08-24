package passenger;

import activity.Activity;

public interface PassengerInterface {
	public boolean addActivity(Activity activity, double price);
	public boolean payForActivity(Activity activity);
}
