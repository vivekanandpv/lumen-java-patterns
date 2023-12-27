package com.vivekanandpv.creational.builder.server;

import com.vivekanandpv.creational.builder.server.Server;
import com.vivekanandpv.creational.builder.cpu.Cpu;
import com.vivekanandpv.creational.builder.ram.Ram;
import com.vivekanandpv.creational.builder.ssd.Ssd;

public class ServerImplementation implements Server {
    private Cpu cpu;
    private Ram ram;
    private Ssd ssd;

    @Override
    public Cpu getCpu() {
        return cpu;
    }

    @Override
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public Ram getRam() {
        return ram;
    }

    @Override
    public void setRam(Ram ram) {
        this.ram = ram;
    }

    @Override
    public Ssd getSsd() {
        return ssd;
    }

    @Override
    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }
}
