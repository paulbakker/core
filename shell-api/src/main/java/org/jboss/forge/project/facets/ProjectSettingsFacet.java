package org.jboss.forge.project.facets;

import org.jboss.forge.project.Facet;

/**
 * @Author Paul Bakker - paul.bakker.nl@gmail.com
 */
public interface ProjectSettingsFacet extends Facet{
    void setProperty(String name, String value);
    String getProperty(String name);
}
