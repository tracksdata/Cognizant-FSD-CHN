import { Component, OnInit, Input, Output,EventEmitter } from '@angular/core';
import { emit } from 'cluster';


@Component({
  selector: 'app-child-data',
  templateUrl: './child-data.component.html',
  styleUrls: ['./child-data.component.css']
})
export class ChildDataComponent {

 @Input('id') eid:string;
 @Input('name') ename:string;

 @Output() sendRecord:EventEmitter<any>=new EventEmitter();
 selectedEmployeeObject:any={};

  selectedData(){
  
    this.selectedEmployeeObject={
       selectedId:this.eid,
       selectedName:this.ename      
    }

    this.sendRecord.emit(this.selectedEmployeeObject);

 }     
  

}
