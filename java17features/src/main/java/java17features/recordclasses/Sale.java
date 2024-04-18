package java17features.recordclasses;

import java.time.LocalDate;

public record Sale(Merchant merchant, LocalDate date, double value) {

}
