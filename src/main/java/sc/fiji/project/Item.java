package sc.fiji.project;

import java.util.List;
import java.util.Map;

public interface Item {
	boolean exists();
	String getName();
	List<Action> getActions();
	int getColor();
	void setColor(int color);
	void loadConfigFrom(Map<String, Object> data);
	void saveConfigTo(Map<String, Object> data);
}
