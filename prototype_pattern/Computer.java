package prototype_pattern;

public abstract class Computer implements Cloneable{

    String brand;
    String perfomenceLevel;
    String levelOfMemoty;
    boolean webcam;
    int usbPorts;
    int vgaPort;
    String vgaSize;
    double display;
    String hdd;
    boolean floppyDisk = true;
    boolean hdmi;

    public String toString() {
        return "Pentium_1 {BRAND : "+brand+" PERFORMANCE LEVEL : "+perfomenceLevel+" MEMORY : "+levelOfMemoty+" WEBCAM : "+webcam+"" +
                " USB PORTS : "+usbPorts+" VGA PORTS : "+vgaPort+" VGA SIZE : "+vgaSize+" DISPLAY : "+display+" HDD : "+hdd
                +"}";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPerfomenceLevel() {
        return perfomenceLevel;
    }

    public void setPerfomenceLevel(String perfomenceLevel) {
        this.perfomenceLevel = perfomenceLevel;
    }

    public String getLevelOfMemoty() {
        return levelOfMemoty;
    }

    public void setLevelOfMemoty(String levelOfMemoty) {
        this.levelOfMemoty = levelOfMemoty;
    }

    public boolean isWebcam() {
        return webcam;
    }

    public void setWebcam(boolean webcam) {
        this.webcam = webcam;
    }

    public int getUsbPorts() {
        return usbPorts;
    }

    public void setUsbPorts(int usbPorts) {
        this.usbPorts = usbPorts;
    }

    public int getVgaPort() {
        return vgaPort;
    }

    public void setVgaPort(int vgaPort) {
        this.vgaPort = vgaPort;
    }

    public String getVgaSize() {
        return vgaSize;
    }

    public void setVgaSize(String vgaSize) {
        this.vgaSize = vgaSize;
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public boolean isFloppyDisk() {
        return floppyDisk;
    }

    public void setFloppyDisk(boolean floppyDisk) {
        this.floppyDisk = floppyDisk;
    }

    public boolean isHdmi() {
        return hdmi;
    }

    public void setHdmi(boolean hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
