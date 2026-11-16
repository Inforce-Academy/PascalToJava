program PersonProfile;

var
  FirstName, LastName: String;
  Age: Integer;
  Gender: Char;
  FullName: String;
  AdultText: String;

begin
  Write('First name: '); ReadLn(FirstName);
  Write('Last name: '); ReadLn(LastName);
  Write('Age: '); ReadLn(Age);
  Write('Gender (M/F): '); ReadLn(Gender);
  FullName := FirstName + ' ' + LastName;

  if Age >= 18 then
    AdultText := 'adult'
  else
    AdultText := 'minor';

  WriteLn('--- PROFILE ---');
  WriteLn('Name: ', FullName);
  WriteLn('Age: ', Age, ' (', AdultText, ')');
  WriteLn('Gender: ', Gender);
end.