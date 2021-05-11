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
import com.google.common.collect.Sets;




public class JunitTest {

	@Test
	public void rowValueProviderTest() {
		
		String[] test = {"car", "mercedes", "audi"};
		RowValueProvider prov = new RowValueProvider(0);
		String result =	prov.provideValue(1, test);
		assertEquals(result, "car");
		
	}
	
	@Test
	public void toCharTest() {
		String str = "F";
		assertEquals(CSV2RDF.toChar(str), str.charAt(0));
		
	}
	
	@Test
	public void parserConfigTest() {
		ParserConfig testconfig = new ParserConfig();
		
		Set<RioSetting<?>> aNonFatalErrors = Sets.<RioSetting<?>> newHashSet(
                BasicParserSettings.FAIL_ON_UNKNOWN_DATATYPES, BasicParserSettings.FAIL_ON_UNKNOWN_LANGUAGES);

		testconfig.setNonFatalErrors(aNonFatalErrors);

		testconfig.set(BasicParserSettings.FAIL_ON_UNKNOWN_DATATYPES, false);
		testconfig.set(BasicParserSettings.FAIL_ON_UNKNOWN_LANGUAGES, false);
		testconfig.set(BasicParserSettings.VERIFY_DATATYPE_VALUES, false);
		testconfig.set(BasicParserSettings.VERIFY_LANGUAGE_TAGS, false);
		testconfig.set(BasicParserSettings.VERIFY_RELATIVE_URIS, false);
		
		ParserConfig result = CSV2RDF.getParserConfig();
		assertNotEquals(result, testconfig);
		
	}
	
	@Test
	public void UUIDProviderTest() {
		String[] teststr = {"car", "mercedes", "audi"};
		UUIDProvider test = new UUIDProvider();
		String result = test.provideValue(1, teststr);
		String expected = UUID.randomUUID().toString();
		assertNotEquals(result, expected);
		
		
	}
	
}
