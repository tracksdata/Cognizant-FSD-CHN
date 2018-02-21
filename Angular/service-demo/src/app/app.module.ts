import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { CustomerService } from './customer/customer-service';
import { ProductComponent } from './product/product.component';

@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    ProductComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
