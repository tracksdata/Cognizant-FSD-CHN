import { BookService } from './../bookservice';
import { Component, OnInit } from '@angular/core';
import { Book } from '../book';

@Component({
  selector: 'app-findbook',
  templateUrl: './findbook.component.html',
  styleUrls: ['./findbook.component.css']
})
export class FindbookComponent implements OnInit {

  constructor(private bookService:BookService) { }

  findBook(id:number){
    this.findResult=true;
    this.bookService.getBook(id).then(book=>this.book=book);
  }
findResult=false;
public book:Book;
  ngOnInit() {
     
  }

}
