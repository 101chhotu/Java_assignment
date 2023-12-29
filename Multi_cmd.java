class Single_cmd 
{
    public static void main(String args[])
  {
    if (args.length>0)
    {  
      System.out.println("your multiple arguments:");
         for(String val:args)
           System.out.println(val);
    }
    else 
    {
       System.out.println("No command line arguments found ");
    }
  }
  
}
