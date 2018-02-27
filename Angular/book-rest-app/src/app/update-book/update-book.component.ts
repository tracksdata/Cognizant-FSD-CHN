import { Book } from './../book';
import { Component, OnInit } from '@angular/core';
import { BookService } from '../bookservice';

@Component({
  selector: 'app-update-book',
  templateUrl: './update-book.component.html',
  styleUrls: ['./update-book.component.css']
})
export class UpdateBookComponent implements OnInit {

  showDiv=false;
  book=new Book();
  constructor(private bookService:BookService) { }
  
  findBook(id:string){
    this.showDiv=true;
    this.bookService.findBook(id).then(book=>this.book=book);
  }

  updateBook(book:Book){
    this.bookService.updateBook(book).then(book=>this.book=book);
  }
  ngOnInit() {
  }

}
