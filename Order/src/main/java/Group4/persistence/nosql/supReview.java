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
