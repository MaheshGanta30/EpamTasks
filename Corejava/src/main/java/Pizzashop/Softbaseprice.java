package Pizzashop;

public class Softbaseprice implements Pizza {
	
	@Override
	public int pizzaprice(boolean tomatoes, boolean corn, boolean mashroom) {
		int pizzacost = 0;
		if(tomatoes && corn && mashroom) {
			pizzacost = softbaseprice + tomatoesprice + mashroomprice;
		}else if (tomatoes && corn==false && mashroom==false) {
			pizzacost = softbaseprice + tomatoesprice;
		}else if (tomatoes=false && corn && mashroom==false) {
			pizzacost = softbaseprice + cornprice;
		}else if (tomatoes==false && corn==false && mashroom) {
			pizzacost = softbaseprice + mashroomprice;
		}else if (tomatoes && corn && mashroom==false) {
			pizzacost = softbaseprice + tomatoesprice + cornprice;
		}else if (tomatoes==false && corn && mashroom) {
			pizzacost = softbaseprice + cornprice + mashroomprice;
		}else if (tomatoes && corn==false && mashroom) {
			pizzacost = softbaseprice + mashroomprice + tomatoesprice;
		}else if (tomatoes==false && corn==false && mashroom==false) {
			pizzacost = softbaseprice;
		}
		return pizzacost;
	}

}
