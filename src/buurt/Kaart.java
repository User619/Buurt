/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buurt;

import java.awt.Cursor;
import java.net.URL;
import java.util.ArrayList;
import java.lang.Math.Angle; //moet nog dlden

/**
 *
 * @author Jelle
 */
public class Kaart {
    
    private ArrayList<Post> posts;
    private Account account;
    //private URL googlemap;
    //private Cursor cursor;
    //private Filter filter1;
    //private Filter filter1;
    //private Filter filter1;
    private Angle oosterlengte;
    private Angle noorderbreedte;
    
    public Kaart(){}
    public Kaart(Account account){setAccount(account);}
    
    public Account getAccount(){return this.account;}
    public void setAccount(Account account){this.account=account;}
    public ArrayList<Post> getPosts(){return posts;}
    public void setPosts(ArrayList<Post> posts){this.posts=posts;}
    public Angle getNoorderbreedte(){return this.noorderbreedte;}
    public void setNoorderbreedte(Angle noorderbreedte){this.noorderbreedte=noorderbreedte;}
    public Angle getOosterlengte(){return this.oosterlengte;}
    public void setOosterlengte(Angle oosterlengte){this.oosterlengte=oosterlengte;}
    
    public void updateKaart(){posts.clear(); /*databankconnectie*/}
    
}
