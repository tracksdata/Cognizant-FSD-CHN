/*
this ==> owner of current execution-context

to obeject's properties in functions we need references
(better use reference through 'this' keyword)

*/
// Why we need 'this' keyword?

var pName='Ozvitha';
var person={
    pName:'Praveen',
    teach:function(){
        var pName='Rose';
        // teach context
    },
    sayName:function(){
        // sayName context
       // var pName='James';
        //console.log('I am: '+pName); // invalid if pName is not in global context
       // console.log('I am: '+person.pName);
        console.log('I am: '+this.pName); // -> current contect => person -> Praveen
        console.log('I am '+pName); // call global context pName: Ozvitha
    }
};

//person.sayName(); invalid calling
var p=person;
p.sayName();

