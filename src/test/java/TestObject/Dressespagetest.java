package TestObject;

import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectPage.BasePage;
import ObjectPage.Dressespageobject;
import ObjectPage.Dressespageobject.DressesPageObject;
import ObjectPage.HomePageObject;

public class Dressespagetest {

	public class DressesPageTests {
		
	     Dressespageobject dp;
	     HomePageObject homePage;
	     BasePage bp;
	     
	     public DressesPageTests()
	     {
	    	 dp=new Dressespageobject();
	    	 homePage=new HomePageObject();
	    	 bp=new BasePage();
	    	 
	     }
	     
	     @Test
	     public void verifyIcons()
	     {  
	    	homePage.clickDresses();
	  	    Assert.assertTrue(bp.elementFound(dp.getShort()));
	  	    Assert.assertTrue(bp.elementFound(dp.getMedium()));
	  	    Assert.assertTrue(bp.elementFound(dp.getLarge()));
	  	  
	  	    
	     }
	     
	     @Test
	     public void verifyProductCount()
	     {
	    	 homePage.clickDresses();
	    	 Assert.assertTrue(dp.getProductCount()== dp.getProductCount(), "Failed:Count mismatched");
	    	 
	     }
	    
	    @Test
	    public void verifyAddToCart()
	    {
	    	homePage.clickDresses();
	    	dp.moveToProductOne();
	    	String msg=dp.getTxtCart();
	    	Assert.assertTrue(msg.contains("added"), "Failed:Product not added to cart");
	    	dp.close();
	    
	    }
	   
	}

}
