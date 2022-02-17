package prob1.rulesets;

import java.awt.Component;

import javafx.css.Rule;
import prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {


	BookWindow bookWindow;

	@Override
	public void applyRules(Component ob) throws RuleException {
		bookWindow = (BookWindow) ob;
		nonemptyRule();
		checkIsbn();
		floatingPointRule();
		minimumPriceRule();
		
	}
	private void nonemptyRule() throws RuleException {
		if(bookWindow.getIsbnValue().trim().isEmpty() || bookWindow.getPriceValue().trim().isEmpty()
				|| bookWindow.getTitleValue().trim().isEmpty()){
			throw new RuleException("Field should be non empty");
		}
	}

	private void checkIsbn() throws RuleException {
		if(bookWindow.getIsbnValue().trim().length()==10 || bookWindow.getIsbnValue().trim().length()==13){
			if(bookWindow.getIsbnValue().trim().length()==10){
				char first = bookWindow.getIsbnValue().trim().charAt(0);
				if(first!='0' || first !='1'){
					throw  new RuleException("The first digit must be 0 or 1");
				}
			} else if (bookWindow.getIsbnValue().trim().length()==13){
				String firstThreeDigits = bookWindow.getIsbnValue().trim().substring(0,3);
				if(firstThreeDigits.equals("978") || firstThreeDigits.equals("979")){
					throw  new RuleException("The first 3 digits must be either 978 or 979");
				}
			}
		}
	}

	private void floatingPointRule() throws RuleException {
		try{
			String priceString = bookWindow.getPriceValue().trim();
			Float price = Float.valueOf(priceString);
			System.out.println(priceString.substring ( priceString.indexOf ( "." ) +1));
			if(priceString.indexOf ( "." ) == -1 || priceString.substring ( priceString.indexOf ( "." )+1 ).length()!=2){
				throw new RuleException(" Price must be a floating point number with two decimal places");
			}
		} catch (NumberFormatException e){
			throw new RuleException("price should be numberic");
		}
	}

	private void minimumPriceRule() throws RuleException{
		try{
			String priceString = bookWindow.getPriceValue().trim();
			Float price = Float.valueOf(priceString);
			if(price<=0.49f){
				throw new RuleException(". Price must be a number greater than 0.49");
			}
		} catch (NumberFormatException e){
			throw new RuleException("price should be numberic");
		}
	}



}
