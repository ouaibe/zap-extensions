/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2017 The ZAP Development Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zaproxy.zap.extension.jxbrowser;

import com.teamdev.jxbrowser.chromium.ContextMenuHandler;
import javax.swing.JComponent;
import org.parosproxy.paros.Constant;

public class ZapContextMenuHandler extends BrowserContextMenuHandler implements ContextMenuHandler {

    public ZapContextMenuHandler(BrowserFrame frame, JComponent parentComponent) {
        super(frame, parentComponent);
    }

    @Override
    protected String getOpenInNewTabLabel() {
        return Constant.messages.getString("jxbrowser.browser.popupmenu.opennewtab");
    }

    @Override
    protected String getReloadLabel() {
        return Constant.messages.getString("jxbrowser.browser.popupmenu.reload");
    }
}
