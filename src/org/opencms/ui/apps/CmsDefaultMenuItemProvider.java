/*
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (c) Alkacon Software GmbH (http://www.alkacon.com)
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

package org.opencms.ui.apps;

import org.opencms.main.CmsLog;
import org.opencms.ui.actions.CmsAboutDialogAction;
import org.opencms.ui.actions.CmsAvailabilityDialogAction;
import org.opencms.ui.actions.CmsChangeTypeDialogAction;
import org.opencms.ui.actions.CmsContextMenuActionItem;
import org.opencms.ui.actions.CmsCopyMoveDialogAction;
import org.opencms.ui.actions.CmsCopyToProjectDialogAction;
import org.opencms.ui.actions.CmsDeleteDialogAction;
import org.opencms.ui.actions.CmsDirectPublishDialogAction;
import org.opencms.ui.actions.CmsEditCodeDialogAction;
import org.opencms.ui.actions.CmsEditDialogAction;
import org.opencms.ui.actions.CmsEditPropertyAction;
import org.opencms.ui.actions.CmsLockAction;
import org.opencms.ui.actions.CmsLockedResourcesAction;
import org.opencms.ui.actions.CmsPreferencesDialogAction;
import org.opencms.ui.actions.CmsProjectDialogAction;
import org.opencms.ui.actions.CmsPropertiesDialogAction;
import org.opencms.ui.actions.CmsPublishQueueDialogAction;
import org.opencms.ui.actions.CmsSecureExportDialogAction;
import org.opencms.ui.actions.CmsStealLockAction;
import org.opencms.ui.actions.CmsTouchDialogAction;
import org.opencms.ui.actions.CmsUndeleteDialogAction;
import org.opencms.ui.actions.CmsUndoDialogAction;
import org.opencms.ui.actions.CmsUnlockAction;
import org.opencms.ui.components.CmsResourceTableProperty;
import org.opencms.ui.contextmenu.CmsSubmenu;
import org.opencms.ui.contextmenu.I_CmsContextMenuItem;
import org.opencms.ui.contextmenu.I_CmsContextMenuItemProvider;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;

/**
 * Default implementation of menu item provider.<p>
 */
public class CmsDefaultMenuItemProvider implements I_CmsContextMenuItemProvider {

    /** Logger instance for this class. */
    static final Log LOG = CmsLog.getLog(CmsDefaultMenuItemProvider.class);

    /**
     * Creates a new instance.<p>
     */
    public CmsDefaultMenuItemProvider() {
        // default constructor, do nothing
    }

    /**
     * @see org.opencms.ui.contextmenu.I_CmsContextMenuItemProvider#getMenuItems()
     */
    public List<I_CmsContextMenuItem> getMenuItems() {

        CmsSubmenu advanced = new CmsSubmenu("advanced", null, "%(key.GUI_EXPLORER_CONTEXT_ADVANCED_0)", 26, 0);

        // the entries in this list will be sorted by there order property
        // for better readability please place additional entries  according to this sort order
        return Arrays.<I_CmsContextMenuItem> asList(
            new CmsContextMenuActionItem(new CmsLockAction(), null, 0, 0),
            new CmsContextMenuActionItem(new CmsUnlockAction(), null, 0, 0),
            new CmsContextMenuActionItem(new CmsStealLockAction(), null, 0, 0),
            new CmsContextMenuActionItem(new CmsCopyToProjectDialogAction(), null, 0, 0),
            new CmsContextMenuActionItem(new CmsDirectPublishDialogAction(), null, 2, 0),
            // TODO: add publish scheduled entry here
            new CmsContextMenuActionItem(new CmsEditDialogAction(), null, 6, 0),
            new CmsContextMenuActionItem(new CmsCopyMoveDialogAction(), null, 8, 0),
            new CmsContextMenuActionItem(
                new CmsEditPropertyAction(
                    CmsResourceTableProperty.PROPERTY_RESOURCE_NAME,
                    Messages.GUI_EXPLORER_RENAME_0),
                null,
                10,
                0),
            new CmsContextMenuActionItem(
                new CmsEditPropertyAction(CmsResourceTableProperty.PROPERTY_TITLE, Messages.GUI_EXPLORER_EDIT_TITLE_0),
                null,
                12,
                0),
            new CmsContextMenuActionItem(
                new CmsEditPropertyAction(
                    CmsResourceTableProperty.PROPERTY_NAVIGATION_TEXT,
                    Messages.GUI_EXPLORER_EDIT_NAVIGATION_TEXT_0),
                null,
                14,
                0),
            new CmsContextMenuActionItem(new CmsDeleteDialogAction(), null, 16, 0),
            new CmsContextMenuActionItem(new CmsUndoDialogAction(), null, 18, 0),
            new CmsContextMenuActionItem(new CmsUndeleteDialogAction(), null, 20, 0),
            // TODO: add relations entry here
            // TODO: add permissions entry here
            advanced,
            new CmsContextMenuActionItem(new CmsTouchDialogAction(), advanced.getId(), 0, 0),
            new CmsContextMenuActionItem(new CmsAvailabilityDialogAction(), advanced.getId(), 2, 0),
            new CmsContextMenuActionItem(new CmsSecureExportDialogAction(), advanced.getId(), 4, 0),
            new CmsContextMenuActionItem(new CmsChangeTypeDialogAction(), advanced.getId(), 6, 0),
            new CmsContextMenuActionItem(new CmsEditCodeDialogAction(), advanced.getId(), 8, 0),
            // TODO: add history entry here
            new CmsContextMenuActionItem(new CmsPropertiesDialogAction(), null, 30, 0),

            // toolbar menu entries
            new CmsContextMenuActionItem(new CmsPreferencesDialogAction(), null, 0, 0),
            new CmsContextMenuActionItem(new CmsProjectDialogAction(), null, 2, 0),
            new CmsContextMenuActionItem(new CmsPublishQueueDialogAction(), null, 4, 0),
            new CmsContextMenuActionItem(new CmsAboutDialogAction(), null, 8, 0),
            new CmsContextMenuActionItem(new CmsLockedResourcesAction(), null, 0, 0)

        );

    }

}
