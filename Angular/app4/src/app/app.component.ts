import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 
  employeeData:any=[
    {empId:10,empName:'Praveene'},
    {empId:11,empName:'James'},
    {empId:12,empName:'Ford'},
    {empId:13,empName:'Don'},
  ];

     
  selectedEmployeeObject:any={}; 
  getRecord(data:any){
    this.selectedEmployeeObject=data;
    //console.log('selected Id: '+data.selectedId);
    //console.log('selected Name: '+data.selectedName);
  }

}
