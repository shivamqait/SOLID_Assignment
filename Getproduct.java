class Getproduct  
{ 
    private Product model; 
    private Shipmentview view; 
  
    public Getproduct(Product model, Shipmentview view) 
    { 
        this.model = model; 
        this.view = view; 
    } 
  
    public void setProductName(String name) 
    { 
        model.setName(name);         
    } 
  
    public String getProductName() 
    { 
        return model.getName();         
    } 
  
    public void setProductPrice(int price) 
    { 
        model.setPrice(price);         
    } 
  
    public int getProductPrice() 
    { 
        return model.getPrice();         
    } 

    public void setProductQty(int Qty) 
    { 
        model.setQty(Qty);         
    } 
  
    public int getProductQty() 
    { 
        return model.getQty();         
    }

    public void updateView() 
    {                 
        view.printProductDetails(model.getName(), model.getPrice(), model.getQty()); 
    }     
} 