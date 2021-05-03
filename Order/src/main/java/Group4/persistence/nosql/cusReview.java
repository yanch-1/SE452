@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "cusReviews")
public class cusReview {
    @Id
    private String customer;
    private String review;
    private String reviewer;
    private Date reviewDate;
}
