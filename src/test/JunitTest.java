package test;

import static org.junit.Assert.*;


import java.util.UUID;

import org.junit.Test;


import com.complexible.common.csv.CSV2RDF;
import com.complexible.common.csv.CSV2RDF.RowValueProvider;
import com.complexible.common.csv.CSV2RDF.UUIDProvider;
import com.complexible.common.csv.CSV2RDF.RowNumberProvider;





public class JunitTest {

	@Test
	public void rowValueProviderTest() {
		
		String[] test = {"car", "mercedes", "audi"};
		RowValueProvider prov = new RowValueProvider(1);
		String result =	prov.provideValue(1, test);
		assertEquals("mercedes", result);
		
	}
	
	@Test
	public void toCharTest() {
		
		String str = "F";
		assertEquals(str.charAt(0), CSV2RDF.toChar(str));
		
	}
	
	@Test
	public void toCharExceptionTest() {
		
		try{
			String str = "Ford";
			CSV2RDF.toChar(str);
			  fail("Exception not thrown");
			}catch(Exception e){
			  assertEquals("Expecting a single character but got Ford",e.getMessage());
			}
		
	}
	
	
	@Test
	public void UUIDProviderTest() {
		
		String[] teststr = {"car", "mercedes", "audi"};
		UUIDProvider test = new UUIDProvider();
		String result = test.provideValue(1, teststr);
		String expected = UUID.randomUUID().toString();
		
		assertNotEquals(expected, result);
		
	}
	
	@Test
	public void rowNumberProviderTest() {
			
			String[] teststr = {"car", "mercedes", "audi"};
			int rowIndex = 1;
			String expected = String.valueOf(rowIndex);
			
			RowNumberProvider test = new RowNumberProvider();
			assertEquals(expected, test.provide(rowIndex, teststr));
			
	}
		
		
	
	
}
