/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buurt;

import java.util.Date;

/**
 *
 * @author Jelle
 */
public class Account {
    
    //public Accountinfodingen
    
    private Kaart kaart;
    
    public Account(){setKaart(new Kaart(this));}
    
    public void setKaart(Kaart kaart){this.kaart=kaart;}
    public Kaart getKaart(){return this.kaart;}
    public static void login(){/*databaseconnectie*/}
    public void postMelding(String titel, String inhoud, int type)
    {Post post=new Melding(titel, inhoud, this, getKaart().getNoorderbreedte(), getKaart().getOosterlengte(), type);
    /* post in database wegschrijven*/}
    public void postMelding(String titel, String inhoud, String type)
    {Post post=new Melding(titel, inhoud, this, getKaart().getNoorderbreedte(), getKaart().getOosterlengte(), type);
    /* post in database wegschrijven*/}
    public void postEvenement(String titel, String inhoud, Date beginDatum, Date eindDatum)
    {Post post=new Evenement(titel, inhoud, this, getKaart().getNoorderbreedte(), getKaart().getOosterlengte(), beginDatum, eindDatum);
    /* post in database wegschrijven*/}
    public void reactie(Post post, String titel, String inhoud){post.getReacties().add(new Reactie(titel, inhoud, this));}
    public void like(Post post) {post.getLikes().add(new Like(this));}
    
}
