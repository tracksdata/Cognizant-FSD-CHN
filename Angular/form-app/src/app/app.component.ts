import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  active=false;
  result=false;
  friends:string[]=['James','Praveen','Mani','Kavya','Ramu'];
  
  emps=[
         {
            name:'Praveen',
            id:'EMP001',
            salary:934734
         },
         {
          name:'Ozvitha',
          id:'EMP002',
          salary:949757
        },
        {
        name:'Bucky',
        id:'EMP003',
        salary:9579475
       }

      ];

  




}
