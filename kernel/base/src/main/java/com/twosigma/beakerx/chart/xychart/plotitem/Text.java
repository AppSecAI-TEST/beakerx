/*
 *  Copyright 2014 TWO SIGMA OPEN SOURCE, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.twosigma.beakerx.chart.xychart.plotitem;

import com.twosigma.beakerx.chart.Color;
import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;

import java.util.Date;

/**
 * Text
 */
public class Text implements Serializable, Cloneable {

  private Number x = 0.0d;
  private Number y = 0.0d;
  private boolean showPointer = true;
  private String text = "";
  private Double pointerAngle = (-0.25f) * Math.PI;
  private Color color;
  private int size = 13;
  private Class plotType;

  public Number getX() {
    return x;
  }

  public void setX(Object x) {
    if (x instanceof Number) {
      this.x = (Number) x;
    } else if (x instanceof Date) {
      Date date = (Date) x;
      this.x = date.getTime();
    } else {
      throw new IllegalArgumentException("x coordinate should be a number or java.util.Date object");
    }

  }

  public Number getY() {
    return y;
  }

  public void setY(Number y) {
    this.y = y;
  }

  public Boolean getShowPointer() {
    return showPointer;
  }

  public void setShowPointer(boolean showPointer) {
    this.showPointer = showPointer;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public Double getPointerAngle() {
    return pointerAngle;
  }

  public void setPointerAngle(Double pointerAngle) {
    this.pointerAngle = pointerAngle;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public Class getPlotType() {
    return plotType;
  }

  public void setPlotType(Class plotType) {
    this.plotType = plotType;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return SerializationUtils.clone(this);
  }
}
