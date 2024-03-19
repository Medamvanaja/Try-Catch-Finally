 class Main
{
    public static void  main(String a[])
    {
        try 
        {
            int a1[]=new int[-2];
            System.out.println("::try block::");
            System.out.println("first element:"+a1[0]);
        }    
        catch(NegativeArraySizeException n)
        {
            System.out.println("generated exception:\n"+n);
            System.out.println("::catch block::");
        }    
        finally
        {
            System.out.println(":: finally block::");
        }
        System.out.println(" After the try block");
    }       
}
 
                                                                               

