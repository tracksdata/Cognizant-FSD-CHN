import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { BookComponent } from './book/book.component';
import { EmpComponent } from './emp/emp.component';
@NgModule({
  declarations: [
    AppComponent,
    BookComponent,
    EmpComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent] 
})
export class AppModule { }
