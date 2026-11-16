program TestDataBuilder;

constant
    Domain = 'example.com';

var
  Username: String;
  YearOfBirth: Integer;
  Domain: String;
  Email: String;
  Data: array[1..3] of String;

begin
  Write('Username: ');
  ReadLn(Username);

  Write('Year of birth: ');
  ReadLn(YearOfBirth);

  Email := Username + '@' + Domain;

  Data[1] := Username;
  Data[2] := Email;
  Str(YearOfBirth, Data[3]);  { Converting integer to string! }

  WriteLn('--- TEST DATA ---');
  WriteLn('username = ', Data[1]);
  WriteLn('email    = ', Data[2]);
end.