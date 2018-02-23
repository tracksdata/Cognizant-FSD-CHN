import { myroutes } from './myrouts';
import { RouterModule } from '@angular/router';
import { BookService } from './bookservice';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { AddBookComponent } from './add-book/add-book.component';
import { ListBooksComponent } from './list-books/list-books.component';
import { FindBookComponent } from './find-book/find-book.component';
import { UpdateBookComponent } from './update-book/update-book.component';
import { DeleteBookComponent } from './delete-book/delete-book.component';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    AddBookComponent,
    ListBooksComponent,
    FindBookComponent,
    UpdateBookComponent,
    DeleteBookComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    RouterModule.forRoot(myroutes)
  ],
  providers: [BookService],
  bootstrap: [AppComponent]
})
export class AppModule { }
