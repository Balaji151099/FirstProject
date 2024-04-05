package withgettersetter;

public class Camera {
	private String type;
	private String sensor;
	
	public void setType(String type) {
		this.type=type;
	}
	public void setSensor(String sensor) {
		this.sensor=sensor;
	}
	public String getType() {
		return type;
	}
	public String getSensor() {
		return sensor;
	}
}
