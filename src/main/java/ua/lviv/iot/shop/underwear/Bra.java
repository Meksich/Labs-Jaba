package ua.lviv.iot.shop.underwear;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.shop.enums.BraStyles;
import ua.lviv.iot.shop.enums.Collections;
import ua.lviv.iot.shop.enums.Color;
import ua.lviv.iot.shop.enums.CupsSize;
import ua.lviv.iot.shop.enums.LinningLevel;

@Data
@NoArgsConstructor
public class Bra extends Underwear {

	private BraStyles style;
	private CupsSize cupsSize;
	private LinningLevel liningLevel;
	private Integer numberOfHooks;
	public Bra(Collections collection, Color color, Integer yearOfProduction, Double price, 
		         BraStyles style, CupsSize cupsSize, LinningLevel liningLevel, Integer numberOfHooks) {
	super(collection, color, yearOfProduction, price);
	this.style = style;
	this.cupsSize = cupsSize;
	this.liningLevel = liningLevel;
	this.numberOfHooks = numberOfHooks;
	}
	
	@Override
	public String toString() {
		return "Bra:\n" + super.toString() + 
				"Style = " + style + "\n" +
				"Cups size = " + cupsSize + "\n" +
				"Lining level = " + liningLevel + "\n" +
				"Number of hooks = " + numberOfHooks + "\n";
	}
}
