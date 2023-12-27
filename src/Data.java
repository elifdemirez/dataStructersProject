/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ynsdm
 */
import java.util.List;
import java.util.ArrayList;

public class Data {
    private String tableName;
    private Dimension dimension;
    private List<SourceCube> sourceCube;
   
	public void bringTableName() {
		System.out.println("Veri Kupu Adi\t\t:\t" + getTableName() + "\n");
	}
	
	public void listDimensions() {
		System.out.println("Kod/Veri Aciklamaları\t:\t" + getDimension().getDimensions() + "\n");
	}
	
	public void listAllData() {
		
		System.out.print("Müsteriler\t\t\t\t");
		System.out.print("Urunler\t\t\t\t");
		System.out.println("Zaman");
		System.out.println("__________________________________________________________________________________________________");
		for(SourceCube s: sourceCube) { 
			System.out.print(s.getCustomer().getFirstName()+" "+s.getCustomer().getLastName()+"\t\t\t\t");
			System.out.print(s.getProduct().getTitle()+"\t\t\t");
			System.out.println(s.getTimestamp().getDay()+" "+s.getTimestamp().getMonth()+" "+s.getTimestamp().getYear());
		} 
		System.out.println("\n");
	}
	
	public void listSelectedDimension(String input) {
		
		if("Musteriler".equals(input)){
			for(SourceCube s: sourceCube) { 
				System.out.println(s.getCustomer().getFirstName()+" "+s.getCustomer().getLastName());
			} 
		}
		else if("Urunler".equals(input)){
			for(SourceCube s: sourceCube) { 
				System.out.println(s.getProduct().getTitle());
			}
		}
                else if("Zaman".equals(input)){
			for(SourceCube s: sourceCube) { 
				System.out.println(s.getTimestamp().getDay()+" "+s.getTimestamp().getMonth()+" "+s.getTimestamp().getYear());
			}
		} 
                

		
		System.out.println("\n");
               
 
	}
	
	public void listSelectedTable(String table) {
              System.out.print(table+" tablosundan >>   ");
		listSelectedDimension(dimension.getDimensions().get(table));
	}
	
	public void listDataPair(String input1, String input2) {
		
		System.out.println(input1 + " ve " + input2 + " listeleniyor...\n");
		
		if("Musteriler".equals(input1) || "Musteriler".equals(input2)){
			if("Urunler".equals(input1) || "Urunler".equals(input2)){
				for(SourceCube s: sourceCube) { 
					System.out.print(s.getCustomer().getFirstName()+" "+s.getCustomer().getLastName()+"\t\t\t\t");
					System.out.println(s.getProduct().getTitle());
				}
			}
			if("Zaman".equals(input1) || "Zaman".equals(input2)){
				for(SourceCube s: sourceCube) { 
					System.out.print(s.getCustomer().getFirstName()+" "+s.getCustomer().getLastName()+"\t\t\t\t");
					System.out.println(s.getTimestamp().getDay()+" "+s.getTimestamp().getMonth()+" "+s.getTimestamp().getYear());
				}
			} 
		}
		else if("Urunler".equals(input1) || "Urunler".equals(input2)){
			if("Zaman".equals(input1) || "Zaman".equals(input2)){
				for(SourceCube s: sourceCube) { 
					System.out.print(s.getProduct().getTitle()+"\t\t\t\t");
					System.out.println(s.getTimestamp().getDay()+" "+s.getTimestamp().getMonth()+" "+s.getTimestamp().getYear());
				}
			} 
		}
		
		System.out.println("\n");
	}
      
        
    public void listSelectedTables(String... tables) {
   
    if (tables.length == 0) {
        System.out.println("En az bir tablo seçilmelidir.");
        return;
    }

    
    List<String> selectedDimensions = new ArrayList<>();
    for (String table : tables) {
        selectedDimensions.add(dimension.getDimensions().get(table));
    }

    System.out.print(String.join(" ve ", tables) + " tablolarindan >>   ");
            System.out.println();


    
    for (SourceCube s : sourceCube) {
        boolean isFirstEntry = true;
        for (String dimensionValue : selectedDimensions) {
            if (!isFirstEntry) {
                System.out.print("\t\t\t\t");
            }
            isFirstEntry = false;

            if ("Musteriler".equals(dimensionValue)) {
                System.out.print(s.getCustomer().getFirstName() + " " + s.getCustomer().getLastName());
            } else if ("Urunler".equals(dimensionValue)) {
                System.out.print(s.getProduct().getTitle());
            } else if ("Zaman".equals(dimensionValue)) {
                System.out.print(s.getTimestamp().getDay() + " " + s.getTimestamp().getMonth() + " " + s.getTimestamp().getYear());
            }
        }
        System.out.println();
    }

    System.out.println("\n");

   
    }
	
	public Data() {
			
	}
	
	public Data(String tableName) {
			this.tableName = tableName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public List<SourceCube> getSourceCube() {
		return sourceCube;
	}

	public void setSourceCube(List<SourceCube> sourceCube) {
		this.sourceCube = sourceCube;
	}
}
