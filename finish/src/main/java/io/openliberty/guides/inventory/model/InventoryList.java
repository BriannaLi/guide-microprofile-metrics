// tag::copyright[]
/*******************************************************************************
 * Copyright (c) 2017, 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - Initial implementation
 *******************************************************************************/
// end::copyright[]
// tag::InventoryList[]
package io.openliberty.guides.inventory.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class InventoryList {

  private List<SystemData> systems;

  public InventoryList(List<SystemData> systems) {
    this.systems = systems;
  }

  public List<SystemData> getSystems() {
    return systems;
  }

  public int getTotal() {
    return systems.size();
  }
}
// end::InventoryList[]
