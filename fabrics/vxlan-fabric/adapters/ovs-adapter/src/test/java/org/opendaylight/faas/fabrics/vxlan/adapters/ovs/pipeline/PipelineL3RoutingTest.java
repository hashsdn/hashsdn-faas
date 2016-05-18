package org.opendaylight.faas.fabrics.vxlan.adapters.ovs.pipeline;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.WriteTransaction;
import org.opendaylight.controller.md.sal.common.api.data.TransactionCommitFailedException;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Address;

import com.google.common.util.concurrent.CheckedFuture;

@RunWith(MockitoJUnitRunner.class)
public class PipelineL3RoutingTest {
    @Mock private DataBroker dataBroker;

    @InjectMocks private PipelineL3Routing pipelineL3Routing = new PipelineL3Routing(dataBroker);

    @Mock private WriteTransaction writeTransaction;
    @Mock CheckedFuture<Void, TransactionCommitFailedException> commitFuture;

    @Before
    public void initialTest() {
        when(writeTransaction.submit()).thenReturn(commitFuture);
        when(dataBroker.newWriteOnlyTransaction()).thenReturn(writeTransaction);
    }

    @Test
    public void testProgramRouterInterface() throws Exception {
        pipelineL3Routing.programRouterInterface(Long.valueOf(1), Long.valueOf(1), Long.valueOf(2), "00:00:00:00:00:01", new IpAddress(new Ipv4Address("192.168.2.3")), 24, true);
        pipelineL3Routing.programRouterInterface(Long.valueOf(1), Long.valueOf(1), Long.valueOf(2), "00:00:00:00:00:01", new IpAddress(new Ipv4Address("192.168.2.3")), 24, false);
    }


}