
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RAMESHA
 */
public abstract class Package {
    
    protected List<Security> securityFeatures = new ArrayList<>();
    
    public Package(){createPackage();}

    public void createPackage(){
        securityFeatures.add(new BasicSecurity());
        securityFeatures.add(new PerformanceSecurity());
        securityFeatures.add(new SimplicitySecurity());
    }

    @Override
    public String toString() {
        return "Package{"
                + "Security Features "+securityFeatures+"}";
    }
    
}
