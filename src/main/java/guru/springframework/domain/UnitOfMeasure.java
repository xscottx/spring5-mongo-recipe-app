package guru.springframework.domain;

import lombok.Setter;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

/**
 * Created by jt on 6/13/17.
 */
@Setter
@Getter
@Document
public class UnitOfMeasure {

    @Id
    private String id;
    private String description;
}
