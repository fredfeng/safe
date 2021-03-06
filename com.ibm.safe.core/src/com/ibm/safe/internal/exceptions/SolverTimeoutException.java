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
package com.ibm.safe.internal.exceptions;

import com.ibm.safe.reporting.message.ISolverResult;

/**
 * Exception thrown by SAFE when solver times out. This is usually a benign
 * abort to avoid running for an extensive amount of time blocking other
 * analyses from taking place.
 * 
 * @author yahave
 * 
 */
public class SolverTimeoutException extends SafeException {

  /**
   * serial version ID (generated by eclipse)
   */
  private static final long serialVersionUID = 6853647010598741727L;

  /**
   * keep intermediate results before T/O occurred
   */
  private final ISolverResult result;

  public SolverTimeoutException(ISolverResult intermediateResult) {
    super();
    this.result = intermediateResult;
  }

  public ISolverResult getResult() {
    return result;
  }
}
