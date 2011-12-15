package org.jboss.forge.env;

import org.apache.commons.configuration.XMLConfiguration;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @Author Paul Bakker - paul.bakker.nl@gmail.com
 */
public class ExampleConfigTest {

    @Test
    public void testConfig() throws Exception {


        XMLConfiguration config = new XMLConfiguration();
        config.setFileName("config.xml");
        config.setAutoSave(true);
        config.setProperty("forge", "rules");


        XMLConfiguration loaded = new XMLConfiguration("config.xml");
        assertThat(loaded.getString("forge"), is("rules"));




    }
}
