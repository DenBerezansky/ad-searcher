package pl.adSearcher.searcher;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import pl.adSearcher.entity.Ad;

import java.io.IOException;

/**
 * Created by Denis Berezanskiy on 01.02.2019.
 * #
 * #
 * #
 * Currently this class working only wit olx.pl
 */
//TODO: Implement ability to parse other market places
public class Parser
{
    
    private Elements parseHtmlPage(String generatedUrl)
    {
        Document doc = null;
        Elements elements = null;
        
        try
        {
            doc = Jsoup.connect(generatedUrl).get();
            elements = doc.getElementsByAttributeValue("class", "offer");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return elements;
    }
    
    private Ad getAdDetails(Element element)
    {
        Ad ad = new Ad();
        if(element != null)
        {
            Elements detailsLinkElements = element.getElementsByAttributeValueContaining("class", "linkWithHash detailsLink");
            if(detailsLinkElements != null )
            {
    
    
                if (detailsLinkElements.hasAttr("href"))
                {
                    ad.setUrl(detailsLinkElements.attr("href"));
                }
                if (detailsLinkElements.hasText())
                {
                    ad.setName(detailsLinkElements.text());
                }
                //TODO: obtain price and phone number from ad
            }
        }
        return ad;
    }
}
