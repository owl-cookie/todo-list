package org.todolist.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutoConfigurationApplicationTests {

	@Value("${property.test.name}")
	private String propertyTestName;

	@Value("${propertyTest}")
	private String propertyTest;

	@Value("${noKey:default value}")
	private String defaultValue;

	@Value("${propertyTestList}")
	private String[] propertyTestArray;

	@Value("#{'${propertyTestList}'.split(',')}")
	private List<String> propertyTestList;

	@Test
	public void testValue() {

		assertThat(propertyTestName, is("property depth test"));
		assertThat(propertyTest, is("test"));
		assertThat(defaultValue, is("default value"));

		assertThat(propertyTestArray[0], is("a"));


	}
}
