public class TestsRef {

    //Изначальный код
    public void testAddItemQuantity_severalQuantity_v1(){
        Address billingAddress = null;
        Address shippingAddress = null;
        Customer customer = null;
        Product product = null;
        Invoice invoice = null;
        try {
// Настройка тестовой конфигурации
            billingAddress = new Address("1222 1st St SW", "Calgary", "Alberta", "T2N 2V2","Canada");
            shippingAddress = new Address("1333 1st St SW", "Calgary", "Alberta", "T2N 2V2", "Canada");
            customer = new Customer(99, "John", "Doe", new BigDecimal("30"), billingAddress, shippingAddress);
            product = new Product(88, "SomeWidget", new BigDecimal("19.99"));
            invoice = new Invoice(customer);
// Вызов тестируемой системы
            invoice.addItemQuantity(product, 5);
// Проверка результата
            List lineItems = invoice.getLineItems();
            if (lineItems.size() == 1) {
                LineItem actItem = (LineItem) lineItems.get(0);
                assertEquals("inv", invoice, actItem.getInv());
                44 Рефакторинг тестов
                assertEquals("prod", product, actItem.getProd());
                assertEquals("quant", 5, actItem.getQuantity());
                assertEquals("discount", new BigDecimal("30"),
                        actItem.getPercentDiscount());
                assertEquals("unit price",new BigDecimal("19.99"),
                        actItem.getUnitPrice());
                assertEquals("extended", new BigDecimal("69.96"),
                        actItem.getExtendedPrice());
            } else {
                assertTrue("Invoice should have 1 item", false);
            }
        } finally {
// Очистка
            deleteObject(invoice);
            deleteObject(product);
            deleteObject(customer);
            deleteObject(billingAddress);
            deleteObject(shippingAddress);
        }
    }


    // Отрефакторинговый код
    public void testAddItemQuantity_severalQuantity_v14() {
        final int QUANTITY = 5;
        final BigDecimal UNIT_PRICE = new BigDecimal("19.99");
        final BigDecimal CUST_DISCOUNT_PC = new BigDecimal("30");
// Настройка тестовой конфигурации
        Customer customer = createACustomer(CUST_DISCOUNT_PC);
        Product product = createAProduct( UNIT_PRICE);
        Invoice invoice = createInvoice(customer);
// Вызов тестируемой системы
        invoice.addItemQuantity(product, QUANTITY);
// Проверка результата
        final BigDecimal BASE_PRICE =
                UNIT_PRICE.multiply(new BigDecimal(QUANTITY));
        final BigDecimal EXTENDED_PRICE =
                BASE_PRICE.subtract(BASE_PRICE.multiply(
                        CUST_DISCOUNT_PC.movePointLeft(2)));
        LineItem expected =
                createLineItem(QUANTITY, CUST_DISCOUNT_PC,
                        EXTENDED_PRICE, product, invoice);
        assertContainsExactlyOneLineItem(invoice, expected);
    }
}


