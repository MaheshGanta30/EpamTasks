package HomeAppliances;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Powerconsumption extends Appliances{
	
	public Powerconsumption(int fan, int light, int tv, int laptop) {
		
		super(fan, light,tv, laptop);
	}
	
	public void Powerswitchon(boolean fan, boolean light, boolean tv, boolean laptop) {
		
		int Powerconsumption;
		if(fan && laptop && tv && light) {
			Powerconsumption = this.fan + this.laptop + this.tv + this.light;
		}else if (fan && light==false && tv==false && laptop==false) {
			Powerconsumption = this.fan;
		}else if (light && fan==false && tv==false && laptop==false) {
			Powerconsumption = this.light;
		}else if (tv && fan==false && light==false && laptop==false) {
			Powerconsumption = this.tv;
		}else if (laptop && fan==false && light==false && tv==false) {
			Powerconsumption = this.laptop;
		}else if (fan && light && tv==false && laptop==false) {
			Powerconsumption = this.fan + this.light;
		}else if (fan && tv && light==false && laptop==false) {
			Powerconsumption = this.fan + this.tv;
		}else if (fan && laptop && light==false && tv==false) {
			Powerconsumption = this.fan + this.laptop;
		}else if (light && tv && fan==false && laptop==false) {
			Powerconsumption = this.light+ this.tv;
		}else if (light && laptop && fan==false && tv==false) {
			Powerconsumption = this.light+ this.laptop;
		}else if (tv && laptop && fan==false && light==false) {
			Powerconsumption = this.tv+ this.laptop;
		}else if (light && laptop && fan && tv==false) {
			Powerconsumption = this.light+ this.laptop+ this.fan;
		}else if (light && laptop && tv && fan==false) {
			Powerconsumption = this.light+ this.laptop+ this.tv;
		}else if (light && fan && tv && laptop==false) {
			Powerconsumption = this.light+ this.fan+ this.tv;
		}else if (fan && laptop && tv && light==false) {
			Powerconsumption = this.fan+ this.laptop+ this.tv;
		}else {
			Powerconsumption = 0;
		}
		System.out.println("Power consumption of Appliances is: "+ Powerconsumption + "units");
		}
	
	public static void main(String[] args) {
		Powerconsumption powerconsumption = new Powerconsumption(1, 2, 3, 4);
		Powerconsumption powerconsumption1 = new Powerconsumption(3, 4, 2, 3);
		ArrayList<Powerconsumption> list = new ArrayList<Powerconsumption>();
		list.add(powerconsumption);
		list.add(powerconsumption1);
		for(Appliances appliances:list) {
			System.out.println("Before Sorting : "+appliances.tostring());
		}
		//System.out.println("Before Sorting : "+list);
		Collections.sort(list);
		for(Appliances appliances:list) {
			System.out.println("After Sorting : "+appliances.tostring());
		}
		//System.out.println("After Sorting : "+list);
		powerconsumption.Powerswitchon(true, true, true, true);
	}
	}


