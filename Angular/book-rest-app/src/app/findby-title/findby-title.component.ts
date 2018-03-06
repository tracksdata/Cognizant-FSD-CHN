import { Component, OnInit } from '@angular/core';
import { Book } from '../book';
import { BookService } from '../bookservice';

@Component({
  selector: 'app-findby-title',
  templateUrl: './findby-title.component.html',
  styleUrls: ['./findby-title.component.css']
})
export class FindbyTitleComponent implements OnInit {

  
  books:Book[];

  constructor(private bookService:BookService) { }

  findBooks(title:string){
    this.bookService.findBooks(title).then(books=>this.books=books);
  }

  ngOnInit() {
   
  }

}
