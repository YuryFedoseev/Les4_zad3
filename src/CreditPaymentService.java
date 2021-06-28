public class CreditPaymentService {
    public double calculate(  double amount, double years) {
        double procent= 9.99; //процент по кредиту
        double period_month = years * 12; //месяцев на выплату
        double procentmonth = procent /12 /100; //месячная процентная ставка
        double variable = Math.pow(( 1+procentmonth),period_month); // переменная для возведения в степень  (1+ мес проц ставка)^количество платежей )
        //к.а.= (мес проц ставка * (1+ мес проц ставка)^количество платежей ) / (( 1+ мес проц ставка)^колич платежей  -1)
        double coefficient = (procentmonth * variable)/ (variable - 1); // коэффициент аннуитета
        double payment = amount * coefficient; //платеж = сумма кредита * коэф аннуитета

        return payment;
    }
}

