/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajes;

import java.io.Serializable;


/**
 *
 * @author sdist
 */
public class ClsMensaje implements Serializable{
    
    private boolean blnRes;
    private int intRes;
    private String strCadenaResultado;

    public ClsMensaje(boolean blnRes, int intRes, String strCadenaResultado) {
        this.blnRes = blnRes;
        this.intRes = intRes;
        this.strCadenaResultado = strCadenaResultado;
    }

    
    
    public boolean isBlnRes() {
        return blnRes;
    }

    public int getIntRes() {
        return intRes;
    }

    public String getStrCadenaResultado() {
        return strCadenaResultado;
    }

    public void setBlnRes(boolean blnRes) {
        this.blnRes = blnRes;
    }

    public void setIntRes(int intRes) {
        this.intRes = intRes;
    }

    public void setStrCadenaResultado(String strCadenaResultado) {
        this.strCadenaResultado = strCadenaResultado;
    }

    
    
    
    
}
