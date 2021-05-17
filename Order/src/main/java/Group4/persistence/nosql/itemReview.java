package Group4.persistence.nosql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "itemReviews")
public class itemReview {
    @Id
    private String item;
    private String review;
    private String reviewer;
    private Date reviewDate;
}
