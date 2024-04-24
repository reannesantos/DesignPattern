public class TelcoAllowance {
		  @Override
		  public String showAllowance(String telcoName, int price) {
		    return telcoName + " Data Usage Offer and price: ₱" + price;
		  }

		  @Override
		  public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
		    return telcoName + " unlimited calls and text package: N/A";
		  }
		}

		public class UnliCallTextPackage implements Promotion {
		  @Override
		  public String showAllowance(String telcoName, int price) {
		    return telcoName + " Data Usage Offer and price: N/A";
		  }

		  @Override
		  public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
		    return telcoName + " unlimited calls and text package: " + (unliCallText ? "Yes
