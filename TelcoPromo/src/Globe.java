public class Globe implements Telco {
		  private final int dataAllowance;
		  private final int price;
		  private final boolean unliCallText;

		  public Globe(int dataAllowance, int price, boolean unliCallText) {
		    this.dataAllowance = dataAllowance;
		    this.price = price;
		    this.unliCallText = unliCallText;
		  }

		  @Override
		  public String getTelcoName() {
		    return "Globe";
		  }

		  @Override
		  public int getPromoPrice() {
		    return price;
		  }

		  @Override
		  public boolean getUnliCallText() {
		    return unliCallText;
		  }

		  // Getters for data allowance
		}
