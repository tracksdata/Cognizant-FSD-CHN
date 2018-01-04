class App{
static void f1(){
System.out.println("f1 method of App class");
}

void f2(){
System.out.println("-- f2 method of App class");
}

static public void main(String[] args){

//f1();

new App().f2();

Person.pName="James";
Person.display();

//java.io.PrintStream ps=System.out;
//ps.println("---- Hello...");


}

}