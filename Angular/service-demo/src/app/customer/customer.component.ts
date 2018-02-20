import { Component, OnInit } from '@angular/core';
import { Customer } from './customer';
import { CustomerService } from './customer-service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  
  customers:Customer[];

  cname:string;

  constructor(private _custService:CustomerService) {}
    getData(){
      return this._custService.getCustomers().then(custs=>this.customers=custs);
    }


  ngOnInit() {
   this.getData();
  }

}
