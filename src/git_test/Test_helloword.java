package git_test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import code.HelloWord;

public class Test_helloword {
 // @BeforeMethod
//  public void bf()
//  	{
//	  
//  	}
  HelloWord h = new HelloWord();
  @Test
  public void f() 
	  {
		  
		  h.sayhello();
	  }
  @Test
  public void add_string_test()
	  {
		 String m = h.add_string("xiwa");
		 Assert.assertEquals(m,"xiwa");
	  }

}
