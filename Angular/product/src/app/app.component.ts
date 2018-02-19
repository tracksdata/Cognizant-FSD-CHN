import { Component, OnInit, Inject, Injectable } from '@angular/core';
import { BookComponent } from './book/book.component';

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
 book:BookComponent;

 
 constructor(){
   this.empName="James";
   this.age=45;
   this.flag=true;
   this.actionName="Get";
  // this.book=book;
 }

 testFun(s2:string){
  this.msg=s2;
  //this.book.testing();
 }



}
