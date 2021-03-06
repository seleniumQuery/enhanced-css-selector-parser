/*
 * CSS Parser Project
 *
 * Copyright (C) 1999-2015 David Schweinsberg.  All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * To contact the authors of the library:
 *
 * http://cssparser.sourceforge.net/
 * mailto:davidsch@users.sourceforge.net
 *
 */
package com.steadystate.css.parser.selectors;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.css.sac.Selector;

import com.steadystate.css.format.CSSFormat;

/**
 * Testcases for {@link CharacterDataSelectorImplTest}.
 */
public class CharacterDataSelectorImplTest {

    /**
     * @throws Exception if any error occurs
     */
    @Test
    public void withoutValue() throws Exception {
        final CharacterDataSelectorImpl c = new CharacterDataSelectorImpl(null);
        Assert.assertEquals(Selector.SAC_CDATA_SECTION_NODE_SELECTOR, c.getSelectorType());
        Assert.assertNull(c.getData());

        Assert.assertEquals("", c.toString());

        Assert.assertEquals("", c.getCssText(null));
        Assert.assertEquals("", c.getCssText(new CSSFormat()));
    }

    /**
     * @throws Exception if any error occurs
     */
    @Test
    public void emptyValue() throws Exception {
        final CharacterDataSelectorImpl c = new CharacterDataSelectorImpl("");
        Assert.assertEquals(Selector.SAC_CDATA_SECTION_NODE_SELECTOR, c.getSelectorType());
        Assert.assertEquals("", c.getData());

        Assert.assertEquals("", c.toString());

        Assert.assertEquals("", c.getCssText(null));
        Assert.assertEquals("", c.getCssText(new CSSFormat()));
    }

    /**
     * @throws Exception if any error occurs
     */
    @Test
    public void withValue() throws Exception {
        final CharacterDataSelectorImpl c = new CharacterDataSelectorImpl("value");
        Assert.assertEquals(Selector.SAC_CDATA_SECTION_NODE_SELECTOR, c.getSelectorType());
        Assert.assertEquals("value", c.getData());

        Assert.assertEquals("value", c.toString());

        Assert.assertEquals("value", c.getCssText(null));
        Assert.assertEquals("value", c.getCssText(new CSSFormat()));
    }
}
