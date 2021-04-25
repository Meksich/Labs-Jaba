package ua.lviv.iot.shop;

import ua.lviv.iot.shop.enums.*;
import ua.lviv.iot.shop.manager.UnderwaerManager;
import ua.lviv.iot.shop.underwear.Bra;
import ua.lviv.iot.shop.underwear.Lingerie;
import ua.lviv.iot.shop.underwear.Pants;

public class App {
    public static void main(String[] args) {
    	System.out.println("aboba");
    	UnderwaerManager manager = new UnderwaerManager();
    	manager.underwear.add(new Bra(Collections.INCREDIBLE, Color.RED, 2018, 20.99,
    			BraStyles.TOP, CupsSize.A, LinningLevel.LIGHTLY_LINED, 0));
		manager.underwear.add(new Bra(Collections.DREAM_ANGELS, Color.MULTICOLORED, 2021, 300.0,
				BraStyles.DEMI, CupsSize.C, LinningLevel.UNLINED, 1));
		manager.underwear.add(new Bra(Collections.BODY_BY_VICTORIA, Color.MULTICOLORED, 2020, 124.0,
    			BraStyles.BALCONETTE, CupsSize.G_PLUS, LinningLevel.PUSH_UP, 3));
		manager.underwear.add(new Pants(Collections.DREAM_ANGELS, Color.MULTICOLORED, 2021, 50.3,
				PantsStyles.BRIEFS, PantsSize.M, 90.0, Fabrics.LACIE));
		manager.underwear.add(new Lingerie(Collections.BODY_BY_VICTORIA, Color.GREY, 2020, 23.37,
				LingerieStyles.BABYDOLLS, PantsSize.L, true));
    	System.out.println("-----------------------Search by year------------------------");
		System.out.println("YEAR: 2020");
    	manager.printUnderwear(manager.searchByYear(2020));
		System.out.println("-----------------------Search by collection------------------------");
		System.out.println("COLLECTION: Dream Angels");
		manager.printUnderwear(manager.searchByCollection(Collections.DREAM_ANGELS));
		System.out.println("-----------------------Sort by price------------------------");
		System.out.println("ORDER: Desc");
		manager.printUnderwear(manager.sortByPrice(SortOrder.DESC));
//small_pants = classes.pants.Pants(classes.enums.StalesOfPants.MULTI_PACK,
//                      classes.enums.PantsSize.XS, 60,
//                      classes.enums.Fabrics.STEAMLESS,
//                      classes.enums.Collections.INCREDIBLE, 2021,
//                      classes.enums.Color.FLORAL, 13)
//large_pants = classes.pants.Pants(classes.enums.StalesOfPants.SHAPEWEAR,
//                      classes.enums.PantsSize.XL, 140,
//                      classes.enums.Fabrics.COTTON,
//                      classes.enums.Collections.BODY_BY_VICTORIA, 2017,
//                      classes.enums.Color.GREEN, 228)
//small_lingerie = classes.lingerie.Lingerie(False, classes.enums.LingerieStyles.CAMIS,
//                               classes.enums.PantsSize.S,
//                               classes.enums.Collections.INCREDIBLE, 2019,
//                               classes.enums.Color.WHITE, 30.30)
//medium_lingerie = classes.lingerie.Lingerie(True, classes.enums.LingerieStyles.CORSETS,
//                                classes.enums.PantsSize.M,
//                                classes.enums.Collections.DREAM_ANGELS, 2021,
//                                classes.enums.Color.MULTICOLORED, 1488)
    }
}