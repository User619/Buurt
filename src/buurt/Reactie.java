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
public class Reactie {
    
    private Account account;
    private Date datum;
    private String titel;
    private String inhoud;
    //private ArrayList<Like> likes;
    
    public Reactie(){}
    public Reactie(String titel, String inhoud, Account account)
    {setTitel(titel); setInhoud(inhoud); setAccount(account); setDatum(Calender.getInstance().getTime());}
    
    public String getTitel(){return this.titel;}
    public void setTitel(String titel){this.titel=titel;}
    public String getInhoud(){return this.inhoud;}
    public void setInhoud(String inhoud){this.inhoud=inhoud;}
    public Date getDatum(){return this.datum;}
    public void setDatum(Date datum){this.datum=datum;}
    public Account getAccount(){return this.account;}
    public void setAccount(Account Account){this.account=account;}
    /*public ArrayList<Like> getLikes(){return this.likes;}      
    public void setLikes(ArrayList<Like> likes){this.likes=likes;}*/
    
}
