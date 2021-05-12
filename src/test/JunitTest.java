package test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.UUID;

import org.junit.Test;

import org.openrdf.rio.ParserConfig;
import org.openrdf.rio.RioSetting;
import org.openrdf.rio.helpers.BasicParserSettings;

import com.complexible.common.csv.CSV2RDF;
import com.complexible.common.csv.CSV2RDF.RowValueProvider;
import com.complexible.common.csv.CSV2RDF.UUIDProvider;
import com.complexible.common.csv.CSV2RDF.RowNumberProvider;
import com.google.common.collect.Sets;




public class JunitTest {

	@Test
	public void rowValueProviderTest() {
		
		String[] test = {"car", "mercedes", "audi"};
		RowValueProvider prov = new RowValueProvider(0);
		String result =	prov.provideValue(1, test);
		assertEquals("car", result);
		
	}
	
	@Test
	public void toCharTest() {
		
		String str = "F";
		assertEquals(str.charAt(0), CSV2RDF.toChar(str));
		
	}
	
	@Test
	public void parserConfigTest() {
		ParserConfig expected = new ParserConfig();
		
		Set<RioSetting<?>> aNonFatalErrors = Sets.<RioSetting<?>> newHashSet(
                BasicParserSettings.FAIL_ON_UNKNOWN_DATATYPES, BasicParserSettings.FAIL_ON_UNKNOWN_LANGUAGES);

		expected.setNonFatalErrors(aNonFatalErrors);

		expected.set(BasicParserSettings.FAIL_ON_UNKNOWN_DATATYPES, false);
		expected.set(BasicParserSettings.FAIL_ON_UNKNOWN_LANGUAGES, false);
		expected.set(BasicParserSettings.VERIFY_DATATYPE_VALUES, false);
		expected.set(BasicParserSettings.VERIFY_LANGUAGE_TAGS, false);
		expected.set(BasicParserSettings.VERIFY_RELATIVE_URIS, false);
		
		ParserConfig result = CSV2RDF.getParserConfig();
		assertNotEquals(expected, result);
		
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
