package prob1.rulesets;

import java.awt.Component;

import prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	CDWindow cdWindow;

	@Override
	public void applyRules(Component ob) throws RuleException {
		cdWindow = (CDWindow) ob;
		nonemptyRule();
		floatingPointRule();
		minimumPriceRule();

	}

	private void nonemptyRule() throws RuleException {
		if(cdWindow.getArtistValue().trim().isEmpty() || cdWindow.getPriceValue().trim().isEmpty()
				|| cdWindow.getPriceValue().trim().isEmpty()){
			throw new RuleException("Field should be non empty");
		}
	}

	private void floatingPointRule() throws RuleException {
		try{
			String priceString = cdWindow.getPriceValue().trim();
			Float price = Float.valueOf(priceString);
			if(priceString.substring ( priceString.indexOf ( "." ) ).length()>2){
				throw new RuleException(" Price must be a floating point number with two decimal places");
			}
		} catch (NumberFormatException e){
			throw new RuleException("price should be numberic");
		}
	}

	private void minimumPriceRule() throws RuleException{
		try{
			String priceString = cdWindow.getPriceValue().trim();
			Float price = Float.valueOf(priceString);
			if(price<=0.49f){
				throw new RuleException(". Price must be a number greater than 0.49");
			}
		} catch (NumberFormatException e){
			throw new RuleException("price should be numberic");
		}
	}

}
