/**
 * Copyright (c) 2015 Huawei Technologies Co. Ltd. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.faas.fabrics.vxlan.adapters.ovs.utils;

public enum StatusCode {
    SUCCESS("Success"),
    CREATED("Created"),

    BADREQUEST("Bad Request"),
    UNAUTHORIZED("UnAuthorized"),
    FORBIDDEN("Forbidden"),
    NOTFOUND("Not Found"),
    NOTALLOWED("Method Not Allowed"),
    NOTACCEPTABLE("Request Not Acceptable"),
    TIMEOUT("Request Timeout"),
    CONFLICT("Resource Conflict"),
    GONE("Resource Gone"),
    UNSUPPORTED("Unsupported"),

    INTERNALERROR("Internal Error"),
    NOTIMPLEMENTED("Not Implemented"),
    NOSERVICE("Service Not Available"),

    UNDEFINED("Undefined Error");

    private String description;
    private StatusCode(String description) {
        this.description = description;
    }

    /**
     * Prints the description associated to the code value
     */
    @Override
    public String toString() {
        return description;
    }

    public int calculateConsistentHashCode() {
        if (this.description != null) {
            return this.description.hashCode();
        } else {
            return 0;
        }
    }
}
