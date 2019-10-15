package git_test;

import org.testng.annotations.Test;

import code.HelloWord;

public class Test_helloword {
  @Test
  public void f() {
	  HelloWord h = new HelloWord();
	  h.sayhello();
  }
}
