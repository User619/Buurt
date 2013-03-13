/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buurt;

import java.util.Date;
import java.util.Calender;
        
/**
 *
 * @author Jelle
 */
public class Like {
    
private Gebruiker gebruiker;
private Date datum;

public Like(){}
public Like(Gebruiker gebruiker)
{setGebruiker(gebruiker); setDatum(Calender.getInstance().getTime());}
public Gebruiker getGebruiker(){return this.gebruiker;}
public void setGebruiker(Gebruiker gebruiker){this.gebruiker=gebruiker;}
public Date getDatum(){return this.datum;}
public void setDatum(){this.datum=datum;}



}
