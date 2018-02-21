import { Component, OnInit } from '@angular/core';
import { Book } from './book';
import { BookService } from './book.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  public book:Book;
  public books:Book[];

  findBook(id:number){
    this.bookService.getBook(id).then(book=>this.book=book);
  }
  constructor(private bookService:BookService) { }

  ngOnInit() {
    this.bookService.getBooks().then(books=>this.books=books);
    this.findBook(14);
    
  }

  get testMsg(){
    return JSON.stringify(this.books);
  }

}
