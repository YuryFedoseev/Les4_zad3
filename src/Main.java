public class Main {
    public static void main(String[] args) {
        CreditPaymentService  service = new CreditPaymentService ();
        double amount = 1_000_000; //общая сумма кредита ;
        double years = 1;//количество лет кредита
        double payment = service.calculate(amount , years);// ежемесячный платеж
        System.out.printf("\n"+"Количество лет:%.0f , Ежемесячный платеж:%.0f руб",years,payment );


        amount = 1_000_000; //общая сумма кредита ;
        years = 2;//количество лет кредита
        payment = service.calculate(amount , years);// ежемесячный платеж
        System.out.printf("\n"+"Количество лет:%.0f , Ежемесячный платеж:%.0f руб",years,payment);

        amount = 1_000_000; //общая сумма кредита ;
        years = 3;//количество лет рабства
        payment = service.calculate(amount , years);// ежемесячный платеж
        System.out.printf("\n"+"Количество лет:%.0f , Ежемесячный платеж:%.0f руб",years,payment);
    }
}
