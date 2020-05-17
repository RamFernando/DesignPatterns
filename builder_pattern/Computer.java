package builder_pattern;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Computer {
    private final String type;
    private final String brand;
    private final String perfomenceLevel;
    private final String levelOfMemory;
    private final boolean webcam;
    private final int usbPorts;
    private final int vgaPort;
    private final String vgaSize;
    private final double display;
    private final String hdd;
    private final boolean floppyDisk;
    private final boolean hdmi;

    public Computer(Builder builder) {
        this.type=builder.type;
        this.brand=builder.brand;
        this.perfomenceLevel=builder.perfomenceLevel;
        this.levelOfMemory=builder.levelOfMemory;
        this.webcam=builder.webcam;
        this.usbPorts=builder.usbPorts;
        this.vgaPort=builder.vgaPort;
        this.vgaSize=builder.vgaSize;
        this.display=builder.display;
        this.hdd=builder.hdd;
        this.floppyDisk=builder.floppyDisk;
        this.hdmi=builder.hdmi;
    }

    static class Builder{
        private String type;
        private String brand;
        private String perfomenceLevel;
        private String levelOfMemory;
        private boolean webcam;
        private int usbPorts;
        private int vgaPort;
        private String vgaSize;
        private double display;
        private String hdd;
        private boolean floppyDisk;
        private boolean hdmi;

        public Computer build(){
            return new Computer(this);
        }

        public Builder(String type, String brand) {
            this.type = type;
            this.brand=brand;
        }

//        public Builder type(String type){
//            this.type = type;
//            return this;
//        }
//
//        public Builder brand(String brand){
//            this.brand = brand;
//            return this;
//        }

        public Builder performance(String performance){
            this.perfomenceLevel=performance;
            return this;
        }

        public Builder levelOfMemory(String levelOfMemory){
            this.levelOfMemory=levelOfMemory;
            return this;
        }

        public Builder webCam(Boolean webcam){
            this.webcam = webcam;
            return this;
        }

        public Builder usbPorts(int usbPorts){
            this.usbPorts = usbPorts;
            return this;
        }

        public Builder vgaPorts(int vgaPort){
            this.vgaPort = vgaPort;
            return this;
        }

        public Builder vgaSize(String vgaSize){
            this.vgaSize=vgaSize;
            return this;
        }

        public Builder display(Double display){
            this.display = display;
            return this;
        }

        public Builder hdd(String hdd){
            this.hdd=hdd;
            return this;
        }

        public Builder floppyDisk(Boolean floppyDisk){
            this.floppyDisk=floppyDisk;
            return this;
        }

        public Builder hdmi(Boolean hdmi){
            this.hdmi=hdmi;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", perfomenceLevel='" + perfomenceLevel + '\'' +
                ", levelOfMemoty='" + levelOfMemory + '\'' +
                ", webcam=" + webcam +
                ", usbPorts=" + usbPorts +
                ", vgaPort=" + vgaPort +
                ", vgaSize='" + vgaSize + '\'' +
                ", display=" + display +
                ", hdd='" + hdd + '\'' +
                ", floppyDisk=" + floppyDisk +
                ", hdmi=" + hdmi +
                '}';
    }
}
