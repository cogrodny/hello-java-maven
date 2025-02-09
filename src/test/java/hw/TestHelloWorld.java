package hw;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestHelloWorld {

  private HelloWorld fixture;

  @BeforeEach
  public void setUp() throws Exception {
    fixture = new HelloWorld();
  }

  @AfterEach
  public void tearDown() throws Exception {
    fixture = null;
  }

  @Test
  public void getMessage() {
    assertNotNull(fixture);
    assertEquals("hello world", fixture.getMessage());
  }

  @Test
  public void getMessage2() { // this test is broken - fix it!
    final var instance = List.of(fixture).get(0);
    assertEquals("hello world", instance.getMessage());
  }

  @Test
  public void getYear() { // this test is OK, fix HelloWorld.java to make it pass!
    assertNotNull(fixture);
    assertEquals(2025, fixture.getYear());
  }
}
