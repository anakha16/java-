class Product
{
  int pcode,price;
  String pname;
  double lowest;
  Product(int l,String m,int p)
  {
    pcode=l;
	pname=m;
	price=p;
  }
  void display()
  {
    System.out.println(pcode+"\t \t"+pname+"\t "+price);
  }
  static void lowest(double p1,double p2,double p3)
  {
	  if(p1<p2 && p1<p3)
	  {
		  System.out.println("\nProduct 1 have the Lowest price ");
	  }
	  else if(p2<p1 && p2<p1)
	  {
		  System.out.println("\nProduct 2 have the Lowest price ");
	  }
	  else
	  {
		  System.out.println("\nProduct 3 have the Lowest price ");
	  }
  }
  public static void main(String args[])
  {
    Product p1=new Product(101,"MASALADOSHA",40);
	Product p2=new Product(102,"PLAINDOSHA",25);
	Product p3=new Product(103,"GHEEROST",50);
	System.out.println("\n\n\t\tPRODUCT INFORMATIONS\n\nPRODUCT CODE\tPRODUCT NAME\tPRICE \n");
	p1.display();
	p2.display();
	p3.display();
	
	lowest(p1.price,p2.price,p3.price);
  }
}
  
    
 