import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { AddBookComponent } from './add-book/add-book.component';
import { BookService } from './add-book/book.service';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    AddBookComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule
  ],
  providers: [BookService],
  bootstrap: [AppComponent]
})
export class AppModule { }
