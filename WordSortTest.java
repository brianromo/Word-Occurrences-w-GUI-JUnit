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
