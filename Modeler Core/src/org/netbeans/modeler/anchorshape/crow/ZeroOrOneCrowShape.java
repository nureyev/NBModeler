/**
 * Copyright [2016] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.netbeans.modeler.anchorshape.crow;

import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 * @author Shiwani Gupta
 */
public class ZeroOrOneCrowShape extends CrowAnchorShape {

    public ZeroOrOneCrowShape(int size) {
        super(size);

        path.moveTo(0.0f, 0.0f);
        path.lineTo((float) size, (float) 0.0f);

        path.moveTo(size / 2, 0.0f);
        path.lineTo((float) size / 2, (float) -size);
        path.moveTo(size / 2, 0.0f);
        path.lineTo((float) size / 2, (float) size);

    }

    public void paint(Graphics2D graphics, boolean source) {
        super.paint(graphics, source);
        Stroke previousStroke = graphics.getStroke();
        graphics.setStroke(STROKE);
        int radius = (int) (size * 2);
        graphics.drawOval(radius / 2, -radius / 2, radius, radius);
        graphics.setStroke(previousStroke);
    }
}
