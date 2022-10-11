

import java.util.ArrayList;
import java.util.Collections;

public class Wallet {
	
	private String name;
	private ArrayList<Currency> currencies;
	
	
	public Wallet(String string) {
		this.name = string;
		this.currencies = new ArrayList<Currency>();
	}

	public void addCurrency(Currency currency){
		currencies.add(currency);
		
	}
	
	/*
	 * This method calculates and returns the total Euro value of 
	 * each currency in the wallet
	*/
	public double getTotalEuroValue(){
		
		double euroTotal = 0;
		
		for (Currency currency: currencies){
				euroTotal+=currency.getEuroValue();	
		}
		return euroTotal;
	}
	
	/*
	 * This method sorts the currencies in ascending order according to their euro Values
	*/
	public void sort(){
		Collections.sort(currencies);
	}
	
	@Override
	/*
	 * The toString() method returns a String value of each currency and its amount in the wallet
	 * each currency- amount pair is separated by a comma
	 * e.g. USD:100,CAD:250,GBP:99,AUD:123
	 * 
	*/
	public String toString(){
		String out= "";
		Currency curr;
		int i=0;
		
		for(i = 0; i< currencies.size()-1; i++){
			curr = currencies.get(i);
			out=out+curr+","; //note how the toString() method of curr is implicitly called
		}
		curr = currencies.get(i);
		out=out+curr; // no comma after final entry
		return out;
	}
	
	
	/*
	 * This is simpler form of the toString method above . It outputs the same format as the one above, 
	 * but uses the subString method from the String class to trim off the final comma
	 *  
	 * 
	*/
	
	public String toString2(){
		
			String out= "";
			for (Currency curr : currencies){
				out=out+curr+","; //note how the toString() method of curr is implicitly called
			}
			out = out.substring(0, out.length()-1); // clips off the trailing comma
			return out;
		}
	
	public String getName(){
		return name;
	}
	
}
