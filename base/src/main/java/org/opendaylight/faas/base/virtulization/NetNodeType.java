/**
 * Copyright (c) 2015 Huawei Technologies Co. Ltd. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.faas.base.virtulization;

public enum NetNodeType {
    PARTITION, // all the nodes under a switch manager
    PNETWORK, // overall physical network
    VCONTAINER, // virtual container
    FABRIC, // abstraction
    VFABRIC, // fabric virtulization
    PBRIDGE, // physical bridge
    PROUTER, // physical router
    UNKNOWN
}
