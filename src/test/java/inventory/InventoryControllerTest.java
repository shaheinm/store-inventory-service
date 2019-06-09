package inventory;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class InventoryControllerTest {

  @Test
  public void greeterSaysHello() {
    assertThat("Hello World", containsString("Hello"));
  }
}

