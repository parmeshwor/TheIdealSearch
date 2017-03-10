package idealSearch;


/**
 * Created by parmeshwor on 4/23/16.
 */
public class IdealSearchMain {

    public static void main(String[] args) {
      /*  IdealSearch idealSearch = new IdealSearch();

        idealSearch.insert(9999);
        idealSearch.insert(1111);
        idealSearch.insert(9998);
        idealSearch.insert(9999);
       
      //  idealSearch.insert(0000);
       // idealSearch.insert(11);


        idealSearch.traverse();
        System.out.println(idealSearch.search(1111));
        System.out.println(idealSearch.search(1119));
        System.out.println(idealSearch.search(0));*/
        
        //---------------------idealSearch2
        
    /*    IdealSearch2 idealSearch2 = new IdealSearch2();

        idealSearch2.insert(99);
        idealSearch2.insert(1111);
        idealSearch2.insert(9998);
        idealSearch2.insert(9999);
       
      //  idealSearch2.insert(0000);
       // idealSearch2.insert(11);


        idealSearch2.traverse();
        System.out.println();
        
        System.out.println(idealSearch2.search(1111));
        System.out.println(idealSearch2.search(1119));
        System.out.println(idealSearch2.search(0));
    	
    	System.out.println();*/
    	
    	//-------------------idealSearch 3
     /*   IdealSearch3 idealSearch3 = new IdealSearch3();

        idealSearch3.insert(99);
        idealSearch3.insert(1111);
        idealSearch3.insert(9998);
        idealSearch3.insert(9999);
        idealSearch3.insert(1000012121);
        idealSearch3.insert(113);
        idealSearch3.insert(1000);
        idealSearch3.insert(666666);
        idealSearch3.insert(3);
        idealSearch3.insert(9);
        idealSearch3.insert(0);
        idealSearch3.insert(1200000001);
       
      //  idealSearch2.insert(0000);
       // idealSearch2.insert(11);


        idealSearch3.traverseRecursive();
        System.out.println();
        
        System.out.println(idealSearch3.search(1111));
        System.out.println(idealSearch3.search(1119));
        System.out.println(idealSearch3.search(0));
        System.out.println(idealSearch3.search(99));
        System.out.println(idealSearch3.search(1000012121));
        System.out.println(idealSearch3.search(120000000));
    	
    	System.out.println();*/
    	
    	//-------------------idealSearch 4
        IdealSearch4 idealSearch3 = new IdealSearch4();


        idealSearch3.insert("12345");
        idealSearch3.insert("1234456778998755");
        idealSearch3.insert("12");
        idealSearch3.insert("999");
        idealSearch3.insert("10002");
        idealSearch3.insert("222344");
        idealSearch3.insert("123");
        idealSearch3.insert("1");
        idealSearch3.insert("123456789123456789");
    
      
        idealSearch3.traverseRecursive();
        System.out.println();
        
        System.out.println(idealSearch3.search("12345"));
        System.out.println(idealSearch3.search("1"));
        System.out.println(idealSearch3.search("123456789123456789"));
        System.out.println(idealSearch3.search("0"));
        System.out.println(idealSearch3.search("12121212"));
        System.out.println(idealSearch3.search("121212121212121212121212121"));
   
    	
    	/*System.out.println();
    	
    	String str = "123455678912356789";
    	for(String s:str.split(""))
    	System.out.println(s+"-");*/
    }
}
