import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    @Column(name ="TEAM_ID")
    private String id;

    private String name;

    public Team() {
    }

    public Team(String member1, String name1) {
        this.id = member1;
        this.name = name1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
