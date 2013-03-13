/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buurt;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.lang.Math.Angle; //moet nog dlden

/**
 *
 * @author Jelle
 */
public class Post {
    
    private String titel;
    private String inhoud;
    private Date datum;
    private Account account;
    private Image afbeelding;
    private Angle oosterlengte;
    private Angle noorderbreedte;
    private ArrayList<Reactie> reacties;
    private ArrayList<Like> likes;
   
    public Post(){}
    public Post(String titel, String inhoud, Account account, Angle noorderbreedte, Angle oosterlengte)
    {setTitel(titel); setInhoud(inhoud); setAccount(account); setNoorderbreedte(noorderbreedte);
    setOosterlengte(oosterlengte); setDatum(Calender.getInstance().getTime());}
    public Post(String titel, String inhoud, Account account, Angle noorderbreedte, Angle oosterlengte, Image afbeelding)
    {setTitel(titel); setInhoud(inhoud); setAccount(account); setNoorderbreedte(noorderbreedte);
    setOosterlengte(oosterlengte); setDatum(Calender.getInstance().getTime()); setAfbeelding(afbeelding);}
    
    public String getTitel(){return this.titel;}
    public void setTitel(String titel){this.titel=titel;}
    public String getInhoud(){return this.inhoud;}
    public void setInhoud(String inhoud){this.inhoud=inhoud;}
    public Date getDatum(){return this.datum;}
    public void setDatum(Date datum){this.datum=datum;}
    public Account getAccount(){return this.account;}
    public void setAccount(Account account){this.account=account;}
    public void setAfbeelding(Image afbeelding){this.afbeelding=afbeelding;}
    public ArrayList<Reactie> getReacties(){return this.reacties;}
    public void setReacties(ArrayList<Reactie> reacties){this.reacties=reacties;}
    public ArrayList<Like> getLikes(){return this.likes;}      
    public void setLikes(ArrayList<Like> likes){this.likes=likes;}
    public Angle getNoorderbreedte(){return this.noorderbreedte;}
    public void setNoorderbreedte(Angle noorderbreedte){this.noorderbreedte=noorderbreedte;}
    public Angle getOosterlengte(){return this.oosterlengte;}
    public void setOosterlengte(Angle oosterlengte){this.oosterlengte=oosterlengte;}
}