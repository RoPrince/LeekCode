package Functional;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Price {
    public static
    final List<BigDecimal> prices = Arrays.asList(
            new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
            new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
            new BigDecimal("45"), new BigDecimal("12"));


    public static void main(String[] args) {
        prices.stream()
                .filter(price->price.compareTo(BigDecimal.valueOf(20))>0)
                .map(price->price.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO,BigDecimal::add);
    }
}
