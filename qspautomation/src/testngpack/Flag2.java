package testngpack;

import org.testng.annotations.Test;

public class Flag2 {
  @Test(enabled=false)
  public void a() {
  }
  @Test()
  public void b() {
  }
}
