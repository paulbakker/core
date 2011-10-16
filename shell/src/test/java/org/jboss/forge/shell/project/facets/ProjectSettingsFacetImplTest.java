package org.jboss.forge.shell.project.facets;

import org.jboss.forge.project.facets.ProjectSettingsFacet;
import org.jboss.forge.test.AbstractShellTest;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

/**
 * @Author Paul Bakker - paul.bakker.nl@gmail.com
 */
public class ProjectSettingsFacetImplTest extends AbstractShellTest {
    @Test
    public void testSetProperty() throws Exception {
        ProjectSettingsFacet settingsFacet = getProject().getFacet(ProjectSettingsFacet.class);
        settingsFacet.setProperty("mytestparam", "hello");

        File settingsFile = new File(".forgesettings");
        assertTrue(settingsFile.exists());
    }

    @Test
    public void testGetProperty() throws Exception {

    }
}
