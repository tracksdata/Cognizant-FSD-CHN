import { Component, OnInit } from '@angular/core';
import { BookService } from '../bookservice';
import { Book } from '../book';

@Component({
  selector: 'app-find-book',
  templateUrl: './find-book.component.html',
  styleUrls: ['./find-book.component.css']
})
export class FindBookComponent implements OnInit {

  constructor(private bookService:BookService) { }
  
  showDiv=true;
  book=new Book();
  findBook(id:string){
    this.showDiv=false;
    this.bookService.findBook(id).then(book=>this.book=book);
  }
   
  ngOnInit() {
  }

}
