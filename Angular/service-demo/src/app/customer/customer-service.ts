import { CUSTOMERS } from './../mock-customers';
import { Injectable } from "@angular/core";

@Injectable()
export class CustomerService{
   
    getCustomers(){
        // return CUSTOMERS;
        return Promise.resolve(CUSTOMERS);

     }


}