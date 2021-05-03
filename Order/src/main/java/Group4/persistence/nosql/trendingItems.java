@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "trendingItems")
public class trendingItems{
    @Id
    private String item;
    private String itemPurchases;
   
}
