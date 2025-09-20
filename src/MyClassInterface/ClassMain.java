package MyClassInterface;

public class ClassMain {
    public static void main(String[] args) {
        TableScanner tableScanner = new TableScanner();
        System.out.println("Please enter table...");
        Row[] table = tableScanner.scanTable();
        TableWriter tableWriter =  new TextFileTableWriter("table.txt");
        tableWriter.writeTable(table);
        System.out.println("Table written to..." + tableWriter.getOutputPlace());
    }
}
