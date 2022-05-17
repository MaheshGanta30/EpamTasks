package Pizzashop;

public class Standardbaseprice implements Pizza {
	
	@Override
	public int pizzaprice(boolean tomatoes, boolean corn, boolean mashroom) {
		int pizzacost = 0;
		if(tomatoes && corn && mashroom) {
			pizzacost = standaredbaseprice + tomatoesprice + mashroomprice;
		}else if (tomatoes && corn==false && mashroom==false) {
			pizzacost = standaredbaseprice + tomatoesprice;
		}else if (tomatoes==false && corn && mashroom==false) {
			pizzacost = standaredbaseprice + cornprice;
		}else if (tomatoes==false && corn==false && mashroom) {
			pizzacost = standaredbaseprice + mashroomprice;
		}else if (tomatoes && corn && mashroom==false) {
			pizzacost = standaredbaseprice + tomatoesprice + cornprice;
		}else if (tomatoes==false && corn && mashroom) {
			pizzacost = standaredbaseprice + cornprice + mashroomprice;
		}else if (tomatoes && corn==false && mashroom) {
			pizzacost = standaredbaseprice + mashroomprice + tomatoesprice;
		}else if (tomatoes=false && corn==false && mashroom==false) {
			pizzacost = standaredbaseprice;
		}
		return pizzacost;
	}

}
