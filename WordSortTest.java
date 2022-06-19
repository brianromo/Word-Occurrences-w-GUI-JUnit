import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class WordSortTest {

	@Test
	void test() {
		try {
			String result = WordSorter.Main(null);
			String resultTwo = result.split(" ")[0];
			int resultNum = 0;
			if(resultTwo.equals("THE")) {
				resultNum = 1;
			}
			assertEquals(1, resultNum);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}

}

-----------------------------------------------------------------------------------------------------------------------
	
import java.io.IOException;

import org.junit.jupiter.api.Test;

class WordSortTest {

	@Test
	void test() {
		try {
			WordSorter.Main(null);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}

}
