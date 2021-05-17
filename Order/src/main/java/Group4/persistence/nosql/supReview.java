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
@Document(collection = "supReviews")
public class supReview {
    @Id
    private String supplier;
    private String review;
    private String reviewer;
    private Date reviewDate;
}
