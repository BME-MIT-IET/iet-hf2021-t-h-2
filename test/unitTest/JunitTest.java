package unitTest;

import static org.junit.jupiter.api.Assertions.*;
import com.complexible.common.csv.CSV2RDF;
import com.complexible.common.csv.CSV2RDF.RowValueProvider;

import org.junit.jupiter.api.Test;

class UnitTests {

	@Test
	void rowValueProviderTest() {
		
		String[] test = {"car", "mercedes", "audi"};
		RowValueProvider prov = new RowValueProvider(0);
		String result =	prov.provideValue(1, test);
		assertEquals(result, "car");
		
	}
	
	@Test
	void test() {
		
	}

}
