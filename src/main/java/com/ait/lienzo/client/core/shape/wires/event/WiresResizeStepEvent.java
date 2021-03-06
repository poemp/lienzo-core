/*
 * Copyright (c) 2018 Ahome' Innovation Technologies. All rights reserved.
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

package com.ait.lienzo.client.core.shape.wires.event;

import com.ait.lienzo.client.core.event.AbstractNodeDragEvent;
import com.ait.lienzo.client.core.event.INodeXYEvent;
import com.ait.lienzo.client.core.shape.wires.WiresShape;

/**
 * <p>Event that is fired when the drag moves ( drag produced by one of resize control points for a wires shape ).</p>
 */
public class WiresResizeStepEvent extends AbstractWiresResizeEvent<WiresResizeStepHandler> implements INodeXYEvent
{
    public static final Type<WiresResizeStepHandler> TYPE = new Type<>();

    public WiresResizeStepEvent(final WiresShape shape, final AbstractNodeDragEvent<?> nodeDragEvent, final int x, final int y, final double width, final double height)
    {
        super(shape, nodeDragEvent, x, y, width, height);
    }

    @Override
    public Type<WiresResizeStepHandler> getAssociatedType()
    {
        return TYPE;
    }

    @Override
    protected void dispatch(final WiresResizeStepHandler shapeMovedHandler)
    {
        shapeMovedHandler.onShapeResizeStep(this);
    }
}
