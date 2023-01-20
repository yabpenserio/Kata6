package kata6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "Albums" )
public class Albums {
    @XmlElement( name = "Album" )
    public List<Album> albums = new ArrayList<>();  
    public boolean add(Album al){
        return this.albums.add(al);
    }

}
