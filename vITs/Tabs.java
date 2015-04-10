package vITs;

public class Tabs extends javax.swing.JTabbedPane {

    public Tabs() {
 	
    	
    Rapport rapport = new Rapport();
        addTab("Rapportera", rapport);

    Hantera hantera = new Hantera();
        addTab("Hantera", hantera);
        
    advancePayment forskott = new advancePayment();
    	addTab("Förskott", forskott);
    	
    }

}
