/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/ade/containerpage/shared/Attic/CmsSubContainer.java,v $
 * Date   : $Date: 2010/10/12 06:55:30 $
 * Version: $Revision: 1.1 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2009 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.ade.containerpage.shared;

import java.util.List;
import java.util.Set;

/**
 * Sub container bean.<p>
 * 
 * @author Tobias Herrmann
 * 
 * @version $Revision: 1.1 $
 * 
 * @since 8.0.0
 */
public class CmsSubContainer extends CmsContainerElement {

    /** The sub-container description. */
    private String m_description;

    /** List of the contained elements id's. */
    private List<CmsContainerElement> m_elements;

    /** The sub-container title. */
    private String m_title;

    /** The container types supported by this sub container. */
    private Set<String> m_types;

    /**
     * Returns the sub-container description.<p>
     *
     * @return the sub-container description
     */
    public String getDescription() {

        return m_description;
    }

    /**
     * Returns the list of the contained elements id's.<p>
     * 
     * @return the list of the contained elements id's
     */
    public List<CmsContainerElement> getElements() {

        return m_elements;
    }

    /**
     * Returns the sub-container title.<p>
     *
     * @return the sub-container title
     */
    public String getTitle() {

        return m_title;
    }

    /**
     * Returns the container types.<p>
     * 
     * @return the container types
     */
    public Set<String> getTypes() {

        return m_types;
    }

    /**
     * Sets the sub-container description.<p>
     *
     * @param description the sub-container description to set
     */
    public void setDescription(String description) {

        m_description = description;
    }

    /**
     * Sets the elements contained in this container.<p>
     * 
     * @param elements the elements
     */
    public void setElements(List<CmsContainerElement> elements) {

        m_elements = elements;

    }

    /**
     * Sets the sub-container title.<p>
     *
     * @param title the sub-container title to set
     */
    public void setTitle(String title) {

        m_title = title;
    }

    /**
     * Sets the types.<p>
     *
     * @param types the types to set
     */
    public void setTypes(Set<String> types) {

        m_types = types;
    }

}
