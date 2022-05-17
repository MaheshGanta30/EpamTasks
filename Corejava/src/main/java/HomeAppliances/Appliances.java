package HomeAppliances;

public abstract class Appliances implements Comparable <Appliances> {

	public int fan;
	
	public int light;
	
	public int tv;
	
	public int laptop;
	
	public Appliances(int fan, int light, int tv, int laptop) {
		this.fan =fan ;
		this.laptop = laptop;
		this.tv=tv;
		this.light=light;
	}
	
	public String tostring() {
		return"[" +
				"fan=" + fan +
				", light=" + light +
				", tv=" + tv +
				", laptop=" + laptop +
				"]";
	}
	
	@Override
	public int compareTo(Appliances appliances) {
		if(this.tv == appliances.tv) {
			return 0;
		}else if (this.tv < appliances.tv) {
			return -1;
		}else {
			return 1;
		}
		
	}
	
}
