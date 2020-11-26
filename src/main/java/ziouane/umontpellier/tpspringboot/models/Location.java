package ziouane.umontpellier.tpspringboot.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Access(AccessType.FIELD)
@Entity(name="locations")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Location {


    public Location(){}
    public Location(long location_id, long latitude, long longitude, Date location_date) {
        this.location_id = location_id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.location_date = location_date;
        this.users= new ArrayList<User>();
    }

    @ManyToMany(mappedBy = "locations")
    @JsonIgnore
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long location_id;

    public long getLocation_id() {
        return location_id;
    }

    public void setLocation_id(long location_id) {
        this.location_id = location_id;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public Date getLocation_date() {
        return location_date;
    }

    public void setLocation_date(Date location_date) {
        this.location_date = location_date;
    }

    private long latitude;
    private long longitude;
    private Date location_date;

}
