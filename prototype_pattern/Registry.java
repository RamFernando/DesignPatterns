package prototype_pattern;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<ComputerType,Computer> computers = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public Computer getComputer(ComputerType computerType){
        Computer computer = null;
        try {
            computer = (Computer) computers.get(computerType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return computer;
    }

    private void initialize() {
        Pentium_1 pentium_1 = new Pentium_1();
        pentium_1.setBrand("COMPAQ Evo");
        pentium_1.setPerfomenceLevel("Intel Pentium 1 Processor");
        pentium_1.setLevelOfMemoty("32MB");
        pentium_1.setWebcam(false);
        pentium_1.setUsbPorts(0);
        pentium_1.setVgaPort(0);
        pentium_1.setVgaSize("32 Mb");
        pentium_1.setDisplay(13.0);
        pentium_1.setHdd("20 Gb");

        Pentium_2 pentium_2 = new Pentium_2();
        pentium_2.setBrand("COMPAQ Pro");
        pentium_2.setPerfomenceLevel("Intel Pentium II Processor");
        pentium_2.setLevelOfMemoty("64MB");
        pentium_2.setWebcam(false);
        pentium_2.setUsbPorts(0);
        pentium_2.setVgaPort(1);
        pentium_2.setVgaSize("32 Mb");
        pentium_2.setDisplay(13.0);
        pentium_2.setHdd("40 GB");

        Pentium_3 pentium_3 = new Pentium_3();
        pentium_3.setBrand("COMPAQ");
        pentium_3.setPerfomenceLevel("Intel Pentium III Processor");
        pentium_3.setLevelOfMemoty("512MB");
        pentium_3.setWebcam(false);
        pentium_3.setUsbPorts(2);
        pentium_3.setVgaPort(1);
        pentium_3.setVgaSize("32Mb");
        pentium_3.setDisplay(13.0);
        pentium_3.setHdd("60 GB");

        Pentium_4 pentium_4 = new Pentium_4();
        pentium_4.setBrand("COMPAQ Pressario");
        pentium_4.setPerfomenceLevel("Intel Pentium IV Processor");
        pentium_4.setLevelOfMemoty("2 Gb");
        pentium_4.setWebcam(false);
        pentium_4.setUsbPorts(2);
        pentium_4.setVgaPort(2);
        pentium_4.setVgaSize("512 Mb");
        pentium_4.setDisplay(14.0);
        pentium_4.setHdd("160 GB");

        Dual_Core dual_core = new Dual_Core();
        dual_core.setBrand("COMPAQ Pressario");
        dual_core.setPerfomenceLevel("Intel Pentium Dual core Processor");
        dual_core.setLevelOfMemoty("2 Gb");
        dual_core.setWebcam(true);
        dual_core.setUsbPorts(4);
        dual_core.setVgaPort(2);
        dual_core.setVgaSize("1 GB");
        dual_core.setDisplay(14.0);
        dual_core.setHdd("160 GB");
        dual_core.setFloppyDisk(false);

        Quad_Core quad_core = new Quad_Core();
        quad_core.setBrand("COMPAQ Pressario");
        quad_core.setPerfomenceLevel("Intel Pentium Quad Core Processor");
        quad_core.setLevelOfMemoty("4 Gb");
        quad_core.setWebcam(true);
        quad_core.setUsbPorts(4);
        quad_core.setVgaPort(2);
        quad_core.setVgaSize("2 GB");
        quad_core.setDisplay(15.0);
        quad_core.setHdd("500 GB");
        quad_core.setFloppyDisk(false);

        Core_i3 core_i3 = new Core_i3();
        core_i3.setBrand("COMPAQ Pressario");
        core_i3.setPerfomenceLevel("Intel Pentium Core i3 Processor");
        core_i3.setLevelOfMemoty("4 Gb");
        core_i3.setWebcam(true);
        core_i3.setUsbPorts(4);
        core_i3.setVgaPort(2);
        core_i3.setVgaSize("2 GB");
        core_i3.setDisplay(15.0);
        core_i3.setHdd("500 GB");
        core_i3.setFloppyDisk(false);
        core_i3.setHdmi(true);

        Core_i5 core_i5 = new Core_i5();
        core_i5.setBrand("COMPAQ Pressario");
        core_i5.setPerfomenceLevel("Intel Pentium Core i5 Processor");
        core_i5.setLevelOfMemoty("8 Gb");
        core_i5.setWebcam(true);
        core_i5.setUsbPorts(4);
        core_i5.setVgaPort(2);
        core_i5.setVgaSize("2 GB");
        core_i5.setDisplay(15.4);
        core_i5.setHdd("1 TB");
        core_i5.setFloppyDisk(false);
        core_i5.setHdmi(true);

        Core_i7 core_i7 = new Core_i7();
        core_i7.setBrand("COMPAQ Pressario");
        core_i7.setPerfomenceLevel("Intel Pentium Core i7 Processor");
        core_i7.setLevelOfMemoty("16 Gb");
        core_i7.setWebcam(true);
        core_i7.setUsbPorts(2);
        core_i7.setVgaPort(1);
        core_i7.setVgaSize("8 GB");
        core_i7.setDisplay(15.4);
        core_i7.setHdd("1 TB");
        core_i7.setFloppyDisk(false);
        core_i7.setHdmi(true);

        computers.put(ComputerType.PENTIUM_1,pentium_1);
        computers.put(ComputerType.PENTIUM_2,pentium_2);
        computers.put(ComputerType.PENTIUM_3,pentium_3);
        computers.put(ComputerType.PENTIUM_4,pentium_4);
        computers.put(ComputerType.DUAL_CORE,dual_core);
        computers.put(ComputerType.QUAD_CORE,quad_core);
        computers.put(ComputerType.CORE_I3,core_i3);
        computers.put(ComputerType.CORE_I5,core_i5);
        computers.put(ComputerType.CORE_I7,core_i7);
    }
}
