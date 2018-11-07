/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import java.text.DecimalFormat;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author sendy
 */
@Stateless
@LocalBean
public class tarifBBM {
DecimalFormat a = new DecimalFormat ("0.0");
String result;
    public String Tarif_Pertamax(double param) {
        return result = a.format ((param*10400));
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public String Tarif_Pertalite(double param) {
        return  result = a.format ((param*10400));
    }

    public String Tarif_Dex(double param) {
        return result = a.format ((param*11850));
    }

    public String Tarif_Premium(double param) {
        return result = a.format ((param*7000));
    }

    public String Tarif_BioSolar(double param) {
        return result = a.format ((param*9800));
    }
}
