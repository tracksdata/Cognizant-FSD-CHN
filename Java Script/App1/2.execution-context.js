/*
Execution Context
-------------------
    memory/stack-frame which contains local
    variables and arguments to execute
    given instructions

    2 phases
    ---------
    phase 1: creation 
    ------------------
    ==> All variables declared any where 
        in the context will get hoisted to
        top-of-context with default
        value (undefined)
    
    phase -2: execute
    ------------------
    ==> all instructions will be get in
        sequence
    ----------------------------------------    

Imp Notes
----------
    ==> Every .js runtime has one global
        object by default

    global-object ==> .js-activation object
 
    -> Browser Envi ==> window
    -> node.js Envi ==> process

    ==> global context always executed by
        global-object

   ==> All global variables will become 
       properties of a global object at
       contect-creation phase
   ==> .js runtime will throw ReferenceERROR
        when using variables which is not 
        in context
   
  best practice:
  ---------------
  ==> declare variables on top to avoid
      hoisting confusions
//-----------------------------------------

   Every function invocation also creates new-context which
   is child of where(context) function is declared.

   //------------------------------------------

                 ---- * ----
*/


/*var n=10; // global context
function teach(){ // teach context
     // hoisted to top of tecach
    console.log("-- N: "+n);
    var n=20;
     n='A';
}*/


function teach(s1){
  
    console.log("-- Teaching..");
     
    function learning(){
          console.log('-- Leaning');
      }

      function assignment(){
          console.log('-- Doing Assignment');
      }
  
      if(s1=="a")
     return assignment;
     else
     return learning;

}
//learn(); invalid

//var len=teach();
//teach();
//teach();
//teach();
//teach();

var learn=teach('a');
learn();










