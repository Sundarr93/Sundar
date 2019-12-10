package TestObject;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ObjectPage.BasePage;
import ObjectPage.HomePageObject;
import ObjectPage.RegistrationPageObject;

public class RegistrationPageTest {
	 HomePageObject homePage;
	 BasePage bp;
	 RegistrationPageObject rp;
	
	public void RegistrationPageTest()
	{
		homePage=new HomePageObject();
		bp=new BasePage();
		rp = new RegistrationPageObject();
	}
	
	@Test
	public void verifyButtons()
	{
		
		
		Assert.assertTrue(bp.elementFound(rp.getShare()));
		Assert.assertTrue(bp.elementFound(rp.getTweet()));
	}
	
	@Test
	public void verifyProdDesc()
	{		
		
		Assert.assertTrue(bp.elementFound(rp.getProdDesc()));
	}
	
    @BeforeMethod
    public void before()
	    {
	    	homePage.clickDresses();
	    	rp.moveToProduct();
	    }

}