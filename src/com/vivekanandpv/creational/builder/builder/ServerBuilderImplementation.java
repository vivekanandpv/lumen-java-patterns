package com.vivekanandpv.creational.builder.builder;

import com.vivekanandpv.creational.builder.cpu.CpuImplementation;
import com.vivekanandpv.creational.builder.ram.RamImplementation;
import com.vivekanandpv.creational.builder.server.Server;
import com.vivekanandpv.creational.builder.ssd.SsdImplementation;

public class ServerBuilderImplementation implements ServerBuilder {
    private final Server server;

    public ServerBuilderImplementation(Server server) {
        this.server = server;
    }

    @Override
    public void addCpu(int cores) {
        server.setCpu(new CpuImplementation(cores));
    }

    @Override
    public void addRam(int capacity) {
        server.setRam(new RamImplementation(capacity));
    }

    @Override
    public void addSsd(int capacity) {
        server.setSsd(new SsdImplementation(capacity));
    }

    @Override
    public Server build() {
        return server;
    }
}
