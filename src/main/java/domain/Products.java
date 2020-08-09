package domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

public class Products {
	@Getter @Setter
	private String name;
	@Getter @Setter
	private  Double price;
	@Getter @Setter
	private String details;
	@Getter @Setter
	private String productID;
}
