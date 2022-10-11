
public abstract class Currency implements Comparable<Currency> {

	protected  String country; // e.g. Canada
	protected  String currencyName; // Canadian Dollar
	protected double amount; // 100
	protected double euroValue; // e.g. 70.03 (the value in euros)

	public String getCountry(){
		return this.country;
	}
	
	public String getCurrencyName(){
		return this.currencyName;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public void setAmount(double amt){
		this.amount = amt;
	}
	public  double getEuroValue(){
		Converter converter = new Converter();
		converter.setEuroValue(this);
		return this.euroValue;
	}
	
	public void setEuroValue(double val){
		this.euroValue = val;
	}
	
	//@Override
	public int compareTo(Currency o) {
		if (this.getEuroValue()==o.getEuroValue()){
			return 0;
		}
		
		if (this.getEuroValue() > o.getEuroValue()){
			return 1;
		}
		
		return -1;
	
	}
	
	@Override
	public String toString(){
		return this.getCurrencyName() +":"+ this.getAmount();
	}
	
	
}
