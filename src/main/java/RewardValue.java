
public class RewardValue {

	private double cash;
	private int miles;




	RewardValue(double cashValue){

		this.cash = cashValue;

	}
	RewardValue(int milesValue){
		this.miles = milesValue;
	}

	public double getCashValue() {
		this.cash = this.miles * 0.0035;
		return this.cash;


	}

	public int getMilesValue() {
		this.miles = (int) (this.cash / 0.0035);
		return this.miles;


	}





}
