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
package com.twosigma.beaker.table.action;

public enum TableActionType {
  DOUBLE_CLICK,
  CONTEXT_MENU_CLICK;

  public static TableActionType getByName(final String input){
    TableActionType ret = null;
    if(input != null){
      for (TableActionType item : TableActionType.values()) {
        if(item.name().equalsIgnoreCase(input.trim())){
          ret = item;
          break;
        }
      }
    }
    return ret;
  }

}