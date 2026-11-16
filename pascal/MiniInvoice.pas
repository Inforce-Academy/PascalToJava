program MiniInvoice;

var
  ItemName : array[1..3] of String;
  Qty      : array[1..3] of Integer;
  Price    : array[1..3] of Real;
  Total    : array[1..3] of Real;
  GrandTotal : Real;

begin
  { Read data for item 1 }
  Write('Item 1 name: '); ReadLn(ItemName[1]);
  Write('Item 1 quantity: '); ReadLn(Qty[1]);
  Write('Item 1 unit price: '); ReadLn(Price[1]);

  { Read data for item 2 }
  Write('Item 2 name: '); ReadLn(ItemName[2]);
  Write('Item 2 quantity: '); ReadLn(Qty[2]);
  Write('Item 2 unit price: '); ReadLn(Price[2]);

  { Read data for item 3 }
  Write('Item 3 name: '); ReadLn(ItemName[3]);
  Write('Item 3 quantity: '); ReadLn(Qty[3]);
  Write('Item 3 unit price: '); ReadLn(Price[3]);
  { Calculate totals (no loops) }
  Total[1] := Qty[1] * Price[1];
  Total[2] := Qty[2] * Price[2];
  Total[3] := Qty[3] * Price[3];

  GrandTotal := Total[1] + Total[2] + Total[3];

  { Output invoice }
  WriteLn('--- INVOICE ---');
  WriteLn(ItemName[1], ': ', Total[1]:0:2);
  WriteLn(ItemName[2], ': ', Total[2]:0:2);
  WriteLn(ItemName[3], ': ', Total[3]:0:2);
  WriteLn('TOTAL: ', GrandTotal:0:2);
end.