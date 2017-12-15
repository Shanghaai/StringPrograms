package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import ReverseString.StringReverseExample;

public class StringReverseTest {

	@Test
	public void test() {
		StringReverseExample sre = new StringReverseExample();
		String reverse = sre.reverse("sahil");
		assertEquals("lihas", reverse);
	}

}
