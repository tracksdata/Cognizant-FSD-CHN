import { Component, OnInit } from '@angular/core';
import { Employee } from './employee';

@Component({
  selector: 'app-emp',
  templateUrl: './emp.component.html',
  styleUrls: ['./emp.component.css']
})
export class EmpComponent  {
  
  emp1=new Employee('EMP001','Praveen',846384);
  emp2=new Employee('EMP002','Ozvitha',343435);
  emp3=new Employee('EMP003','James',846384);
  emp4=new Employee('EMP004','Bucky',353665);

  emps=[this.emp1,this.emp2,this.emp3,this.emp4];


}
