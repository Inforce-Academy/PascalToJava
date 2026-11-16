program SimpleInterest;

var
    Balance: Real;
    RatePercentage: Real; { interest rate in %}
    Rate: Real; { interest rate - decimal }
    Interest: Real;

begin
    Write('Enter balance: ');
    ReadLn(Balance);
    Write('Enter interest rate in %: ');
    ReadLn(RatePercentage);
    Rate := RatePercentage/100;
    Interest := Rate * Balance;
    WriteLn('Interest is ', Interest:0:2);
end.