/*******************************************************************************
 * Copyright (c) 2002-2010 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.safe.internal.filtering;

import com.ibm.wala.util.collections.Filter;

public final class AlwaysTrueClassFilter<T> implements Filter<T> {

  // --- Interface methods implementation

  public boolean accepts(final T clazz) {
    return true;
  }

}
