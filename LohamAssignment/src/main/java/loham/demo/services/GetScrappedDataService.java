package loham.demo.services;

import java.io.IOException;



import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class GetScrappedDataService {
	public String getData(){
		String price = "";
		try {
			   Document doc = Jsoup.connect("https://www.metal.com/Lithium-ion-Battery/202303240001").get();
			   Elements priceelement = doc.select(".strong___1JlBD.priceDown___2TbRQ"); 
			   System.out.println(priceelement.size());
			   price = "The Price Is : " +  priceelement.get(0).text();
			} catch (HttpStatusException ex) {
			   //...
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return price;
	}	
}
