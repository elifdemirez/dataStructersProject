/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Program {

    public static void main(String[] args) {
        
                Data data = new Data("Musteri-Urunler-Zaman");
		Dimension dimension = new Dimension();
		
		HashMap<String, String> dimensions = new HashMap<String, String>();
		
		dimensions.put("A","Musteriler");
		dimensions.put("B", "Urunler");
		dimensions.put("C", "Zaman");
		
		dimension.setDimensions(dimensions);
		data.setDimension(dimension);
		data.setSourceCube(new ArrayList<>());
		
		data.getSourceCube().add(new SourceCube(
				new Customer(1, "Elifnur", "Demirezen"),
				new Product(10756432, "Airfryer"),
				new Timestamp("21", "Aralık", "2023")));
		
		data.getSourceCube().add(new SourceCube(
				new Customer(2, "Deniz Ece", "Kışlalı"),
				new Product(215645457, "Robot Supurge"),
				new Timestamp("14", "Ocak", "2021")));
		
		data.getSourceCube().add(new SourceCube(
				new Customer(3, "Eda Nur", "Topdağ"),
				new Product(178115407, "Audi A8 Auto"),
				new Timestamp("07", "Nisan", "2023")));
		
		data.getSourceCube().add(new SourceCube(
				new Customer(4, "Gamze", "Yıldiz"),
				new Product(3457895, "Fön Makinesi"),
				new Timestamp("30", "Şubat", "2022")));
		
		                
                data.bringTableName();
		data.listDimensions();
		data.listAllData();
		
		data.listSelectedDimension("Müşteriler");
		data.listSelectedDimension("Ürünler");
		data.listSelectedDimension("Zaman");
		
		data.listSelectedTable("A");
		data.listSelectedTables("A", "B");
                data.listSelectedTables("A","B","C");
                
		
                
                
               

    }
    
}
