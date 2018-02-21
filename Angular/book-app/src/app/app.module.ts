import { BookService } from './bookservice';
import { HttpModule } from '@angular/http';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { AddbookComponent } from './addbook/addbook.component';
import { ListbooksComponent } from './listbooks/listbooks.component';
import { UpdatebookComponent } from './updatebook/updatebook.component';
import { FindbookComponent } from './findbook/findbook.component';
import { DeletebookComponent } from './deletebook/deletebook.component';
import { RouterModule } from '@angular/router';
import { myrouters } from './myrouts';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    AddbookComponent,
    ListbooksComponent,
    UpdatebookComponent,
    FindbookComponent,
    DeletebookComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(myrouters),
    FormsModule,
    HttpModule,
    HttpClientModule
  ],
  providers: [BookService],
  bootstrap: [AppComponent]
})
export class AppModule { }
