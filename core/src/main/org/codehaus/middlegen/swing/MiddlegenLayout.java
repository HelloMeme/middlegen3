/*
 * Copyright (c) 2001, The RdbmsTableFromJdbcMetadataProvider Group
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 * - Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * - Neither the name of The RdbmsTableFromJdbcMetadataProvider Group nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
 * DAMAGE.
 */

/*
 * Change log
 *
 */
package org.codehaus.middlegen.swing;

import java.awt.LayoutManager;
import java.awt.Dimension;
import java.awt.Component;

/**
 * @author <a href="mailto:aslak.hellesoy at netcom.no">Aslak Helles�y</a>
 */
public class MiddlegenLayout implements LayoutManager {

	/**
	 * Creates new MiddlegenLayout
	 */
	public MiddlegenLayout() {
	}


	public java.awt.Dimension preferredLayoutSize(java.awt.Container p1) {
		return p1.getPreferredSize();
	}

	public void removeLayoutComponent(java.awt.Component p1) {
	}

	public java.awt.Dimension minimumLayoutSize(java.awt.Container p1) {
		return p1.getPreferredSize();
	}

	public void addLayoutComponent(java.lang.String p1, java.awt.Component p2) {
	}

	public void layoutContainer(java.awt.Container target) {
		synchronized (target.getTreeLock()) {
			for (int i = 0; i < target.getComponentCount(); i++) {
				Component m = target.getComponent(i);
				Dimension d = m.getPreferredSize();
				m.setSize(d.width, d.height);
			}
		}
	}
}