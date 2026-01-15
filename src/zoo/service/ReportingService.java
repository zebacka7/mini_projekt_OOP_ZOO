package zoo.service;

import java.util.List;
import zoo.domain.interfaces.Exportable;

public class ReportingService {

    public void generateReport(List<Exportable> items) {
        System.out.println("\n=== GENEROWANIE RAPORTU AKTYWNOŚCI ===");
        System.out.println("--- RAPORT CSV ---");
        
        if (items.isEmpty()) {
            System.out.println("(Brak danych do raportu)");
            return;
        }

        for (Exportable item : items) {
            System.out.println(item.toDataFormat());
        }
        
        System.out.println("--- KONIEC RAPORTU ---\n");
    }
}