package com.vivekanandpv.creational.builder;

import com.vivekanandpv.creational.builder.builder.ServerBuilder;
import com.vivekanandpv.creational.builder.server.Server;

public class Director {
    private ServerBuilder builder;

    public Director(ServerBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(ServerBuilder builder) {
        this.builder = builder;
    }

    public Server construct() {
        this.builder.addCpu(4);
        this.builder.addRam(8);
        this.builder.addSsd(200);
        return this.builder.build();
    }
}
