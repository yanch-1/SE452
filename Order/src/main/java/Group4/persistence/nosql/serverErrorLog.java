@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "errorLog")
public class serverErrorLOg {
    @Id
    private Date reviewDate;
    private String desription;
    
}
