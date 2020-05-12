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
public class InternetSecurityPackage extends Package{

    @Override
    public void createPackage() {
        super.createPackage();
        securityFeatures.add(new MobileSecurity());
        securityFeatures.add(new PrivacySecurity());
        securityFeatures.add(new MoneySecurity());
    }
    
}
