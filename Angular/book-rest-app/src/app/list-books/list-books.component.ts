import { Component, OnInit } from '@angular/core';
import { Book } from '../book';
import { BookService } from '../bookservice';

@Component({
  selector: 'app-list-books',
  templateUrl: './list-books.component.html',
  styleUrls: ['./list-books.component.css']
})
export class ListBooksComponent implements OnInit {


  books:Book[];

  constructor(private bookService:BookService) { }

  ngOnInit() {
    this.bookService.listAllBooks().then(books=>this.books=books);
  }

}
