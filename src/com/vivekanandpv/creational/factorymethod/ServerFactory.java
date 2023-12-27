package com.vivekanandpv.creational.factorymethod;

public interface ServerFactory {
    Server getServer(ServerType serverType);
}
