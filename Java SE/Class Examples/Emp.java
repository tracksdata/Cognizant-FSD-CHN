class Emp{
int age;
static String mgrName;

void test(){
 age=98;
 mgrName="SOme Name";
System.out.println("-- Test method");
}

public static void main(String[] s){
    mgrName="James Goedic";
    

    Emp e; 
    e=new Emp();
    e.age=100;
   
    
    Emp e1;

    e1=new Emp();
   e1.mgrName="Ozvitha";
   e1.age=87;
    System.out.println("E Age is "+e.age);
    System.out.println("E1 Age is "+e1.age);


  System.out.println("Manager name of e is "+e.mgrName);
  System.out.println("Manager name of e1 is "+e1.mgrName);



	 

}

}