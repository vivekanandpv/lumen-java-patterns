package com.vivekanandpv.creational.builder.server;

import com.vivekanandpv.creational.builder.cpu.Cpu;
import com.vivekanandpv.creational.builder.ram.Ram;
import com.vivekanandpv.creational.builder.ssd.Ssd;

public interface Server {
    Cpu getCpu();

    void setCpu(Cpu cpu);

    Ram getRam();

    void setRam(Ram ram);

    Ssd getSsd();

    void setSsd(Ssd ssd);
}
