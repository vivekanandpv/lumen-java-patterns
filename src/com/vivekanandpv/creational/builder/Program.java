package com.vivekanandpv.creational.builder;

import com.vivekanandpv.creational.builder.builder.ServerBuilder;
import com.vivekanandpv.creational.builder.builder.ServerBuilderImplementation;
import com.vivekanandpv.creational.builder.server.Server;
import com.vivekanandpv.creational.builder.server.ServerImplementation;

public class Program {
    public static void main(String[] args) {
        ServerBuilder builder = new ServerBuilderImplementation(new ServerImplementation());
        Director director = new Director(builder);

        Server server = director.construct();
    }
}
