import { RouterModule } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { BookService } from '../bookservice';
import { Book } from '../book';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  constructor(private bookService:BookService) { }
  book=new Book();
  saveBook(book:Book){
    this.bookService.addBook(book).then(book=>this.book=book);

  }
  ngOnInit() {
  }

}
