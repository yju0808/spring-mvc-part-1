

package hello.itemservice.domain.item;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private Long id; // 상품 식별자
    private String itemName; // 상품 이름
    private Integer price; // 가격
    private Integer quantity; // 수량

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

}