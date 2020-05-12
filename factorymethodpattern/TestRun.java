package factorymethodpattern;

public class TestRun {

    public static void main(String[] args) {
        Package aPackage = PackageFactory.createPackage(PackageCode.ANTIVIRUS);
        System.out.println(aPackage);
        
        Package aPackage1 = PackageFactory.createPackage(PackageCode.INTERNET);
        System.out.println(aPackage1);
        
        Package aPackage2 = PackageFactory.createPackage(PackageCode.TOTAL);
        System.out.println(aPackage2);
    }
    
}
