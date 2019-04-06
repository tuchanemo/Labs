package Mod2.test;

import com.mybank.domain.*;
import com.mybank.reporting.*;
import com.mybank.data.DataSource;
import java.io.IOException;
import java.util.Locale;

public class TestReport {

  private static final String USAGE
    = "USAGE: java com.mybank.test.TestReport <dataFilePath>";

  public static void main(String[] args) {
      
      Locale.setDefault(Locale.ENGLISH);

    // Retrieve the dataFilePath command-line argument
    if ( args.length != 1 ) {
      System.out.println(USAGE);
    } else {
      String dataFilePath = args[0];

      try {
	System.out.println("Reading data file: " + dataFilePath);
	// Create the data source and load the Bank data
	DataSource dataSource = new DataSource(dataFilePath);
	dataSource.loadData();

	// Run the customer report
	CustomerReport report = new CustomerReport();
	report.generateReport();
        
      //  AccumulateSavingsBatch jobRate = new AccumulateSavingsBatch();
      //  jobRate.doBatch();
        
      //  report.generateReport();

      } catch (IOException ioe) {
	System.out.println("Could not load the data file.");
	System.out.println(ioe.getMessage());
	ioe.printStackTrace(System.err);
      }
    }
  }
}
