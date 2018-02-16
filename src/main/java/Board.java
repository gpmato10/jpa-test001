import javax.persistence.*;

@Entity
@TableGenerator(
        name = "BOARD_SEQ_GENERATOR",
        table = "MY_SEQUENCE",
        pkColumnValue = "BOARD_SEQ", allocationSize = 1
)
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "BOARD_SEQ_GENERATOR")
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
