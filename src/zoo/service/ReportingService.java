package zoo.service;

import java.util.List;
import zoo.domain.interfaces.Exportable;

public class ReportingService {

    public void generateReport(List<Exportable> items) {
        System.out.println("\n=== Generating report ===");
        System.out.println("--- CSV REPORT ---");
        
        if (items.isEmpty()) {
            System.out.println("(No data to report)");
            return;
        }

        for (Exportable item : items) {
            System.out.println(item.toDataFormat());
        }

        System.out.println("--- End of report ---\n");
    }
}