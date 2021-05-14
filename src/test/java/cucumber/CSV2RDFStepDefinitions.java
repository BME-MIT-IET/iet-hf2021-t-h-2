package test.java.cucumber;

import com.complexible.common.csv.CSV2RDF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openrdf.rio.ParserConfig;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CSV2RDFStepDefinitions {
    CSV2RDF object;
    String input;
    char character;
    ParserConfig config;
    Exception exception;

    @Given("I have a CSV2RDF type object")
    public void iHaveACSVRDFTypeObject() {
        object = new CSV2RDF();
    }

    @And("The input is a Java String with the length of one")
    public void theInputIsAJavaStringWithThElengthOfOne() {
        input = "A";
    }

    @And("The input is a Java String with the length of more than one")
    public void theInputIsAJavaStringWithTheLengthOfMoreThanOne() {
        input = "ABC";
    }

    @When("I try to parse the string")
    public void iTryToParseTheString() throws NoSuchMethodException{
        Class[] cArg = new Class[1];
        cArg[0] = input.getClass();
        Method method = object.getClass().getDeclaredMethod("toChar", cArg);
        method.setAccessible(true);
        try {
            character = (char) method.invoke(object, input);
        }
        catch (Exception e) {
            exception = e;
        }
    }

    @Then("I get the char")
    public void iGetAChar() {
        assertEquals('A', character);
    }

    @Then("I don't get the char")
    public void iDontGetTheChar(){
        assertNotEquals('A', character);
    }

    @When("I want to create the config for parsing")
    public void iWantToCreateTheConfigForParsing() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = CSV2RDF.class.getDeclaredMethod("getParserConfig", null);
        method.setAccessible(true);
        config = (ParserConfig) method.invoke(null, null);
    }

    @Then("The config object gets created")
    public void theConfigObjectGetsCreated() {
        assertNotEquals(config, null);
        assertEquals(config.getClass(), ParserConfig.class);
    }

    @And("The object has only two parameters")
    public void theObjectHasOnlyTwoParameters() {
        object.files = Arrays.asList("Param_1", "Param_2");
    }

    @And("The object has more than three parameters")
    public void theObjectHasMoreThanThreeParameters() {
        object.files = Arrays.asList("Param_1", "Param_2", "Param_3", "Param_4");
    }

    @When("I try to run the main functionality")
    public void iTryToRunTheMainFunctionality() {
        try {
            object.run();
        } catch (Exception e) {
            exception = e;
        }
    }

    @Then("I get an IllegalArgumentException")
    public void iGetAnIllegalArgumentException() {
        assertEquals(IllegalArgumentException.class, exception.getClass());
    }

    @And("The object has exactly three parameters")
    public void theObjectHasExactlyThreeParameters() {
        object.files = Arrays.asList("examples/cars/template.ttl", "examples/cars/cars.csv", "cars.ttl");
    }

    @And("The file from the second parameter does not exist")
    public void theFileFromTheSecondParameterDoeNotExist() {
        object.files.set(1, "examples/cars/non_existent_csv.csv");
    }

    @And("The file from the first parameter does not exist")
    public void theFileFromTheFirstParameterDoesNotExist() {
        object.files.set(0, "examples/cars/non_existent_ttl.ttl");
    }

    @Then("I get an RuntimeException")
    public void iGetAnRuntimeException() {
        assertEquals(RuntimeException.class, exception.getClass());
    }

    @And("The file from the second parameter is empty")
    public void theFileFromTheSecondParameterIsEmpty() {
        object.files.set(1, "examples/cars/empty_csv.csv");
    }

    @Then("The output file exists")
    public void theOutputFileExists() {
        File tempFile = new File(object.files.get(2));
        assertTrue(tempFile.exists());
    }

    @And("The CSV file has no header")
    public void theCSVFileHasNoHeader() throws NoSuchFieldException, IllegalAccessException {
        object.files.set(1, "examples/cars/cars_no_header.csv");
        Field field = object.getClass().getDeclaredField("noHeader");
        field.setAccessible(true);
        field.set(object, true);
    }

    @Then("The output file is not empty")
    public void theOutputFileIsNotEmpty() {
        File tempFile = new File(object.files.get(2));
        assertNotEquals(0, tempFile.length());
    }
}
