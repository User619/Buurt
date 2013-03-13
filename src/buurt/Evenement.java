/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buurt;

import java.awt.Image;
import java.util.Date;
import java.lang.Math.Angle; //moet nog dlden

/**
 *
 * @author Jelle
 */
public class Evenement extends Post{
    
    private Date beginDatum;
    private Date eindDatum;
    
    public Evenement(){}
    public Evenement(String titel, String inhoud, Account account, Angle noorderbreedte, Angle oosterlengte, Date beginDatum, Date eindDatum)
    {super(titel, inhoud, account, noorderbreedte, oosterlengte); setBeginDatum(beginDatum); setEindDatum(eindDatum);}
    public Evenement(String titel, String inhoud, Account account, Angle noorderbreedte, Angle oosterlengte, Image afbeelding, Date beginDatum, Date eindDatum)
    {super(titel, inhoud, account, afbeelding, noorderbreedte, oosterlengte); setBeginDatum(beginDatum); setEindDatum(eindDatum);}
    
    public Date getBeginDatum(){return this.beginDatum;}
    public void setBeginDatum(Date beginDatum){this.beginDatum=beginDatum;}
    public Date getEindDatum(){return this.eindDatum;}
    public void setEindDatum(Date eindDatum){this.eindDatum=eindDatum;}
    
}
