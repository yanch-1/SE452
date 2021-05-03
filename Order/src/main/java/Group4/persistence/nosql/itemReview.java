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
