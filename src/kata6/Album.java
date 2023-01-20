package kata6;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "Album")
public class Album {
    private int userId;
    private int id;
    private String title;
    
    Album(){
        userId = 0;
        id = 0;
        title = "";
    }
    public Album(int uid, int d, String t){
        userId = uid;
        id = d;
        title = t;
    }
    
    @Override
    public String toString(){
        return "Album{" + "userId=" + userId + ", id=" + id + ", title=" + title +"}";
    }
    public int getUserId(){
        return userId;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    
    public void setUserId(int uid){
        userId = uid;
    }
    public void setId(int d){
        id = d;
    }
    public void setTitle(String t){
        title = t;
    }
    
}
