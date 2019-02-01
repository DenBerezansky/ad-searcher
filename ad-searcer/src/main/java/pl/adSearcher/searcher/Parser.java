package pl.adSearcher.searcher;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
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
    private Ad ad;
    
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
}
