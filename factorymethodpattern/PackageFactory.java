/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpattern;

/**
 *
 * @author RAMESHA
 */
public class PackageFactory {

    public static Package createPackage(PackageCode packageCode) {
        switch (packageCode) {
            case ANTIVIRUS:
                return new AntivirusPackage();
            case INTERNET:
                return new InternetSecurityPackage();
            case TOTAL:
                return new TotalSecurityPackage();
            default:
                return null;
        }
    }
}
