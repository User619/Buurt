/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buurt;

import java.awt.Image;
import java.lang.Math.Angle; //moet nog dlden

/**
 *
 * @author Jelle
 */
public class Melding extends Post{
    
    private int type;
    
    public Melding(){}
    public Melding(String titel, String inhoud, Account account, Angle noorderbreedte, Angle oosterlengte, int type)
    {super(titel, inhoud, account, noorderbreedte, oosterlengte); setType(type);}
    public Melding(String titel, String inhoud, Account account, Angle noorderbreedte, Angle oosterlengte, String type)
    {super(titel, inhoud, account, noorderbreedte, oosterlengte); setTypeString(type);}
    public Melding(String titel, String inhoud, Account account, Angle noorderbreedte, Angle oosterlengte, Image afbeelding, int type)
    {super(titel, inhoud, account, afbeelding, noorderbreedte, oosterlengte); setType(type);}
    public Melding(String titel, String inhoud, Account account, Angle noorderbreedte, Angle oosterlengte, Image afbeelding, String type)
    {super(titel, inhoud, account, afbeelding, noorderbreedte, oosterlengte); setTypeString(type);}
    
    public int getType(){return this.type;}
    public void setType(int type){this.type=type;}
    public String getTypeString(){switch(type) {case 1: return "blabla"; default: return null;}}
    public void setTypeString(String type){switch(type) {case "blabla":setType(1);}}
    
}
