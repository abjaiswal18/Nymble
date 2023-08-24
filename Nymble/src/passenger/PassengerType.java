package passenger;

public class PassengerType {
	private String passengerNum;
	private String typeName;
    private double discount;

    public PassengerType(String typeName, double discount) {
        this.typeName = typeName;
        this.discount = discount;
    }

    public double applyDiscount(double cost) {
        return cost * (1 - discount);
    }
    
    public String getPassengerNum() {
		return passengerNum;
	}

	public void setPassengerNum(String passengerNum) {
		this.passengerNum = passengerNum;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
