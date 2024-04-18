package java17features.recordclasses;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MerchantDemo {

	public static void main(String[] args) {
		Merchant sneha = new Merchant("Sneha");
		Merchant raj = new Merchant("Raj");
		Merchant florence = new Merchant("Florence");
		Merchant leo = new Merchant("Leo");

		List<Merchant> merchantList = List.of(sneha, raj, florence, leo);

		/**
		 * List<Sale> salesList = List.of(new Sale(sneha, LocalDate.of(2020,
		 * Month.NOVEMBER, 13), 11034.20), new Sale(raj, LocalDate.of(2020,
		 * Month.NOVEMBER, 20), 8234.23), new Sale(florence, LocalDate.of(2020,
		 * Month.NOVEMBER, 19), 10003.67), // ... new Sale(leo, LocalDate.of(2020,
		 * Month.NOVEMBER, 4), 9645.34));
		 **/
		Sale snehaSales = new Sale(sneha, LocalDate.of(2020, Month.NOVEMBER, 13), 11034.20);
		Sale rajSales = new Sale(raj, LocalDate.of(2020, Month.NOVEMBER, 20), 8234.23);
		Sale florenceSales = new Sale(florence, LocalDate.of(2020, Month.NOVEMBER, 19), 10003.67);
		Sale leoSales = new Sale(leo, LocalDate.of(2020, Month.NOVEMBER, 4), 9645.34);

		Sale snehaSalesJan = new Sale(sneha, LocalDate.of(2020, Month.JANUARY, 11), 21034.20);
		Sale rajSalesJan = new Sale(raj, LocalDate.of(2020, Month.JANUARY, 25), 18234.23);
		Sale florenceSalesJan = new Sale(florence, LocalDate.of(2020, Month.JANUARY, 20), 5003.67);
		Sale leoSalesJan = new Sale(leo, LocalDate.of(2020, Month.JANUARY, 24), 4645.34);

		List<Sale> salesList = new ArrayList<Sale>();
		salesList.add(leoSales);
		salesList.add(snehaSales);
		salesList.add(rajSales);
		salesList.add(florenceSales);
		salesList.add(florenceSalesJan);
		salesList.add(rajSalesJan);
		salesList.add(leoSalesJan);
		salesList.add(snehaSalesJan);

		List<Merchant> topMerchants = findTopMerchants(salesList, merchantList, 2020, Month.NOVEMBER);

		System.out.println("Top merchants: ");
		topMerchants.forEach(m -> System.out.println(m.name()));

	}

	private static List<Merchant> findTopMerchants(List<Sale> salesList, List<Merchant> merchantList, int year,
			Month month) {

		/**
		 * List<Sale> novSales =
		 * salesList.stream().filter(s->s.date().getMonth().equals(Month.NOVEMBER))
		 * .sorted(Comparator.comparing(Sale::value))
		 * .collect(Collectors.toList()).reversed(); List<Merchant> merchants =
		 * novSales.stream().map(Sale::merchant).collect(Collectors.toList());
		 **/

		//Approach one using stream api
		/**List<Merchant> merchants = salesList.stream()
											.filter(s -> s.date().getMonth().equals(Month.NOVEMBER))
											.sorted(Comparator.comparing(Sale::value))
											.map(Sale::merchant)
											.collect(Collectors.toList()).reversed();
		return merchants;*/
		
		//Another approach
		// Local record class
		record MerchantSales(Merchant merchant, double sales) {
		}
		
		/**
		List m = merchantList.stream()
							.map(merchant -> new MerchantSales(merchant, computeSales(salesList, merchant, year, month)))
							.collect(Collectors.toList());
		
		System.out.println("***"+m);**/

		return merchantList.stream()
				.map(merchant -> new MerchantSales(merchant, computeSales(salesList, merchant, year, month)))
				.sorted((m1, m2) -> Double.compare(m2.sales(), m1.sales()))
				.map(MerchantSales::merchant)
				.collect(Collectors.toList());
	}

	
	static  double computeSales(List<Sale> sales, Merchant mt, int yr, Month mo) {
		return sales.stream().filter(
				s -> s.merchant().name().equals(mt.name()) && s.date().getYear() == yr && s.date().getMonth() == mo)
				.mapToDouble(s -> s.value()).sum();
	}
}