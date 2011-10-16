package org.jboss.forge.shell.project.facets;

import org.jboss.forge.project.facets.BaseFacet;
import org.jboss.forge.project.facets.ProjectSettingsFacet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author Paul Bakker - paul.bakker.nl@gmail.com
 */
public class ProjectSettingsFacetImpl extends BaseFacet implements ProjectSettingsFacet{
    @Override
    public void setProperty(String name, String value) {
        Properties properties = new Properties();
        properties.setProperty(name, value);

        FileOutputStream fileInputStream = null;
        try {
            fileInputStream = new FileOutputStream(".forgesettings");
            properties.storeToXML(fileInputStream,null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String getProperty(String name) {
        return null;
    }

    @Override
    public boolean install() {
        return true;
    }

    @Override
    public boolean isInstalled() {
        return true;
    }
}
