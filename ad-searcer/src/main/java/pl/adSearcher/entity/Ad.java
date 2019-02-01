package pl.adSearcher.entity;

/**
 * Created by Denis Berezanskiy on 01.02.2019.
 */
public class Ad
{
    private long Id;
    private String url;
    private String name;
    private String phoneNumber;
    private String price;
    
    public Ad()
    {
    }
    
    public Ad(String url, String name, String phoneNumber,String price)
    {
        this.url = url;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.price = price;
    }
    
    public long getId()
    {
        return Id;
    }
    
    public void setId(long id)
    {
        Id = id;
    }
    
    public String getUrl()
    {
        return url;
    }
    
    public void setUrl(String url)
    {
        this.url = url;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    public String getPrice()
    {
        return price;
    }
    
    public void setPrice(String price)
    {
        this.price = price;
    }
}
