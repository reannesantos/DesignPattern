
public class Smart implements Telco {
	private final int dataAllowance;
	  private final int price;

	  public Smart(int dataAllowance, int price) {
	    this.dataAllowance = dataAllowance;
	    this.price = price;
	  }

	  @Override
	  public String getTelcoName() {
	    return "Smart";
	  }

	  @Override
	  public int getPromoPrice() {
	    return price;
	  }

	  @Override
	  public boolean getUnliCallText() {
	    return false;
	  }

	  // Getters for data allowance and unlimited calls/texts
	}