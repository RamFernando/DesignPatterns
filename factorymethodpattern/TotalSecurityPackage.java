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
public class TotalSecurityPackage extends Package{

    @Override
    public void createPackage() {
        super.createPackage();
        securityFeatures.add(new MobileSecurity());
        securityFeatures.add(new PrivacySecurity());
        securityFeatures.add(new MoneySecurity());
        securityFeatures.add(new SafeKidsSecurity());
        securityFeatures.add(new PasswordSecurity());
        securityFeatures.add(new FileProtection());
    }
    
}
