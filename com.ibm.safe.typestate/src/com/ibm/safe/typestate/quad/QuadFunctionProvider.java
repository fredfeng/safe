/*******************************************************************************
 * Copyright (c) 2004-2010 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.safe.typestate.quad;

import java.util.Collection;

import com.ibm.safe.ICFGSupergraph;
import com.ibm.safe.typestate.core.TypeStateFunctionProvider;
import com.ibm.safe.typestate.mine.TraceReporter;
import com.ibm.safe.typestate.rules.ITypeStateDFA;
import com.ibm.wala.escape.ILiveObjectAnalysis;
import com.ibm.wala.ipa.callgraph.CallGraph;
import com.ibm.wala.ipa.callgraph.propagation.InstanceKey;
import com.ibm.wala.ipa.callgraph.propagation.PointerAnalysis;

/**
 * @author Eran Yahav (yahave)
 * @author Stephen Fink
 */
public abstract class QuadFunctionProvider extends TypeStateFunctionProvider {
  /**
   * @param callGraph
   * @param pointerAnalysis
   * @param supergraph
   * @param domain
   * @param dfa
   * @param trackedInstances
   */
  protected QuadFunctionProvider(CallGraph callGraph, PointerAnalysis pointerAnalysis, ICFGSupergraph supergraph,
      QuadTypeStateDomain domain, ITypeStateDFA dfa, Collection<InstanceKey> trackedInstances, ILiveObjectAnalysis live,
      TraceReporter traceReporter) {
    super(callGraph, domain, dfa, supergraph, pointerAnalysis, trackedInstances, live, traceReporter);
  }

  public QuadTypeStateDomain getQuadDomain() {
    return (QuadTypeStateDomain) getDomain();
  }
}