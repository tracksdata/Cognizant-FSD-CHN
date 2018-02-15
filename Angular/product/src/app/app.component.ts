import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

 name="Praveen";
 actionName:string;
 empName:string;
 age:number;
 msg:string;
 flag:boolean;
 constructor(){
   this.empName="James";
   this.age=45;
   this.flag=true;
   this.actionName="Get";
 }

 testFun(s2:string){
  this.msg=s2;
 }



}
